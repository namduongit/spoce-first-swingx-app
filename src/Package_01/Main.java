/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package_01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author NamDuong
 */

@SuppressWarnings("unused")
public class Main {
    // Link cua CSDL: jdbc:mysql://<host>:<port>/<database_name>
    public static final String HOST = "localhost";
    public static final int PORT = 3306;
    public static final String DATABASE_NAME = "qlsieuthi";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "NDuong205";


    public static final String CONNECTION_URL = String.format(
        "jdbc:mysql://%s:%d/%s", HOST, PORT, DATABASE_NAME
    );

    public void getConection() {
        try (Connection conection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD)) {
            System.out.println("Ket noi thanh cong");
        } catch(SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }


    public static void main(String[] args) {
        // System.out.println("Hello world!");
        new Main().getConection();
    }
}
