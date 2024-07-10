package frm_Home;

import frm_ThongKe.JFame_ThongKeHoaDon;
import frm_ThucDon.JFrame_MenuForm;
import cnn.*;
import frm_DonHang.JFrame_ThemMoiDonHang;
import frm_ThongTinNguoiDung.JFrame_ThongTinNguoiDung;
import java.awt.BorderLayout;
import java.sql.Connection;
import javax.swing.border.EmptyBorder;
import model.TaiKhoanDangNhapDTO;
import org.jfree.chart.ChartPanel;

public class JFrame_MainForm extends javax.swing.JFrame {

    private Connect_Db Db = new Connect_Db();
    private Connection connect;
    public TaiKhoanDangNhapDTO tkdn;

    public JFrame_MainForm(TaiKhoanDangNhapDTO tkdn) {
        this.tkdn = tkdn;
        connect = Db.connectDB();
        initComponents();
        kiemTraVaiTro();
    }

    public JFrame_MainForm() {
        connect = Db.connectDB();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Chart = new javax.swing.JButton();
        HoaDonbtn = new javax.swing.JButton();
        DonHangbtn = new javax.swing.JButton();
        QuanLyNhanVienbtn = new javax.swing.JButton();
        QuanLyKhobtn = new javax.swing.JButton();
        btn_QuanLiKhachHang = new javax.swing.JButton();
        btn_QuanLiSanPham = new javax.swing.JButton();
        panel_User = new javax.swing.JPanel();
        btn_Home = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_User = new javax.swing.JButton();
        btn_Book = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        multiPane = new javax.swing.JTabbedPane();
        pnMultiPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sugong Coffee");
        setMaximumSize(new java.awt.Dimension(1493, 790));
        setMinimumSize(new java.awt.Dimension(1493, 790));
        setPreferredSize(new java.awt.Dimension(1493, 790));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setBackground(new java.awt.Color(252, 234, 186));
        pnMenu.setPreferredSize(new java.awt.Dimension(1493, 800));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/su.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(252, 234, 186));

        btn_Chart.setBackground(new java.awt.Color(255, 204, 204));
        btn_Chart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Chart.setForeground(new java.awt.Color(255, 102, 102));
        btn_Chart.setText("Thống kê");
        btn_Chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChartActionPerformed(evt);
            }
        });

        HoaDonbtn.setBackground(new java.awt.Color(255, 153, 153));
        HoaDonbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HoaDonbtn.setForeground(new java.awt.Color(255, 51, 51));
        HoaDonbtn.setText("Quản lí hóa đơn");
        HoaDonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonbtnActionPerformed(evt);
            }
        });

        DonHangbtn.setBackground(new java.awt.Color(255, 51, 51));
        DonHangbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DonHangbtn.setText("Quản lí đơn hàng");
        DonHangbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonHangbtnActionPerformed(evt);
            }
        });

        QuanLyNhanVienbtn.setBackground(new java.awt.Color(255, 153, 153));
        QuanLyNhanVienbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuanLyNhanVienbtn.setForeground(new java.awt.Color(255, 51, 51));
        QuanLyNhanVienbtn.setText("Quản lí nhân viên");
        QuanLyNhanVienbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanLyNhanVienbtnActionPerformed(evt);
            }
        });

        QuanLyKhobtn.setBackground(new java.awt.Color(255, 51, 51));
        QuanLyKhobtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuanLyKhobtn.setText("Quản lí kho");
        QuanLyKhobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanLyKhobtnActionPerformed(evt);
            }
        });

        btn_QuanLiKhachHang.setBackground(new java.awt.Color(255, 153, 153));
        btn_QuanLiKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_QuanLiKhachHang.setForeground(new java.awt.Color(255, 51, 51));
        btn_QuanLiKhachHang.setText("Quản lí khách hàng");
        btn_QuanLiKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLiKhachHangActionPerformed(evt);
            }
        });

        btn_QuanLiSanPham.setBackground(new java.awt.Color(255, 153, 153));
        btn_QuanLiSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_QuanLiSanPham.setForeground(new java.awt.Color(255, 51, 51));
        btn_QuanLiSanPham.setText("Quản lí sản phẩm");
        btn_QuanLiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLiSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_QuanLiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Chart, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(DonHangbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HoaDonbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuanLyNhanVienbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuanLyKhobtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_QuanLiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_QuanLiKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_QuanLiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuanLyNhanVienbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoaDonbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonHangbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuanLyKhobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Chart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_User.setBackground(new java.awt.Color(252, 234, 186));

        btn_Home.setBackground(new java.awt.Color(255, 204, 204));
        btn_Home.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(255, 102, 102));
        btn_Home.setText("Trang chủ");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        btn_Menu.setBackground(new java.awt.Color(255, 153, 153));
        btn_Menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Menu.setForeground(new java.awt.Color(255, 51, 51));
        btn_Menu.setText("Thêm hóa đơn");
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });

        btn_User.setBackground(new java.awt.Color(255, 51, 51));
        btn_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_User.setForeground(new java.awt.Color(255, 204, 204));
        btn_User.setText("Thông tin người dùng");
        btn_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserActionPerformed(evt);
            }
        });

        btn_Book.setBackground(new java.awt.Color(255, 51, 51));
        btn_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Book.setText("Thêm đơn đặt hàng");
        btn_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_UserLayout = new javax.swing.GroupLayout(panel_User);
        panel_User.setLayout(panel_UserLayout);
        panel_UserLayout.setHorizontalGroup(
            panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_User, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_UserLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        panel_UserLayout.setVerticalGroup(
            panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_User, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_UserLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panel_User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 800));

        pnMultiPane.setBackground(new java.awt.Color(255, 204, 204));
        pnMultiPane.setPreferredSize(new java.awt.Dimension(1263, 755));
        pnMultiPane.setLayout(new java.awt.BorderLayout());
        multiPane.addTab("tab1", pnMultiPane);

        getContentPane().add(multiPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, -39, 1290, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kiemTraVaiTro() {
        int quyen = tkdn.getVaiTro();
        if (quyen == 1) // quyền admin ( mở panel xử lí )
        {
            jPanel1.setVisible(true);
        } else {
            jPanel1.setVisible(false);
        }
    }

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // Chuyển đến tab đầu tiên
        multiPane.setSelectedIndex(0);

        // Tạo và hiển thị frame ThucDon bên trong panel1
        pnMultiPane.removeAll(); // Xóa tất cả các thành phần bên trong panel1 trước khi thêm mới

        // Đặt JFrame_HomeSlide panel vào giữa của pnMultiPane
        JFrame_HomeSlide homeSlide = new JFrame_HomeSlide();
        pnMultiPane.add(homeSlide.getContentPane());

        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        JFrame_MenuForm menuForm = new JFrame_MenuForm();
        pnMultiPane.add(menuForm.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        JFrame_ThemMoiDonHang tmdh = new JFrame_ThemMoiDonHang();
        pnMultiPane.add(tmdh.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_BookActionPerformed

    private void HoaDonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonbtnActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        frm_HoaDon.JFrame_QuanLyHoaDon qlhd = new frm_HoaDon.JFrame_QuanLyHoaDon();
        pnMultiPane.add(qlhd.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_HoaDonbtnActionPerformed

    private void btn_ChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChartActionPerformed

        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll(); // Xóa tất cả các thành phần hiện tại trong pnMultiPane

        JFame_ThongKeHoaDon chart = new JFame_ThongKeHoaDon();
        ChartPanel chartPanel = chart.createChartPanel();

        EmptyBorder emptyBorder = new EmptyBorder(100, 0, 0, 0);
        chartPanel.setBorder(emptyBorder);

        // Lấy kích thước hiện tại của pnMultiPane
        int width = pnMultiPane.getWidth(); // Sử dụng chiều rộng hiện tại của pnMultiPane
        int height = pnMultiPane.getHeight() * 70 / 100; // Chiếm 30% chiều cao của pnMultiPane
        chartPanel.setPreferredSize(new java.awt.Dimension(width, height));

        pnMultiPane.setLayout(new BorderLayout()); // Đảm bảo BorderLayout cho pnMultiPane
        pnMultiPane.add(chartPanel, BorderLayout.NORTH); // Thêm ChartPanel vào pnMultiPane ở vị trí top
        pnMultiPane.revalidate(); // Cập nhật layout của pnMultiPane
        pnMultiPane.repaint(); // Vẽ lại pnMultiPane

    }//GEN-LAST:event_btn_ChartActionPerformed

    private void btn_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        JFrame_ThongTinNguoiDung ttnd = new JFrame_ThongTinNguoiDung(tkdn);
        pnMultiPane.add(ttnd.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_UserActionPerformed

    private void DonHangbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonHangbtnActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        frm_DonHang.JFrame_QuanLiDonDathang qldh = new frm_DonHang.JFrame_QuanLiDonDathang();
        pnMultiPane.add(qldh.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_DonHangbtnActionPerformed

    private void QuanLyNhanVienbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanLyNhanVienbtnActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        frm_NhanVien.JFrame_QuanLyNhanVien nv = new frm_NhanVien.JFrame_QuanLyNhanVien();
        pnMultiPane.add(nv.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_QuanLyNhanVienbtnActionPerformed

    private void QuanLyKhobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanLyKhobtnActionPerformed
        this.dispose();
        frm_Kho.NewJFrame kho = new frm_Kho.NewJFrame();
        kho.setVisible(true);
    }//GEN-LAST:event_QuanLyKhobtnActionPerformed

    private void btn_QuanLiKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLiKhachHangActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        frm_KhachHang.JFrame_QuanLyKhachHang kh = new frm_KhachHang.JFrame_QuanLyKhachHang();
        pnMultiPane.add(kh.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_QuanLiKhachHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_QuanLiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLiSanPhamActionPerformed
        multiPane.setSelectedIndex(0);
        pnMultiPane.removeAll();
        frm_SanPham.JFrame_QuanLiSanPham sp = new frm_SanPham.JFrame_QuanLiSanPham();
        pnMultiPane.add(sp.getContentPane());
        pnMultiPane.revalidate();
        pnMultiPane.repaint();
    }//GEN-LAST:event_btn_QuanLiSanPhamActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonHangbtn;
    private javax.swing.JButton HoaDonbtn;
    private javax.swing.JButton QuanLyKhobtn;
    private javax.swing.JButton QuanLyNhanVienbtn;
    private javax.swing.JButton btn_Book;
    private javax.swing.JButton btn_Chart;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_QuanLiKhachHang;
    private javax.swing.JButton btn_QuanLiSanPham;
    private javax.swing.JButton btn_User;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane multiPane;
    private javax.swing.JPanel panel_User;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnMultiPane;
    // End of variables declaration//GEN-END:variables

}
