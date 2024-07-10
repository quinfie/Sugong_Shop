package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoaiThucDonDAO {

    private Connection connection;

    public LoaiThucDonDAO(Connection connection) {
        this.connection = connection;
    }

    public void createLoaiThucDon(LoaiThucDonDTO loaiThucDon) throws SQLException {
        String query = "INSERT INTO Loai_Thuc_Don (MA_LOAI_THUC_DON, TEN_LOAI_THUC_DON) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, loaiThucDon.getMaLoaiThucDon());
            stmt.setString(2, loaiThucDon.getTenLoaiThucDon());
            stmt.executeUpdate();
        }
    }

    public LoaiThucDonDTO readLoaiThucDon(int maLoaiThucDon) throws SQLException {
        String query = "SELECT * FROM Loai_Thuc_Don WHERE MA_LOAI_THUC_DON = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, maLoaiThucDon);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new LoaiThucDonDTO(rs.getInt("MA_LOAI_THUC_DON"), rs.getString("TEN_LOAI_THUC_DON"));
                }
            }
        }
        return null;
    }

    public List<LoaiThucDonDTO> readAllLoaiThucDon() throws SQLException {
        List<LoaiThucDonDTO> loaiThucDonList = new ArrayList<>();
        String query = "SELECT * FROM Loai_Thuc_Don";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                loaiThucDonList.add(new LoaiThucDonDTO(rs.getInt("MA_LOAI_THUC_DON"), rs.getString("TEN_LOAI_THUC_DON")));
            }
        }
        return loaiThucDonList;
    }

    public void updateLoaiThucDon(LoaiThucDonDTO loaiThucDon) throws SQLException {
        String query = "UPDATE Loai_Thuc_Don SET TEN_LOAI_THUC_DON = ? WHERE MA_LOAI_THUC_DON = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, loaiThucDon.getTenLoaiThucDon());
            stmt.setInt(2, loaiThucDon.getMaLoaiThucDon());
            stmt.executeUpdate();
        }
    }

    public void deleteLoaiThucDon(int maLoaiThucDon) throws SQLException {
        String query = "DELETE FROM Loai_Thuc_Don WHERE MA_LOAI_THUC_DON = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, maLoaiThucDon);
            stmt.executeUpdate();
        }
    }
}
