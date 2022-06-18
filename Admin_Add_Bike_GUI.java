import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Add_Bike_GUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel main_label;

    private JLabel bike_model_label;
    private JLabel bike_mileage_label;
    private JLabel bike_price_label;
    private JLabel bike_company_label;
    private JLabel bike_engine_label;
    private JLabel bike_quantity_label;

    private JTextField bike_model_field;
    private JTextField bike_mileage_field;
    private JTextField bike_price_field;
    private JTextField bike_company_field;
    private JTextField bike_engine_field;
    private JTextField bike_quantity_field;



    private JButton add_button;
    private JButton clear_button;
    private JButton back_button;
    public Admin_Add_Bike_GUI(){
        frame = new JFrame("Vehicle Showroom Management System");
        panel = new JPanel(null);
        main_label = new JLabel("Add Bike");
        main_label.setFont(new Font("Serif", Font.BOLD, 35));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(430, 30, 700, 100);

        bike_model_label = new JLabel("Model:");
        bike_model_label.setFont(new Font("", Font.BOLD, 25));
        bike_model_label.setForeground(Color.CYAN);
        bike_model_label.setBounds(230, 110, 700, 100);

        bike_model_field = new JTextField();
        bike_model_field.setBounds(400, 140, 350, 40);

        bike_company_label = new JLabel("Company:");
        bike_company_label.setFont(new Font("", Font.BOLD, 25));
        bike_company_label.setForeground(Color.CYAN);
        bike_company_label.setBounds(230, 180, 700, 100);

        bike_company_field = new JTextField();
        bike_company_field.setBounds(400, 210, 350, 40);

        bike_mileage_label = new JLabel("Mileage:");
        bike_mileage_label.setFont(new Font("", Font.BOLD, 25));
        bike_mileage_label.setForeground(Color.CYAN);
        bike_mileage_label.setBounds(230, 250, 700, 100);

        bike_mileage_field = new JTextField();
        bike_mileage_field.setBounds(400, 280, 350, 40);

        bike_engine_label = new JLabel("Engine:");
        bike_engine_label.setFont(new Font("", Font.BOLD, 25));
        bike_engine_label.setForeground(Color.CYAN);
        bike_engine_label.setBounds(230, 320, 700, 100);

        bike_engine_field = new JTextField();
        bike_engine_field.setBounds(400, 350, 350, 40);

        bike_price_label = new JLabel("Price:");
        bike_price_label.setFont(new Font("", Font.BOLD, 25));
        bike_price_label.setForeground(Color.CYAN);
        bike_price_label.setBounds(230, 390, 700, 100);

        bike_price_field = new JTextField();
        bike_price_field.setBounds(400, 420, 350, 40);

        bike_quantity_label = new JLabel("Quantity:");
        bike_quantity_label.setFont(new Font("", Font.BOLD, 25));
        bike_quantity_label.setForeground(Color.CYAN);
        bike_quantity_label.setBounds(230, 460, 700, 100);

        bike_quantity_field = new JTextField();
        bike_quantity_field.setBounds(400, 490, 350, 40);




        back_button = new JButton("Back");
        back_button.setBounds(100, 630, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new Handler());

        clear_button = new JButton("Clear");
        clear_button.setBounds(400, 630, 180, 60);
        clear_button.setBackground(Color.CYAN);
        clear_button.setFont(new Font("Aerial", Font.BOLD, 20));
        clear_button.addActionListener(new Handler());

        add_button = new JButton("Add");
        add_button.setBounds(700, 630, 180, 60);
        add_button.setBackground(Color.CYAN);
        add_button.setFont(new Font("Aerial", Font.BOLD, 20));
        add_button.addActionListener(new Handler());

        panel.add(main_label);

        panel.add(bike_model_label);
        panel.add(bike_model_field);
        panel.add(bike_company_field);
        panel.add(bike_company_label);
        panel.add(bike_mileage_field);
        panel.add(bike_mileage_label);
        panel.add(bike_engine_field);
        panel.add(bike_engine_label);
        panel.add(bike_price_field);
        panel.add(bike_price_label);
        panel.add(bike_quantity_field);
        panel.add(bike_quantity_label);

        panel.add(back_button);
        panel.add(clear_button);
        panel.add(add_button);
        panel.setBackground(new Color(21, 40, 51));
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
            if(e.getSource() == add_button){

            }
            if(e.getSource() == clear_button){
                bike_model_field.setText("");
                bike_company_field.setText("");
                bike_engine_field.setText("");
                bike_price_field.setText("");
                bike_mileage_field.setText("");
                bike_quantity_field.setText("");
            }
            if(e.getSource() == back_button){
                frame.dispose();
                Admin_Manage_Bike_Board admin_manage_car_board = new Admin_Manage_Bike_Board();
            }
        }
    }
}
