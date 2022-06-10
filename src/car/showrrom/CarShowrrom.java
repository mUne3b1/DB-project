/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.showrrom;
import java.sql.*;
import static java.time.Clock.system;
import java.util.*;
/**
 *
 * @author User
 */
public class CarShowrrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{
        Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","HR");
        Statement stmt = mycon.createStatement();
            stmt.executeUpdate("Insert into departments values(1, 'DeptName', 176,  1700)");
            ResultSet result = stmt.executeQuery("Select * from departments");
            while(result.next()){
                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3));
            }
       
       
       } catch 
               (Exception e){
           System.out.println(e.toString());}
       }
}
