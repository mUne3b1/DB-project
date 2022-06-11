import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vehicle Showroom Management System");
        JPanel panel = new JPanel(null);

        JLabel main_label = new JLabel("Welcome to");
        JLabel main_label2 = new JLabel("Vehicle Showroom Management System");
        main_label.setFont(new Font("Aerial", Font.BOLD, 30));
        main_label2.setFont(new Font("Serif", Font.BOLD, 40));
        main_label.setForeground(Color.CYAN);
        main_label2.setForeground(Color.CYAN);

        main_label.setBounds(400, 60, 500, 100);
        main_label2.setBounds(150, 100, 700, 100);

        JButton starting_button = new JButton("Get Started");
        starting_button.setBounds(300, 500, 400, 100);
        starting_button.setBackground(Color.CYAN);
        starting_button.setFont(new Font("Aerial", Font.BOLD, 20));

//        main_label.setForeground(Color.white);
        panel.add(starting_button);
        panel.add(main_label);
        panel.add(main_label2);
        panel.setBackground(new Color(21, 40, 51));


        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
