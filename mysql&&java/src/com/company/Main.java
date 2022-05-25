package com.company;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3306/tesla?useSSL=false";
        String databseUserName = "root";
        String databasePassword = "siby";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(MySQLURL,databseUserName,databasePassword);

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employe");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}


    }
}
