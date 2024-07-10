/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.DonDatHangDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;

public class DonDatHangDAO {

    private Connection connect;

    public DonDatHangDAO(Connection connect) {
        this.connect = connect;
    }

    public List<DonDatHangDTO> getAllDonDatHang() {
        List<DonDatHangDTO> donDatHangList = new ArrayList<>();
        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Don_Dat_Hang");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            while (resultSet.next()) {
                DonDatHangDTO donDatHang = new DonDatHangDTO();
                donDatHang.setMaDatHang(resultSet.getInt("MA_DAT_HANG"));
                donDatHang.setNgayDatHang(resultSet.getDate("NGAY_DAT_HANG"));
                donDatHang.setMaKhachHang(resultSet.getString("MA_KHACH_HANG"));
                donDatHang.setNguoiPhuTrach(resultSet.getString("NGUOI_PHU_TRACH"));
                donDatHang.setTrangThaiDonHang(resultSet.getString("TRANG_THAI_DON_HANG"));
                donDatHang.setThanhTien(resultSet.getFloat("THANH_TIEN"));

                donDatHangList.add(donDatHang);
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(DonDatHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donDatHangList;
    }

    public int themDonDatHang(DonDatHangDTO donDatHangDTO) throws SQLException {
        String query = "INSERT INTO Don_Dat_Hang (NGAY_DAT_HANG, MA_KHACH_HANG, NGUOI_PHU_TRACH, TRANG_THAI_DON_HANG, THANH_TIEN) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = connect.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setDate(1, new java.sql.Date(donDatHangDTO.getNgayDatHang().getTime()));
            ps.setString(2, donDatHangDTO.getMaKhachHang());
            ps.setString(3, donDatHangDTO.getNguoiPhuTrach());
            ps.setString(4, donDatHangDTO.getTrangThaiDonHang());
            ps.setFloat(5, donDatHangDTO.getThanhTien());

            ps.executeUpdate();

            // Lấy mã đơn đặt hàng vừa được tạo
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1; // Trả về -1 nếu không có mã đơn đặt hàng nào được tạo
    }
}
