import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin_Add_Exchange_Vehicle {
    private JFrame frame;
    private JPanel panel;
    private JLabel main_label;

    private JLabel car_model_label;
    private JLabel car_mileage_label;
    private JLabel car_price_label;
    private JLabel car_company_label;
    private JLabel car_engine_label;
    private JLabel car_quantity_label;

    private JTextField car_model_field;
    private JTextField car_mileage_field;
    private JTextField car_price_field;
    private JTextField car_company_field;
    private JTextField car_engine_field;
    private JTextField car_quantity_field;



    private JButton add_button;
    private JButton clear_button;
    private JButton back_button;

    public Admin_Add_Exchange_Vehicle(){
        frame = new JFrame("Vehicle Showroom Management System");
        panel = new JPanel(null);
        main_label = new JLabel("Add Car");
        main_label.setFont(new Font("Serif", Font.BOLD, 35));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(430, 30, 700, 100);

        car_model_label = new JLabel("Model:");
        car_model_label.setFont(new Font("", Font.BOLD, 25));
        car_model_label.setForeground(Color.CYAN);
        car_model_label.setBounds(230, 110, 700, 100);

        car_model_field = new JTextField();
        car_model_field.setBounds(400, 140, 350, 40);

        car_company_label = new JLabel("Company:");
        car_company_label.setFont(new Font("", Font.BOLD, 25));
        car_company_label.setForeground(Color.CYAN);
        car_company_label.setBounds(230, 180, 700, 100);

        car_company_field = new JTextField();
        car_company_field.setBounds(400, 210, 350, 40);

        car_mileage_label = new JLabel("Mileage:");
        car_mileage_label.setFont(new Font("", Font.BOLD, 25));
        car_mileage_label.setForeground(Color.CYAN);
        car_mileage_label.setBounds(230, 250, 700, 100);

        car_mileage_field = new JTextField();
        car_mileage_field.setBounds(400, 280, 350, 40);

        car_engine_label = new JLabel("Engine:");
        car_engine_label.setFont(new Font("", Font.BOLD, 25));
        car_engine_label.setForeground(Color.CYAN);
        car_engine_label.setBounds(230, 320, 700, 100);

        car_engine_field = new JTextField();
        car_engine_field.setBounds(400, 350, 350, 40);

        car_price_label = new JLabel("Price:");
        car_price_label.setFont(new Font("", Font.BOLD, 25));
        car_price_label.setForeground(Color.CYAN);
        car_price_label.setBounds(230, 390, 700, 100);

        car_price_field = new JTextField();
        car_price_field.setBounds(400, 420, 350, 40);

        car_quantity_label = new JLabel("Quantity:");
        car_quantity_label.setFont(new Font("", Font.BOLD, 25));
        car_quantity_label.setForeground(Color.CYAN);
        car_quantity_label.setBounds(230, 460, 700, 100);

        car_quantity_field = new JTextField();
        car_quantity_field.setBounds(400, 490, 350, 40);




        back_button = new JButton("Back");
        back_button.setBounds(100, 630, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new Admin_Add_Exchange_Vehicle.Handler());

        clear_button = new JButton("Clear");
        clear_button.setBounds(400, 630, 180, 60);
        clear_button.setBackground(Color.CYAN);
        clear_button.setFont(new Font("Aerial", Font.BOLD, 20));
        clear_button.addActionListener(new Admin_Add_Exchange_Vehicle.Handler());

        add_button = new JButton("Add");
        add_button.setBounds(700, 630, 180, 60);
        add_button.setBackground(Color.CYAN);
        add_button.setFont(new Font("Aerial", Font.BOLD, 20));
        add_button.addActionListener(new Admin_Add_Exchange_Vehicle.Handler());

        panel.add(main_label);

        panel.add(car_model_label);
        panel.add(car_model_field);
        panel.add(car_company_field);
        panel.add(car_company_label);
        panel.add(car_mileage_field);
        panel.add(car_mileage_label);
        panel.add(car_engine_field);
        panel.add(car_engine_label);
        panel.add(car_price_field);
        panel.add(car_price_label);
        panel.add(car_quantity_field);
        panel.add(car_quantity_label);

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
                car_model_field.setText("");
                car_company_field.setText("");
                car_engine_field.setText("");
                car_price_field.setText("");
                car_mileage_field.setText("");
                car_quantity_field.setText("");
            }
            if(e.getSource() == back_button){
                frame.dispose();
                Admin_Manage_Exchange_Board admin_manage_exchange_board = new Admin_Manage_Exchange_Board();
            }
        }
    }
}


