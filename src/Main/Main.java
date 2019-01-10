/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import Views.Login;

/**
 *
 * @author NetShadow
 */
public class Main {
    public static Connection con = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/technicien","root","");
            System.out.println("connect");
            Login login = new Login();
            login.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            System.exit(0);
    }
});
            new Login().show();
        }catch(Exception e){
           
        }
    }
    
}
