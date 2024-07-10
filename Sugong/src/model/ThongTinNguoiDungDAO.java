package model;

import cnn.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ThongTinNguoiDungDAO {

    private Connect_Db connectDb;

    public ThongTinNguoiDungDAO() {
        connectDb = new Connect_Db();
    }

    public List<ThongTinNguoiDungDTO> getAll() {
        List<ThongTinNguoiDungDTO> danhSachThongTin = new ArrayList<>();
        String query = "SELECT * FROM Thong_Tin_Nguoi_Dung";

        try (Connection con = connectDb.connectDB(); PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ThongTinNguoiDungDTO thongTin = new ThongTinNguoiDungDTO(
                        rs.getString("MA_NGUOI_DUNG"),
                        rs.getString("TEN_NGUOI_DUNG"),
                        rs.getString("GIOI_TINH"),
                        rs.getDate("NGAY_SINH"),
                        rs.getString("CCCD"),
                        rs.getString("DIA_CHI"),
                        rs.getString("SDT")
                );
                danhSachThongTin.add(thongTin);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy thông tin người dùng từ cơ sở dữ liệu.");
            ex.printStackTrace();
        }
        return danhSachThongTin;
    }

    public ThongTinNguoiDungDTO layThongTinNguoiDung(String maNguoiDung) {
        ThongTinNguoiDungDTO thongTin = null;
        String query = "SELECT * FROM Thong_Tin_Nguoi_Dung WHERE MA_NGUOI_DUNG=?";

        try (Connection con = connectDb.connectDB()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, maNguoiDung);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                thongTin = new ThongTinNguoiDungDTO(
                        rs.getString("MA_NGUOI_DUNG"),
                        rs.getString("TEN_NGUOI_DUNG"),
                        rs.getString("GIOI_TINH"),
                        rs.getDate("NGAY_SINH"),
                        rs.getString("CCCD"),
                        rs.getString("DIA_CHI"),
                        rs.getString("SDT")
                );
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy thông tin người dùng từ cơ sở dữ liệu.");
        }

        return thongTin;
    }

    public String layMaNguoiPhuTrach(String tenNguoiPhuTrach) {
        String maNguoiPhuTrach = null;
        String query = "SELECT MA_NGUOI_DUNG FROM Thong_Tin_Nguoi_Dung WHERE TEN_NGUOI_DUNG = ?";
        try (Connection con = connectDb.connectDB(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, tenNguoiPhuTrach);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    maNguoiPhuTrach = resultSet.getString("MA_NGUOI_DUNG");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy Mã người phụ trách từ cơ sở dữ liệu.");
            ex.printStackTrace();
        }
        return maNguoiPhuTrach;
    }

    public String layTenNguoiPhuTrach(String maNguoiPhuTrach) {
        String tenNguoiPhuTrach = null;
        String query = "SELECT TEN_NGUOI_DUNG FROM Thong_Tin_Nguoi_Dung WHERE MA_NGUOI_DUNG = ?";
        try (Connection con = connectDb.connectDB(); PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, maNguoiPhuTrach);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    tenNguoiPhuTrach = resultSet.getString("TEN_NGUOI_DUNG");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy Tên người phụ trách từ cơ sở dữ liệu.");
            ex.printStackTrace();
        }
        return tenNguoiPhuTrach;
    }

}
