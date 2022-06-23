import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

public class Admin_Add_Used_Car_GUI {
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
    private String combo_default = "man1";
    private int man_id = 0;



    private JButton add_button;
    private JButton clear_button;
    private JButton back_button;
    public Admin_Add_Used_Car_GUI(){
        frame = new JFrame("Vehicle Showroom Management System");
        panel = new JPanel(null);
        main_label = new JLabel("Add Used Car");
        main_label.setFont(new Font("Serif", Font.BOLD, 35));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(410, 30, 700, 100);

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
        private int id;
        private Random random;
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean chk = true;

            String model = car_model_field.getText();
            int mileage = Integer.parseInt(car_mileage_field.getText());
            int price = Integer.parseInt(car_price_field.getText());
            String engine = car_engine_field.getText();
            int quantity = Integer.parseInt(car_quantity_field.getText());

            random = new Random();
            id = random.nextInt(10000)+1;

                if (e.getSource() == add_button) {

                    try {
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Muneeb", "you");
                        Statement st = con.createStatement();
                        ResultSet result = st.executeQuery("select * from manufacturer");
                        while (result.next() && !combo_default.equals(result.getString(2))) {
                        }
                        man_id = Integer.parseInt(result.getString(1));

                        con.close();
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                    if (car_model_field.getText().isEmpty() || car_mileage_field.getText().isEmpty() || car_price_field.getText().isEmpty() ||
                            car_company_field.getText().isEmpty() || car_engine_field.getText().isEmpty() || car_quantity_field.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fields should not be empty!!!");
                    } else {
                        int ad_id = 12;

                        try {
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Muneeb", "you");
                            Statement st = con.createStatement();
                            ResultSet result = st.executeQuery("select * from used_vehicles");
                            while (result.next()) {
                                if (id == result.getInt(1)) {
                                    JOptionPane.showMessageDialog(null, "Car already exists!!!");
                                    frame.dispose();
                                    Admin_Manage_Used_Vehicle_Board admin_manage_used_vehicle_board = new Admin_Manage_Used_Vehicle_Board();
                                    chk = false;
                                }
                            }
                            if (chk) {
                                String query = "insert into cars(car_id, car_model, car_mileage, car_engine, car_price, car_quantity, manufacturer_manufacturer_id, admin_admin_id) values(?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement pst = con.prepareStatement(query);
                                pst.setInt(1, id);
                                pst.setString(2, model);
                                pst.setInt(3, mileage);
                                pst.setString(4, engine);
                                pst.setInt(5, price);
                                pst.setInt(6, quantity);
                                pst.setInt(7, man_id);
                                pst.setInt(8, ad_id);
                                pst.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Car added successful!!!");
                                con.close();
                                frame.dispose();
                                Admin_Manage_Used_Vehicle_Board admin_manage_used_vehicle_board = new Admin_Manage_Used_Vehicle_Board();
                            }
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                    }
                }


                if (e.getSource() == clear_button) {
                    car_model_field.setText("");
                    car_company_field.setText("");
                    car_engine_field.setText("");
                    car_price_field.setText("");
                    car_mileage_field.setText("");
                    car_quantity_field.setText("");
                }
                if (e.getSource() == back_button) {
                    frame.dispose();
                    Admin_Manage_Used_Vehicle_Board admin_manage_used_vehicle_board = new Admin_Manage_Used_Vehicle_Board();
                }
            }}}