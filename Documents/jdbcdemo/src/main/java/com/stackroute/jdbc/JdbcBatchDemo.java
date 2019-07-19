package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
        public void batchDemo()
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


            Connection connection= null;
            try {
                connection = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/Jdbcdemo","root","Root@123");
                connection.setAutoCommit(false);
                Statement stmt=connection.createStatement();
                stmt.addBatch("insert into Employee values(100,'neelanshi',22,'female')");
                stmt.addBatch("insert into Employee values(111,'akhila',22,'female')");
                stmt.executeBatch();//executing the batch

                connection.commit();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
}
