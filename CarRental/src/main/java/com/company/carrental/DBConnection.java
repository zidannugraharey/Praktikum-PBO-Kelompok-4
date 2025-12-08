package com.company.carrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentcar", "root", ""); // Username root, password kosong
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Koneksi Gagal: " + ex.getMessage());
        }
        return con;
    }
}   
