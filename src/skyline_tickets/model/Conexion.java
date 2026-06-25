/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skyline_tickets.model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author juans
 */
public class Conexion {
    
    Connection con;
    
    String url = "jdbc:mysql://localhost:3306/reportes_financieros";
    String user = "root";
    String password = "";
    
    public Connection getConection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexion a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(),"Base de datos apagada."+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
