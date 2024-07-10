/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import frm_Kho.ChiTietKho;
import frm_Kho.DataHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BIN DAT
 */
public class CTKhoImp {

    public List<ChiTietKho> getList() {
        List<ChiTietKho> chiTietList = new ArrayList<>();

        try {
            Connection connection = DataHelper.openConnection();
            String query = "SELECT ctgd.MA_GIAO_DICH, ctgd.MA_NGUYEN_LIEU, ctgd.SO_LUONG, nl.TEN_NGUYEN_LIEU\n"
                    + "FROM Chi_Tiet_Giao_Dich_Kho ctgd\n"
                    + "JOIN Kho_Nguyen_Lieu nl ON ctgd.MA_NGUYEN_LIEU = nl.MA_NGUYEN_LIEU";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ChiTietKho chiTiet = new ChiTietKho();
                chiTiet.setmGD(resultSet.getInt("MA_GIAO_DICH"));
                chiTiet.setmNL(resultSet.getInt("MA_NGUYEN_LIEU"));
                chiTiet.setsLg(resultSet.getInt("SO_LUONG"));
                chiTiet.setTenNL(resultSet.getString("TEN_NGUYEN_LIEU"));

                // Thêm chi tiết vào danh sách
                chiTietList.add(chiTiet);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return chiTietList;
    }
}
