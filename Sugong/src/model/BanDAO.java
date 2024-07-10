package model;

import cnn.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BanDAO {

    public BanDAO() {
        connect = Db.connectDB();
    }

    private Connect_Db Db = new Connect_Db();
    private Connection connect;

    public BanDAO(Connection connect) {
        connect = Db.connectDB();
    }

    public List<BanDTO> getAllBans() throws SQLException {
        List<BanDTO> bans = new ArrayList<>();

        String query = "SELECT Ma_Ban, TINH_TRANG_BAN FROM Ban";
        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int maBan = rs.getInt("Ma_Ban");
                String tinhTrangBan = rs.getString("TINH_TRANG_BAN");
                bans.add(new BanDTO(maBan, tinhTrangBan));
            }
        }

        return bans;
    }

    // Thêm mới một bản ghi vào bảng BanDTO
    public void themMoiBan(int maBan, String tinhTrangBan) {
        try {
            String sql = "INSERT INTO Ban (MA_BAN, TINH_TRANG_BAN) VALUES (?, ?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setInt(1, maBan);
            pstmt.setString(2, tinhTrangBan);
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("Thêm mới bàn thành công.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi khi thêm mới bàn: " + ex.getMessage());
        }
    }

    // Cập nhật trạng thái của một bàn
    public void capNhatTrangThaiBan(int maBan, String tinhTrangBanMoi) {
        try {
            String sql = "UPDATE Ban SET TINH_TRANG_BAN = ? WHERE MA_BAN = ?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, tinhTrangBanMoi);
            pstmt.setInt(2, maBan);
            int rowsAffected = pstmt.executeUpdate();
            pstmt.close();
            if (rowsAffected > 0) {
                System.out.println("Cập nhật trạng thái của bàn thành công.");
            } else {
                System.out.println("Không tìm thấy bàn có mã: " + maBan);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi khi cập nhật trạng thái của bàn: " + ex.getMessage());
        }
    }

    // Lấy trạng thái của một bàn dựa trên mã bàn
    public String layTrangThaiBan(int maBan) {
        try {
            String sql = "SELECT TINH_TRANG_BAN FROM Ban WHERE MA_BAN = ?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setInt(1, maBan);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("TINH_TRANG_BAN");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi khi lấy trạng thái của bàn: " + ex.getMessage());
        }
        return null;
    }

}
