package frm_HoaDon;

import cnn.Connect_Db;
import frm_DonHang.JFrame_QuanLiDonDathang;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.*;

public class JFrame_QuanLyHoaDon extends javax.swing.JFrame {

    private DefaultTableModel model;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel dfm;
    private Connect_Db Db = new Connect_Db();
    private Connection connect;
    private HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

    public JFrame_QuanLyHoaDon() {
        connect = Db.connectDB();
        initComponents();
        initTable();
        init_ChiTietDon();
    }

    private void getData() {
        List<HoaDonDTO> hoaDonList = hoaDonDAO.getAllHoaDon();
        for (HoaDonDTO hoaDon : hoaDonList) {
            dfm.addRow(new Object[]{
                hoaDon.getMaHoaDon(),
                hoaDon.getMaKhachHang(),
                hoaDon.getNguoiPhuTrach(),
                hoaDon.getThanhTien(),
                hoaDon.getNgay()
            });
        }
    }

    private void initTable() {
        dfm = new DefaultTableModel();
        dfm.setColumnIdentifiers(new String[]{"Mã hóa đơn", "Mã khách hàng", "Người phụ trách", "Thành tiền", "Ngày"});
        tb_HoaDon.setModel(dfm);
        getData();

        TableColumn columnMaHoaDon = tb_HoaDon.getColumnModel().getColumn(0);
        columnMaHoaDon.setPreferredWidth(100);

        TableColumn columnMaKhachHang = tb_HoaDon.getColumnModel().getColumn(1);
        columnMaKhachHang.setPreferredWidth(120);

        TableColumn columnNguoiPhuTrach = tb_HoaDon.getColumnModel().getColumn(2);
        columnNguoiPhuTrach.setPreferredWidth(120);

        TableColumn columnThanhTien = tb_HoaDon.getColumnModel().getColumn(3);
        columnThanhTien.setPreferredWidth(100);

        TableColumn columnNgay = tb_HoaDon.getColumnModel().getColumn(4);
        columnNgay.setPreferredWidth(120);
    }

    private void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    private void clearText() {
        tf_MHD.setText("");
        tf_NPT.setText("");
        tf_TT.setText("");
        tf_NGAY.setText("");
        tf_MKH.setText("");
        tf_MaChiTietDon.setText("");
        tf_SoLuong.setText("");
        tf_MaMon.setText("");
    }

    private HoaDonDTO createHoaDonFromInput() {
        try {
            int maHoaDon = Integer.parseInt(tf_MHD.getText().trim());
            String maKhachHang = tf_MKH.getText().trim();
            String nguoiPhuTrach = tf_NPT.getText().trim();
            float thanhTien = Float.parseFloat(tf_TT.getText().trim());

            String ngayStr = tf_NGAY.getText().trim();
            java.util.Date parsedDate = dateFormat.parse(ngayStr);
            Date ngay = new Date(parsedDate.getTime());

            if (maKhachHang.isEmpty() || nguoiPhuTrach.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!");
                return null;
            }
            return new HoaDonDTO(maHoaDon, maKhachHang, nguoiPhuTrach, thanhTien, ngay);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng cho các trường số!");
            return null;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng cho ngày (yyyy-MM-dd)!");
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tbModel = new javax.swing.JScrollPane();
        tb_HoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_MHD = new javax.swing.JTextField();
        tf_TT = new javax.swing.JTextField();
        tf_NGAY = new javax.swing.JTextField();
        btn_New = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        tf_NPT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_MKH = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tf_SoLuong = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_MaChiTietDon = new javax.swing.JTextField();
        tf_MaMon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        XoaMon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChiTietDon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1263, 755));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setMinimumSize(new java.awt.Dimension(1263, 755));
        jPanel2.setPreferredSize(new java.awt.Dimension(1263, 755));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tb_HoaDon.setBackground(new java.awt.Color(255, 102, 102));
        tb_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tb_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_HoaDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tb_HoaDon.setRowHeight(28);
        tb_HoaDon.setShowGrid(true);
        tb_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_HoaDonMouseClicked(evt);
            }
        });
        tbModel.setViewportView(tb_HoaDon);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Mã hóa đơn");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Mã khách hàng");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Người phụ trách");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Thành tiền");

        tf_MHD.setBackground(new java.awt.Color(255, 153, 153));
        tf_MHD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_MHD.setEnabled(false);

        tf_TT.setBackground(new java.awt.Color(255, 153, 153));
        tf_TT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_TT.setEnabled(false);

        tf_NGAY.setBackground(new java.awt.Color(255, 153, 153));
        tf_NGAY.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_New.setBackground(new java.awt.Color(51, 255, 51));
        btn_New.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_New.setForeground(new java.awt.Color(255, 255, 255));
        btn_New.setText("Làm mới");
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
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
        btn_Delete.setText("Xóa hóa đơn");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        tf_NPT.setBackground(new java.awt.Color(255, 153, 153));
        tf_NPT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tf_NPT.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Ngày");

        tf_MKH.setBackground(new java.awt.Color(255, 153, 153));
        tf_MKH.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_MKH.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(255, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Số lượng");

        tf_SoLuong.setBackground(new java.awt.Color(255, 153, 153));
        tf_SoLuong.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Mã chi tiết đơn");

        tf_MaChiTietDon.setBackground(new java.awt.Color(255, 153, 153));
        tf_MaChiTietDon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_MaChiTietDon.setEnabled(false);

        tf_MaMon.setBackground(new java.awt.Color(255, 153, 153));
        tf_MaMon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_MaMon.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Mã món");

        XoaMon.setBackground(new java.awt.Color(153, 153, 0));
        XoaMon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        XoaMon.setText("Xóa món ăn");
        XoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_MHD, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_NPT, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_NGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_MKH, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_MaChiTietDon, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(XoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_MHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_NPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_NGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_MaChiTietDon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_MaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XoaMon)
                    .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Danh sách hóa đơn");

        tableChiTietDon.setAutoCreateRowSorter(true);
        tableChiTietDon.setBackground(new java.awt.Color(255, 102, 102));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        int maHoaDon;
        try {
            maHoaDon = Integer.parseInt(tf_MHD.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mã hóa đơn không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc chắn muốn xóa hóa đơn này?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            boolean deleted = hoaDonDAO.deleteHoaDon(maHoaDon);
            if (deleted) {
                JOptionPane.showMessageDialog(this, "Hóa đơn đã được xóa thành công!");
                clearText();
                clearTable(tb_HoaDon);
                getData();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa hóa đơn không thành công!");
            }
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        HoaDonDTO hoaDon = createHoaDonFromInput();
        if (hoaDon != null) {
            boolean updated = hoaDonDAO.updateHoaDon(hoaDon);
            if (updated) {
                JOptionPane.showMessageDialog(this, "Hóa đơn được cập nhật thành công!");
                if (!tf_MaChiTietDon.getText().isEmpty() && !tf_SoLuong.getText().isEmpty() && !tf_MaMon.getText().isEmpty()) {
                    updateSelectedMaMon();
                } else {
                    clearText();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn không thành công!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn không thành công!");
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void updateSelectedMaMon() {
        try {
            int maHoaDon = Integer.parseInt(tf_MaChiTietDon.getText());

            // Lấy chuỗi từ textField tf_MaMon
            String maMonString = tf_MaMon.getText();

            // Tách chuỗi để lấy mã món
            int maMon = Integer.parseInt(maMonString.split(" - ")[0]);
            int soLuong = Integer.parseInt(tf_SoLuong.getText());
            chiTietHoaDonDAO.updateChiTietHoaDon(maHoaDon, maMon, soLuong);
            JOptionPane.showMessageDialog(this, "Chi tiết hóa đơn được cập nhật thành công!");
            clearText();
            clearTable(tb_HoaDon);
            clearTable(tableChiTietDon);
            getData();

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ: " + e.getMessage());
        }
    }

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        clearText();
    }//GEN-LAST:event_btn_NewActionPerformed

    private void tb_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_HoaDonMouseClicked
        int selectedRow = tb_HoaDon.getSelectedRow();

        if (selectedRow >= 0 && selectedRow < tb_HoaDon.getRowCount()) {
            tf_MHD.setText(tb_HoaDon.getValueAt(selectedRow, 0).toString());
            tf_MKH.setText(tb_HoaDon.getValueAt(selectedRow, 1).toString());
            tf_NPT.setText(tb_HoaDon.getValueAt(selectedRow, 2).toString());
            tf_TT.setText(tb_HoaDon.getValueAt(selectedRow, 3).toString());
            tf_NGAY.setText(tb_HoaDon.getValueAt(selectedRow, 4).toString());

            int mdh = Integer.parseInt(tb_HoaDon.getValueAt(selectedRow, 0).toString());
            populateChiTietHoaDon(mdh);

        } else {
            System.out.println("Lỗi");
        }
    }//GEN-LAST:event_tb_HoaDonMouseClicked

    private void tableChiTietDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiTietDonMouseClicked
        int selectedRow = tableChiTietDon.getSelectedRow();
        showInformation_ChiTietDon(selectedRow);
    }//GEN-LAST:event_tableChiTietDonMouseClicked

    private void XoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaMonActionPerformed
        int selectedRow = tableChiTietDon.getSelectedRow();
        if (selectedRow >= 0 && selectedRow < tableChiTietDon.getRowCount()) {
            int maHoaDon = Integer.parseInt(tf_MaChiTietDon.getText());
            String maMonString = tableChiTietDon.getValueAt(selectedRow, 1).toString();
            int maMon = Integer.parseInt(maMonString.split(" - ")[0]);

            boolean success = deleteChiTietDonDatHang(maHoaDon, maMon);

            if (success) {
                clearTable(tableChiTietDon);
                clearTable(tb_HoaDon);
                getData();
                populateChiTietHoaDon(maHoaDon);  // Refresh tableChiTietDon
                JOptionPane.showMessageDialog(null, "Xóa món thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa món thất bại!");
            }
        }
    }//GEN-LAST:event_XoaMonActionPerformed

    private boolean deleteChiTietDonDatHang(int maHoaDon, int maMon) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connect.prepareStatement(
                    "DELETE FROM Chi_Tiet_Hoa_Don WHERE MA_HOA_DON = ? AND MA_MON = ?"
            );
            preparedStatement.setInt(1, maHoaDon);
            preparedStatement.setInt(2, maMon);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void showInformation_ChiTietDon(int selectedRow) {
        tf_MaChiTietDon.setText(tableChiTietDon.getValueAt(selectedRow, 0).toString());
        tf_MaMon.setText(tableChiTietDon.getValueAt(selectedRow, 1).toString());
        tf_SoLuong.setText(tableChiTietDon.getValueAt(selectedRow, 2).toString());
    }

    private void populateChiTietHoaDon(int maHoaDon) {
        DefaultTableModel modelChiTiet = (DefaultTableModel) tableChiTietDon.getModel();
        modelChiTiet.setRowCount(0);

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(
                    "SELECT Chi_Tiet_Hoa_Don.MA_HOA_DON, Chi_Tiet_Hoa_Don.MA_MON, Thuc_Don.TEN_MON, Chi_Tiet_Hoa_Don.SO_LUONG_MON "
                    + "FROM Chi_Tiet_Hoa_Don "
                    + "INNER JOIN Thuc_Don ON Chi_Tiet_Hoa_Don.MA_MON = Thuc_Don.MA_MON "
                    + "WHERE Chi_Tiet_Hoa_Don.MA_HOA_DON = ?"
            );
            preparedStatement.setInt(1, maHoaDon);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int maHoaDonResult = resultSet.getInt("MA_HOA_DON");
                int maMon = resultSet.getInt("MA_MON");
                String tenMon = resultSet.getString("TEN_MON");
                int soLuongMon = resultSet.getInt("SO_LUONG_MON");
                String maMonTenMon = maMon + " - " + tenMon;
                modelChiTiet.addRow(new Object[]{maHoaDonResult, maMonTenMon, soLuongMon});
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            Logger.getLogger(JFrame_QuanLiDonDathang.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void init_ChiTietDon() {
        model = (DefaultTableModel) tableChiTietDon.getModel();
        String[] colName = new String[3];
        colName[0] = "Mã hóa đơn";
        colName[1] = "Mã món - Tên món";
        colName[2] = "Số lượng";
        model.setColumnIdentifiers(colName);

        Font font = new Font("Arial", Font.PLAIN, 13);
        tableChiTietDon.setFont(font);
        // Thiết lập độ rộng cho từng cột
        TableColumn columnMaDon = tableChiTietDon.getColumnModel().getColumn(0);
        columnMaDon.setPreferredWidth(100);

        TableColumn columnMaMon = tableChiTietDon.getColumnModel().getColumn(1);
        columnMaMon.setPreferredWidth(264);

        TableColumn columnSoLuong = tableChiTietDon.getColumnModel().getColumn(2);
        columnSoLuong.setPreferredWidth(72);
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
            java.util.logging.Logger.getLogger(JFrame_QuanLyHoaDon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyHoaDon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyHoaDon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_QuanLyHoaDon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_QuanLyHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XoaMon;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableChiTietDon;
    private javax.swing.JScrollPane tbModel;
    private javax.swing.JTable tb_HoaDon;
    private javax.swing.JTextField tf_MHD;
    private javax.swing.JTextField tf_MKH;
    private javax.swing.JTextField tf_MaChiTietDon;
    private javax.swing.JTextField tf_MaMon;
    private javax.swing.JTextField tf_NGAY;
    private javax.swing.JTextField tf_NPT;
    private javax.swing.JTextField tf_SoLuong;
    private javax.swing.JTextField tf_TT;
    // End of variables declaration//GEN-END:variables

}
