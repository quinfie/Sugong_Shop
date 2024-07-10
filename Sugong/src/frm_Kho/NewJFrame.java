package frm_Kho;

import model.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import model.*;
import org.jfree.chart.ChartPanel;

public class NewJFrame extends javax.swing.JFrame {

    DefaultComboBoxModel<String> modelCbxDVT;
    private JTabbedPane table;
    private KhoNLDAO khoNLDAO;
    private DefaultTableModel tableModel;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        this.khoNLDAO = khoNLDAO;
        initComponents();
        loadDataFromTable();
        loadDataFromTable1();
        loadDataFromTable2("Tất cả");
        initComboboxList();
        initComboboxList2();
        setLocationRelativeTo(null);

    }

    private void initComboboxList() {
        modelCbxDVT = new DefaultComboBoxModel<>();
        modelCbxDVT.addElement("kg");
        modelCbxDVT.addElement("lít");
        modelCbxDVT.addElement("quả");
        modelCbxDVT.addElement("lon");

        cbxDonViTinh.setModel(modelCbxDVT);
    }

    private void initComboboxList2() {
        modelCbxDVT = new DefaultComboBoxModel<>();
        modelCbxDVT.addElement("Tất cả");
        modelCbxDVT.addElement("Xuất hàng");
        modelCbxDVT.addElement("Nhập hàng");
        //cbxLoc.setSelectedIndex(0);
        cbxLoc.setModel(modelCbxDVT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMoi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        cbxLoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenNguyenLieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxDonViTinh = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        txtMaNguyenLieu = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTGDKho = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblGDKho = new javax.swing.JTable();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMoi.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnNew.setText("Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnThem)
                .addGap(47, 47, 47)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnNew)
                    .addComponent(btnThem))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        txtTim.setText("Nhập tên nguyên liệu");
        txtTim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimFocusLost(evt);
            }
        });
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        cbxLoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Lọc GDKho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTim)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbxLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblThongTin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Nguyên Liệu", "Tên Nguyên Liệu", "Số Lượng Tồn", "Đơn Vị Tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongTin);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mã Nguyên Liệu");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tên Nguyên Liệu");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Số Lượng Tồn");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Đơn Vị Tính");

        cbxDonViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDonViTinhActionPerformed(evt);
            }
        });

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxDonViTinh, 0, 134, Short.MAX_VALUE)
                    .addComponent(txtSoLuong))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(txtMaNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(cbxDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblCTGDKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCTGDKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCTGDKho);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Sugong Coffe Manager");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongke2.png"))); // NOI18N
        jButton1.setText("Thống Kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        tblGDKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGDKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblGDKho);

        javax.swing.GroupLayout btnMoiLayout = new javax.swing.GroupLayout(btnMoi);
        btnMoi.setLayout(btnMoiLayout);
        btnMoiLayout.setHorizontalGroup(
            btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        btnMoiLayout.setVerticalGroup(
            btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btnMoiLayout.createSequentialGroup()
                        .addGroup(btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(btnMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(btnMoiLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinMouseClicked

        int rowAtPoint = tblThongTin.rowAtPoint(evt.getPoint());

        if (rowAtPoint < 0) {
            return;
        }

        // Get the values from the table and display them in the corresponding components
        txtMaNguyenLieu.setText(tblThongTin.getValueAt(rowAtPoint, 0).toString());
        txtTenNguyenLieu.setText(tblThongTin.getValueAt(rowAtPoint, 1).toString());
        txtSoLuong.setText(tblThongTin.getValueAt(rowAtPoint, 2).toString());
        String selectedDonViTinh = tblThongTin.getValueAt(rowAtPoint, 3).toString();
        cbxDonViTinh.setSelectedItem(selectedDonViTinh);
        cbxDonViTinh.revalidate();
        cbxDonViTinh.repaint();

    }//GEN-LAST:event_tblThongTinMouseClicked
    private boolean checkMaNguyenLieuExists(String maNguyenLieu) {
        boolean exists = false;

        // Thực hiện câu lệnh SELECT để kiểm tra mã nguyên liệu đã tồn tại hay chưa
        try {
            Connection connection = DataHelper.openConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Kho_Nguyen_Lieu WHERE Ma_Nguyen_Lieu = '" + maNguyenLieu + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                exists = true;
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return exists;
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String maNguyenLieu = txtMaNguyenLieu.getText();
        String tenNguyenLieu = txtTenNguyenLieu.getText();
        String soLuong = txtSoLuong.getText();
        String donViTinh = cbxDonViTinh.getSelectedItem().toString();

        boolean isMaNguyenLieuExists = checkMaNguyenLieuExists(maNguyenLieu);
        if (isMaNguyenLieuExists) {
            JOptionPane.showMessageDialog(null, "Mã nguyên liệu đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Chuyển đổi soLuong thành kiểu int
            int soLuongTon = Integer.parseInt(soLuong);

            // Tạo đối tượng KhoNguyenLieu mới
            KhoNguyenLieu khoNguyenLieu = new KhoNguyenLieu();
            khoNguyenLieu.setMaNL(Integer.parseInt(maNguyenLieu));
            khoNguyenLieu.setTenNL(tenNguyenLieu);
            khoNguyenLieu.setsL(soLuongTon);
            khoNguyenLieu.setdVT(donViTinh);

            // Sử dụng KhoNLDAO để thêm dữ liệu vào CSDL
            KhoNLDAOImp khoNLDao = new KhoNLDAOImp();
            boolean isInserted = khoNLDao.insertKhoNguyenLieu(khoNguyenLieu);

            if (isInserted) {
                // Sau khi thêm dữ liệu thành công, cập nhật lại bảng
                loadDataFromTable();
                JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm dữ liệu thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Số lượng phải là một số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        initComboboxList();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maNguyenLieu = txtMaNguyenLieu.getText();

        if (maNguyenLieu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nguyên liệu cần xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int maNguyenLieuInt;
        try {
            maNguyenLieuInt = Integer.parseInt(maNguyenLieu);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Mã nguyên liệu phải là một số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa nguyên liệu này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            KhoNLDAOImp khoNLDao = new KhoNLDAOImp();
            boolean isDeleted = khoNLDao.deleteKhoNguyenLieu(maNguyenLieuInt);

            if (isDeleted) {
                // Sau khi xóa dữ liệu thành công, cập nhật lại bảng
                loadDataFromTable();
                JOptionPane.showMessageDialog(null, "Xóa dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Xóa dữ liệu thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtMaNguyenLieu.setText("");
        txtTenNguyenLieu.setText("");
        txtSoLuong.setText("");

        // Preserve the selected item in cbxDonViTinh
        Object selectedItem = cbxDonViTinh.getSelectedItem();

        cbxDonViTinh.setSelectedIndex(0);

        // Restore the selected item in cbxDonViTinh
        if (selectedItem != null) {
            cbxDonViTinh.setSelectedItem(selectedItem);
        }
        initComboboxList();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String keyword = txtTim.getText();

        // Thực hiện câu lệnh SELECT để tìm kiếm dữ liệu từ CSDL
        try {
            Connection connection = DataHelper.openConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Kho_Nguyen_Lieu WHERE TEN_NGUYEN_LIEU LIKE '%" + keyword + "%'";
            ResultSet resultSet = statement.executeQuery(query);

            // Xóa dữ liệu hiện tại trong bảng
            DefaultTableModel tableModel = (DefaultTableModel) tblThongTin.getModel();
            tableModel.setRowCount(0);

            // Thêm dữ liệu tìm kiếm vào bảng
            while (resultSet.next()) {
                String maNguyenLieu = resultSet.getString("Ma_Nguyen_Lieu");
                String tenNguyenLieu = resultSet.getString("TEN_NGUYEN_LIEU");
                String soLuong = resultSet.getString("SO_LUONG_TON");
                String donViTinh = resultSet.getString("DON_VI_TINH");

                Object[] rowData = {maNguyenLieu, tenNguyenLieu, soLuong, donViTinh};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "Tìm dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        initComboboxList();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        String maNguyenLieu = txtMaNguyenLieu.getText();
        String tenNguyenLieu = txtTenNguyenLieu.getText();
        String soLuong = txtSoLuong.getText();
        String donViTinh = cbxDonViTinh.getSelectedItem().toString();

        if (maNguyenLieu.isEmpty() || tenNguyenLieu.isEmpty() || soLuong.isEmpty() || donViTinh.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int maNguyenLieuInt;
        int soLuongTon;
        try {
            maNguyenLieuInt = Integer.parseInt(maNguyenLieu);
            soLuongTon = Integer.parseInt(soLuong);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Mã nguyên liệu và số lượng phải là các số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo đối tượng KhoNguyenLieu mới
        KhoNguyenLieu khoNguyenLieu = new KhoNguyenLieu();
        khoNguyenLieu.setMaNL(maNguyenLieuInt);
        khoNguyenLieu.setTenNL(tenNguyenLieu);
        khoNguyenLieu.setsL(soLuongTon);
        khoNguyenLieu.setdVT(donViTinh);

        // Sử dụng KhoNLDAO để cập nhật dữ liệu vào CSDL
        KhoNLDAOImp khoNLDao = new KhoNLDAOImp();
        boolean isUpdated = khoNLDao.updateKhoNguyenLieu(khoNguyenLieu);

        if (isUpdated) {
            // Sau khi cập nhật dữ liệu thành công, cập nhật lại bảng
            loadDataFromTable();
            JOptionPane.showMessageDialog(null, "Cập nhật dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật dữ liệu thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        initComboboxList();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void cbxDonViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDonViTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDonViTinhActionPerformed

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtTimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusGained
        // TODO add your handling code here:
        if (txtTim.getText().trim().equals("Nhập tên nguyên liệu")) {
            txtTim.setText("");
            txtTim.setForeground(Color.BLACK); // Thiết lập màu văn bản là đen
        }
    }//GEN-LAST:event_txtTimFocusGained

    private void txtTimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusLost
        // TODO add your handling code here:
        if (txtTim.getText().trim().isEmpty()) {
            txtTim.setText("Nhập tên nguyên liệu");
            txtTim.setForeground(Color.GRAY); // Thiết lập màu văn bản là xám
        }
    }//GEN-LAST:event_txtTimFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Lấy dữ liệu từ cơ sở dữ liệu hoặc bất kỳ nguồn dữ liệu nào
        KhoNLDAO khoNguyenLieuDao = new KhoNLDAOImp();
        List<KhoNguyenLieu> khoNguyenLieuList = khoNguyenLieuDao.getList();

        // Tạo biểu đồ tròn
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for (KhoNguyenLieu khoNguyenLieu : khoNguyenLieuList) {
            pieDataset.setValue(khoNguyenLieu.getTenNL(), khoNguyenLieu.getsL());
        }
        JFreeChart pieChart = ChartFactory.createPieChart("Biểu đồ tròn", pieDataset, true, true, false);

        // Tạo biểu đồ cột
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        for (KhoNguyenLieu khoNguyenLieu : khoNguyenLieuList) {
            barDataset.addValue(khoNguyenLieu.getsL(), "Nguyên liệu", khoNguyenLieu.getTenNL());
        }
        JFreeChart barChart = ChartFactory.createBarChart("Biểu đồ cột", "Tên nguyên liệu", "Số lượng", barDataset);

        // Hiển thị biểu đồ trong một frame mới
        JFrame chartFrame = new JFrame("Thống kê kho nguyên liệu");
        chartFrame.setLayout(new GridLayout(1, 2));

        // Thêm biểu đồ tròn vào frame
        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        chartFrame.add(pieChartPanel);

        // Thêm biểu đồ cột vào frame
        ChartPanel barChartPanel = new ChartPanel(barChart);
        chartFrame.add(barChartPanel);

        // Hiển thị frame chứa biểu đồ
        chartFrame.setSize(800, 600);
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chartFrame.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocActionPerformed

        String selectedValue = (String) cbxLoc.getSelectedItem();
        loadDataFromTable2(selectedValue);
    }//GEN-LAST:event_cbxLocActionPerformed
    private void loadDataFromTable() {
        List<KhoNguyenLieu> khoNguyenLieuList = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DataHelper.openConnection();
            String sql = "SELECT * FROM Kho_Nguyen_Lieu";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // Loop through the result set and populate the list
            while (rs.next()) {
                KhoNguyenLieu khoNguyenLieu = new KhoNguyenLieu();
                khoNguyenLieu.setMaNL(rs.getInt("MA_NGUYEN_LIEU"));
                khoNguyenLieu.setTenNL(rs.getString("TEN_NGUYEN_LIEU"));
                khoNguyenLieu.setsL(rs.getInt("SO_LUONG_TON"));
                khoNguyenLieu.setdVT(rs.getString("DON_VI_TINH"));

                // Add the KhoNguyenLieu object to the list
                khoNguyenLieuList.add(khoNguyenLieu);
            }

            // Now that we have all the data, we can populate the table model
            DefaultTableModel model = (DefaultTableModel) tblThongTin.getModel();
            model.setRowCount(0); // Clear existing data

            for (KhoNguyenLieu knl : khoNguyenLieuList) {
                Object[] row = new Object[]{
                    knl.getMaNL(),
                    knl.getTenNL(),
                    knl.getsL(),
                    knl.getdVT()
                };
                model.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Failed to retrieve data from the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Log the exception for debugging purposes
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                // Handle or log the exception while closing resources
                e.printStackTrace();
            }
        }
    }

    private void loadDataFromTable1() {
        List<ChiTietKho> chiTietList = new ArrayList<>();
        try {
            Connection connection = DataHelper.openConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT ctgd.MA_GIAO_DICH, ctgd.MA_NGUYEN_LIEU, ctgd.SO_LUONG, nl.TEN_NGUYEN_LIEU\n"
                    + "FROM Chi_Tiet_Giao_Dich_Kho ctgd\n"
                    + "JOIN Kho_Nguyen_Lieu nl ON ctgd.MA_NGUYEN_LIEU = nl.MA_NGUYEN_LIEU";
            ResultSet resultSet = statement.executeQuery(query);
            // Kiểm tra mô hình bảng
            if (tblThongTin.getModel() instanceof DefaultTableModel) {
                DefaultTableModel tableModel = (DefaultTableModel) tblCTGDKho.getModel();
                // Tạo một mảng các tên cột
                String[] columnNames = {"Tên Nguyên Liệu", "Mã Giao Dịch", "Mã Nguyên Liệu", "Số Lượng"};
                // Đặt tên cột cho bảng
                for (int i = 0; i < columnNames.length; i++) {
                    TableColumnModel columnModel = tblCTGDKho.getColumnModel();
                    TableColumn column = columnModel.getColumn(i);
                    column.setHeaderValue(columnNames[i]);
                }
                tableModel.setRowCount(0); // Xóa dữ liệu hiện tại trong bảng
                while (resultSet.next()) {
                    ChiTietKho chiTiet = new ChiTietKho();
                    chiTiet.setmGD(resultSet.getInt("MA_GIAO_DICH"));
                    chiTiet.setmNL(resultSet.getInt("MA_NGUYEN_LIEU"));
                    chiTiet.setsLg(resultSet.getInt("SO_LUONG"));
                    chiTiet.setTenNL(resultSet.getString("TEN_NGUYEN_LIEU"));
                    // Thêm chi tiết vào danh sách
                    chiTietList.add(chiTiet);
                }
                // Bây giờ ta có toàn bộ dữ liệu, hãy cập nhật bảng
                for (ChiTietKho chiTiet : chiTietList) {
                    Object[] row = new Object[]{
                        chiTiet.getTenNL(),
                        chiTiet.getmGD(),
                        chiTiet.getmNL(),
                        chiTiet.getsLg()
                    };
                    tableModel.addRow(row);
                }
            } else {
                // Mô hình bảng không hợp lệ
                System.out.println("Mô hình bảng không hợp lệ!");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadDataFromTable2(String filter) {
        List<GDKho> gdkhoList = new ArrayList<>();
        try {
            Connection connection = DataHelper.openConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Giao_Dich_Kho";
            if (!filter.equals("Tất cả")) {
                query += " WHERE LOAI_GIAO_DICH = N'" + filter + "'";
            }
            ResultSet resultSet = statement.executeQuery(query);

            // Check if the table model is a DefaultTableModel
            if (tblGDKho.getModel() instanceof DefaultTableModel) {
                DefaultTableModel tableModel = (DefaultTableModel) tblGDKho.getModel();
                String[] columnNames = {"Mã Giao Giao", "Ngày Giờ", "Mã Người Dùng", "Loại Giao Dịch"};
                // Đặt tên cột cho bảng
                for (int i = 0; i < columnNames.length; i++) {
                    TableColumnModel columnModel = tblGDKho.getColumnModel();
                    TableColumn column = columnModel.getColumn(i);
                    column.setHeaderValue(columnNames[i]);
                }
                tableModel.setRowCount(0); // Clear current table data

                // Fetch data from the result set
                while (resultSet.next()) {
                    GDKho gdkho = new GDKho();
                    gdkho.setMaGD(resultSet.getInt("MA_GIAO_DICH"));
                    gdkho.setNgayGio(resultSet.getDate("NGAY_GIO"));
                    gdkho.setMaND(resultSet.getString("MA_NGUOI_DUNG"));
                    gdkho.setLoaiGD(resultSet.getString("LOAI_GIAO_DICH"));
                    gdkhoList.add(gdkho);
                }

                // Populate the table with data
                for (GDKho gdkho : gdkhoList) {
                    Object[] row = new Object[]{
                        gdkho.getMaGD(),
                        gdkho.getNgayGio(),
                        gdkho.getMaND(),
                        gdkho.getLoaiGD()
                    };
                    tableModel.addRow(row);
                }
            } else {
                System.out.println("Mô hình bảng không hợp lệ!");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnMoi;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxDonViTinh;
    private javax.swing.JComboBox<String> cbxLoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCTGDKho;
    private javax.swing.JTable tblGDKho;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTextField txtMaNguyenLieu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenNguyenLieu;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
