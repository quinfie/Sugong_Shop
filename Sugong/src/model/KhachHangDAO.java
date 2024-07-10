package model;

import cnn.Connect_Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KhachHangDAO {

    private Connect_Db connectDb;

    public KhachHangDAO() {
        connectDb = new Connect_Db();
    }

    public String getMaKhachHang(String sdt) {
        String ma = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connectDb.connectDB();
            String query = "SELECT MA_KHACH_HANG FROM Khach_Hang WHERE SO_DIEN_THOAI = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, sdt);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                ma = resultSet.getString("MA_KHACH_HANG");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ma;
    }
}
