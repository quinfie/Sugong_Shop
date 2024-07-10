/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm_KhachHang;

import cnn.Connect_Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class JFrame_QuanLyKhachHang extends javax.swing.JFrame {

    private DefaultTableModel dfm;
    private PreparedStatement pstm;
    private Connect_Db connect;

    public JFrame_QuanLyKhachHang() {
        connect = new Connect_Db();
        initComponents();
        initTable();
        getData(connect.connectDB());
    }

    private void initTable() {
        dfm = new DefaultTableModel();
        dfm.setColumnIdentifiers(new String[]{"Mã khách hàng", "Tên khách hàng", "Giới tính", "Ngày sinh", "Số lần mua hàng"});
        tb_ThongTinKH.setModel(dfm);

        TableColumn columnMa = tb_ThongTinKH.getColumnModel().getColumn(0);
        columnMa.setPreferredWidth(100);

        TableColumn columnTen = tb_ThongTinKH.getColumnModel().getColumn(1);
        columnTen.setPreferredWidth(260);

        TableColumn columnGioiTinh = tb_ThongTinKH.getColumnModel().getColumn(2);
        columnGioiTinh.setPreferredWidth(100);

        TableColumn columnNgaySinh = tb_ThongTinKH.getColumnModel().getColumn(3);
        columnNgaySinh.setPreferredWidth(100);

        TableColumn columnSoLanMuaHang = tb_ThongTinKH.getColumnModel().getColumn(4);
        columnSoLanMuaHang.setPreferredWidth(120);
    }

    private void getData(Connection connect) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM Khach_Hang";
            stmt = connect.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("MA_KHACH_HANG");
                String ten = rs.getString("TEN_KHACH_HANG");
                String gt = rs.getString("GIOI_TINH");
                String date = rs.getString("NGAY_SINH");
                int soLanMuaHang = rs.getInt("SO_LAN_MUA_HANG");
                dfm.addRow(new Object[]{id, ten, gt, date, soLanMuaHang});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tbModel = new javax.swing.JScrollPane();
        tb_ThongTinKH = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_MaKH = new javax.swing.JTextField();
        tf_TenKH = new javax.swing.JTextField();
        tf_NgaySinh = new javax.swing.JTextField();
        tf_SoLanMua = new javax.swing.JTextField();
        tf_GioiTinh = new javax.swing.JTextField();
        btn_Insert = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_New = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1263, 755));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setMinimumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setPreferredSize(new java.awt.Dimension(1263, 755));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("THÔNG TIN KHÁCH HÀNG");

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        tb_ThongTinKH.setBackground(new java.awt.Color(255, 102, 102));
        tb_ThongTinKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_ThongTinKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_ThongTinKH.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tb_ThongTinKH.setRowHeight(28);
        tb_ThongTinKH.setShowGrid(true);
        tb_ThongTinKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ThongTinKHMouseClicked(evt);
            }
        });
        tbModel.setViewportView(tb_ThongTinKH);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Mã khách hàng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Tên khách hàng");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Giới tính");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Ngày sinh");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Số lần mua");

        tf_MaKH.setBackground(new java.awt.Color(255, 153, 153));
        tf_MaKH.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_TenKH.setBackground(new java.awt.Color(255, 153, 153));
        tf_TenKH.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_NgaySinh.setBackground(new java.awt.Color(255, 153, 153));
        tf_NgaySinh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_SoLanMua.setBackground(new java.awt.Color(255, 153, 153));
        tf_SoLanMua.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_GioiTinh.setBackground(new java.awt.Color(255, 153, 153));
        tf_GioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_GioiTinh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_Insert.setBackground(new java.awt.Color(0, 153, 153));
        btn_Insert.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_Insert.setText("Thêm");
        btn_Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InsertMouseClicked(evt);
            }
        });

        btn_Search.setBackground(new java.awt.Color(204, 204, 0));
        btn_Search.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(255, 255, 255));
        btn_Search.setText("Tìm kiếm");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_Update.setBackground(new java.awt.Color(255, 51, 102));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Cập nhật");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setBackground(new java.awt.Color(204, 51, 255));
        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Xóa ");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_New.setBackground(new java.awt.Color(51, 255, 51));
        btn_New.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_New.setForeground(new java.awt.Color(255, 255, 255));
        btn_New.setText("Làm mới");
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(tf_SoLanMua)))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_SoLanMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbModel, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?") == JOptionPane.NO_OPTION) {
            return;
        }

        String sql = "DELETE FROM Khach_Hang WHERE MA_KHACH_HANG=?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, tf_MaKH.getText());

            // Thực hiện truy vấn DELETE
            pstm.executeUpdate();

            // Xóa dữ liệu hiện tại trong bảng
            DefaultTableModel model = (DefaultTableModel) tb_ThongTinKH.getModel();
            model.setRowCount(0);

            // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
            getData(connection);

            // Xóa dữ liệu đang hiển thị trên các trường nhập liệu
            btn_NewActionPerformed(evt);

            JOptionPane.showMessageDialog(this, "Dữ liệu đã bị xóa.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật?") == JOptionPane.NO_OPTION) {
            return;
        }
        String sql = "UPDATE Khach_Hang SET TEN_KHACH_HANG=?, GIOI_TINH=?, NGAY_SINH=?, SO_LAN_MUA_HANG=? WHERE MA_KHACH_HANG=?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, tf_TenKH.getText());
            pstm.setString(2, tf_GioiTinh.getText());
            pstm.setString(3, tf_NgaySinh.getText());
            pstm.setInt(4, Integer.parseInt(tf_SoLanMua.getText()));
            pstm.setString(5, tf_MaKH.getText());

            // Thực hiện truy vấn UPDATE
            int rowsUpdated = pstm.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Dữ liệu được cập nhật thành công!");
                // Xóa dữ liệu hiện tại trong bảng
                DefaultTableModel model = (DefaultTableModel) tb_ThongTinKH.getModel();
                model.setRowCount(0);

                // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
                getData(connection);
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật không thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsertMouseClicked
        String sql = "INSERT INTO Khach_Hang (MA_KHACH_HANG, TEN_KHACH_HANG, GIOI_TINH, NGAY_SINH, SO_LAN_MUA_HANG) VALUES (?, ?, ?, ?, ?)";
        try {
            // Initialize pstm before setting parameters
            pstm = connect.connectDB().prepareStatement(sql);
            pstm.setString(1, tf_MaKH.getText());
            pstm.setString(2, tf_TenKH.getText());
            pstm.setString(3, tf_GioiTinh.getText());
            pstm.setString(4, tf_NgaySinh.getText());
            pstm.setInt(5, Integer.parseInt(tf_SoLanMua.getText()));

            // Thực hiện truy vấn INSERT
            int rowsInserted = pstm.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Dữ liệu được lưu thành công!");
                // Xóa dữ liệu hiện tại trong bảng
                DefaultTableModel model = (DefaultTableModel) tb_ThongTinKH.getModel();
                model.setRowCount(0);

                // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
                getData(connect.connectDB());
            } else {
                JOptionPane.showMessageDialog(this, "Lưu dữ liệu không thành công!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_InsertMouseClicked

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        //Xóa nội dung hiển thị
        tf_MaKH.setText("");
        tf_TenKH.setText("");
        tf_GioiTinh.setText("");
        tf_NgaySinh.setText("");
        tf_SoLanMua.setText("");
    }//GEN-LAST:event_btn_NewActionPerformed

    private void tb_ThongTinKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ThongTinKHMouseClicked
        int selectedRow = tb_ThongTinKH.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tb_ThongTinKH.getRowCount()) {
            tf_MaKH.setText(tb_ThongTinKH.getValueAt(selectedRow, 0).toString());
            tf_TenKH.setText(tb_ThongTinKH.getValueAt(selectedRow, 1).toString());
            tf_GioiTinh.setText(tb_ThongTinKH.getValueAt(selectedRow, 2).toString());
            tf_NgaySinh.setText(tb_ThongTinKH.getValueAt(selectedRow, 3).toString());
            tf_SoLanMua.setText(tb_ThongTinKH.getValueAt(selectedRow, 4).toString());

        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tb_ThongTinKHMouseClicked

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        String searchKeyword = tf_MaKH.getText();
        String sql = "SELECT * FROM Khach_Hang WHERE MA_KHACH_HANG = ?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, searchKeyword);
            ResultSet rs = pstm.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tb_ThongTinKH.getModel();
            model.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng

            boolean found = false; // Biến kiểm tra xem có tìm thấy nhân viên hay không

            while (rs.next()) {
                // Lấy thông tin từ ResultSet
                String tenNguoiDung = rs.getString("TEN_NGUOI_DUNG");
                String gioiTinh = rs.getString("GIOI_TINH");
                String ngaySinh = rs.getString("NGAY_SINH");
                String soLanMua = rs.getString("SO_LAN_MUA_HANG");

                // Hiển thị thông tin trong bảng
                Object[] rowData = {searchKeyword, tenNguoiDung, gioiTinh, ngaySinh, soLanMua};
                model.addRow(rowData);

                found = true;
            }

            if (found) {
                JOptionPane.showMessageDialog(this, "Khách hàng được tìm thấy!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_QuanLyKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane tbModel;
    private javax.swing.JTable tb_ThongTinKH;
    private javax.swing.JTextField tf_GioiTinh;
    private javax.swing.JTextField tf_MaKH;
    private javax.swing.JTextField tf_NgaySinh;
    private javax.swing.JTextField tf_SoLanMua;
    private javax.swing.JTextField tf_TenKH;
    // End of variables declaration//GEN-END:variables

}
