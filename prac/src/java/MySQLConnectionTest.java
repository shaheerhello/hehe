/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.*;  

class DatabaseConnectivity{  
    
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/scdlabjava","root","")) {
        //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        stmt.executeUpdate("INSERT into student VALUES ('1', 'Ali','Street 6')");
        ResultSet rs=stmt.executeQuery("select * from student");
        while(rs.next())
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    }
}catch(Exception e){ System.out.println(e);}  


}  
} 