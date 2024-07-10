package frm_DonHang;

import cnn.Connect_Db;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.ThongTinNguoiDungDAO;

public class JFrame_QuanLiDonDathang extends javax.swing.JFrame {

    private ThongTinNguoiDungDAO ttnd;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private DefaultTableModel model;
    private Connect_Db Db = new Connect_Db();
    private Connection connect;

    public JFrame_QuanLiDonDathang() {
        ttnd = new ThongTinNguoiDungDAO();
        connect = Db.connectDB();
        initComponents();
        init_DonHang();
        init_ChiTietDon();
        init_ComboBox_ThucDon();
        fillNguoiPhuTrach();
        MA_MON.setSelectedItem(null);
        cb_npt.setSelectedItem(null);
        cb_tthd.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDonDatHang = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChiTietDon = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NGAY_DAT_HANG = new javax.swing.JFormattedTextField();
        MA_KHACH_HANG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MA_DAT_HANG = new javax.swing.JTextField();
        BtnUpdate = new javax.swing.JButton();
        xoaMon = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        XoaDonHang = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cb_npt = new javax.swing.JComboBox<>();
        cb_tthd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MA_MON = new javax.swing.JComboBox<>();
        SO_LUONG = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        MA_CHI_TIET_DON = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lí đơn hàng");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1384, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setDoubleBuffered(false);
        jPanel3.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jPanel3.setRequestFocusEnabled(false);

        jScrollPane2.setAlignmentX(0.0F);
        jScrollPane2.setAlignmentY(0.0F);

        tableDonDatHang.setAutoCreateRowSorter(true);
        tableDonDatHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tableDonDatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableDonDatHang.setAlignmentX(0.0F);
        tableDonDatHang.setAlignmentY(0.0F);
        tableDonDatHang.setAutoscrolls(false);
        tableDonDatHang.setRowHeight(25);
        tableDonDatHang.setShowGrid(true);
        tableDonDatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDonDatHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDonDatHang);

        tableChiTietDon.setAutoCreateRowSorter(true);
        tableChiTietDon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tableChiTietDon.setAlignmentX(0.0F);
        tableChiTietDon.setAlignmentY(0.0F);
        tableChiTietDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableChiTietDon.setAutoscrolls(false);
        tableChiTietDon.setRowHeight(25);
        tableChiTietDon.setRowSelectionAllowed(false);
        tableChiTietDon.setShowGrid(true);
        tableChiTietDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChiTietDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableChiTietDon);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DANH SÁCH ĐƠN ĐẶT HÀNG");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CHI TIẾT ĐƠN ĐẶT HÀNG");

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã đặt hàng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ngày đặt hàng");

        NGAY_DAT_HANG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        NGAY_DAT_HANG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MA_KHACH_HANG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Trạng thái hóa đơn");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mã khách hàng");

        MA_DAT_HANG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MA_DAT_HANG.setEnabled(false);

        BtnUpdate.setBackground(new java.awt.Color(255, 51, 102));
        BtnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnUpdate.setText("Cập Nhật Thông Tin");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        xoaMon.setBackground(new java.awt.Color(102, 102, 255));
        xoaMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xoaMon.setText("Xóa Món Ăn");
        xoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaMonActionPerformed(evt);
            }
        });

        BtnClear.setBackground(new java.awt.Color(0, 153, 102));
        BtnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnClear.setText("Làm mới");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 100));
        jSeparator1.setVerifyInputWhenFocusTarget(false);

        XoaDonHang.setBackground(new java.awt.Color(204, 153, 255));
        XoaDonHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        XoaDonHang.setText("Xóa Đơn Hàng");
        XoaDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaDonHangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Người phụ trách");

        cb_tthd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa thanh toán", "Đã thanh toán" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mã món");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Số lượng");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Mã chi tiết đơn");

        MA_CHI_TIET_DON.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NGAY_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_npt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_tthd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MA_KHACH_HANG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MA_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SO_LUONG, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MA_CHI_TIET_DON)
                        .addComponent(MA_MON, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(XoaDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(XoaDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(MA_CHI_TIET_DON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MA_MON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SO_LUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(MA_KHACH_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MA_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(NGAY_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cb_npt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cb_tthd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDonDatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDonDatHangMouseClicked
        int selectedRow = tableDonDatHang.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tableDonDatHang.getRowCount()) {
            try {
                showInformation_DonHang(selectedRow);
                int mdh = Integer.parseInt(tableDonDatHang.getValueAt(selectedRow, 0).toString());
                populateChiTietDonDatHang(mdh);
            } catch (SQLException ex) {
                Logger.getLogger(JFrame_QuanLiDonDathang.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tableDonDatHangMouseClicked

    public void clearTextDonHang() {
        MA_DAT_HANG.setText("");
        NGAY_DAT_HANG.setText("");
        MA_KHACH_HANG.setText("");
        cb_npt.setSelectedItem(null);
        cb_tthd.setSelectedItem(null);
    }

    public void clearTextChiTietDon() {
        MA_MON.setSelectedItem(null);
        SO_LUONG.setText("");
        MA_CHI_TIET_DON.setText("");
    }

    private void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        clearTextChiTietDon();
        clearTextDonHang();

    }//GEN-LAST:event_BtnClearActionPerformed

    private void tableChiTietDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiTietDonMouseClicked
        int selectedRow = tableChiTietDon.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tableChiTietDon.getRowCount()) {
            showInformation_ChiTietDon(selectedRow);
        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tableChiTietDonMouseClicked

    private void updateDonDatHang(int maDatHang, Date ngayDatHang, String maKhachHang, String nguoiPhuTrach, String trangThai) throws SQLException {
        PreparedStatement preparedStatement = connect.prepareStatement(
                "UPDATE Don_Dat_Hang SET NGAY_DAT_HANG = ?, MA_KHACH_HANG = ?, NGUOI_PHU_TRACH = ?, TRANG_THAI_DON_HANG = ? WHERE MA_DAT_HANG = ?"
        );
        preparedStatement.setDate(1, ngayDatHang);
        preparedStatement.setString(2, maKhachHang);
        preparedStatement.setString(3, nguoiPhuTrach);
        preparedStatement.setString(4, trangThai);
        preparedStatement.setInt(5, maDatHang);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private void updateChiTietDonDatHang(int maChiTietDon, int maMon, int soLuong) throws SQLException {
        PreparedStatement preparedStatement = connect.prepareStatement(
                "UPDATE Chi_Tiet_Don_Dat_Hang SET MA_MON = ?, SO_LUONG = ? WHERE MA_CHI_TIET = ?"
        );
        preparedStatement.setInt(1, maMon);
        preparedStatement.setInt(2, soLuong);
        preparedStatement.setInt(3, maChiTietDon);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private void updateSelectedMaMon() {
        if (!MA_CHI_TIET_DON.getText().isEmpty() && !SO_LUONG.getText().isEmpty()) {
            try {
                int maChiTiet = Integer.parseInt(MA_CHI_TIET_DON.getText());
                int soLuong = Integer.parseInt(SO_LUONG.getText());
                // Assuming you need to parse the selected item in the ComboBox to get the MA_MON
                String selectedItem = (String) MA_MON.getSelectedItem();
                if (selectedItem != null) {
                    // Splitting the selected item to get the MA_MON
                    int maMon = Integer.parseInt(selectedItem.split(" - ")[0]);
                    updateChiTietDonDatHang(maChiTiet, maMon, soLuong); // Updated method with maMon parameter
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ: " + e.getMessage());
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại: " + e.getMessage());
            }
        }
    }

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            // Lấy dữ liệu từ các trường văn bản
            int maDatHang = Integer.parseInt(MA_DAT_HANG.getText());
            String ngayDatHangText = NGAY_DAT_HANG.getText(); // Chuỗi ngày tháng từ trường văn bản

            // Chuyển đổi chuỗi ngày tháng thành kiểu java.sql.Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date ngayDatHang = new Date(dateFormat.parse(ngayDatHangText).getTime());

            String maKhachHang = MA_KHACH_HANG.getText();

            String npt = String.valueOf(cb_npt.getSelectedItem());
            String maNPT = ttnd.layMaNguoiPhuTrach(npt);

            String trangThai = String.valueOf(cb_tthd.getSelectedItem());

            // Cập nhật thông tin đơn đặt hàng
            updateDonDatHang(maDatHang, ngayDatHang, maKhachHang, maNPT, trangThai);

            // Cập nhật chi tiết đơn đặt hàng nếu có thông tin
            updateSelectedMaMon();
            JOptionPane
                    .showMessageDialog(null, "Cập nhật thành công!");
            clearTable(tableDonDatHang);
            init_DonHang();  // Refresh tableDonDatHang
            clearTable(tableChiTietDon);  // Clear tableChiTietDon
            clearTextChiTietDon();
            clearTextDonHang();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ: " + e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi chuyển đổi ngày tháng: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    //==============================================================================================================================================
    private void deleteChiTietDonDatHang(int maChiTiet) throws SQLException {
        PreparedStatement preparedStatement = connect.prepareStatement(
                "DELETE FROM Chi_Tiet_Don_Dat_Hang WHERE MA_CHI_TIET = ?"
        );
        preparedStatement.setInt(1, maChiTiet);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private void xoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaMonActionPerformed
        int selectedRow = tableChiTietDon.getSelectedRow();
        if (selectedRow >= 0 && selectedRow < tableChiTietDon.getRowCount()) {
            try {
                int maChiTiet = Integer.parseInt(MA_CHI_TIET_DON.getText());
                int maDatHang = Integer.parseInt(MA_DAT_HANG.getText());

                deleteChiTietDonDatHang(maChiTiet);

                clearTable(tableChiTietDon);
                populateChiTietDonDatHang(maDatHang);  // Refresh tableChiTietDon

                JOptionPane.showMessageDialog(null, "Xóa món thành công!");
                clearTable(tableDonDatHang);
                init_DonHang();  // Refresh tableDonDatHang
                clearTable(tableChiTietDon);  // Clear tableChiTietDon
                clearTextChiTietDon();
                clearTextDonHang();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Xóa món thất bại!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn món để xóa!");
        }
    }//GEN-LAST:event_xoaMonActionPerformed

    //==============================================================================================================================================
    private void deleteDonDatHang(int maDatHang) throws SQLException {
        PreparedStatement preparedStatement = connect.prepareStatement(
                "DELETE FROM Chi_Tiet_Don_Dat_Hang WHERE MA_DAT_HANG = ?"
        );
        preparedStatement.setInt(1, maDatHang);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        preparedStatement = connect.prepareStatement(
                "DELETE FROM Don_Dat_Hang WHERE MA_DAT_HANG = ?"
        );
        preparedStatement.setInt(1, maDatHang);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private void XoaDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaDonHangActionPerformed
        int selectedRow = tableDonDatHang.getSelectedRow();
        if (selectedRow >= 0 && selectedRow < tableDonDatHang.getRowCount()) {
            try {
                int maDatHang = Integer.parseInt(tableDonDatHang.getValueAt(selectedRow, 0).toString());
                deleteDonDatHang(maDatHang);

                clearTable(tableDonDatHang);
                init_DonHang();  // Refresh tableDonDatHang
                clearTable(tableChiTietDon);  // Clear tableChiTietDon

                JOptionPane.showMessageDialog(null, "Xóa đơn hàng thành công!");
                clearTextChiTietDon();
                clearTextDonHang();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Xóa đơn hàng thất bại!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn đơn hàng để xóa!");
        }
    }//GEN-LAST:event_XoaDonHangActionPerformed

    //==============================================================================================================================================
    public void showInformation_DonHang(int selectedRow) throws SQLException {
        MA_DAT_HANG.setText(tableDonDatHang.getValueAt(selectedRow, 0).toString());
        NGAY_DAT_HANG.setText(tableDonDatHang.getValueAt(selectedRow, 1).toString());
        MA_KHACH_HANG.setText(tableDonDatHang.getValueAt(selectedRow, 2).toString());

        // Đặt giá trị cho JComboBox cb_tthd
        String selectedValue = String.valueOf(tableDonDatHang.getValueAt(selectedRow, 3).toString());
        String tenNguoiPhuTrach = ttnd.layTenNguoiPhuTrach(selectedValue);
        for (int i = 0; i < cb_npt.getItemCount(); i++) {
            if (cb_npt.getItemAt(i).toString().equals(tenNguoiPhuTrach)) {
                cb_npt.setSelectedIndex(i);
                break;
            }
        }

        selectedValue = tableDonDatHang.getValueAt(selectedRow, 4).toString();
        for (int i = 0; i < cb_tthd.getItemCount(); i++) {
            if (cb_tthd.getItemAt(i).toString().equals(selectedValue)) {
                cb_tthd.setSelectedIndex(i);
                break;
            }
        }
    }

    public void showInformation_ChiTietDon(int selectedRow) {
        MA_CHI_TIET_DON.setText(tableChiTietDon.getValueAt(selectedRow, 0).toString());
        Object maMonValue = tableChiTietDon.getValueAt(selectedRow, 2);
        MA_MON.setSelectedItem(maMonValue);
        SO_LUONG.setText(tableChiTietDon.getValueAt(selectedRow, 3).toString());
    }

    private void init_ComboBox_ThucDon() {
        try {
            String query = "SELECT MA_MON, TEN_MON FROM Thuc_Don";
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List<String> menuItems = new ArrayList<>();
            while (resultSet.next()) {
                String maMon = resultSet.getString("MA_MON");
                String tenMon = resultSet.getString("TEN_MON");
                String menuItem = maMon + " - " + tenMon;
                menuItems.add(menuItem);
            }

            MA_MON.setModel(new DefaultComboBoxModel<>(menuItems.toArray(new String[0])));
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void fillNguoiPhuTrach() {
        if (connect != null) {
            try {
                String query = "SELECT TEN_NGUOI_DUNG FROM Thong_Tin_Nguoi_Dung";
                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) { //kiểm tra có 1 hàng kq hay ko
                    String userName = resultSet.getString("TEN_NGUOI_DUNG");
                    cb_npt.addItem(userName);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //====================================================================================
    private void init_DonHang() {
        initTableColumns();
        populateTableData();
    }

    private void initTableColumns() {
        String[] colName = {
            "Mã đặt hàng",
            "Ngày đặt hàng",
            "Mã khách hàng",
            "Người phụ trách",
            "Trạng thái đơn hàng",
            "Thành tiền"
        };
        model = (DefaultTableModel) tableDonDatHang.getModel();
        model.setColumnIdentifiers(colName);

        Font font = new Font("Arial", Font.PLAIN, 13);
        tableDonDatHang.setFont(font);
    }

    private void populateTableData() {
        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Don_Dat_Hang");

            while (resultSet.next()) {
                String maDatHang = resultSet.getString("MA_DAT_HANG");
                Date ngayDatHang = resultSet.getDate("NGAY_DAT_HANG");
                String ngayDatHangFormatted = ngayDatHang != null ? dateFormat.format(ngayDatHang) : "";
                String maKhachHang = resultSet.getString("MA_KHACH_HANG");
                String nguoiPhuTrach = resultSet.getString("NGUOI_PHU_TRACH");
                String trangThaiDonHang = resultSet.getString("TRANG_THAI_DON_HANG");
                float thanhTien = resultSet.getFloat("THANH_TIEN");

                String[] row = {
                    maDatHang,
                    ngayDatHangFormatted,
                    maKhachHang,
                    nguoiPhuTrach,
                    trangThaiDonHang,
                    String.valueOf(thanhTien)
                };
                model.addRow(row);
            }

            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLiDonDathang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void init_ChiTietDon() {
        model = (DefaultTableModel) tableChiTietDon.getModel();
        String[] colName = new String[4];
        colName[0] = "Mã chi tiết";
        colName[1] = "Mã đơn hàng";
        colName[2] = "Mã món - Tên món";
        colName[3] = "Số lượng";
        model.setColumnIdentifiers(colName);

        Font font = new Font("Arial", Font.PLAIN, 13);
        tableChiTietDon.setFont(font);
        // Thiết lập độ rộng cho từng cột
        TableColumn columnMaDon = tableChiTietDon.getColumnModel().getColumn(1);
        columnMaDon.setPreferredWidth(100);

        TableColumn columnMaMon = tableChiTietDon.getColumnModel().getColumn(2);
        columnMaMon.setPreferredWidth(230);

        TableColumn columnSoLuong = tableChiTietDon.getColumnModel().getColumn(3);
        columnSoLuong.setPreferredWidth(72);
    }

    private void populateChiTietDonDatHang(int mdh) {
        DefaultTableModel modelChiTiet = (DefaultTableModel) tableChiTietDon.getModel();
        modelChiTiet.setRowCount(0);

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(
                    "SELECT Chi_Tiet_Don_Dat_hang.MA_CHI_TIET, Chi_Tiet_Don_Dat_hang.MA_DAT_HANG, Chi_Tiet_Don_Dat_Hang.MA_MON, SO_LUONG, TEN_MON FROM Chi_Tiet_Don_Dat_Hang"
                    + " INNER JOIN Thuc_Don ON Chi_Tiet_Don_Dat_Hang.MA_MON = Thuc_Don.MA_MON"
                    + " WHERE MA_DAT_HANG = ?"
            );
            preparedStatement.setInt(1, mdh);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int maChiTiet = resultSet.getInt("MA_CHI_TIET"); // Retrieve MA_CHI_TIET
                int maDon = resultSet.getInt("MA_DAT_HANG");
                int maMon = resultSet.getInt("MA_MON");
                String tenMon = resultSet.getString("TEN_MON");
                int soLuong = resultSet.getInt("SO_LUONG");
                String maMonTenMon = maMon + " - " + tenMon;
                modelChiTiet.addRow(new Object[]{maChiTiet, maDon, maMonTenMon, soLuong}); // Add MA_CHI_TIET to the table row
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLiDonDathang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_QuanLiDonDathang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField MA_CHI_TIET_DON;
    private javax.swing.JTextField MA_DAT_HANG;
    private javax.swing.JTextField MA_KHACH_HANG;
    private javax.swing.JComboBox<String> MA_MON;
    private javax.swing.JFormattedTextField NGAY_DAT_HANG;
    private javax.swing.JTextField SO_LUONG;
    private javax.swing.JButton XoaDonHang;
    private javax.swing.JComboBox<String> cb_npt;
    private javax.swing.JComboBox<String> cb_tthd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableChiTietDon;
    private javax.swing.JTable tableDonDatHang;
    private javax.swing.JButton xoaMon;
    // End of variables declaration//GEN-END:variables
}
