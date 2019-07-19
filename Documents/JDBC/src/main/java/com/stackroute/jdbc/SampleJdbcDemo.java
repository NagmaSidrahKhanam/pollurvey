package com.stackroute.jdbc;

import java.sql.*;

public class SampleJdbcDemo {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void getEmployeeDetails()  {
        try {
//       STEP 1 : load driver and register with DriverManager
//         register with node driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//       STEP 2: use DriverManager to obtain the connection
//created statement object



                 connection= DriverManager.getConnection( "jdbc:mysql://localhost:3306/JdbcDemo","root","Root@123");

            statement = connection.createStatement();
                 resultSet = statement.executeQuery("Select * from Employee");


            while (resultSet.next())
            {
                System.out.println(" Id : "+ resultSet.getInt(1)+resultSet.getString(2));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
//        finally {
//            {
//                try {
//                    connection.close();
//                    statement.close();
//                    resultSet.close();
//                }
//                catch (SQLException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
