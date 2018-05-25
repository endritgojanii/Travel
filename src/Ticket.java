import javax.swing.*;

public class Ticket extends JFrame {
    public static void main(String[] args) {
        Ticket ex = new Ticket();
        ex.setVisible(true);

    }

    Ticket() {
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);


        JLabel textusername = new JLabel();
        textusername.setBounds(260, 220, 200, 100);
        panel.add(textusername);


        setTitle("Ticket");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}