import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
//        try{
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Muneeb","you");
//            Statement st = con.createStatement();
//            ResultSet result = st.executeQuery("select * from Admin");
//            while(result.next()){
//                System.out.println(result.getInt(1) + " " + result.getInt(2));
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }
//Get_Started get_started = new Get_Started();
//        User_Sign_Up_GUI user_sign_up_gui = new User_Sign_Up_GUI();
//        Sign_In_GUI sign_in_gui = new Sign_In_GUI();

        Admin_Login admin_login = new Admin_Login();
//   Admin_Dashboard admin_dashboard = new Admin_Dashboard();
//        Admin_Manage_Car_Board admin_manage_car_board = new Admin_Manage_Car_Board();
//        Admin_Add_Car_GUI admin_add_car_gui = new Admin_Add_Car_GUI();

//        Admin_View_Car_GUI admin_view_car_gui = new Admin_View_Car_GUI();
        //Admin_Delete_Car_GUI admin_delete_car_gui = new Admin_Delete_Car_GUI();
//      updateCarsGUI ne = new updateCarsGUI();
//        Admin_Add_Used_Car_GUI admin_add_used_car_gui = new Admin_Add_Used_Car_GUI();
///      Admin_Manage_Bike_Board admin_manage_bike_board = new Admin_Manage_Bike_Board();
          //Admin_Manage_Used_Vehicle_Board admin_manage_used_vehicle_board = new Admin_Manage_Used_Vehicle_Board();
//        User_Log_In_GUI user_log_in_gui = new User_Log_In_GUI();
//        User_Sign_Up_GUI user_sign_up_gui = new User_Sign_Up_GUI();
    }
}
