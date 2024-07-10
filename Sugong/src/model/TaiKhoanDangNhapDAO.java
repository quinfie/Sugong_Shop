package model;

import cnn.Connect_Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaiKhoanDangNhapDAO {

    private Connect_Db connectDb;

    public TaiKhoanDangNhapDAO() {
        connectDb = new Connect_Db();
    }

    public TaiKhoanDangNhapDTO getTaiKhoanByCredentials(String username, String password) {
        TaiKhoanDangNhapDTO taiKhoan = null;
        try (Connection connection = connectDb.connectDB()) {
            String query = "SELECT * FROM Tai_Khoan_Dang_Nhap WHERE TEN_DANG_NHAP = ? AND MAT_KHAU = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                taiKhoan = new TaiKhoanDangNhapDTO();
                taiKhoan.setTenDangNhap(resultSet.getString("TEN_DANG_NHAP"));
                taiKhoan.setMatKhau(resultSet.getString("MAT_KHAU"));
                taiKhoan.setVaiTro(resultSet.getInt("VAI_TRO"));
                taiKhoan.setMaNguoiDung(resultSet.getString("MA_NGUOI_DUNG"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return taiKhoan;
    }
}
