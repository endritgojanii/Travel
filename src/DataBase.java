import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBase {


    public static FromAirlinesItem[] getStatelist() {

        FromAirlinesItem[] stateitems = new FromAirlinesItem[6];
        stateitems[0] = new FromAirlinesItem("New York");
        stateitems[1] = new FromAirlinesItem("Canada");
        stateitems[2] = new FromAirlinesItem("Kosovo");
        stateitems[3] = new FromAirlinesItem("Albania");
        stateitems[4] = new FromAirlinesItem("Germany");
        stateitems[5] = new FromAirlinesItem("Austria");

        return stateitems;
    }


    public AirlinesItem[] getAirlineslist() {
        AirlinesItem[] airlinesitems = new AirlinesItem[9];
        airlinesitems[0] = new AirlinesItem("Airline1");
        airlinesitems[1] = new AirlinesItem("Airline2");
        airlinesitems[2] = new AirlinesItem("Airline3");
        airlinesitems[3] = new AirlinesItem("Ariline4");
        airlinesitems[4] = new AirlinesItem("Airline5");
        airlinesitems[5] = new AirlinesItem("Airline6");
        airlinesitems[6] = new AirlinesItem("Ariline7");
        airlinesitems[7] = new AirlinesItem("Airline8");
        airlinesitems[8] = new AirlinesItem("Airline9");
        return airlinesitems;
    }

    public static HotelsItem[] getHotelslist() {
        HotelsItem[] hotelsitems = new HotelsItem[6];
        hotelsitems[0] = new HotelsItem("A");
        hotelsitems[1] = new HotelsItem("B");
        hotelsitems[2] = new HotelsItem("C");
        hotelsitems[3] = new HotelsItem("D");
        hotelsitems[4] = new HotelsItem("E");
        hotelsitems[5] = new HotelsItem("F");
        return hotelsitems;
    }


    public static class FromAirlinesItem {
        private String name;


        FromAirlinesItem(String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class HotelsItem {
        private String name;


        HotelsItem(String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class AirlinesItem {

        private String name;

        AirlinesItem(String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return name;
        }


    }


    public static class DateItem {

        private Date mDate;

        DateItem(Date date) {
            mDate = date;
        }

        @Override
        public String toString() {

            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

            return data.format(mDate);
        }
    }

    public static class ImageSwap implements ActionListener {

        static JLabel label;

        public static List<ImageIcon> imRay = new ArrayList<>();

        public void actionPerformed(ActionEvent e) {
            int index = ((JComboBox) e.getSource()).getSelectedIndex();
            label.setIcon(imRay.get(index));
        }

        public static JLabel getLabel(BufferedImage[] images) {
            for (int j = 1; j < images.length; j++) {
                imRay.add(new ImageIcon(images[j]));
            }
            label = new JLabel(imRay.get(0));
            label.setBounds(50, 250, 500, 200);
            return label;

        }


    }


}