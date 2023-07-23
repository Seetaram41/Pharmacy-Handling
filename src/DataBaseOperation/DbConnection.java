/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseOperation;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class DbConnection {
    private static Connection con = null;
    private static String driverName;
    private static String jdbcUrl;
    private static String username;
    private static String password;
   
    static{
        getData();
        try{
            Class.forName(driverName);
            con = DriverManager.getConnection(jdbcUrl,username,password);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.toString());
        }        
    }
    
    private static void getData(){
        Properties p = new Properties();
        InputStream is = DbConnection.class.getResourceAsStream("db.properties");
        try {
            p.load(is);
            driverName = p.getProperty("driverName");
            jdbcUrl = p.getProperty("jdbcUrl");
            username = p.getProperty("username");
            password = p.getProperty("password");
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e.toString());
        }
    }
    public static Connection getCon(){
        return con;
    }
}
