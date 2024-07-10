/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import frm_Kho.KhoNguyenLieu;
import frm_Kho.DataHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BIN DAT
 */
public class KhoNLDAOImp implements KhoNLDAO {

    @Override
    public List<KhoNguyenLieu> getList() {
        try {
            Connection con = DataHelper.openConnection();
            String sql = "Select * from Kho_Nguyen_Lieu";
            List<KhoNguyenLieu> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhoNguyenLieu khoNguyenLieu = new KhoNguyenLieu();
                khoNguyenLieu.setMaNL(rs.getInt("MA_NGUYEN_LIEU"));
                khoNguyenLieu.setTenNL(rs.getString("TEN_NGUYEN_LIEU"));
                khoNguyenLieu.setsL(rs.getInt("SO_LUONG_TON"));
                khoNguyenLieu.setdVT(rs.getString("DON_VI_TINH"));
                list.add(khoNguyenLieu);
            }
            ps.close();
            rs.close();
            con.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertKhoNguyenLieu(KhoNguyenLieu khoNguyenLieu) {
        try {
            Connection con = DataHelper.openConnection();
            String sql = "INSERT INTO Kho_Nguyen_Lieu (MA_NGUYEN_LIEU, TEN_NGUYEN_LIEU, SO_LUONG_TON, DON_VI_TINH) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, khoNguyenLieu.getMaNL());
            ps.setString(2, khoNguyenLieu.getTenNL());
            ps.setInt(3, khoNguyenLieu.getsL());
            ps.setString(4, khoNguyenLieu.getdVT());
            int rowsInserted = ps.executeUpdate();
            ps.close();
            con.close();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteKhoNguyenLieu(int maNguyenLieu) {
        try {
            Connection con = DataHelper.openConnection();
            String sql = "DELETE FROM Kho_Nguyen_Lieu WHERE MA_NGUYEN_LIEU = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, maNguyenLieu);
            int rowsDeleted = ps.executeUpdate();
            ps.close();
            con.close();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateKhoNguyenLieu(KhoNguyenLieu khoNguyenLieu) {
        try {
            Connection con = DataHelper.openConnection();
            String sql = "UPDATE Kho_Nguyen_Lieu SET TEN_NGUYEN_LIEU = ?, SO_LUONG_TON = ?, DON_VI_TINH = ? WHERE MA_NGUYEN_LIEU = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, khoNguyenLieu.getTenNL());
            ps.setInt(2, khoNguyenLieu.getsL());
            ps.setString(3, khoNguyenLieu.getdVT());
            ps.setInt(4, khoNguyenLieu.getMaNL());
            int rowsUpdated = ps.executeUpdate();
            ps.close();
            con.close();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        KhoNLDAO khoNLDao = new KhoNLDAOImp();
        System.out.println(khoNLDao.getList());
    }

}
