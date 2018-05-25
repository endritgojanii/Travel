import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComboBoxItem {

    private ComboBoxItem() {


        JFrame frame = new JFrame();
        List<Country> countries = createCountryList();
        JComboBox<Object> cBox = createComboBox(countries);
        frame.add(cBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JComboBox<Object> createComboBox(List<Country> countries) {
        final JComboBox<Object> comboBox = new JComboBox<>(countries.toArray());
        comboBox.setRenderer(new ComboBoxRenderer());
        comboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Country country = (Country) comboBox.getSelectedItem();
                assert country != null;
                System.out.println(Objects.requireNonNull(country).getIso());


            }
        });
        return comboBox;
    }

    static class ComboBoxRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                                                      int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list,
                    value, index, isSelected, cellHasFocus);
            Country country = (Country) value;
            label.setText(country.getName());
            return label;
        }
    }

    private List<Country> createCountryList() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("Afghanistan", true));
        list.add(new Country("Åland Islands", false));
        list.add(new Country("Albania", true));
        return list;
    }

    public class Country {
        private String name;
        private boolean iso;

        Country(String name, boolean iso) {
            this.name = name;
            this.iso = iso;
        }

        public String getName() {
            return name;
        }

        boolean getIso() {
            return iso;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComboBoxItem::new);

    }
}