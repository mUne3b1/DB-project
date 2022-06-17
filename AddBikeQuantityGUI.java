import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBikeQuantityGUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel main_label;
    private JButton back_button;
    private JButton  update_button;
    private JLabel update_price_label;

    private JTextField update_price;
    public AddBikeQuantityGUI() {
        frame = new JFrame("Update Bike  quantity");
        panel = new JPanel(null);
        main_label = new JLabel("Update  Bike quantity");
        main_label.setFont(new Font("Serif", Font.BOLD, 45));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(350, 30, 700, 100);


        update_price = new JTextField();
        update_price.setBounds(310, 250, 450, 40);

        update_price_label = new JLabel("Add new quantity:");
        update_price_label.setFont(new Font("Aerial", Font.BOLD, 30));
        update_price_label.setForeground(Color.CYAN);
        update_price_label.setBounds(390, 160, 300, 100);

        back_button = new JButton("Back");
        back_button.setBounds(300, 590, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new AddBikeQuantityGUI.Handler());

        update_button = new JButton("Update");
        update_button.setBounds(550, 590, 180, 60);
        update_button.setBackground(Color.CYAN);
        update_button.setFont(new Font("Aerial", Font.BOLD, 20));
        update_button.addActionListener(new AddBikeQuantityGUI.Handler());

        panel.setBackground(new Color(21, 40, 51));
        panel.add(main_label);
        panel.add(update_price);
        panel.add(update_price_label);
        panel.add(update_button);
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
            if (e.getSource() == back_button) {
                frame.dispose();
                Main_DashBoard main_dashBoard = new Main_DashBoard();
            }

        }}}

