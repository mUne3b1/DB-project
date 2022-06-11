
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_Sign_In_GUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel main_label;
    private JLabel email_label;
    private JLabel password_label;
    private JTextField email_field;
    private JTextField password_field;
    private JButton back_button;
    private JButton signin_button;
    private JButton clear_button;

    public User_Sign_In_GUI() {
        frame = new JFrame("Vehicle Management System");
        panel = new JPanel(null);

        main_label = new JLabel("Sign In");
        main_label.setFont(new Font("Serif", Font.BOLD, 50));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(400, 60, 700, 100);

        email_field = new JTextField();
        email_field.setBounds(400, 250, 450, 40);

        email_label = new JLabel("Email:");
        email_label.setFont(new Font("Aerial", Font.BOLD, 30));
        email_label.setForeground(Color.CYAN);
        email_label.setBounds(200, 220, 300, 100);


        password_field = new JTextField();
        password_field.setBounds(400, 390, 450, 40);

        password_label = new JLabel("Password:");
        password_label.setFont(new Font("Aerial", Font.BOLD, 30));
        password_label.setForeground(Color.CYAN);
        password_label.setBounds(200, 358, 300, 100);


        back_button = new JButton("Back");
        back_button.setBounds(410, 600, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new Handler());

        signin_button = new JButton("Sign In");
        signin_button.setBounds(110, 600, 180, 60);
        signin_button.setBackground(Color.CYAN);
        signin_button.setFont(new Font("Aerial", Font.BOLD, 20));
        signin_button.addActionListener(new Handler());


        clear_button = new JButton("Clear");
        clear_button.setBounds(710, 600, 180, 60);
        clear_button.setBackground(Color.CYAN);
        clear_button.setFont(new Font("Aerial", Font.BOLD, 20));
        clear_button.addActionListener(new Handler());


        panel.setBackground(new Color(21, 40, 51));
        panel.add(main_label);
        panel.add(email_field);
        panel.add(email_label);
        panel.add(password_field);
        panel.add(password_label);
        panel.add(back_button);
        panel.add(signin_button);
        panel.add(clear_button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back_button){
                frame.dispose();
                Main_DashBoard main_dashBoard = new Main_DashBoard();
            }
            if(e.getSource() == signin_button){

            }
            if(e.getSource() == clear_button){
                email_field.setText("");
                password_field.setText("");
            }
        }
    }
}