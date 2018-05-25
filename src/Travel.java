import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Travel extends JFrame {

    public static void main(String[] args) {
        Travel ex = new Travel();
        ex.setVisible(true);

    }

    private Travel() {
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        UsernameData[] usernameData = new UsernameData[5];
        usernameData[0] = new UsernameData("");
        usernameData[1] = new UsernameData("endritgojani1");
        usernameData[2] = new UsernameData("endritgojani2");
        usernameData[3] = new UsernameData("endritgojani3");


        PasswordData[] passwordData = new PasswordData[4];
        passwordData[0] = new PasswordData("");
        passwordData[1] = new PasswordData("endriti");
        passwordData[2] = new PasswordData("endriti");
        passwordData[3] = new PasswordData("endriti");


        JLabel welcome = new JLabel("Welcome");
        welcome.setBounds(340, 50, 150, 30);
        welcome.setFont(new Font("Bold", Font.ITALIC, 30));
        welcome.setForeground(Color.RED);
        panel.add(welcome);


        JLabel textname = new JLabel("Name:");
        textname.setBounds(160, 120, 80, 30);
        panel.add(textname);

        JTextField name1 = new JTextField(20);
        name1.setBounds(220, 120, 150, 30);
        panel.add(name1);


        JLabel textsurname = new JLabel("Surname:");
        textsurname.setBounds(400, 120, 80, 30);
        panel.add(textsurname);

        JTextField surname1 = new JTextField(20);
        surname1.setBounds(480, 120, 150, 30);
        panel.add(surname1);

        JLabel personalnumber = new JLabel("Personal Number:");
        personalnumber.setBounds(230, 170, 120, 30);
        panel.add(personalnumber);

        JTextField personno1 = new JTextField(20);
        personno1.setBounds(360, 170, 150, 30);
        panel.add(personno1);

        JLabel textusername = new JLabel("Username:");
        textusername.setBounds(260, 270, 80, 30);
        panel.add(textusername);


        JLabel textpassword = new JLabel("Password:");
        textpassword.setBounds(260, 320, 80, 30);
        panel.add(textpassword);

        JTextField username1 = new JTextField(20);
        username1.setBounds(360, 270, 150, 30);
        panel.add(username1);

        JPasswordField password1 = new JPasswordField(20);
        password1.setBounds(360, 320, 150, 30);
        panel.add(password1);

        JLabel textLable = new JLabel("");
        textLable.setBounds(330, 215, 300, 50);
        textLable.setForeground(Color.RED);
        panel.add(textLable);


        JButton loginButton = new JButton("Login");
        loginButton.setBounds(360, 400, 80, 30);
        loginButton.setForeground(Color.BLUE);
        loginButton.addActionListener(event -> {

            if (username1.getText().equals(usernameData[0].getName())) {
                if (password1.getText().equals(passwordData[0].getName())) {
                    Airlines airlines = new Airlines();
                    airlines.setVisible(true);
                    dispose();

                } else {
                    textLable.setText("Gabim ne username ose password");
                }
            } else {
                if (username1.getText().equals(usernameData[1].getName())) {
                    if (password1.getText().equals(passwordData[1].getName())) {
                        Airlines airlines = new Airlines();
                        airlines.setVisible(true);
                        dispose();
                    } else {
                        textLable.setText("Gabim ne ne username ose password");
                    }
                } else {
                    if (username1.getText().equals(usernameData[2].getName())) {
                        if (password1.getText().equals(passwordData[2].getName())) {
                            Airlines airlines = new Airlines();
                            airlines.setVisible(true);
                            dispose();
                        } else {
                            textLable.setText("Gabim ne username ose password");
                        }
                    } else {
                        if (username1.getText().equals(usernameData[3].getName())) {
                            if (password1.getText().equals(passwordData[3].getName())) {
                                Airlines airlines = new Airlines();
                                airlines.setVisible(true);
                                dispose();
                            } else {
                                textLable.setText("Gabim ne username ose password");
                            }
                        } else {
                            textLable.setText("Gabim ne username ose password");
                        }

                    }

                }


            }


        });

        panel.add(loginButton);
        setTitle("Welcome");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private static class UsernameData {
        private String usernameData;


        UsernameData(String usernameData) {
            this.usernameData = usernameData;

        }

        String getName() {
            return usernameData;
        }

        @Override
        public String toString() {
            return usernameData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UsernameData that = (UsernameData) o;
            return Objects.equals(usernameData, that.usernameData);
        }

        @Override
        public int hashCode() {

            return Objects.hash(usernameData);
        }
    }

    public class PasswordData {
        private String passwordData;


        PasswordData(String passwordData) {
            this.passwordData = passwordData;

        }

        String getName() {
            return passwordData;
        }

        @Override
        public String toString() {
            return passwordData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PasswordData that = (PasswordData) o;
            return Objects.equals(passwordData, that.passwordData);
        }

        @Override
        public int hashCode() {

            return Objects.hash(passwordData);
        }
    }


}

