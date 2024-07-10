package frm_DonHang;

import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import cnn.Connect_Db;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import model.*;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;

public class JFrame_ThemMoiDonHang extends javax.swing.JFrame {

    private ChiTietDonHangDAO chiTietDonHangDAO;
    private ChiTietDonHangDTO chiTietDonHangDTO;
    private DonDatHangDTO donDatHangDTO;
    private DonDatHangDAO donDatHangDAO;
    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Connect_Db Db = new Connect_Db();
    private Connection connect;
    private DefaultTableModel modelTD = new DefaultTableModel();
    private DefaultTableModel modelDH = new DefaultTableModel();

    public JFrame_ThemMoiDonHang() {
        connect = Db.connectDB();
        donDatHangDAO = new DonDatHangDAO(connect);
        chiTietDonHangDAO = new ChiTietDonHangDAO(connect);
        initComponents();
        fillNguoiPhuTrach();
        init_DonHang();
        init_ThucDon();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMonAn = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonHang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NGAY_DAT_HANG = new javax.swing.JFormattedTextField();
        MA_KHACH_HANG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        cb_npt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cb_tthd = new javax.swing.JComboBox<>();
        XoaMotMon = new javax.swing.JButton();
        XoaTatCaMon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sdt_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1388, 758));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setDoubleBuffered(false);
        jPanel3.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jPanel3.setRequestFocusEnabled(false);

        jScrollPane2.setAlignmentX(0.0F);
        jScrollPane2.setAlignmentY(0.0F);

        tableMonAn.setAutoCreateRowSorter(true);
        tableMonAn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tableMonAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableMonAn.setAlignmentX(0.0F);
        tableMonAn.setAlignmentY(0.0F);
        tableMonAn.setAutoscrolls(false);
        tableMonAn.setEditingColumn(0);
        tableMonAn.setEditingRow(0);
        tableMonAn.setRowHeight(25);
        tableMonAn.setShowGrid(true);
        tableMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMonAnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMonAn);

        tableDonHang.setAutoCreateRowSorter(true);
        tableDonHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tableDonHang.setAlignmentX(0.0F);
        tableDonHang.setAlignmentY(0.0F);
        tableDonHang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableDonHang.setAutoscrolls(false);
        tableDonHang.setRowHeight(25);
        tableDonHang.setRowSelectionAllowed(false);
        tableDonHang.setShowGrid(true);
        jScrollPane1.setViewportView(tableDonHang);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Danh Sách Các Món Ăn");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CHI TIẾT ĐƠN ĐẶT HÀNG");

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ngày đặt hàng");

        NGAY_DAT_HANG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        NGAY_DAT_HANG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MA_KHACH_HANG.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        MA_KHACH_HANG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MA_KHACH_HANG.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Trạng thái hóa đơn");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Số điện thoại");

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

        jButton1.setText("Thêm Món");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb_npt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Người phụ trách");

        cb_tthd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cb_tthd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa thanh toán", "Đã thanh toán" }));

        XoaMotMon.setText("Xóa một món");
        XoaMotMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaMotMonActionPerformed(evt);
            }
        });

        XoaTatCaMon.setText("Xóa tất cả món");
        XoaTatCaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaTatCaMonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mã khách hàng");

        sdt_tf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sdt_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sdt_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdt_tfFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MA_KHACH_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cb_tthd, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_npt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NGAY_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sdt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(XoaMotMon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaTatCaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(XoaMotMon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(XoaTatCaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NGAY_DAT_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_npt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_tthd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MA_KHACH_HANG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sdt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        clearText();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void tableMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMonAnMouseClicked
        if (evt.getClickCount() == 1) { // Kiểm tra nếu double click
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();

            // Lấy thông tin từ dòng đã double click trong tableThucDon
            int maMon = Integer.parseInt((String) target.getValueAt(row, 0));
            String tenMon = (String) target.getValueAt(row, 1);
            String thanhPhan = (String) target.getValueAt(row, 2);
            int gia = Integer.parseInt((String) target.getValueAt(row, 3));
            String hinhAnh = (String) target.getValueAt(row, 4);
            int maLoaiThucDon = Integer.parseInt((String) target.getValueAt(row, 5));

            // Tạo một đối tượng ThucDonDTO từ thông tin thu được
            ThucDonDTO selectedThucDon = new ThucDonDTO(maMon, tenMon, thanhPhan, gia, hinhAnh, maLoaiThucDon);

            // Thêm selectedThucDon vào tableDonHang
            addThucDonToDonHang(selectedThucDon);
        }
    }//GEN-LAST:event_tableMonAnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        themDonHang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xoaMonTrongGioHang(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) tableDonHang.getModel();
        model.removeRow(rowIndex);
    }

    private void XoaMotMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaMotMonActionPerformed
        int selectedRow = tableDonHang.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int response = JOptionPane.showConfirmDialog(
                    null,
                    "Bạn có chắc muốn xóa món này?",
                    "Xác nhận",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
            if (response == JOptionPane.YES_OPTION) {
                xoaMonTrongGioHang(selectedRow);
            }
        }
    }//GEN-LAST:event_XoaMotMonActionPerformed

    private void XoaTatCaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaTatCaMonActionPerformed

        int response = JOptionPane.showConfirmDialog(
                null,
                "Bạn có chắc muốn xóa tất cả các món?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (response == JOptionPane.YES_OPTION) {
            clearTable(tableDonHang);
        }
    }//GEN-LAST:event_XoaTatCaMonActionPerformed

    private void sdt_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdt_tfFocusLost
        String soDienThoai = sdt_tf.getText();
        String maKhachHang = khachHangDAO.getMaKhachHang(soDienThoai);
        MA_KHACH_HANG.setText(maKhachHang);
    }//GEN-LAST:event_sdt_tfFocusLost

    private void addThucDonToDonHang(ThucDonDTO selectedThucDon) {
        DefaultTableModel modelDH = (DefaultTableModel) tableDonHang.getModel();
        boolean existed = false;
        for (int i = 0; i < modelDH.getRowCount(); i++) {
            if ((int) modelDH.getValueAt(i, 0) == selectedThucDon.getMaMon()) {
                // Nếu đã tồn tại dòng có mã món tương tự, tăng số lượng lên 1 và thoát vòng lặp
                int soLuong = (int) modelDH.getValueAt(i, 3) + 1;
                modelDH.setValueAt(soLuong, i, 3);
                existed = true;
                break;
            }
        }

        // Nếu chưa tồn tại dòng tương tự, thêm mới vào tableDonHang
        if (!existed) {
            Object[] rowToAdd = {selectedThucDon.getMaMon(), selectedThucDon.getTenMon(),
                selectedThucDon.getGia(), 1}; // Số lượng mặc định là 1
            modelDH.addRow(rowToAdd);
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

    public void clearText() {
        NGAY_DAT_HANG.setText("");
        MA_KHACH_HANG.setText("");
        cb_npt.setSelectedItem(null);
        cb_tthd.setSelectedItem(null);
        tableDonHang.clearSelection();
        tableMonAn.clearSelection();
        sdt_tf.setText("");
    }

    private void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

//========================================================================================
    private void init_ThucDon() {
        modelTD = (DefaultTableModel) tableMonAn.getModel();
        String[] colName = new String[6];
        colName[0] = "Mã món";
        colName[1] = "Tên món";
        colName[2] = "Thành phần";
        colName[3] = "Giá";
        colName[4] = "Hình ảnh";
        colName[5] = "Mã loại thực đơn";
        modelTD.setColumnIdentifiers(colName);

        try {
            ThucDonDAO thucDonDAO = new ThucDonDAO(connect);
            List<ThucDonDTO> thucDonList = thucDonDAO.getAllThucDon();

            for (ThucDonDTO thucDon : thucDonList) {
                String[] row = {String.valueOf(thucDon.getMaMon()), thucDon.getTenMon(), thucDon.getThanhPhan(),
                    String.valueOf(thucDon.getGia()), thucDon.getHinhAnh(), String.valueOf(thucDon.getMaLoaiThucDon())};
                modelTD.addRow(row);
            }

            Font font = new Font("Arial", Font.PLAIN, 13);
            tableMonAn.setFont(font);

        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLiDonDathang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void init_DonHang() {
        modelDH = (DefaultTableModel) tableDonHang.getModel();
        String[] colName = new String[4];
        colName[0] = "Mã món";
        colName[1] = "Tên món";
        colName[2] = "Giá";
        colName[3] = "Số lượng";
        modelDH.setColumnIdentifiers(colName);

        Font font = new Font("Arial", Font.PLAIN, 13);
        tableDonHang.setFont(font);

        TableColumn columnMaMon = tableDonHang.getColumnModel().getColumn(0);
        columnMaMon.setPreferredWidth(80);

        TableColumn columnTenMon = tableDonHang.getColumnModel().getColumn(1);
        columnTenMon.setPreferredWidth(240);

        TableColumn columnGia = tableDonHang.getColumnModel().getColumn(2);
        columnGia.setPreferredWidth(106);

        TableColumn columnSoLuong = tableDonHang.getColumnModel().getColumn(3);
        columnSoLuong.setPreferredWidth(80);
    }

    private void themDonHang() {
        try {
            // Lấy thông tin từ các trường nhập liệu trên giao diện
            Date ngayDatHang = dateFormat.parse(NGAY_DAT_HANG.getText());
            String maKhachHang = MA_KHACH_HANG.getText();
            String trangThaiDonHang = String.valueOf(cb_tthd.getSelectedItem());

            // Lấy thông tin người phụ trách từ comboBox và chuyển đổi thành mã người phụ trách
            String tenNguoiPhuTrach = String.valueOf(cb_npt.getSelectedItem());
            ThongTinNguoiDungDAO thongTinNguoiDungDAO = new ThongTinNguoiDungDAO();
            String maNguoiPhuTrach = thongTinNguoiDungDAO.layMaNguoiPhuTrach(tenNguoiPhuTrach);

            donDatHangDTO = new DonDatHangDTO(0, ngayDatHang, maKhachHang, maNguoiPhuTrach, trangThaiDonHang, 0);
            int maDatHang = donDatHangDAO.themDonDatHang(donDatHangDTO);

            // Lấy dữ liệu từ JTable chứa các món và thêm vào bảng Chi_Tiet_Don_Dat_Hang
            DefaultTableModel model = (DefaultTableModel) tableDonHang.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                int maMon = (int) model.getValueAt(i, 0);
                int soLuong = (int) model.getValueAt(i, 3); // Giả sử cột 1 chứa số lượng

                chiTietDonHangDTO = new ChiTietDonHangDTO(maDatHang, maMon, soLuong);
                chiTietDonHangDAO.themChiTietDonHang(chiTietDonHangDTO);
            }

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm đơn hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            clearTable(tableDonHang);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng cho mã đặt hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng cho ngày đặt hàng (dd/MM/yyyy)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi ghi dữ liệu vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_ThemMoiDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JTextField MA_KHACH_HANG;
    private javax.swing.JFormattedTextField NGAY_DAT_HANG;
    private javax.swing.JButton XoaMotMon;
    private javax.swing.JButton XoaTatCaMon;
    private javax.swing.JComboBox<String> cb_npt;
    private javax.swing.JComboBox<String> cb_tthd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField sdt_tf;
    private javax.swing.JTable tableDonHang;
    private javax.swing.JTable tableMonAn;
    // End of variables declaration//GEN-END:variables
}
