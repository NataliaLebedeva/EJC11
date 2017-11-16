package com.epam.lessons.lesson16112017.jdbc;

import java.io.InputStream;
import java.nio.file.Files;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by Nata on 16.11.2017.
 */
public class HWjdbc {

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        InputStream resourceAsStream = HWjdbc.class.getResourceAsStream("/h2.sql");
        Scanner scanner = new Scanner(resourceAsStream);


        try (Connection con = DriverManager.getConnection("jdbc:h2:mem:test; DB_CLOSE_DELAY = -1", "", "");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("")) {


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
