package com.stackroute.jdbc;

import java.sql.*;

class DatabaseMetaDataDemo {
    public void databaseDemo()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Jdbcdemo","root","Root@123");
            DatabaseMetaData dbmd=connection.getMetaData();
            System.out.println("Database Meta Data Demo   :::  ");
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }  }





