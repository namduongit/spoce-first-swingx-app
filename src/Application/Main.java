/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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


    public boolean checkConection() {
        boolean result = false;

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD)) {
            result = true;
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối: " + e.getMessage());
        }
        return result;
    }



    public void getQueryCustomer() {
        if (new Main().checkConection()) {
            try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
                 Statement statement = connection.createStatement()) {

                String sqlQuery = "SELECT * FROM KhachHang";
                ResultSet rs = statement.executeQuery(sqlQuery);

                while (rs.next()) {
                    String idCustomer = rs.getString("makh");
                    String fullName = rs.getString("tenkh");
                    System.out.println("ID: "+ idCustomer +", fullName: "+ fullName);
                }
            } catch (SQLException e) {
                System.out.println("Lỗi truy vấn: " + e.getMessage());
            }
        }
        else {
            System.out.println("Can't connect to MySQL");
        }
    }


    public static void main(String[] args) {
        new Main().getQueryCustomer();

    }
}
