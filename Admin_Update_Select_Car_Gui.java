import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class Admin_Update_Select_Car_Gui {
    private JFrame frame;
    private JPanel panel;

    private JLabel main_label;
    private TextArea info_area;
    private JLabel delete_label;
    private JTextField delete_field;

    private JButton proceed_button;

    private JButton back_button;
    static int car_id;

    public Admin_Update_Select_Car_Gui() {
        frame = new JFrame("Vehicle Showroom Management System");
        panel = new JPanel(null);

        main_label = new JLabel("Update Cars");
        main_label.setFont(new Font("Serif", Font.BOLD, 35));
        main_label.setForeground(Color.CYAN);
        main_label.setBounds(430, 20, 700, 100);

        info_area = new TextArea();
        info_area.setBounds(0, 120, 1000, 470);
        info_area.setBackground(new Color(21, 40, 51));
        info_area.setForeground(Color.CYAN);
        info_area.setFont(new Font("SansSerif", Font.PLAIN, 18));

        delete_field = new JTextField();
        delete_field.setBounds(700, 628, 100, 30);

        delete_label = new JLabel("Enter Serial number of car you want to Update: ");
        delete_label.setFont(new Font("", Font.BOLD, 25));
        delete_label.setForeground(Color.CYAN);
        delete_label.setBounds(130, 590, 700, 100);

        back_button = new JButton("Back");
        back_button.setBounds(290, 685, 180, 60);
        back_button.setBackground(Color.CYAN);
        back_button.setFont(new Font("Aerial", Font.BOLD, 20));
        back_button.addActionListener(new Handler());

        proceed_button = new JButton("Proceed");
        proceed_button.setBounds(530, 685, 180, 60);
        proceed_button.setBackground(Color.CYAN);
        proceed_button.setFont(new Font("Aerial", Font.BOLD, 20));
        proceed_button.addActionListener(new Handler());

        panel.add(main_label);
        panel.add(info_area);
        panel.add(back_button);
        panel.add(proceed_button);
        panel.add(delete_field);
        panel.add(delete_label);
        panel.setBackground(new Color(21, 40, 51));
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        car_id = Integer.MAX_VALUE;
        Admin_View_Car_GUI.Update(info_area);
    }




    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if(e.getSource() == proceed_button){
                try{
                    int serial = Integer.parseInt(delete_field.getText());
                    try {
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Muneeb","you");
                        Statement st = con.createStatement();
                        ResultSet result = st.executeQuery("select * from cars");
                        while(result.next()){
                            arrayList.add(result.getInt(1));
                        }
                        if(serial <= arrayList.size()) {
                            car_id = arrayList.get(serial - 1);
                        }
                        con.close();
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                    if(serial > arrayList.size()){
                        JOptionPane.showMessageDialog(null, "Car not found!!!");
                        delete_field.setText("");
                    }
                    else{
                        frame.dispose();
                        Admin_Update_Car_GUI admin_update_car_gui = new Admin_Update_Car_GUI();
                    }
                }catch (Exception z){
                    JOptionPane.showMessageDialog(null, "Enter valid Integer!!!");
                    delete_field.setText("");
                }
            }

            if(e.getSource() == back_button){
                frame.dispose();
                Admin_Manage_Car_Board admin_manage_car_board = new Admin_Manage_Car_Board();
            }
        }
    }
}
