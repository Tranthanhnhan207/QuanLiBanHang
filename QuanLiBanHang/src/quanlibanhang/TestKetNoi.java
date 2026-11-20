package quanlibanhang;

import java.sql.Connection;

public class TestKetNoi {

    public static void main(String[] args) {
        Connection conn = KetNoi.getConnection();

        if (conn != null) {
            System.out.println("KET NOI THANH CONG!");
        } else {
            System.out.println("KET NOI THAT BAI!");
        }
    }
}
