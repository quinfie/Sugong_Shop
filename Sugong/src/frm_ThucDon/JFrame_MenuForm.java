package frm_ThucDon;

import model.*;
import cnn.Connect_Db;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.Locale;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class JFrame_MenuForm extends javax.swing.JFrame {

    public static final int COFFEE = 1;
    public static final int TEA = 2;
    public static final int SMOOTHIE = 3;
    public static final int COOKIES = 4;
    public static final int MACARON = 5;
    public static final int DONUT = 6;

    private ChiTietHoaDonDTO chiTietHoaDonDTO;
    private ThucDonDAO thucDonDAO;
    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    private ThongTinNguoiDungDAO thongTinNguoiDungDAO = new ThongTinNguoiDungDAO();
    private ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

    private DecimalFormat decimalFormat = new DecimalFormat("#,### đ");
    private NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
    private DefaultTableModel cart = new DefaultTableModel();
    private ArrayList<ThucDonDTO> list = new ArrayList<>();
    private Connect_Db Db = new Connect_Db();
    private Connection connect;
    private ImageIcon icon, iconScaled;
    private Image img, imgScaled;

    public JFrame_MenuForm() {
        connect = Db.connectDB();
        thucDonDAO = new ThucDonDAO(connect);
        initComponents();
        initTitle();
        setupScrollPane();
        initCart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_ThucDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CookiesBtn = new javax.swing.JButton();
        DonursBtn = new javax.swing.JButton();
        CoffeeBtn = new javax.swing.JButton();
        SmoothieBtn = new javax.swing.JButton();
        TeaBtn = new javax.swing.JButton();
        MacaronBtn = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        searchMon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pn_Cart = new javax.swing.JPanel();
        topCart = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delOne = new javax.swing.JButton();
        delAll = new javax.swing.JButton();
        detailNote = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        mainCart = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Cart = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_Ma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_npt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tf_sdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_ThanhTien = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);

        pn_ThucDon.setBackground(new java.awt.Color(255, 204, 204));
        pn_ThucDon.setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thực Đơn");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CookiesBtn.setBackground(new java.awt.Color(255, 153, 153));
        CookiesBtn.setForeground(new java.awt.Color(255, 102, 102));
        CookiesBtn.setText("Cookies");
        CookiesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CookiesBtnActionPerformed(evt);
            }
        });

        DonursBtn.setBackground(new java.awt.Color(255, 153, 153));
        DonursBtn.setForeground(new java.awt.Color(255, 102, 102));
        DonursBtn.setText("Donuts");
        DonursBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonursBtnActionPerformed(evt);
            }
        });

        CoffeeBtn.setBackground(new java.awt.Color(255, 153, 153));
        CoffeeBtn.setForeground(new java.awt.Color(255, 102, 102));
        CoffeeBtn.setText("Coffee");
        CoffeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeBtnActionPerformed(evt);
            }
        });

        SmoothieBtn.setBackground(new java.awt.Color(255, 153, 153));
        SmoothieBtn.setForeground(new java.awt.Color(255, 102, 102));
        SmoothieBtn.setText("Smoothie");
        SmoothieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmoothieBtnActionPerformed(evt);
            }
        });

        TeaBtn.setBackground(new java.awt.Color(255, 153, 153));
        TeaBtn.setForeground(new java.awt.Color(255, 102, 102));
        TeaBtn.setText("Tea & Milk Tea");
        TeaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeaBtnActionPerformed(evt);
            }
        });

        MacaronBtn.setBackground(new java.awt.Color(255, 153, 153));
        MacaronBtn.setForeground(new java.awt.Color(255, 102, 102));
        MacaronBtn.setText("Macaron");
        MacaronBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacaronBtnActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(255, 204, 204));
        Search.setForeground(new java.awt.Color(255, 204, 204));
        Search.setBorder(null);
        Search.setBorderPainted(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        searchMon.setBackground(new java.awt.Color(255, 153, 153));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jScrollPane1.setViewportView(jPanel1);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(null);
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 1000));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout pn_ThucDonLayout = new javax.swing.GroupLayout(pn_ThucDon);
        pn_ThucDon.setLayout(pn_ThucDonLayout);
        pn_ThucDonLayout.setHorizontalGroup(
            pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ThucDonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SmoothieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CookiesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonursBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CoffeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MacaronBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pn_ThucDonLayout.setVerticalGroup(
            pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ThucDonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ThucDonLayout.createSequentialGroup()
                        .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CoffeeBtn)
                            .addComponent(DonursBtn)
                            .addComponent(CookiesBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MacaronBtn)
                            .addComponent(TeaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmoothieBtn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ThucDonLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(searchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ThucDonLayout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pn_Cart.setBackground(new java.awt.Color(255, 204, 204));

        topCart.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Giỏ hàng");

        delOne.setBackground(new java.awt.Color(255, 204, 204));
        delOne.setForeground(new java.awt.Color(255, 102, 102));
        delOne.setText("Xóa món");
        delOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delOneActionPerformed(evt);
            }
        });

        delAll.setBackground(new java.awt.Color(255, 204, 204));
        delAll.setForeground(new java.awt.Color(255, 102, 102));
        delAll.setText("Xóa tất cả");
        delAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAllActionPerformed(evt);
            }
        });

        detailNote.setBackground(new java.awt.Color(255, 153, 153));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.setValue(1);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout topCartLayout = new javax.swing.GroupLayout(topCart);
        topCart.setLayout(topCartLayout);
        topCartLayout.setHorizontalGroup(
            topCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(topCartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delAll, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(delOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner1))
                .addGap(18, 18, 18)
                .addComponent(detailNote)
                .addContainerGap())
        );
        topCartLayout.setVerticalGroup(
            topCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topCartLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topCartLayout.createSequentialGroup()
                        .addComponent(delOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delAll))
                    .addComponent(detailNote))
                .addContainerGap())
        );

        mainCart.setBackground(new java.awt.Color(255, 204, 204));

        tb_Cart.setBackground(new java.awt.Color(255, 204, 204));
        tb_Cart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_Cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tb_Cart.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tb_Cart.setRowHeight(60);
        tb_Cart.setShowGrid(true);
        jScrollPane2.setViewportView(tb_Cart);

        javax.swing.GroupLayout mainCartLayout = new javax.swing.GroupLayout(mainCart);
        mainCart.setLayout(mainCartLayout);
        mainCartLayout.setHorizontalGroup(
            mainCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );
        mainCartLayout.setVerticalGroup(
            mainCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
            .addGroup(mainCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainCartLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Mã khách hàng");

        tf_Ma.setBackground(new java.awt.Color(255, 153, 153));
        tf_Ma.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Người phụ trách");

        cb_npt.setBackground(new java.awt.Color(255, 153, 153));

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Số điện thoại");

        tf_sdt.setBackground(new java.awt.Color(255, 153, 153));
        tf_sdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_sdtFocusLost(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Thành tiền");

        tf_ThanhTien.setBackground(new java.awt.Color(255, 153, 153));
        tf_ThanhTien.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Lưu hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_npt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_npt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pn_CartLayout = new javax.swing.GroupLayout(pn_Cart);
        pn_Cart.setLayout(pn_CartLayout);
        pn_CartLayout.setHorizontalGroup(
            pn_CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_CartLayout.setVerticalGroup(
            pn_CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CartLayout.createSequentialGroup()
                .addComponent(topCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_ThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_Cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_ThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Truy vấn tất cả các mục trong bảng thực đơn

    public ArrayList<ThucDonDTO> getThucDonData(Connection conn) {
        return getThucDonByQuery(conn, "SELECT MA_MON, TEN_MON, THANH_PHAN, GIA, HINH_ANH, MA_LOAI_THUC_DON FROM Thuc_Don", null);
    }

    //thực hiện truy vấn lấy các mục từ bảng Thuc_Don với điều kiện (loại thực đơn bằng giá trị loai)
    public ArrayList<ThucDonDTO> getThucDon_ByTenLoai(Connection conn, int loai) {
        String sql = "SELECT MA_MON, TEN_MON, THANH_PHAN, GIA, HINH_ANH, MA_LOAI_THUC_DON FROM Thuc_Don WHERE MA_LOAI_THUC_DON = ?";
        return getThucDonByQuery(conn, sql, loai);
    }

    //thực hiện truy vấn (tên món chứa giá trị name)
    public ArrayList<ThucDonDTO> getThucDon_ByName(Connection conn, String name) {
        String sql = "SELECT MA_MON, TEN_MON, THANH_PHAN, GIA, HINH_ANH, MA_LOAI_THUC_DON FROM Thuc_Don WHERE TEN_MON LIKE ?";
        return getThucDonByQuery(conn, sql, "%" + name + "%");
    }

    private ArrayList<ThucDonDTO> getThucDonByQuery(Connection conn, String sql, Object parameter) {
        ArrayList<ThucDonDTO> list = new ArrayList<>(); //lưu trữ kết quả truy vấn
        try (PreparedStatement stmt = conn.prepareStatement(sql)) { //interface
            if (parameter != null) {
                if (parameter instanceof Integer) {
                    stmt.setInt(1, (int) parameter);
                } else if (parameter instanceof String) {
                    stmt.setString(1, (String) parameter);
                }
            }
            try (ResultSet rs = stmt.executeQuery()) { // ResultSet để lấy các giá trị từ mỗi hàng kết quả của truy vấn
                while (rs.next()) {
                    int maMon = rs.getInt("MA_MON");
                    String tenMon = rs.getString("TEN_MON");
                    String thanhPhan = rs.getString("THANH_PHAN");
                    int gia = rs.getInt("GIA");
                    String hinhAnh = rs.getString("HINH_ANH");
                    int maLoai = rs.getInt("MA_LOAI_THUC_DON");
                    ThucDonDTO td = new ThucDonDTO(maMon, tenMon, thanhPhan, gia, hinhAnh, maLoai);
                    list.add(td);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving ThucDon data: " + e.getMessage());
        }
        return list;
    }

    private int themHoaDon(String maKhachHang, String nguoiPhuTrach, double thanhTien) {
        int maHoaDon = -1;// Giả sử không tìm thấy mã hóa đơn
        if (connect != null) {
            try { //Truy vấn này sử dụng các tham số động để chèn các giá trị tương ứng.
                String query = "INSERT INTO Hoa_Don (MA_KHACH_HANG, NGUOI_PHU_TRACH, THANH_TIEN) VALUES (?, ?, ?)";
                PreparedStatement statement = connect.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);//cho phép ResultSet chứa các khóa tạo ra trong quá trình thực thi truy vấn.
                statement.setString(1, maKhachHang);
                statement.setString(2, nguoiPhuTrach);
                statement.setDouble(3, thanhTien);
                statement.executeUpdate();

                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    maHoaDon = generatedKeys.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return maHoaDon;
    }

    private void themChiTietHoaDonTuGioHang(int maHoaDon) {
        for (int i = 0; i < cart.getRowCount(); i++) { //hang
            String tenMon = (String) cart.getValueAt(i, 1);
            int soLuong = (int) cart.getValueAt(i, 3);
            int maMon = thucDonDAO.layMaMonTuTenMon(tenMon);

            chiTietHoaDonDTO = new ChiTietHoaDonDTO(maHoaDon, maMon, soLuong);
            chiTietHoaDonDAO.themChiTietHoaDon(chiTietHoaDonDTO);
        }
    }//duyệt qa all và thêm cthd tương ứng vào csdl

    //===========================================================================================================

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        clearList(); //xóa ds hiện tại
        if (searchMon.getText().isEmpty()) {
            list = getThucDonData(connect); //gán dữ liệu menu vào list
            createPanels(list); //hiển thị ds menu
        } else {//lấy menu theo tên gán vào list
            list = getThucDon_ByName(connect, searchMon.getText());
            createPanels(list);
        }
        searchMon.setText("");//xóa nd nhập liệu
    }//GEN-LAST:event_SearchActionPerformed

    private void SmoothieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmoothieBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, SMOOTHIE);
        createPanels(list);
    }//GEN-LAST:event_SmoothieBtnActionPerformed

    private void CookiesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CookiesBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, COOKIES);
        createPanels(list);
    }//GEN-LAST:event_CookiesBtnActionPerformed

    private void DonursBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonursBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, DONUT);
        createPanels(list);
    }//GEN-LAST:event_DonursBtnActionPerformed

    private void CoffeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, COFFEE);
        createPanels(list);
    }//GEN-LAST:event_CoffeeBtnActionPerformed

    private void TeaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeaBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, TEA);
        createPanels(list);
    }//GEN-LAST:event_TeaBtnActionPerformed

    private void MacaronBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacaronBtnActionPerformed
        clearList();
        list = getThucDon_ByTenLoai(connect, MACARON);
        createPanels(list);
    }//GEN-LAST:event_MacaronBtnActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if ((int) jSpinner1.getValue() < 0) {
            JOptionPane.showMessageDialog(null, "Số lượng không được nhỏ hơn 0");
            jSpinner1.setValue(0);
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void delOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delOneActionPerformed
        int selectedRow = tb_Cart.getSelectedRow();
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
    }//GEN-LAST:event_delOneActionPerformed

    private void delAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAllActionPerformed
        int response = JOptionPane.showConfirmDialog(
                null,
                "Bạn có chắc muốn xóa tất cả các món?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (response == JOptionPane.YES_OPTION) {
            xoaTatCaMonTrongGioHang();
        }
    }//GEN-LAST:event_delAllActionPerformed

    private void tf_sdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_sdtFocusLost
        String soDienThoai = tf_sdt.getText();
        String maKhachHang = khachHangDAO.getMaKhachHang(soDienThoai);
        tf_Ma.setText(maKhachHang);
    }//GEN-LAST:event_tf_sdtFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String maKhachHang = tf_Ma.getText();
        String maNguoiPhuTrach = thongTinNguoiDungDAO.layMaNguoiPhuTrach(cb_npt.getSelectedItem().toString());

        String totalStr = tf_ThanhTien.getText().toString();
        double total = convertStringToDouble(totalStr);//chuyển thành số thực

        int maHoaDon = themHoaDon(maKhachHang, maNguoiPhuTrach, total);

        if (maHoaDon != -1) {
            // Thêm các món vào bảng Chi_Tiet_Hoa_Don
            themChiTietHoaDonTuGioHang(maHoaDon);
            JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm hóa đơn thất bại");
        }
        clearPayment();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    public void scaleImage(JLabel label, String fileImage, int width, int height) {
        icon = new ImageIcon(fileImage);
        img = icon.getImage();

        // Scale hình ảnh với kích thước mới
        imgScaled = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        iconScaled = new ImageIcon(imgScaled);
        label.setIcon(iconScaled);
    }

    public JPanel createPanel(ThucDonDTO thucDon) {
        Font font = new Font("Arial", Font.BOLD, 12);
        Border border = new LineBorder(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Sử dụng FlowLayout, padding là 10 pixel theo chiều ngang, 10 pixel theo chiều dọc
        panel.setBackground(new Color(255, 204, 229)); // Đặt màu nền thành màu hồng nhạt

        JLabel lb_Hinh = new JLabel();
        lb_Hinh.setPreferredSize(new Dimension(120, 75));
        lb_Hinh.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        lb_Hinh.setOpaque(true);
        lb_Hinh.setBackground(Color.PINK);

        String fileimage = "src/img/" + thucDon.getHinhAnh();
        scaleImage(lb_Hinh, fileimage, 69, 93);
        panel.add(lb_Hinh);

        JTextArea lb_TenMon = new JTextArea(thucDon.getTenMon());
        lb_TenMon.setPreferredSize(new Dimension(200, 35));
        lb_TenMon.setLineWrap(true); // Cho phép tự động xuống dòng
        lb_TenMon.setMargin(new Insets(0, 0, 0, 4));
        lb_TenMon.setEnabled(false);
        lb_TenMon.setFont(font);
        panel.add(lb_TenMon);

        JTextArea ThanhPhan_lb = new JTextArea(thucDon.getThanhPhan());
        ThanhPhan_lb.setLineWrap(true); // Cho phép tự động xuống dòng
        ThanhPhan_lb.setWrapStyleWord(true); // Xuống dòng theo từ
        ThanhPhan_lb.setPreferredSize(new Dimension(210, 115));
        ThanhPhan_lb.setEnabled(false);
        panel.add(ThanhPhan_lb);

        JButton btn_ChonMon = new JButton("Thêm vào giỏ hàng");
        btn_ChonMon.setPreferredSize(new Dimension(143, 28));
        panel.add(btn_ChonMon);

        int gia = thucDon.getGia();
        String giaFormatted = decimalFormat.format(gia);
        JTextField tf_Gia = new JTextField(giaFormatted);
        tf_Gia.setPreferredSize(new Dimension(65, 25));
        tf_Gia.setEnabled(false);
        panel.add(tf_Gia);

        // Thiết lập event cho ThucDonDTO
        btn_ChonMon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GetInfoThucDon(thucDon);
            }
        });

        // Thiết lập size cho panel
        panel.setPreferredSize(new Dimension(245, 295));

        // Thiết lập border cho panel
        panel.setBorder(border);

        return panel;
    }

    public void setupScrollPane() {
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // Set FlowLayout for jPanel1
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(25);
        jScrollPane1.setViewportView(jPanel1);
        jScrollPane1.setBackground(new Color(255, 204, 229));
    }

    public void createPanels(List<ThucDonDTO> thucDonList) {
        jPanel1.removeAll(); // Xóa tất cả các JPanel con trước khi thêm mới
        int rows = (thucDonList.size() + 2) / 3; //Số hàng được tính bằng cách thêm 2 vào số lượng thực đơn và chia cho 3.
        int panelHeight = 245;

        jPanel1.setPreferredSize(new Dimension(1280, rows * panelHeight));
        for (ThucDonDTO thucDon : thucDonList) {
            JPanel panel = createPanel(thucDon);
            jPanel1.add(panel);
        }
        jPanel1.revalidate(); // Yêu cầu jPanel1 vẽ lại nội dung mới
        jPanel1.repaint();
    }

    public void initTitle() {
        icon = new ImageIcon(getClass().getResource("/img/search.png"));
        img = icon.getImage();
        int width = Search.getWidth();
        int height = Search.getHeight();
        Image imgScaled = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon iconScaled = new ImageIcon(imgScaled);
        Search.setIcon(iconScaled);
    }

    private void clearList() {
        list.clear();
        jPanel1.removeAll();
    }

    private double convertStringToDouble(String str) {
        str = str.replaceAll("[^\\d]", ""); // Loại bỏ tất cả các ký tự không phải là số hoặc dấu chấm
        // Thay dấu chấm phân cách hàng nghìn bằng dấu chấm phân cách thập phân
        str = str.replace(",", ".");
        return Double.parseDouble(str);
    }

    private void clearPayment() {
        xoaTatCaMonTrongGioHang();
        tf_Ma.setText("");
        tf_ThanhTien.setText("");
        tf_sdt.setText("");
        cb_npt.setSelectedItem(null);

    }

    //======================================================================================================================
    private void initCart() {
        fillNguoiPhuTrach();

        cart.addColumn("STT");
        cart.addColumn("Tên");
        cart.addColumn("Giá");
        cart.addColumn("Số lượng");
        cart.addColumn("Ghi chú");

        tb_Cart.setModel(cart);

        TableColumn sttColumn = tb_Cart.getColumnModel().getColumn(0);
        sttColumn.setPreferredWidth(40);
        falseEditCell(sttColumn);

        // Sử dụng renderer mặc định cho cột "Tên"
        TableColumn tenColumn = tb_Cart.getColumnModel().getColumn(1);
        tenColumn.setPreferredWidth(240);
        falseEditCell(tenColumn);

        TableColumn giaColumn = tb_Cart.getColumnModel().getColumn(2);
        giaColumn.setPreferredWidth(70);
        falseEditCell(giaColumn);

        // Thiết lập kích thước cho cột "Số lượng"
        TableColumn soLuongColumn = tb_Cart.getColumnModel().getColumn(3); // Cột "Số lượng" ở vị trí 3
        soLuongColumn.setPreferredWidth(65); // Thiết lập chiều rộng cho cột "Số lượng"

        TableColumn gcColumn = tb_Cart.getColumnModel().getColumn(4);
        gcColumn.setPreferredWidth(143);

        // Thêm sự kiện để tự động tăng STT
        tb_Cart.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateSTTColumn();
            }
        });
        setTongTien();
    }

    public void falseEditCell(TableColumn tenColumn) {
        tenColumn.setCellEditor(new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        });
    }

    public void setTongTien() {
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                double total = tinhTongTien(); // Lấy giá trị tổng tiền từ phương thức tinhTongTien()
                String formattedTotal = formatter.format(total); // Định dạng giá trị tổng tiền
                tf_ThanhTien.setText(formattedTotal); // Đặt giá trị đã định dạng vào text field
            }
        });
    }

    // Phương thức để cập nhật STT tự động
    private void updateSTTColumn() {
        for (int i = 0; i < tb_Cart.getRowCount(); i++) {
            tb_Cart.setValueAt(i + 1, i, 0);
        }
    }

    private void xoaMonTrongGioHang(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        model.removeRow(rowIndex);
    }

    private void xoaTatCaMonTrongGioHang() {
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng
    }

    private boolean isMonDaCoTrongList(String tenMon) {
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String tenMonHienTai = (String) model.getValueAt(i, 1); // Lấy tên món ở cột thứ hai
            if (tenMonHienTai.equals(tenMon)) {
                return true; // Trả về true nếu món đã tồn tại trong danh sách
            }
        }
        return false; // Trả về false nếu món không tồn tại trong danh sách
    }

    private void AddToCart(Integer stt, String tenMon, double giaMon, int soLuong, String ghiChu) {
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        model.addRow(new Object[]{stt, tenMon, giaMon, soLuong, ghiChu});
    }

    private void addToCartOrUpdateQuantity(Integer stt, String tenMon, double giaMon, int soLuong, String ghiChu) {
        if (isMonDaCoTrongList(tenMon)) {
            // Nếu món đã tồn tại trong danh sách, tăng số lượng
            DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                String tenMonHienTai = (String) model.getValueAt(i, 1); // Lấy tên món ở cột thứ hai
                if (tenMonHienTai.equals(tenMon)) {
                    int soLuongHienTai = (int) model.getValueAt(i, 3); // Lấy số lượng ở cột thứ tư
                    model.setValueAt(soLuongHienTai + soLuong, i, 3); // Cập nhật số lượng
                    return;
                }
            }
        } else {
            // Nếu món chưa tồn tại trong danh sách, thêm món mới vào danh sách
            AddToCart(stt, tenMon, giaMon, soLuong, ghiChu);
        }
    }

    private void GetInfoThucDon(ThucDonDTO thucDon) {
        String tenMon = thucDon.getTenMon();
        double giaMon = thucDon.getGia();
        int soLuong = (int) jSpinner1.getValue();
        String ghiChu = detailNote.getText();
        int stt = tb_Cart.getRowCount() + 1;
        addToCartOrUpdateQuantity(stt, tenMon, giaMon, soLuong, ghiChu);
        tinhTongTien();
        refreshCart();
    }

    public void refreshCart() {
        jSpinner1.setValue(1);
        detailNote.setText("");
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

    private double tinhTongTien() {
        double tongTien = 0.0;
        DefaultTableModel model = (DefaultTableModel) tb_Cart.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            double gia = (double) model.getValueAt(i, 2); // Cột "Giá" ở vị trí 2
            int soLuong = (int) model.getValueAt(i, 3); // Cột "Số lượng" ở vị trí 3
            tongTien += gia * soLuong;
        }
        return tongTien;

    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            }
            JFrame_MenuForm menuForm = new JFrame_MenuForm();
            menuForm.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CoffeeBtn;
    private javax.swing.JButton CookiesBtn;
    private javax.swing.JButton DonursBtn;
    private javax.swing.JButton MacaronBtn;
    private javax.swing.JButton Search;
    private javax.swing.JButton SmoothieBtn;
    private javax.swing.JButton TeaBtn;
    private javax.swing.JComboBox<String> cb_npt;
    private javax.swing.JButton delAll;
    private javax.swing.JButton delOne;
    private javax.swing.JTextField detailNote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel mainCart;
    private javax.swing.JPanel pn_Cart;
    private javax.swing.JPanel pn_ThucDon;
    private javax.swing.JTextField searchMon;
    private javax.swing.JTable tb_Cart;
    private javax.swing.JTextField tf_Ma;
    private javax.swing.JTextField tf_ThanhTien;
    private javax.swing.JTextField tf_sdt;
    private javax.swing.JPanel topCart;
    // End of variables declaration//GEN-END:variables
}
