import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.Objects;
import java.util.Random;

public class Airlines extends JFrame {

    public static String dataefluturimit;

    public static String dataekthimit;

    public static String kompaniaairore;

    public static String ngavendi;

    public static String nevendin;

    public static String numriiulses;

    public static String getDataefluturimit() {
        return dataefluturimit;
    }

    public static String getDataekthimit() {
        return dataekthimit;
    }

    public static String getKompaniaairore() {
        return kompaniaairore;
    }

    public static String getNgavendi() {
        return ngavendi;
    }

    public static String getNevendin() {
        return nevendin;
    }

    public static String getNumriiulses() {
        return numriiulses;
    }

    DataBase dataBase = new DataBase();

    public static void main(String[] args) {

        Airlines ex = new Airlines();
        ex.setVisible(true);
    }

    private String string = "";

    public class Seats {
        private int number;
        private boolean value;

        Seats(int number, boolean value) {
            this.number = number;
            this.value = value;
        }

        boolean getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }


    }

    private Seats[] getSeatslist() {
        Seats[] seatsitems = new Seats[40];

        int j = 1;
        for (int i = 0; i < 40; i++) {
            Random a = new Random();
            boolean vlera = a.nextBoolean();
            seatsitems[i] = new Seats(j, vlera);
            j++;
        }
        return seatsitems;
    }

    Airlines() {
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel title = new JLabel("Airplane ticket reservation");
        title.setBounds(200, 100, 400, 30);
        title.setFont(new Font("Bold", Font.ITALIC, 30));
        title.setForeground(Color.RED);
        panel.add(title);


        JLabel fromtext = new JLabel("From:");
        fromtext.setBounds(180, 200, 50, 30);
        panel.add(fromtext);

        JComboBox<DataBase.DateItem> datacombobox = new JComboBox<>();
        datacombobox.setBounds(230, 200, 130, 30);
        datacombobox.setEditable(false);
        datacombobox.addItemListener(e -> {

            dataefluturimit = String.valueOf(datacombobox.getSelectedItem());
//
        });
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < 293; ++i) {
            datacombobox.addItem(new DataBase.DateItem(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }
        panel.add(datacombobox);


        JLabel totext = new JLabel("To:");
        totext.setBounds(420, 200, 30, 30);
        panel.add(totext);


        JComboBox<DataBase.DateItem> datacombobox1 = new JComboBox<>();
        datacombobox1.setBounds(460, 200, 130, 30);
        datacombobox1.setEditable(false);
        datacombobox1.addItemListener((ItemEvent e) -> {
            dataekthimit = String.valueOf(datacombobox1.getSelectedItem());

        });
        Calendar calendar1 = Calendar.getInstance();
        for (int i = 0; i < 293; ++i) {
            datacombobox1.addItem(new DataBase.DateItem(calendar1.getTime()));
            calendar1.add(Calendar.DATE, 1);
        }
        panel.add(datacombobox1);

        JLabel fromtext1 = new JLabel("From:");
        fromtext1.setBounds(180, 300, 50, 30);
        panel.add(fromtext1);


        JComboBox<DataBase.FromAirlinesItem> fromOptions = new JComboBox<>(DataBase.getStatelist());
        fromOptions.setBounds(230, 300, 130, 30);
        fromOptions.setEditable(false);
        fromOptions.addItemListener(e -> ngavendi = String.valueOf(fromOptions.getSelectedItem()));
        panel.add(fromOptions);


        JLabel totext1 = new JLabel("To:");
        totext1.setBounds(420, 300, 30, 30);
        panel.add(totext1);


        JComboBox<DataBase.FromAirlinesItem> toOptions = new JComboBox<>(DataBase.getStatelist());
        toOptions.setBounds(460, 300, 130, 30);
        toOptions.setEditable(false);
        toOptions.addItemListener((ItemEvent e) -> {
            nevendin = String.valueOf(toOptions.getSelectedItem());
        });
        panel.add(toOptions);


        JLabel company = new JLabel("Airline Companies:");
        company.setBounds(200, 250, 130, 30);
        panel.add(company);

        JComboBox<DataBase.AirlinesItem> airlinelist = new JComboBox<>(dataBase.getAirlineslist());
        airlinelist.setBounds(350, 250, 190, 30);
        airlinelist.setEditable(false);
        airlinelist.addItemListener(e -> {
            kompaniaairore = String.valueOf(airlinelist.getSelectedItem());
        });

        panel.add(airlinelist);


        JLabel selectseat = new JLabel("Select seat:");
        selectseat.setBounds(270, 350, 80, 30);
        panel.add(selectseat);


        JLabel selectseata = new JLabel("1 2 3 4");
        selectseata.setBounds(200, 390, 80, 30);
        selectseata.setForeground(Color.RED);
        panel.add(selectseata);

        JLabel selectseatb = new JLabel("5 6 7 8");
        selectseatb.setBounds(200, 410, 80, 30);
        selectseatb.setForeground(Color.RED);
        panel.add(selectseatb);

        JLabel selectseatc = new JLabel(".  .  .  .");
        selectseatc.setBounds(200, 430, 80, 30);
        selectseatc.setForeground(Color.RED);
        panel.add(selectseatc);

        JComboBox<Seats> seats = new JComboBox<>(getSeatslist());
        seats.setBounds(360, 350, 130, 30);
        seats.setEditable(false);
        seats.addItemListener(e -> {
            System.out.println(seats.getSelectedIndex() + 1);


            if (Objects.requireNonNull((Seats) seats.getSelectedItem()).getValue()) {
                string = "e rezervuar";

            } else {
                string = "e lire";
                numriiulses = String.valueOf(seats.getSelectedItem());

            }
            JOptionPane.showMessageDialog(null, string);


        });

        panel.add(seats);


        JButton getTicket = new JButton("Get ticket");
        getTicket.setBounds(360, 410, 100, 30);
        getTicket.setForeground(Color.BLUE);
        getTicket.addActionListener(event -> {

            Seats seats1 = (Seats) seats.getSelectedItem();
            if (!Objects.requireNonNull(seats1).getValue()) {
                Hotels hotels = null;
                try {
                    hotels = new Hotels();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert hotels != null;
                hotels.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Ulseja eshte e rezervuar");
            }

        });
        panel.add(getTicket);


        setTitle("Get the ticket");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
