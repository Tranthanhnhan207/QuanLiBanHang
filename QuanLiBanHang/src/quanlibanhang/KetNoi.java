package quanlibanhang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {

    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost;"
                   + "instanceName=SQLEXPRESS;"
                   + "databaseName=QLBanHang;"
                   + "encrypt=true;"
                   + "trustServerCertificate=true;"
                   + "integratedSecurity=true;";

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Ket noi SQL Server thanh cong!");
            return conn;

        } catch (SQLException e) {
            System.out.println("Loi ket noi: " + e.getMessage());
            return null;
        }
    }

    static Connection layKetNoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

