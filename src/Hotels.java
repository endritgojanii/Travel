import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hotels extends JFrame {


    public static void main(String[] args) throws IOException {

        Hotels hotels = new Hotels();
        hotels.setVisible(true);
    }

    Hotels() throws IOException {
        initUI();
    }


    private void initUI() throws IOException {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JComboBox<Integer> adult = new JComboBox<>();
        adult.setBounds(110, 110, 130, 30);
        adult.setEditable(false);
        adult.addItemListener(e -> {

        });
        for (int i = 1; i < 21; i++) {
            adult.addItem(i);
        }
        panel.add(adult);

        JLabel selectadult = new JLabel("Adult:");
        selectadult.setBounds(60, 110, 80, 30);
        panel.add(selectadult);

        JComboBox<Integer> child = new JComboBox<>();
        child.setBounds(360, 110, 130, 30);
        child.setEditable(false);
        child.addItemListener(e -> {

        });
        for (int i = 0; i < 11; i++) {
            child.addItem(i);
        }
        panel.add(child);

        JLabel selectchild = new JLabel("Child:");
        selectchild.setBounds(308, 110, 80, 30);
        panel.add(selectchild);

        JButton getTicket = new JButton("Get ticket");
        getTicket.setBounds(250, 500, 100, 30);
        getTicket.setForeground(Color.BLUE);
        getTicket.addActionListener(event -> {
            Ticket ticket;
            ticket = new Ticket();
            ticket.setVisible(true);
            dispose();

        });
        panel.add(getTicket);


        JComboBox<DataBase.HotelsItem> hotelslist = new JComboBox<>(DataBase.getHotelslist());
        hotelslist.setBounds(235, 50, 130, 30);
        hotelslist.setEditable(false);
        hotelslist.addItemListener(e -> {

            int index = ((JComboBox) e.getSource()).getSelectedIndex();
            DataBase.ImageSwap.label.setIcon(DataBase.ImageSwap.imRay.get(index));

        });
        panel.add(hotelslist);

        String[] ids = {"a", "b", "c", "d", "e", "f", "h"};
        BufferedImage[] images = new BufferedImage[ids.length];
        for (int j = 1; j < images.length; j++) {
            images[1] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/a.jpg"));
            images[2] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/c.jpg"));
            images[3] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/d.jpg"));
            images[4] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/f.jpg"));
            images[5] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/g.jpg"));
            images[6] = ImageIO.read(new File("/Users/endritgojani/IdeaProjects/Travel/Fotot/h.jpg"));

        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(DataBase.ImageSwap.getLabel(images));
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);


    }


}