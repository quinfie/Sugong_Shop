/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import frm_Kho.GDKho;
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
public class GDKhoImp implements GDKhoDao {

    @Override
    public List<GDKho> getList() {
        try {
            Connection con = DataHelper.openConnection();
            String sql = "SELECT * FROM Giao_Dich_Kho WHERE LOAI_GIAO_DICH = N'Xuất hàng'";
            List<GDKho> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GDKho gdkho = new GDKho();
                gdkho.setMaGD(rs.getInt("MA_GIAO_DICH"));
                gdkho.setNgayGio(rs.getDate("NGAY_GIO"));
                gdkho.setMaND(rs.getString("MA_NGUOI_DUNG"));
                gdkho.setLoaiGD(rs.getString("LOAI_GIAO_DICH"));
                list.add(gdkho);
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

    public static void main(String[] args) {
        GDKhoDao gDKhoDao = new GDKhoImp();
        System.out.println(gDKhoDao.getList());
    }
}
