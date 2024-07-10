/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChiTietDonHangDAO {

    private Connection connection;

    public ChiTietDonHangDAO(Connection connection) {   
        this.connection = connection;
    }

    public void themChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO) {
        String query = "INSERT INTO Chi_Tiet_Don_Dat_Hang (MA_DAT_HANG, MA_MON, SO_LUONG) VALUES (?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(query);

            pstm.setInt(1, chiTietDonHangDTO.getMaDatHang());
            pstm.setInt(2, chiTietDonHangDTO.getMaMon());
            pstm.setInt(3, chiTietDonHangDTO.getSoLuong());

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();  // Log the exception (you might want to use a logging framework instead)
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();  // Log the exception (again, consider using a logging framework)
                }
            }
        }
    }

}
