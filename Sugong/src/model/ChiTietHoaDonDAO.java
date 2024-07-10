package model;

import cnn.Connect_Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChiTietHoaDonDAO {

    private Connect_Db connectDb;

    public ChiTietHoaDonDAO() {
        connectDb = new Connect_Db();
    }

    public void themChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDonDTO) {
        try {
            String query = "INSERT INTO Chi_Tiet_Hoa_Don (MA_HOA_DON, MA_MON, SO_LUONG_MON) VALUES (?, ?, ?)";
            PreparedStatement statement = connectDb.connectDB().prepareStatement(query);

            statement.setInt(1, chiTietHoaDonDTO.getMaHoaDon());
            statement.setInt(2, chiTietHoaDonDTO.getMaMon());
            statement.setInt(3, chiTietHoaDonDTO.getSoLuongMon());

            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateChiTietHoaDon(int maHoaDon, int maMon, int soLuong) {
        Connection connection = null;
        PreparedStatement statement = null;
        boolean updated = false;

        try {
            connection = connectDb.connectDB();

            String sql = "UPDATE Chi_Tiet_Hoa_Don SET SO_LUONG_MON = ? WHERE MA_HOA_DON = ? AND MA_MON = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, soLuong);
            statement.setInt(2, maHoaDon);
            statement.setInt(3, maMon);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                updated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updated;
    }
}
