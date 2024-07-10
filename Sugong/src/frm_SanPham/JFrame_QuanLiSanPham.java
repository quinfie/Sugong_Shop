package frm_SanPham;

import cnn.Connect_Db;
import frm_NhanVien.JFrame_QuanLyNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.LoaiThucDonDAO;
import model.LoaiThucDonDTO;
import model.*;

public class JFrame_QuanLiSanPham extends javax.swing.JFrame {

    private DefaultTableModel dfm;
    private Connect_Db Db = new Connect_Db();
    private Connection connect;

    public JFrame_QuanLiSanPham() {
        connect = Db.connectDB();
        initComponents();
        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tbModel = new javax.swing.JScrollPane();
        tb_ThucDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MaLoaiThucDon = new javax.swing.JTextField();
        TenLoaiThucDon = new javax.swing.JTextField();
        HinhAnh = new javax.swing.JTextField();
        TenMon = new javax.swing.JTextField();
        MaMon = new javax.swing.JTextField();
        btn_New = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        Gia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ThanhPhan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setMinimumSize(new java.awt.Dimension(1263, 755));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("QUẢN LÍ SẢN PHẨM");

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        tb_ThucDon.setBackground(new java.awt.Color(255, 102, 102));
        tb_ThucDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_ThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_ThucDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tb_ThucDon.setRowHeight(28);
        tb_ThucDon.setShowGrid(true);
        tb_ThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ThucDonMouseClicked(evt);
            }
        });
        tbModel.setViewportView(tb_ThucDon);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Mã loại thực đơn");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Tên loại thực đơn");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Giá");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Hình ảnh");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Thành phần");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Tên món");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Mã món");

        MaLoaiThucDon.setBackground(new java.awt.Color(255, 153, 153));
        MaLoaiThucDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaLoaiThucDon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TenLoaiThucDon.setBackground(new java.awt.Color(255, 153, 153));
        TenLoaiThucDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TenLoaiThucDon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HinhAnh.setBackground(new java.awt.Color(255, 153, 153));
        HinhAnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HinhAnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TenMon.setBackground(new java.awt.Color(255, 153, 153));
        TenMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TenMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MaMon.setBackground(new java.awt.Color(255, 153, 153));
        MaMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        Gia.setBackground(new java.awt.Color(255, 153, 153));
        Gia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ThanhPhan.setColumns(20);
        ThanhPhan.setLineWrap(true);
        ThanhPhan.setRows(5);
        jScrollPane1.setViewportView(ThanhPhan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TenMon, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(MaMon)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HinhAnh)
                                .addComponent(Gia)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TenLoaiThucDon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MaLoaiThucDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaLoaiThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenLoaiThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tbModel)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    private void initTable() {
        dfm = new DefaultTableModel();
        dfm.setColumnIdentifiers(new String[]{"Mã món", "Tên món", "Thành phần", "Giá", "Hình ảnh", "Loại thực đơn", "Mã loại thực đơn"});
        tb_ThucDon.setModel(dfm);

        TableColumn columnMaMon = tb_ThucDon.getColumnModel().getColumn(0);
        columnMaMon.setPreferredWidth(30);

        TableColumn columnTenMon = tb_ThucDon.getColumnModel().getColumn(1);
        columnTenMon.setPreferredWidth(260);

        TableColumn columnThanhPhan = tb_ThucDon.getColumnModel().getColumn(2);
        columnThanhPhan.setPreferredWidth(300);

        TableColumn columnGia = tb_ThucDon.getColumnModel().getColumn(3);
        columnGia.setPreferredWidth(30);

        TableColumn columnHinhAnh = tb_ThucDon.getColumnModel().getColumn(4);
        columnHinhAnh.setPreferredWidth(100);

        TableColumn columnLoaiThucDon = tb_ThucDon.getColumnModel().getColumn(5);
        columnLoaiThucDon.setPreferredWidth(230);

        TableColumn columnMaLoaiThucDon = tb_ThucDon.getColumnModel().getColumn(5);
        columnMaLoaiThucDon.setPreferredWidth(50);

        loadData();
    }

    private void loadData() {
        ThucDonDAO thucDonDAO = new ThucDonDAO(connect);
        try {
            List<ThucDonDTO> thucDonList = thucDonDAO.getAllThucDon();
            for (ThucDonDTO thucDon : thucDonList) {
                dfm.addRow(new Object[]{
                    thucDon.getMaMon(),
                    thucDon.getTenMon(),
                    thucDon.getThanhPhan(),
                    thucDon.getGia(),
                    thucDon.getHinhAnh(),
                    getLoaiThucDonName(thucDon.getMaLoaiThucDon()),
                    thucDon.getMaLoaiThucDon()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String getLoaiThucDonName(int maLoaiThucDon) {
        LoaiThucDonDAO loaiThucDonDAO = new LoaiThucDonDAO(connect);
        try {
            LoaiThucDonDTO loaiThucDon = loaiThucDonDAO.readLoaiThucDon(maLoaiThucDon);
            if (loaiThucDon != null) {
                return loaiThucDon.getTenLoaiThucDon();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Unknown";
    }

    private void tb_ThucDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ThucDonMouseClicked
        int selectedRow = tb_ThucDon.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tb_ThucDon.getRowCount()) {
            MaLoaiThucDon.setText(tb_ThucDon.getValueAt(selectedRow, 6).toString());
            TenLoaiThucDon.setText(tb_ThucDon.getValueAt(selectedRow, 5).toString());
            Gia.setText(tb_ThucDon.getValueAt(selectedRow, 3).toString());
            HinhAnh.setText(tb_ThucDon.getValueAt(selectedRow, 4).toString());
            TenMon.setText(tb_ThucDon.getValueAt(selectedRow, 1).toString());
            MaMon.setText(tb_ThucDon.getValueAt(selectedRow, 0).toString());
            ThanhPhan.setText(tb_ThucDon.getValueAt(selectedRow, 2).toString());
        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tb_ThucDonMouseClicked

    private void clearText() {
        //Xóa nội dung hiển thị
        MaLoaiThucDon.setText("");
        TenLoaiThucDon.setText("");
        Gia.setText("");
        HinhAnh.setText("");
        TenMon.setText("");
        MaMon.setText("");
        ThanhPhan.setText("");
    }

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        clearText();
    }//GEN-LAST:event_btn_NewActionPerformed

    private void btn_InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsertMouseClicked
        try {
            ThucDonDTO thucDon = new ThucDonDTO();
            thucDon.setMaMon(Integer.parseInt(MaMon.getText()));
            thucDon.setTenMon(TenMon.getText());
            thucDon.setThanhPhan(ThanhPhan.getText());
            thucDon.setGia(Integer.parseInt(Gia.getText()));
            thucDon.setHinhAnh(HinhAnh.getText());
            thucDon.setMaLoaiThucDon(Integer.parseInt(MaLoaiThucDon.getText()));

            ThucDonDAO thucDonDAO = new ThucDonDAO(connect);
            thucDonDAO.createThucDon(thucDon);
            clearTable(tb_ThucDon);
            JOptionPane.showMessageDialog(this, "Thêm món thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadData();
            clearText();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm món: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_InsertMouseClicked

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        try {
            ThucDonDTO thucDon = new ThucDonDTO();
            thucDon.setMaMon(Integer.parseInt(MaMon.getText()));
            thucDon.setTenMon(TenMon.getText());
            thucDon.setThanhPhan(ThanhPhan.getText());
            thucDon.setGia(Integer.parseInt(Gia.getText()));
            thucDon.setHinhAnh(HinhAnh.getText());
            thucDon.setMaLoaiThucDon(Integer.parseInt(MaLoaiThucDon.getText()));

            ThucDonDAO thucDonDAO = new ThucDonDAO(connect);
            thucDonDAO.updateThucDon(thucDon);
            clearTable(tb_ThucDon);
            JOptionPane.showMessageDialog(this, "Cập nhật món thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadData();
            clearText();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        try {
            int maMon = Integer.parseInt(MaMon.getText());

            ThucDonDAO thucDonDAO = new ThucDonDAO(connect);
            thucDonDAO.deleteThucDon(maMon);
            clearTable(tb_ThucDon);
            JOptionPane.showMessageDialog(this, "Xóa món thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadData();
            clearText();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa món: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_QuanLiSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gia;
    private javax.swing.JTextField HinhAnh;
    private javax.swing.JTextField MaLoaiThucDon;
    private javax.swing.JTextField MaMon;
    private javax.swing.JTextField TenLoaiThucDon;
    private javax.swing.JTextField TenMon;
    private javax.swing.JTextArea ThanhPhan;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_New;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane tbModel;
    private javax.swing.JTable tb_ThucDon;
    // End of variables declaration//GEN-END:variables
}
