import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class MultipleSelectModel extends AbstractListModel
        implements ComboBoxModel {

    private String message = "";
    List values = new ArrayList();
    List<Airlines.Seats> selected = new ArrayList();

    public MultipleSelectModel(Airlines.Seats[] values) {
        for (Airlines.Seats object : values) {
            this.values.add(object);
        }
    }

    @Override
    public int getSize() {
        return values.size();
    }

    @Override
    public Object getElementAt(int index) {
        return values.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (anItem == null) {
            if (selected.isEmpty()) return;
            selected.clear();
        } else {

            if(((Airlines.Seats)anItem).getValue()){
                message = "e rezervuar";
                JOptionPane.showMessageDialog(null, message);
            }else{

                boolean removed = selected.remove(anItem);
                if (!removed) {

                    selected.add(((Airlines.Seats)anItem));

                    Airlines.numriIUlseve.clear();

                    for(int i = 0; i < selected.size(); i++){
                        Airlines.numriIUlseve.add(((Airlines.Seats)selected.get(i)).toString());
                    }
                }
            }

        }
        fireContentsChanged(this, -1, -1);
    }

    @Override
    public java.util.List getSelectedItem() {
        return selected;
    }

}