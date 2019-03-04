package com.rhiodamuthie.eyemusicstudio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDB {

//    private Connection connection = null;

    public static void main(String[] args) {

        System.out.println("------------------");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "spring";
        String pass = "spring";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(connection != null){
            System.out.println("Oracle connected..");
        }else {
            System.out.println("ERROR..");
        }

        System.out.println("------------------");
    }
}
