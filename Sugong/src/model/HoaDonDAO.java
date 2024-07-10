package model;

import cnn.Connect_Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDonDAO {

    private Connect_Db connectDb;

    public HoaDonDAO() {
        connectDb = new Connect_Db();
    }

    public List<HoaDonDTO> getAllHoaDon() {
        List<HoaDonDTO> hoaDonList = new ArrayList<>();
        String query = "SELECT MA_HOA_DON, MA_KHACH_HANG, NGUOI_PHU_TRACH, THANH_TIEN, NGAY FROM Hoa_Don";
        try (Connection connection = connectDb.connectDB(); PreparedStatement ps = connection.prepareStatement(query); ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                int maHoaDon = resultSet.getInt("MA_HOA_DON");
                String maKhachHang = resultSet.getString("MA_KHACH_HANG");
                String nguoiPhuTrach = resultSet.getString("NGUOI_PHU_TRACH");
                float thanhTien = resultSet.getFloat("THANH_TIEN");
                Date ngay = resultSet.getDate("NGAY");
                HoaDonDTO hoaDon = new HoaDonDTO(maHoaDon, maKhachHang, nguoiPhuTrach, thanhTien, ngay);
                hoaDonList.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDonList;
    }

    public boolean updateHoaDon(HoaDonDTO hoaDon) {
        String sql = "UPDATE Hoa_Don SET MA_KHACH_HANG=?, NGUOI_PHU_TRACH=?, THANH_TIEN=?, NGAY=? WHERE MA_HOA_DON=?";
        try (Connection connection = connectDb.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, hoaDon.getMaKhachHang());
            pstm.setString(2, hoaDon.getNguoiPhuTrach());
            pstm.setFloat(3, hoaDon.getThanhTien());
            pstm.setDate(4, new java.sql.Date(hoaDon.getNgay().getTime()));
            pstm.setInt(5, hoaDon.getMaHoaDon());

            int rowsUpdated = pstm.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteHoaDon(int maHoaDon) {
        String sqlDeleteChiTiet = "DELETE FROM Chi_Tiet_Hoa_Don WHERE MA_HOA_DON = ?";
        String sqlDeleteHoaDon = "DELETE FROM Hoa_Don WHERE MA_HOA_DON = ?";

        try (Connection connection = connectDb.connectDB(); PreparedStatement pstmDeleteChiTiet = connection.prepareStatement(sqlDeleteChiTiet); PreparedStatement pstmDeleteHoaDon = connection.prepareStatement(sqlDeleteHoaDon)) {

            // Xóa các bản ghi từ bảng Chi_Tiet_Hoa_Don trước
            pstmDeleteChiTiet.setInt(1, maHoaDon);
            pstmDeleteChiTiet.executeUpdate();

            // Sau đó xóa hoá đơn từ bảng Hoa_Don
            pstmDeleteHoaDon.setInt(1, maHoaDon);
            int rowsDeleted = pstmDeleteHoaDon.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
