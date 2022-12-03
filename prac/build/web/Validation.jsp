<%-- 
    Document   : Validation
    Created on : Nov 28, 2022, 2:30:42 PM
    Author     : rajas
--%>

<%@ page import ="java.sql.*" %>
<%  String driverName="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/";
String databaseName="reg";
String username="root";
String password="";
    try{
        String us = request.getParameter("username");   
        String pw = request.getParameter("password");
        Class.forName(driverName);  // MySQL database connection
        Connection conn = DriverManager.getConnection(url+databaseName, username, password);    
        PreparedStatement pst = conn.prepareStatement("select * from customer where username=? and password=?");
        pst.setString(1, us);
        pst.setString(2, pw);
        ResultSet rs = pst.executeQuery();

        System.out.println(rs.getString("username"));
        
        if(rs != null)           
           out.println("Valid login credentials");        
        else
           out.println("Invalid login credentials");            
   }
   catch(Exception e){ 
       out.print(e);
       out.println("Something went wrong !! Please try again");       
   }      
%>
