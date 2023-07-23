package DataBaseOperation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DataBaseOperation.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Table {
    public static void main(String[] args) {
        Connection con = DbConnection.getCon();
        try {
            Statement s =con.createStatement();
            String sql_query1 = "create table appuser(appuser_pk int Auto_increment primary key,userrole varchar(50),name varchar(150),dob varchar(100),gender varchar(50),phNo varchar(50),email varchar(200),username varchar(100),password varchar(100), address varchar(500))";
            String sql_query2 ="create table medicine(medicine_pk int auto_increment primary key,uniqueId varchar(200),name varchar(100),companyName varchar(100),quantity varchar(100),price varchar(200))";
            String sql_query3= "insert into appuser(userrole,name,dob,gender,phno,email,username,password,address) values('appuser','ayushi','20-01-2000','Female','9856013127','ayushi@gmail.com','ayushi41','123456','mandideep')";
            String sql_query4= "Create table bill(bill_pk int auto_increment Primary key, billId varchar(100),billDate varchar(100),Totalpaid bigint, generatedBill varchar(50) )";
            s.executeUpdate(sql_query4);
            JOptionPane.showConfirmDialog(null, "Successfully creted table");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
        }
    }
}
