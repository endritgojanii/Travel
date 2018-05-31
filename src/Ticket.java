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


        JLabel emri = new JLabel("Emri:");
        emri.setBounds(105, 40, 200, 100);
        panel.add(emri);

        JLabel emri1 = new JLabel(Travel.getEmri());
        emri1.setBounds(160, 40, 200, 100);
        panel.add(emri1);

        JLabel mbiemri = new JLabel("Mbiemri:");
        mbiemri.setBounds(380, 40, 200, 100);
        panel.add(mbiemri);

        JLabel mbiemri1 = new JLabel(Travel.getMbiemri());
        mbiemri1.setBounds(460, 40, 200, 100);
        panel.add(mbiemri1);

        JLabel numri = new JLabel("Numri Personal:");
        numri.setBounds(180, 80, 200, 100);
        panel.add(numri);

        JLabel numri1 = new JLabel(Travel.getNumripersonal());
        numri1.setBounds(300, 80, 200, 100);
        panel.add(numri1);

        JLabel dataefluturimit = new JLabel("Data e Fluturimit:");
        dataefluturimit.setBounds(60, 140, 200, 100);
        panel.add(dataefluturimit);


        JLabel dataefluturimit1 = new JLabel(Airlines.getDataefluturimit());
        dataefluturimit1.setBounds(180, 140, 200, 100);
        panel.add(dataefluturimit1);

        JLabel dataekthimit = new JLabel("Data e Kthimit:");
        dataekthimit.setBounds(340, 140, 180, 100);
        panel.add(dataekthimit);

        JLabel dataekthimit1 = new JLabel(Airlines.getDataekthimit());
        dataekthimit1.setBounds(450, 140, 200, 100);
        panel.add(dataekthimit1);

        JLabel kompania = new JLabel("Kompania Ajrore:");
        kompania.setBounds(100, 180, 200, 100);
        panel.add(kompania);

        JLabel kompania1 = new JLabel(Airlines.getKompaniaairore());
        kompania1.setBounds(220, 180, 200, 100);
        panel.add(kompania1);

        JLabel numriiulses = new JLabel("Numrat e Uleseve: ");
        numriiulses.setBounds(380, 180, 200, 100);
        panel.add(numriiulses);


        StringBuilder numratEUlseve = new StringBuilder();

        for(int i = 0; i < Airlines.getNumriiulses().size(); i++){
            numratEUlseve.append(Airlines.getNumriiulses().get(i)).append(", ");
        }

        JLabel numriiulses1 = new JLabel(numratEUlseve.toString());
        numriiulses1.setBounds(500, 180, 200, 100);
        panel.add(numriiulses1);

        JLabel ngavendi = new JLabel("Nga Vendi:");
        ngavendi.setBounds(100, 220, 200, 100);
        panel.add(ngavendi);

        JLabel ngavendi1 = new JLabel(Airlines.getNgavendi());
        ngavendi1.setBounds(180, 220, 200, 100);
        panel.add(ngavendi1);

        JLabel nevendin = new JLabel("Ne Vendin:");
        nevendin.setBounds(380, 220, 200, 100);
        panel.add(nevendin);

        JLabel nevendin1 = new JLabel(Airlines.getNevendin());
        nevendin1.setBounds(480, 220, 200, 100);
        panel.add(nevendin1);


        setTitle("Ticket");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}