/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ThucDonDAO {

    private Connection connect;

    public ThucDonDAO(Connection connect) {
        this.connect = connect;
    }

    public List<ThucDonDTO> getAllThucDon() throws SQLException {
        List<ThucDonDTO> thucDonList = new ArrayList<>();
        String query = "SELECT * FROM Thuc_Don";

        try (Statement statement = connect.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                ThucDonDTO thucDon = new ThucDonDTO();
                thucDon.setMaMon(resultSet.getInt("MA_MON"));
                thucDon.setTenMon(resultSet.getString("TEN_MON"));
                thucDon.setThanhPhan(resultSet.getString("THANH_PHAN"));
                thucDon.setGia(resultSet.getInt("GIA"));
                thucDon.setHinhAnh(resultSet.getString("HINH_ANH"));
                thucDon.setMaLoaiThucDon(resultSet.getInt("MA_LOAI_THUC_DON"));
                thucDonList.add(thucDon);
            }
        }
        return thucDonList;
    }

    public int layMaMonTuTenMon(String tenMon) {
        int maMon = -1; // Giả sử không tìm thấy mã món
        if (connect != null) {
            try {
                String query = "SELECT MA_MON FROM Thuc_Don WHERE TEN_MON = ?";
                PreparedStatement statement = connect.prepareStatement(query);
                statement.setString(1, tenMon);
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    maMon = resultSet.getInt("MA_MON");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return maMon;
    }

    public void createThucDon(ThucDonDTO thucDon) throws SQLException {
        String query = "INSERT INTO Thuc_Don (MA_MON, TEN_MON, THANH_PHAN, GIA, HINH_ANH, MA_LOAI_THUC_DON) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, thucDon.getMaMon());
            stmt.setString(2, thucDon.getTenMon());
            stmt.setString(3, thucDon.getThanhPhan());
            stmt.setInt(4, thucDon.getGia());
            stmt.setString(5, thucDon.getHinhAnh());
            stmt.setInt(6, thucDon.getMaLoaiThucDon());
            stmt.executeUpdate();
        }
    }

    public ThucDonDTO readThucDon(int maMon) throws SQLException {
        String query = "SELECT * FROM Thuc_Don WHERE MA_MON = ?";
        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, maMon);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ThucDonDTO(
                            rs.getInt("MA_MON"),
                            rs.getString("TEN_MON"),
                            rs.getString("THANH_PHAN"),
                            rs.getInt("GIA"),
                            rs.getString("HINH_ANH"),
                            rs.getInt("MA_LOAI_THUC_DON")
                    );
                }
            }
        }
        return null;
    }

    public void updateThucDon(ThucDonDTO thucDon) throws SQLException {
        String query = "UPDATE Thuc_Don SET TEN_MON = ?, THANH_PHAN = ?, GIA = ?, HINH_ANH = ?, MA_LOAI_THUC_DON = ? WHERE MA_MON = ?";
        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, thucDon.getTenMon());
            stmt.setString(2, thucDon.getThanhPhan());
            stmt.setInt(3, thucDon.getGia());
            stmt.setString(4, thucDon.getHinhAnh());
            stmt.setInt(5, thucDon.getMaLoaiThucDon());
            stmt.setInt(6, thucDon.getMaMon());
            stmt.executeUpdate();
        }
    }

    public void deleteThucDon(int maMon) throws SQLException {
        String query = "DELETE FROM Thuc_Don WHERE MA_MON = ?";
        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, maMon);
            stmt.executeUpdate();
        }
    }

}
