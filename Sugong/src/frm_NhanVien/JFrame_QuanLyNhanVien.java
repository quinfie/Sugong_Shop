package frm_NhanVien;

import cnn.Connect_Db;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.ThongTinNguoiDungDAO;
import model.ThongTinNguoiDungDTO;

public class JFrame_QuanLyNhanVien extends javax.swing.JFrame {

    private DefaultTableModel dfm;
    private PreparedStatement pstm;
    private Connect_Db connect;
    private ThongTinNguoiDungDAO thongTinNguoiDungDAO = new ThongTinNguoiDungDAO();

    public JFrame_QuanLyNhanVien() {
        connect = new Connect_Db();
        initComponents();
        initTable();
    }

    private void getData() {
        List<ThongTinNguoiDungDTO> nguoiDungList = thongTinNguoiDungDAO.getAll();
        for (ThongTinNguoiDungDTO nguoiDung : nguoiDungList) {
            dfm.addRow(new Object[]{
                nguoiDung.getMaNguoiDung(),
                nguoiDung.getTenNguoiDung(),
                nguoiDung.getGioiTinh(),
                nguoiDung.getNgaySinh(),
                nguoiDung.getCccd(),
                nguoiDung.getDiaChi(),
                nguoiDung.getSdt()
            });
        }
    }

    private void initTable() {
        dfm = new DefaultTableModel();
        dfm.setColumnIdentifiers(new String[]{"Mã người dùng", "Tên người dùng", "Giới tính", "Ngày sinh", "CCCD", "Địa chỉ", "Số điện thoại"});
        tb_ThongTinNV.setModel(dfm);
        getData();

        TableColumn columnMa = tb_ThongTinNV.getColumnModel().getColumn(0);
        columnMa.setPreferredWidth(70);

        TableColumn columnTen = tb_ThongTinNV.getColumnModel().getColumn(1);
        columnTen.setPreferredWidth(260);

        TableColumn columnGioiTinh = tb_ThongTinNV.getColumnModel().getColumn(2);
        columnGioiTinh.setPreferredWidth(70);

        TableColumn columnNgaySinh = tb_ThongTinNV.getColumnModel().getColumn(3);
        columnNgaySinh.setPreferredWidth(100);

        TableColumn columnCCCD = tb_ThongTinNV.getColumnModel().getColumn(4);
        columnCCCD.setPreferredWidth(170);

        TableColumn columnDiaChi = tb_ThongTinNV.getColumnModel().getColumn(5);
        columnDiaChi.setPreferredWidth(520);

        TableColumn columnSDT = tb_ThongTinNV.getColumnModel().getColumn(6);
        columnSDT.setPreferredWidth(170);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tbModel = new javax.swing.JScrollPane();
        tb_ThongTinNV = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_MaNV = new javax.swing.JTextField();
        tf_TenNV = new javax.swing.JTextField();
        tf_NgaySinh = new javax.swing.JTextField();
        tf_DiaChi = new javax.swing.JTextField();
        tf_CCCD = new javax.swing.JTextField();
        tf_SDT = new javax.swing.JTextField();
        btn_New = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        tf_GioiTinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1263, 755));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setMinimumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setPreferredSize(new java.awt.Dimension(1263, 755));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("THÔNG TIN NHÂN VIÊN");

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        tb_ThongTinNV.setBackground(new java.awt.Color(255, 102, 102));
        tb_ThongTinNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_ThongTinNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_ThongTinNV.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tb_ThongTinNV.setRowHeight(28);
        tb_ThongTinNV.setShowGrid(true);
        tb_ThongTinNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ThongTinNVMouseClicked(evt);
            }
        });
        tbModel.setViewportView(tb_ThongTinNV);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Mã nhân viên");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Tên nhân viên");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Giới tính");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Ngày sinh");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Địa chỉ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("CCCD");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Số điện thoại");

        tf_MaNV.setBackground(new java.awt.Color(255, 153, 153));
        tf_MaNV.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_TenNV.setBackground(new java.awt.Color(255, 153, 153));
        tf_TenNV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_TenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TenNVActionPerformed(evt);
            }
        });

        tf_NgaySinh.setBackground(new java.awt.Color(255, 153, 153));
        tf_NgaySinh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_DiaChi.setBackground(new java.awt.Color(255, 153, 153));
        tf_DiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_CCCD.setBackground(new java.awt.Color(255, 153, 153));
        tf_CCCD.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_SDT.setBackground(new java.awt.Color(255, 153, 153));
        tf_SDT.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_New.setBackground(new java.awt.Color(51, 255, 51));
        btn_New.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_New.setForeground(new java.awt.Color(255, 255, 255));
        btn_New.setText("Làm mới");
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });

        btn_Insert.setBackground(new java.awt.Color(0, 153, 153));
        btn_Insert.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_Insert.setText("Thêm");
        btn_Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InsertMouseClicked(evt);
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

        btn_Search.setBackground(new java.awt.Color(204, 204, 0));
        btn_Search.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(255, 255, 255));
        btn_Search.setText("Tìm kiếm");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        tf_GioiTinh.setBackground(new java.awt.Color(255, 153, 153));
        tf_GioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_GioiTinh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(tf_CCCD)
                            .addComponent(tf_SDT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tf_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Search)
                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete)
                    .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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
                .addGap(551, 551, 551)
                .addComponent(jLabel7)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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

        String sql = "DELETE FROM Thong_Tin_Nguoi_Dung WHERE MA_NGUOI_DUNG=?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, tf_MaNV.getText());

            // Thực hiện truy vấn DELETE
            pstm.executeUpdate();

            // Xóa dữ liệu hiện tại trong bảng
            DefaultTableModel model = (DefaultTableModel) tb_ThongTinNV.getModel();
            model.setRowCount(0);

            // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
            getData();

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
        String sql = "UPDATE Thong_Tin_Nguoi_Dung SET TEN_NGUOI_DUNG=?, GIOI_TINH=?, NGAY_SINH=?, CCCD=?, DIA_CHI=?, SDT=? WHERE MA_NGUOI_DUNG=?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, tf_TenNV.getText());
            pstm.setString(2, tf_GioiTinh.getText());
            pstm.setString(3, tf_NgaySinh.getText());
            pstm.setString(4, tf_CCCD.getText());
            pstm.setString(5, tf_DiaChi.getText());
            pstm.setString(6, tf_SDT.getText());
            pstm.setString(7, tf_MaNV.getText());
            String cccd = tf_CCCD.getText();
            if (cccd.length() > 12) {
                cccd = cccd.substring(0, 12); // Cắt giá trị nếu vượt quá độ dài 12 ký tự
            }
            pstm.setString(4, cccd);
            // Thực hiện truy vấn UPDATE
            int rowsUpdated = pstm.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Dữ liệu được cập nhật thành công!");
                // Xóa dữ liệu hiện tại trong bảng
                DefaultTableModel model = (DefaultTableModel) tb_ThongTinNV.getModel();
                model.setRowCount(0);

                // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
                getData();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật không thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsertMouseClicked
        String sql = "INSERT INTO Thong_Tin_Nguoi_Dung (MA_NGUOI_DUNG, TEN_NGUOI_DUNG, GIOI_TINH, NGAY_SINH, CCCD, DIA_CHI, SDT) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            pstm = connect.connectDB().prepareStatement(sql);
            pstm.setString(1, tf_MaNV.getText());
            pstm.setString(2, tf_TenNV.getText());
            pstm.setString(3, tf_GioiTinh.getText());

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date ngaySinh = dateFormat.parse(tf_NgaySinh.getText());
                pstm.setDate(4, new java.sql.Date(ngaySinh.getTime()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không đúng định dạng! Vui lòng nhập lại theo định dạng yyyy-MM-dd.");
                return;
            }

            pstm.setString(5, tf_CCCD.getText());
            pstm.setString(6, tf_DiaChi.getText());
            pstm.setString(7, tf_SDT.getText());

            // Đặt giá trị CCCD ở vị trí thứ năm
            String cccd = tf_CCCD.getText();
            if (cccd.length() > 12) {
                cccd = cccd.substring(0, 12);
            }
            pstm.setString(5, cccd);

            // Thực hiện truy vấn INSERT
            int rowsInserted = pstm.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Dữ liệu được lưu thành công!");
                DefaultTableModel model = (DefaultTableModel) tb_ThongTinNV.getModel();
                model.setRowCount(0);

                // Hiển thị lại dữ liệu từ cơ sở dữ liệu trong bảng
                getData();
            } else {
                JOptionPane.showMessageDialog(this, "Lưu dữ liệu không thành công!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_InsertMouseClicked

    private void refresh() {
        tf_MaNV.setText("");
        tf_TenNV.setText("");
        tf_GioiTinh.setText("");
        tf_NgaySinh.setText("");
        tf_DiaChi.setText("");
        tf_CCCD.setText("");
        tf_SDT.setText("");

        DefaultTableModel model = (DefaultTableModel) tb_ThongTinNV.getModel();
        model.setRowCount(0);
        getData();
    }

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        refresh();

    }//GEN-LAST:event_btn_NewActionPerformed

    private void tf_TenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TenNVActionPerformed

    private void tb_ThongTinNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ThongTinNVMouseClicked
        int selectedRow = tb_ThongTinNV.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tb_ThongTinNV.getRowCount()) {
            tf_MaNV.setText(tb_ThongTinNV.getValueAt(selectedRow, 0).toString());
            tf_TenNV.setText(tb_ThongTinNV.getValueAt(selectedRow, 1).toString());
            tf_GioiTinh.setText(tb_ThongTinNV.getValueAt(selectedRow, 2).toString());
            tf_NgaySinh.setText(tb_ThongTinNV.getValueAt(selectedRow, 3).toString());
            tf_DiaChi.setText(tb_ThongTinNV.getValueAt(selectedRow, 5).toString());
            tf_CCCD.setText(tb_ThongTinNV.getValueAt(selectedRow, 4).toString());
            tf_SDT.setText(tb_ThongTinNV.getValueAt(selectedRow, 6).toString());

        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tb_ThongTinNVMouseClicked

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        String searchKeyword = tf_MaNV.getText();
        String sql = "SELECT * FROM Thong_Tin_Nguoi_Dung WHERE MA_NGUOI_DUNG = ?";
        try (Connection connection = connect.connectDB(); PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, searchKeyword);
            ResultSet rs = pstm.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tb_ThongTinNV.getModel();
            model.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng

            boolean found = false; // Biến kiểm tra xem có tìm thấy nhân viên hay không

            while (rs.next()) {
                // Lấy thông tin từ ResultSet
                String tenNguoiDung = rs.getString("TEN_NGUOI_DUNG");
                String gioiTinh = rs.getString("GIOI_TINH");
                String ngaySinh = rs.getString("NGAY_SINH");
                String cccd = rs.getString("CCCD");
                String diaChi = rs.getString("DIA_CHI");
                String sdt = rs.getString("SDT");

                // Hiển thị thông tin trong bảng
                Object[] rowData = {searchKeyword, tenNguoiDung, gioiTinh, ngaySinh, cccd, diaChi, sdt};
                model.addRow(rowData);

                found = true;
            }

            if (found) {
                JOptionPane.showMessageDialog(this, "Nhân viên được tìm thấy!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên!");
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
            java.util.logging.Logger.getLogger(JFrame_QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_QuanLyNhanVien().setVisible(true);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane tbModel;
    private javax.swing.JTable tb_ThongTinNV;
    private javax.swing.JTextField tf_CCCD;
    private javax.swing.JTextField tf_DiaChi;
    private javax.swing.JTextField tf_GioiTinh;
    private javax.swing.JTextField tf_MaNV;
    private javax.swing.JTextField tf_NgaySinh;
    private javax.swing.JTextField tf_SDT;
    private javax.swing.JTextField tf_TenNV;
    // End of variables declaration//GEN-END:variables

}
