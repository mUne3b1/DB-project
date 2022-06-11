import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_Board {
    private JFrame frame;
    private JPanel panel;

    private JButton signIn_button;
    private JButton signUp_button;
    private JButton back_button;
    private JLabel main_label;
    public User_Board(){
        frame = new JFrame("Vehicle Showroom Management System");
        panel = new JPanel(null);

        main_label = new JLabel("Vehicle Showroom Management System");
        main_label.setFont(new Font("Serif", Font.BOLD, 35));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(180, 60, 700, 100);

        signIn_button = new JButton("Sign In");
        signIn_button.setBounds(300, 200, 400, 100);
        signIn_button.setBackground(Color.CYAN);
        signIn_button.setFont(new Font("Aerial", Font.BOLD, 30));
        signIn_button.addActionListener(new Handler());

        signUp_button = new JButton("Sign Up");
        signUp_button.setBounds(300, 400, 400, 100);
        signUp_button.setBackground(Color.CYAN);
        signUp_button.setFont(new Font("Aerial", Font.BOLD, 30));

        back_button = new JButton("Back");
        back_button.setBounds(410, 600, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new Handler());



        panel.setBackground(new Color(21, 40, 51));

        panel.add(main_label);
        panel.add(signIn_button);
        panel.add(signUp_button);
        panel.add(back_button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back_button){
                frame.dispose();
                Main_DashBoard main_dashBoard = new Main_DashBoard();
            }
            if(e.getSource() == signIn_button){
                frame.dispose();
                Sign_In_GUI sign_in_gui = new Sign_In_GUI();
            }
        }
    }
}
