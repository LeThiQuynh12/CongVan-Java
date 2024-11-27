package QuanLyCongVan.Views;



import QuanLyCongVan.Controllers.PhongBanController;
import QuanLyCongVan.Controllers.TaiLieuController;
import QuanLyCongVan.Controllers.VanBanNoiBoController;
import QuanLyCongVan.Model.PhongBan;
import QuanLyCongVan.Model.TaiLieu;

import QuanLyCongVan.Model.VanBanNoiBo;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class FormTrangChu extends javax.swing.JFrame {
private DefaultTableModel  tableModelPhongBan = new DefaultTableModel(); 
private final DefaultTableModel tableModelVanBanNoiBo = new DefaultTableModel();
private DefaultTableModel tableModelTaiLieu = new DefaultTableModel();

    
    public FormTrangChu() throws SQLException {
        initComponents();
        CardLayout cardLayout = (CardLayout) pnChuaCacCard.getLayout();
        // Thêm từng panel vào CardLayout với key tương ứng
        pnChuaCacCard.add(panelHeThong, "heThong");
        pnChuaCacCard.add(panelQLVanBan, "quanLyVanBan");
        pnChuaCacCard.add(panelQLVBNoiBo, "quanLyVanBanNoiBo");
        pnChuaCacCard.add(panelTimThong, "timThong");
        initTablePhongBan();
        fillDataPhongBan();
        
        
       initTableVanBanNoiBo();
       fillDataVanBanNoiBo();
       initTableVanBanNoiBo1();
       
       loadComboboxData();
       loadComboboxData1();
        initTableTaiLieu(); 
        fillDataTaiLieu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btnThem1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnTaiLai1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        ThanhMenu1 = new javax.swing.JPanel();
        panelButton1 = new javax.swing.JPanel();
        btnHeThong1 = new javax.swing.JButton();
        btnQLVBNoiBo1 = new javax.swing.JButton();
        btnTim_Thong1 = new javax.swing.JButton();
        btnQLVanBan1 = new javax.swing.JButton();
        pnChuaCacCard1 = new javax.swing.JPanel();
        panelHeThong1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        panelQLVanBan1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        panelQLVBNoiBo1 = new javax.swing.JPanel();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        panelTimThong1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ThanhMenu = new javax.swing.JPanel();
        panelButton = new javax.swing.JPanel();
        btnHeThong = new javax.swing.JButton();
        btnQLVBNoiBo = new javax.swing.JButton();
        btnTim_Thong = new javax.swing.JButton();
        btnQLVanBan = new javax.swing.JButton();
        pnChuaCacCard = new javax.swing.JPanel();
        panelHeThong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelQLVanBan = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        panelQLVBNoiBo = new javax.swing.JPanel();
        btnVanBanNoiBo = new javax.swing.JButton();
        btnDsNoiBo = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        panelTimThong = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnThongKeVanBanDen = new javax.swing.JButton();
        btnThongKeVBNB = new javax.swing.JButton();
        btnTKVanBandi = new javax.swing.JButton();
        pnThan = new javax.swing.JPanel();
        pnChuaThan = new javax.swing.JPanel();
        pnTrangCHU = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pnChinh = new javax.swing.JPanel();
        pnChuaNoiDung = new javax.swing.JTabbedPane();
        pnPhongBan = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTaiLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongBan = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        pnVanBanNoiBo = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtTenVanBan = new javax.swing.JTextField();
        txtSoKyHieu = new javax.swing.JTextField();
        txtNguoiNhan = new javax.swing.JTextField();
        txtNguoiDuyet = new javax.swing.JTextField();
        txtNguoiKy = new javax.swing.JTextField();
        dateNgayBanHanh = new com.toedter.calendar.JDateChooser();
        cmbLoaiBanHanh = new javax.swing.JComboBox<>();
        cmbPhongBanHanh = new javax.swing.JComboBox<>();
        cmbPhongBanNhan = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTrichYeu = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDinhKem = new javax.swing.JTable();
        btnDinhKemFile = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        btnXoaFile = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        btnThem8 = new javax.swing.JButton();
        btnLuu7 = new javax.swing.JButton();
        btnTaiLai8 = new javax.swing.JButton();
        pnDSNoibo = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btnSua9 = new javax.swing.JButton();
        btnThemQuayLaiDeThem = new javax.swing.JButton();
        btnXoa9 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbVanBanNoiBo = new javax.swing.JTable();
        pnTimKiemThongKe = new javax.swing.JPanel();
        pnChuaTimKiemThongKe = new javax.swing.JTabbedPane();
        ThongKeVanBanDi = new javax.swing.JPanel();
        ThongKeVanBanDen = new javax.swing.JPanel();
        ThongKeVanBanNoiBo = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTrichYeu1 = new javax.swing.JTextArea();
        jLabel82 = new javax.swing.JLabel();
        ThoiGianTimKiem = new javax.swing.JComboBox<>();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        cmbLoaiBanHanh1 = new javax.swing.JComboBox<>();
        cmbPhongBanHanh1 = new javax.swing.JComboBox<>();
        cmbPhongBanNhan1 = new javax.swing.JComboBox<>();
        txtSoKyHieu1 = new javax.swing.JTextField();
        txtTenVanBan1 = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnXemChiTiet = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbVanBanNoiBo1 = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        jButton63 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("Thêm mới");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sửa");
        jPopupMenu2.add(jMenuItem2);

        jMenuItem3.setText("Xóa");
        jPopupMenu3.add(jMenuItem3);

        jMenuItem4.setText("Tải lại");
        jPopupMenu4.add(jMenuItem4);

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jToolBar2.setRollover(true);

        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/insert.png"))); // NOI18N
        btnThem1.setFocusable(false);
        btnThem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThem1MouseExited(evt);
            }
        });
        jToolBar2.add(btnThem1);

        btnSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/service.png"))); // NOI18N
        btnSua1.setFocusable(false);
        btnSua1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSua1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSua1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSua1MouseExited(evt);
            }
        });
        jToolBar2.add(btnSua1);

        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/trash.png"))); // NOI18N
        btnXoa1.setFocusable(false);
        btnXoa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoa1MouseExited(evt);
            }
        });
        jToolBar2.add(btnXoa1);

        btnTaiLai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/reset.png"))); // NOI18N
        btnTaiLai1.setFocusable(false);
        btnTaiLai1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaiLai1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaiLai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaiLai1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaiLai1MouseExited(evt);
            }
        });
        jToolBar2.add(btnTaiLai1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel10.setBackground(new java.awt.Color(230, 247, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 153), null));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN ĐI VÀ ĐẾN");
        jLabel4.setToolTipText("");

        jButton31.setBackground(new java.awt.Color(255, 249, 196));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 102, 51));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton31.setText("Tìm kiếm thống kê");

        jButton33.setBackground(new java.awt.Color(255, 249, 196));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 102, 51));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/open-book.png"))); // NOI18N
        jButton33.setText("Danh sách văn bản đến");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(255, 249, 196));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 102, 51));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton34.setText("Văn bản đến");

        jButton35.setBackground(new java.awt.Color(255, 249, 196));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 102, 51));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/software.png"))); // NOI18N
        jButton35.setText("Số văn bản");

        jButton36.setBackground(new java.awt.Color(255, 249, 196));
        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 102, 51));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton36.setText("Loại văn bản");

        jButton37.setBackground(new java.awt.Color(255, 249, 196));
        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 102, 51));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton37.setText("Nơi ban hành");

        jButton38.setBackground(new java.awt.Color(255, 249, 196));
        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 102, 51));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton38.setText("Văn bản đi");

        jButton39.setBackground(new java.awt.Color(255, 249, 196));
        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 102, 51));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton39.setText("Danh sách văn bản đi");

        jButton40.setBackground(new java.awt.Color(255, 249, 196));
        jButton40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton40.setForeground(new java.awt.Color(0, 102, 51));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton40.setText("Tìm kiếm thống kê");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel34.setText("jLabel5");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel37.setText("jLabel5");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel41.setText("jLabel5");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel42.setText("jLabel5");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton36)
                        .addGap(22, 22, 22)
                        .addComponent(jButton37)
                        .addGap(13, 13, 13)
                        .addComponent(jButton35))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)))
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton39)
                        .addGap(43, 43, 43)
                        .addComponent(jButton40))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton33)
                        .addGap(87, 87, 87)
                        .addComponent(jButton31))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton34)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel36)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel32))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel49)
                .addGap(0, 0, 0)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel11.setBackground(new java.awt.Color(230, 247, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 204), null));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 102, 51));
        jLabel50.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN NỘI BỘ");
        jLabel50.setToolTipText("");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel51.setText("jLabel5");

        jButton41.setBackground(new java.awt.Color(255, 249, 196));
        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton41.setForeground(new java.awt.Color(0, 102, 51));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton41.setText("Loại văn bản");

        jButton42.setBackground(new java.awt.Color(255, 249, 196));
        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton42.setForeground(new java.awt.Color(0, 102, 51));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton42.setText("Phòng ban hành");

        jButton43.setBackground(new java.awt.Color(255, 249, 196));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton43.setForeground(new java.awt.Color(0, 102, 51));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton43.setText("Phòng ban nhận");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jButton44.setBackground(new java.awt.Color(255, 249, 196));
        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(0, 102, 51));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton44.setText("Văn bản nội bộ");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(255, 249, 196));
        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton45.setForeground(new java.awt.Color(0, 102, 51));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/private-account.png"))); // NOI18N
        jButton45.setText("Danh sách văn bản nội bộ");

        jButton46.setBackground(new java.awt.Color(255, 249, 196));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton46.setForeground(new java.awt.Color(0, 102, 51));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton46.setText("Tìm kiếm thống kê");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel56.setText("jLabel5");

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton42)
                        .addGap(18, 18, 18)
                        .addComponent(jButton43)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThanhMenu1.setBackground(new java.awt.Color(204, 255, 255));

        panelButton1.setBackground(new java.awt.Color(255, 255, 255));

        btnHeThong1.setBackground(new java.awt.Color(204, 204, 255));
        btnHeThong1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHeThong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/software.png"))); // NOI18N
        btnHeThong1.setText("Hệ thống");
        btnHeThong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeThong1ActionPerformed(evt);
            }
        });

        btnQLVBNoiBo1.setBackground(new java.awt.Color(204, 204, 255));
        btnQLVBNoiBo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLVBNoiBo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        btnQLVBNoiBo1.setText("Quản lý văn bản nội bộ");
        btnQLVBNoiBo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLVBNoiBo1ActionPerformed(evt);
            }
        });

        btnTim_Thong1.setBackground(new java.awt.Color(204, 204, 255));
        btnTim_Thong1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTim_Thong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        btnTim_Thong1.setText("Tìm kiếm - Thống kê");
        btnTim_Thong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim_Thong1ActionPerformed(evt);
            }
        });

        btnQLVanBan1.setBackground(new java.awt.Color(204, 204, 255));
        btnQLVanBan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLVanBan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/open-book.png"))); // NOI18N
        btnQLVanBan1.setText("Quản lý văn bản");
        btnQLVanBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLVanBan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButton1Layout = new javax.swing.GroupLayout(panelButton1);
        panelButton1.setLayout(panelButton1Layout);
        panelButton1Layout.setHorizontalGroup(
            panelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButton1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHeThong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLVBNoiBo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim_Thong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLVanBan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelButton1Layout.setVerticalGroup(
            panelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButton1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnHeThong1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLVanBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLVBNoiBo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim_Thong1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnChuaCacCard1.setBackground(new java.awt.Color(255, 255, 204));
        pnChuaCacCard1.setLayout(new java.awt.CardLayout());

        panelHeThong1.setBackground(new java.awt.Color(204, 255, 255));
        panelHeThong1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hệ thống", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelHeThong1.setLayout(new java.awt.CardLayout());

        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/selecting.png"))); // NOI18N
        jButton47.setText("Phân quyền nhân viên");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton48.setText("Thông tin người ký duyệt");

        jButton49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/team.png"))); // NOI18N
        jButton49.setText("Quản lý người dùng");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        panelHeThong1.add(jPanel12, "card2");

        pnChuaCacCard1.add(panelHeThong1, "card3");

        panelQLVanBan1.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVanBan1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelQLVanBan1.setLayout(new java.awt.CardLayout());

        jButton50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton50.setText("Số văn bản");

        jButton51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton51.setText("Nơi ban hành");

        jButton52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton52.setText("Văn bản đến");

        jButton53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton53.setText("Loại văn bản");

        jButton54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton54.setText("Danh sách văn bản đến");

        jButton55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton55.setText("Danh sách văn bản đi");

        jButton56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton56.setText("Văn bản đi");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton56, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton54, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelQLVanBan1.add(jPanel13, "card2");

        pnChuaCacCard1.add(panelQLVanBan1, "card2");

        panelQLVBNoiBo1.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVBNoiBo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton57.setText("Văn bản nội bộ");

        jButton58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton58.setText("Danh sách văn bản nội bộ");

        jButton59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton59.setText("Phòng ban");

        javax.swing.GroupLayout panelQLVBNoiBo1Layout = new javax.swing.GroupLayout(panelQLVBNoiBo1);
        panelQLVBNoiBo1.setLayout(panelQLVBNoiBo1Layout);
        panelQLVBNoiBo1Layout.setHorizontalGroup(
            panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelQLVBNoiBo1Layout.setVerticalGroup(
            panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBo1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pnChuaCacCard1.add(panelQLVBNoiBo1, "card4");

        panelTimThong1.setBackground(new java.awt.Color(204, 255, 255));
        panelTimThong1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm - Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/seo-report.png"))); // NOI18N
        jButton60.setText("Thống kê văn bản đến");

        jButton61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        jButton61.setText("Thống kê văn bản nội bộ");
        jButton61.setToolTipText("");

        jButton62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analytics.png"))); // NOI18N
        jButton62.setText("Thống kê văn bản đi");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jButton62, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTimThong1Layout = new javax.swing.GroupLayout(panelTimThong1);
        panelTimThong1.setLayout(panelTimThong1Layout);
        panelTimThong1Layout.setHorizontalGroup(
            panelTimThong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimThong1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTimThong1Layout.setVerticalGroup(
            panelTimThong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimThong1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnChuaCacCard1.add(panelTimThong1, "card5");

        javax.swing.GroupLayout ThanhMenu1Layout = new javax.swing.GroupLayout(ThanhMenu1);
        ThanhMenu1.setLayout(ThanhMenu1Layout);
        ThanhMenu1Layout.setHorizontalGroup(
            ThanhMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThanhMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChuaCacCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ThanhMenu1Layout.setVerticalGroup(
            ThanhMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChuaCacCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(ThanhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThanhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenuBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(204, 255, 255)));

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPopupMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPopupMenu5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPopupMenu5MouseExited(evt);
            }
        });

        jMenuItem5.setBackground(new java.awt.Color(255, 204, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/log-in.png"))); // NOI18N
        jMenuItem5.setText("Đăng nhập lại");
        jMenuItem5.setToolTipText("");
        jPopupMenu5.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 204, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/reset-password.png"))); // NOI18N
        jMenuItem6.setText("Đổi mật khẩu");
        jPopupMenu5.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 204, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/button.png"))); // NOI18N
        jMenuItem7.setText("Thoát");
        jPopupMenu5.add(jMenuItem7);

        jPopupMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPopupMenu6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPopupMenu6MouseExited(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setText("Sửa thông tin cá nhân");
        jPopupMenu6.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem9");

        jMenu6.setText("jMenu6");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("Lưu");
        jPopupMenu7.add(jMenuItem11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                                              QUẢN LÝ VĂN BẢN - CÔNG VĂN                                          ");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        ThanhMenu.setBackground(new java.awt.Color(204, 255, 255));

        panelButton.setBackground(new java.awt.Color(255, 255, 255));

        btnHeThong.setBackground(new java.awt.Color(204, 204, 255));
        btnHeThong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/software.png"))); // NOI18N
        btnHeThong.setText("Hệ thống");
        btnHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeThongActionPerformed(evt);
            }
        });

        btnQLVBNoiBo.setBackground(new java.awt.Color(204, 204, 255));
        btnQLVBNoiBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLVBNoiBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        btnQLVBNoiBo.setText("Quản lý văn bản nội bộ");
        btnQLVBNoiBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLVBNoiBoActionPerformed(evt);
            }
        });

        btnTim_Thong.setBackground(new java.awt.Color(204, 204, 255));
        btnTim_Thong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTim_Thong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        btnTim_Thong.setText("Tìm kiếm - Thống kê");
        btnTim_Thong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim_ThongActionPerformed(evt);
            }
        });

        btnQLVanBan.setBackground(new java.awt.Color(204, 204, 255));
        btnQLVanBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLVanBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/open-book.png"))); // NOI18N
        btnQLVanBan.setText("Quản lý văn bản");
        btnQLVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLVanBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHeThong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLVBNoiBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim_Thong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLVanBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLVanBan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLVBNoiBo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim_Thong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnChuaCacCard.setBackground(new java.awt.Color(255, 255, 204));
        pnChuaCacCard.setLayout(new java.awt.CardLayout());

        panelHeThong.setBackground(new java.awt.Color(204, 255, 255));
        panelHeThong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hệ thống", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelHeThong.setLayout(new java.awt.CardLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/selecting.png"))); // NOI18N
        jButton2.setText("Phân quyền nhân viên");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton4.setText("Thông tin người ký duyệt");

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/team.png"))); // NOI18N
        jButton6.setText("Quản lý người dùng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(354, Short.MAX_VALUE)))
        );

        panelHeThong.add(jPanel3, "card2");

        pnChuaCacCard.add(panelHeThong, "card3");

        panelQLVanBan.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVanBan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelQLVanBan.setLayout(new java.awt.CardLayout());

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton19.setText("Số văn bản");

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton20.setText("Nơi ban hành");

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton21.setText("Văn bản đến");

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton22.setText("Loại văn bản");

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton23.setText("Danh sách văn bản đến");

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton24.setText("Danh sách văn bản đi");

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton25.setText("Văn bản đi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelQLVanBan.add(jPanel6, "card2");

        pnChuaCacCard.add(panelQLVanBan, "card2");

        panelQLVBNoiBo.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVBNoiBo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnVanBanNoiBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVanBanNoiBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        btnVanBanNoiBo.setText("Văn bản nội bộ");
        btnVanBanNoiBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVanBanNoiBoActionPerformed(evt);
            }
        });

        btnDsNoiBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDsNoiBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        btnDsNoiBo.setText("Danh sách văn bản nội bộ");
        btnDsNoiBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDsNoiBoActionPerformed(evt);
            }
        });

        btnPhongBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        btnPhongBan.setText("Phòng ban");
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQLVBNoiBoLayout = new javax.swing.GroupLayout(panelQLVBNoiBo);
        panelQLVBNoiBo.setLayout(panelQLVBNoiBoLayout);
        panelQLVBNoiBoLayout.setHorizontalGroup(
            panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDsNoiBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVanBanNoiBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelQLVBNoiBoLayout.setVerticalGroup(
            panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVanBanNoiBo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDsNoiBo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pnChuaCacCard.add(panelQLVBNoiBo, "card4");

        panelTimThong.setBackground(new java.awt.Color(204, 255, 255));
        panelTimThong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm - Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnThongKeVanBanDen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKeVanBanDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/seo-report.png"))); // NOI18N
        btnThongKeVanBanDen.setText("Thống kê văn bản đến");
        btnThongKeVanBanDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeVanBanDenActionPerformed(evt);
            }
        });

        btnThongKeVBNB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKeVBNB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        btnThongKeVBNB.setText("Thống kê văn bản nội bộ");
        btnThongKeVBNB.setToolTipText("");
        btnThongKeVBNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeVBNBActionPerformed(evt);
            }
        });

        btnTKVanBandi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTKVanBandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analytics.png"))); // NOI18N
        btnTKVanBandi.setText("Thống kê văn bản đi");
        btnTKVanBandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKVanBandiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKeVanBanDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKeVBNB, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(btnTKVanBandi, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnTKVanBandi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnThongKeVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnThongKeVBNB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTimThongLayout = new javax.swing.GroupLayout(panelTimThong);
        panelTimThong.setLayout(panelTimThongLayout);
        panelTimThongLayout.setHorizontalGroup(
            panelTimThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimThongLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTimThongLayout.setVerticalGroup(
            panelTimThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimThongLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnChuaCacCard.add(panelTimThong, "card5");

        javax.swing.GroupLayout ThanhMenuLayout = new javax.swing.GroupLayout(ThanhMenu);
        ThanhMenu.setLayout(ThanhMenuLayout);
        ThanhMenuLayout.setHorizontalGroup(
            ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChuaCacCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        ThanhMenuLayout.setVerticalGroup(
            ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChuaCacCard, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnThan.setBackground(new java.awt.Color(255, 255, 204));

        pnChuaThan.setBackground(new java.awt.Color(255, 255, 204));
        pnChuaThan.setLayout(new java.awt.CardLayout());

        pnTrangCHU.setBackground(new java.awt.Color(204, 255, 204));
        pnTrangCHU.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(230, 247, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 153), null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN ĐI VÀ ĐẾN");
        jLabel2.setToolTipText("");

        jButton3.setBackground(new java.awt.Color(255, 249, 196));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton3.setText("Tìm kiếm thống kê");

        jButton1.setBackground(new java.awt.Color(255, 249, 196));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/open-book.png"))); // NOI18N
        jButton1.setText("Danh sách văn bản đến");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 249, 196));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton5.setText("Văn bản đến");

        jButton7.setBackground(new java.awt.Color(255, 249, 196));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/software.png"))); // NOI18N
        jButton7.setText("Số văn bản");

        jButton8.setBackground(new java.awt.Color(255, 249, 196));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton8.setText("Loại văn bản");

        jButton9.setBackground(new java.awt.Color(255, 249, 196));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 51));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton9.setText("Nơi ban hành");

        jButton10.setBackground(new java.awt.Color(255, 249, 196));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 102, 51));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton10.setText("Văn bản đi");

        jButton11.setBackground(new java.awt.Color(255, 249, 196));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 51));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton11.setText("Danh sách văn bản đi");

        jButton12.setBackground(new java.awt.Color(255, 249, 196));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 51));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton12.setText("Tìm kiếm thống kê");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel9.setText("jLabel5");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel14.setText("jLabel5");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel18.setText("jLabel5");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel19.setText("jLabel5");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 289, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton8)
                        .addGap(22, 22, 22)
                        .addComponent(jButton9)
                        .addGap(13, 13, 13)
                        .addComponent(jButton7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)))
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton11)
                        .addGap(22, 22, 22)
                        .addComponent(jButton12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel27)
                .addGap(0, 0, 0)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(230, 247, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 204), null));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN NỘI BỘ");
        jLabel3.setToolTipText("");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel11.setText("jLabel5");

        jButton13.setBackground(new java.awt.Color(255, 249, 196));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 51));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton13.setText("Loại văn bản");

        jButton14.setBackground(new java.awt.Color(255, 249, 196));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 102, 51));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton14.setText("Phòng ban hành");

        jButton15.setBackground(new java.awt.Color(255, 249, 196));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 102, 51));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton15.setText("Phòng ban nhận");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jButton16.setBackground(new java.awt.Color(255, 249, 196));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 102, 51));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton16.setText("Văn bản nội bộ");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 249, 196));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 102, 51));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/private-account.png"))); // NOI18N
        jButton17.setText("Danh sách văn bản nội bộ");

        jButton18.setBackground(new java.awt.Color(255, 249, 196));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 102, 51));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton18.setText("Tìm kiếm thống kê");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel28.setText("jLabel5");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnTrangCHU.add(jPanel4, "card2");

        pnChuaThan.add(pnTrangCHU, "card3");

        pnChinh.setBackground(new java.awt.Color(255, 255, 255));
        pnChinh.setLayout(new java.awt.CardLayout());

        pnChuaNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        pnChuaNoiDung.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnChuaNoiDungAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnPhongBan.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/insert.png"))); // NOI18N
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLuuMouseExited(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/trash.png"))); // NOI18N
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/reset.png"))); // NOI18N
        btnTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaiLaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaiLaiMouseExited(evt);
            }
        });
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnTaiLai)
                .addGap(18, 18, 18)
                .addComponent(btnLuu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaiLai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbPhongBan.setBackground(new java.awt.Color(255, 255, 204));
        tbPhongBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        tbPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Phòng ban", "Mã phòng ban"
            }
        ));
        jScrollPane1.setViewportView(tbPhongBan);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập thông tin phòng ban", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel60.setText("Phòng ban có: ");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setText("Phòng ban hành: Khởi tạo/gửi tài liệu, quyết định, thông tin nội bộ hoặc ra bên ngoài.");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel62.setText("Phòng ban nhận: Tiếp nhận tài liệu, thông tin hoặc công việc từ các phòng ban khác.");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnPhongBanLayout = new javax.swing.GroupLayout(pnPhongBan);
        pnPhongBan.setLayout(pnPhongBanLayout);
        pnPhongBanLayout.setHorizontalGroup(
            pnPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnPhongBanLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnPhongBanLayout.setVerticalGroup(
            pnPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhongBanLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnChuaNoiDung.addTab("Phòng ban", pnPhongBan);

        pnVanBanNoiBo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 255)))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setText("Số ký hiệu");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setText("Tên văn bản");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("Ngày ban hành");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("Loại ban hành");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setText("Phòng ban hành");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setText("Phòng nhận");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setText("Người nhận");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("Người ký");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("Người duyệt");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateNgayBanHanh, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoKyHieu, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(txtTenVanBan))))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbLoaiBanHanh, 0, 168, Short.MAX_VALUE)
                            .addComponent(cmbPhongBanNhan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPhongBanHanh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNguoiDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNguoiNhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtNguoiKy, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel68)
                    .addComponent(jLabel71)
                    .addComponent(cmbLoaiBanHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoKyHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel69)
                                    .addComponent(cmbPhongBanHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel72)
                                    .addComponent(txtNguoiKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel67))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbPhongBanNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNguoiDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73)))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtTenVanBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(dateNgayBanHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trích yếu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        txtTrichYeu.setColumns(20);
        txtTrichYeu.setRows(5);
        jScrollPane2.setViewportView(txtTrichYeu);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nội dung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane3.setViewportView(txtNoiDung);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đính kèm file", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        tbDinhKem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tài liệu", "Tên tài liệu", "Ngày tạo", "Kích cỡ", "Loại", "Đường dẫn"
            }
        ));
        tbDinhKem.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tbDinhKem.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(tbDinhKem);

        btnDinhKemFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDinhKemFile.setText("Đính kèm file");
        btnDinhKemFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinhKemFileActionPerformed(evt);
            }
        });

        btnDocFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDocFile.setText("Đọc file");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnXoaFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaFile.setText("Xóa file");
        btnXoaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDocFile, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnDinhKemFile, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnXoaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnDinhKemFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDocFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(204, 255, 255));

        btnThem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/insert.png"))); // NOI18N
        btnThem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThem8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThem8MouseExited(evt);
            }
        });
        btnThem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem8ActionPerformed(evt);
            }
        });

        btnLuu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        btnLuu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLuu7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLuu7MouseExited(evt);
            }
        });
        btnLuu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu7ActionPerformed(evt);
            }
        });

        btnTaiLai8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/reset.png"))); // NOI18N
        btnTaiLai8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaiLai8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaiLai8MouseExited(evt);
            }
        });
        btnTaiLai8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLai8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnThem8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaiLai8)
                .addGap(18, 18, 18)
                .addComponent(btnLuu7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTaiLai8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLuu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnVanBanNoiBoLayout = new javax.swing.GroupLayout(pnVanBanNoiBo);
        pnVanBanNoiBo.setLayout(pnVanBanNoiBoLayout);
        pnVanBanNoiBoLayout.setHorizontalGroup(
            pnVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVanBanNoiBoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnVanBanNoiBoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnVanBanNoiBoLayout.setVerticalGroup(
            pnVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVanBanNoiBoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pnChuaNoiDung.addTab("Văn bản nội bộ", pnVanBanNoiBo);

        pnDSNoibo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(204, 255, 255));

        btnSua9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/service.png"))); // NOI18N
        btnSua9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSua9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSua9MouseExited(evt);
            }
        });
        btnSua9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua9ActionPerformed(evt);
            }
        });

        btnThemQuayLaiDeThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/insert.png"))); // NOI18N
        btnThemQuayLaiDeThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemQuayLaiDeThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemQuayLaiDeThemMouseExited(evt);
            }
        });
        btnThemQuayLaiDeThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemQuayLaiDeThemActionPerformed(evt);
            }
        });

        btnXoa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/trash.png"))); // NOI18N
        btnXoa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoa9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoa9MouseExited(evt);
            }
        });
        btnXoa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnThemQuayLaiDeThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThemQuayLaiDeThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chọn thời gian lọc thông tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hôm nay", "Tuần này", "Tháng này", "Năm nay", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12", "Năm trước" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel74.setText("Từ ngày");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel75.setText("Đến ngày");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbVanBanNoiBo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số ký hiệu", "Tên văn bản", "Ngày ban hành", "Loại văn bản", "Phòng ban hành", "Phòng ban nhận", "Trích yếu"
            }
        ));
        tbVanBanNoiBo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVanBanNoiBoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbVanBanNoiBo);
        if (tbVanBanNoiBo.getColumnModel().getColumnCount() > 0) {
            tbVanBanNoiBo.getColumnModel().getColumn(4).setResizable(false);
            tbVanBanNoiBo.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnDSNoiboLayout = new javax.swing.GroupLayout(pnDSNoibo);
        pnDSNoibo.setLayout(pnDSNoiboLayout);
        pnDSNoiboLayout.setHorizontalGroup(
            pnDSNoiboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnDSNoiboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDSNoiboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        pnDSNoiboLayout.setVerticalGroup(
            pnDSNoiboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDSNoiboLayout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pnChuaNoiDung.addTab("Danh sách văn bản nội bộ", pnDSNoibo);

        pnChinh.add(pnChuaNoiDung, "card2");

        pnTimKiemThongKe.setBackground(new java.awt.Color(255, 255, 255));
        pnTimKiemThongKe.setLayout(new java.awt.CardLayout());

        pnChuaTimKiemThongKe.setBackground(new java.awt.Color(255, 255, 255));
        pnChuaTimKiemThongKe.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnChuaTimKiemThongKeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ThongKeVanBanDi.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout ThongKeVanBanDiLayout = new javax.swing.GroupLayout(ThongKeVanBanDi);
        ThongKeVanBanDi.setLayout(ThongKeVanBanDiLayout);
        ThongKeVanBanDiLayout.setHorizontalGroup(
            ThongKeVanBanDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1139, Short.MAX_VALUE)
        );
        ThongKeVanBanDiLayout.setVerticalGroup(
            ThongKeVanBanDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        pnChuaTimKiemThongKe.addTab("Thống kê văn bản đi", ThongKeVanBanDi);

        ThongKeVanBanDen.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout ThongKeVanBanDenLayout = new javax.swing.GroupLayout(ThongKeVanBanDen);
        ThongKeVanBanDen.setLayout(ThongKeVanBanDenLayout);
        ThongKeVanBanDenLayout.setHorizontalGroup(
            ThongKeVanBanDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1139, Short.MAX_VALUE)
        );
        ThongKeVanBanDenLayout.setVerticalGroup(
            ThongKeVanBanDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        pnChuaTimKiemThongKe.addTab("Thống kê văn bản đến", ThongKeVanBanDen);

        ThongKeVanBanNoiBo.setBackground(new java.awt.Color(255, 255, 255));
        ThongKeVanBanNoiBo.setForeground(new java.awt.Color(51, 0, 153));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null), "  TÌM KIẾM VĂN BẢN NỘI BỘ    ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 255))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 0, 153));
        jLabel63.setText("Từ ngày");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 0, 153));
        jLabel65.setText("đến ngày");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 0, 153));
        jLabel76.setText("Loại văn bản");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(51, 0, 153));
        jLabel77.setText("Phòng ban hành");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 0, 153));
        jLabel78.setText("Phòng ban nhận");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 0, 153));
        jLabel79.setText("Số ký hiệu");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 0, 153));
        jLabel80.setText("Tên văn bản");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 0, 153));
        jLabel81.setText("Trích yếu");

        txtTrichYeu1.setColumns(20);
        txtTrichYeu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTrichYeu1.setForeground(new java.awt.Color(51, 0, 153));
        txtTrichYeu1.setRows(5);
        jScrollPane6.setViewportView(txtTrichYeu1);

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 0, 153));
        jLabel82.setText("Chọn thời gian ");

        ThoiGianTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hôm nay", "Tuần này", "Tháng này", "Năm nay", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12", "Năm trước" }));
        ThoiGianTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoiGianTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel77))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbLoaiBanHanh1, 0, 170, Short.MAX_VALUE)
                                    .addComponent(cmbPhongBanHanh1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ThoiGianTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbPhongBanNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenVanBan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtSoKyHieu1))
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(ThoiGianTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)))
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoKyHieu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbLoaiBanHanh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel79)
                                .addComponent(jLabel81))
                            .addComponent(jLabel76))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel80)
                                .addComponent(txtTenVanBan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel77)
                            .addComponent(cmbPhongBanHanh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(cmbPhongBanNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(51, 0, 153));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXemChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXemChiTiet.setForeground(new java.awt.Color(51, 0, 153));
        btnXemChiTiet.setText("Xem chi tiết");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(51, 0, 153));
        jButton28.setText("Xuất file excel");

        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(51, 0, 153));
        jButton29.setText("In báo cáo");

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "  DANH SÁCH VĂN BẢN NỘI BỘ   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 255))); // NOI18N

        tbVanBanNoiBo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Số ký hiệu", "Tên văn bản", "Ngày ban hành", "Loại ban hành", "Phòng ban hành", "Phòng ban nhận", "Người nhận", "Người ký", "Người duyệt", "Trích yếu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVanBanNoiBo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVanBanNoiBo1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbVanBanNoiBo1);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 0, 153));
        jLabel83.setText("THỐNG KÊ VĂN BẢN NỘI BỘ");

        javax.swing.GroupLayout ThongKeVanBanNoiBoLayout = new javax.swing.GroupLayout(ThongKeVanBanNoiBo);
        ThongKeVanBanNoiBo.setLayout(ThongKeVanBanNoiBoLayout);
        ThongKeVanBanNoiBoLayout.setHorizontalGroup(
            ThongKeVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeVanBanNoiBoLayout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeVanBanNoiBoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ThongKeVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ThongKeVanBanNoiBoLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ThongKeVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXemChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(14, 14, 14))
        );
        ThongKeVanBanNoiBoLayout.setVerticalGroup(
            ThongKeVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeVanBanNoiBoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addGap(18, 18, 18)
                .addGroup(ThongKeVanBanNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongKeVanBanNoiBoLayout.createSequentialGroup()
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnChuaTimKiemThongKe.addTab("Thống kê văn bản nội bộ", ThongKeVanBanNoiBo);

        pnTimKiemThongKe.add(pnChuaTimKiemThongKe, "card2");

        pnChinh.add(pnTimKiemThongKe, "card2");

        pnChuaThan.add(pnChinh, "card2");

        javax.swing.GroupLayout pnThanLayout = new javax.swing.GroupLayout(pnThan);
        pnThan.setLayout(pnThanLayout);
        pnThanLayout.setHorizontalGroup(
            pnThanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChuaThan, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnThanLayout.setVerticalGroup(
            pnThanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChuaThan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThanhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnThan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThanhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnThan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton63.setText("jButton63");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/user.png"))); // NOI18N
        jButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton64MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton64MouseExited(evt);
            }
        });

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/book.png"))); // NOI18N
        jButton65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton65MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton65MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ỨNG DỤNG QUẢN LÝ VĂN BẢN - CÔNG VĂN");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jButton65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(503, 503, 503)
                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeThongActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) pnChuaCacCard.getLayout();
        cl.show(pnChuaCacCard, "heThong"); // Hiển thị panel "Quản lý văn bản nội bộ"

    }//GEN-LAST:event_btnHeThongActionPerformed

    private void btnQLVBNoiBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLVBNoiBoActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) pnChuaCacCard.getLayout();
        cl.show(pnChuaCacCard, "quanLyVanBanNoiBo"); // Hiển thị panel "Quản lý văn bản nội bộ"
    }//GEN-LAST:event_btnQLVBNoiBoActionPerformed

    private void btnTim_ThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim_ThongActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) pnChuaCacCard.getLayout();
        cl.show(pnChuaCacCard, "timThong"); // Hiển thị panel "Quản lý văn bản nội bộ"

    }//GEN-LAST:event_btnTim_ThongActionPerformed

    private void btnQLVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLVanBanActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) pnChuaCacCard.getLayout();
        cl.show(pnChuaCacCard, "quanLyVanBan"); // Hiển thị panel "Quản lý văn bản nội bộ"

    }//GEN-LAST:event_btnQLVanBanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnThem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1MouseEntered

    private void btnThem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1MouseExited

    private void btnSua1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSua1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua1MouseEntered

    private void btnSua1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSua1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua1MouseExited

    private void btnXoa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa1MouseEntered

    private void btnXoa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa1MouseExited

    private void btnTaiLai1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLai1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLai1MouseEntered

    private void btnTaiLai1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLai1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLai1MouseExited

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void btnHeThong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeThong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeThong1ActionPerformed

    private void btnQLVBNoiBo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLVBNoiBo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQLVBNoiBo1ActionPerformed

    private void btnTim_Thong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim_Thong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTim_Thong1ActionPerformed

    private void btnQLVanBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLVanBan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQLVanBan1ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseExited
      if (!jPopupMenu6.getBounds().contains(evt.getPoint()) && 
        !jButton64.getBounds().contains(evt.getPoint())) {
        jPopupMenu6.setVisible(false);
    }
    }//GEN-LAST:event_jButton64MouseExited

    private void jButton64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseEntered
        jPopupMenu6.show(jButton64, 0, jButton64.getHeight());
    }//GEN-LAST:event_jButton64MouseEntered

    private void jButton65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseExited
        // Khi chuột rời khỏi jButton65, chỉ ẩn jPopupMenu5 nếu chuột không ở trong jPopupMenu5
    if (!jPopupMenu5.getBounds().contains(evt.getPoint())) {
        jPopupMenu5.setVisible(false);
    }
    }//GEN-LAST:event_jButton65MouseExited

    private void jButton65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseEntered
    // Hiển thị jPopupMenu5 khi chuột di chuyển vào jButton65
    jPopupMenu5.show(jButton65, 0, jButton65.getHeight());
    }//GEN-LAST:event_jButton65MouseEntered

    private void jPopupMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu5MouseEntered
        // TODO add your handling code here:
          // Giữ jPopupMenu5 mở khi chuột vào trong menu
    jPopupMenu5.setVisible(true);
    }//GEN-LAST:event_jPopupMenu5MouseEntered

    private void jPopupMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu5MouseExited
       // Khi chuột rời khỏi cả jButton65 và jPopupMenu5, ẩn jPopupMenu5
    if (!jButton65.getBounds().contains(evt.getPoint()) && 
        !jPopupMenu5.getBounds().contains(evt.getPoint())) {
        jPopupMenu5.setVisible(false);
    }
    }//GEN-LAST:event_jPopupMenu5MouseExited

    private void jPopupMenu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu6MouseEntered
        
    jPopupMenu6.setVisible(true);
    }//GEN-LAST:event_jPopupMenu6MouseEntered

    private void jPopupMenu6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu6MouseExited
         if (!jButton64.getBounds().contains(evt.getPoint()) && 
        !jPopupMenu6.getBounds().contains(evt.getPoint())) {
        jPopupMenu6.setVisible(false);
    }
    }//GEN-LAST:event_jPopupMenu6MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        // TODO add your handling code here:
           // TODO add your handling code here:
        jPopupMenu1.show(btnThem, 0, btnThem.getHeight()); // dọc gắn liền btnThem
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
     jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        // TODO add your handling code here:
        jPopupMenu3.show(btnXoa, 0, btnXoa.getHeight());
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        // TODO add your handling code here:
        jPopupMenu3.setVisible(false);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnTaiLaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiMouseEntered
        // TODO add your handling code here:
        jPopupMenu4.show(btnTaiLai, 0, btnTaiLai.getHeight());
    }//GEN-LAST:event_btnTaiLaiMouseEntered

    private void btnTaiLaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiMouseExited
        // TODO add your handling code here:
        jPopupMenu4.setVisible(false);
    }//GEN-LAST:event_btnTaiLaiMouseExited

    private void btnLuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseEntered
        // TODO add your handling code here:
        jPopupMenu7.show(btnLuu, 0, btnLuu.getHeight());
    }//GEN-LAST:event_btnLuuMouseEntered

    private void btnLuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseExited
        // TODO add your handling code here:'
        jPopupMenu7.setVisible(false);
    }//GEN-LAST:event_btnLuuMouseExited
     public void initTablePhongBan(){
    
         // mảng chưa Các cột tiêu đề 
    String[] colsName = new String[]{"STT", "TÊN PHÒNG BAN", "MÃ PHÒNG BAN"}; 
    tableModelPhongBan = new DefaultTableModel(colsName, 0);
    tbPhongBan.setModel(tableModelPhongBan);

    // Ẩn cột "MÃ PHÒNG BAN"
    tbPhongBan.getColumnModel().getColumn(2).setMinWidth(0);
    tbPhongBan.getColumnModel().getColumn(2).setMaxWidth(0);
    tbPhongBan.getColumnModel().getColumn(2).setWidth(0);

    }
   public void fillDataPhongBan(){
       ArrayList<PhongBan> lst = null;
    try {
        lst = new PhongBanController().getAll(); // Lấy danh sách từ CSDL
    } catch (SQLException ex) {
        Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
    }

    tableModelPhongBan.setRowCount(0); // Xóa dữ liệu cũ trên bảng
    for (int i = 0; i < lst.size(); i++) {
        String[] row = {
            String.valueOf(i + 1), // Số thứ tự
            lst.get(i).getTenPhongBan(), // Tên Phòng Ban
            lst.get(i).getMaPhongBan() // Mã Phòng Ban (cột ẩn)
        };
        tableModelPhongBan.addRow(row);
    }
 }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
    // Tạo dòng mới với số thứ tự tự động tăng
    int rowCount = tableModelPhongBan.getRowCount();
    String[] newRow = { 
        String.valueOf(rowCount + 1), // Số thứ tự tự động tăng
        "", // Tên Phòng Ban (để người dùng nhập)
        "null" // Giá trị mặc định cho cột ẩn "Mã Phòng Ban"
    };
    tableModelPhongBan.addRow(newRow);
    }//GEN-LAST:event_btnThemActionPerformed

    
    
    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed

    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void btnThem8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem8MouseEntered

        jPopupMenu1.show(btnThem8, 0, btnThem8.getHeight()); // dọc gắn liền btnThem
    }//GEN-LAST:event_btnThem8MouseEntered

    private void btnThem8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThem8MouseExited
        jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_btnThem8MouseExited
  
    private void btnLuu7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuu7MouseEntered
      jPopupMenu7.show(btnLuu7, 0, btnLuu7.getHeight());
    }//GEN-LAST:event_btnLuu7MouseEntered

    private void btnLuu7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuu7MouseExited
         jPopupMenu7.setVisible(false);
    }//GEN-LAST:event_btnLuu7MouseExited

    private void btnTaiLai8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLai8MouseEntered
        jPopupMenu4.show(btnTaiLai8, 0, btnTaiLai8.getHeight());
    }//GEN-LAST:event_btnTaiLai8MouseEntered

    private void btnTaiLai8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLai8MouseExited
          jPopupMenu4.setVisible(false);
    }//GEN-LAST:event_btnTaiLai8MouseExited

    private void btnSua9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSua9MouseEntered
        // TODO add your handling code here:
          // TODO add your handling code here:
        jPopupMenu2.show(btnSua9, 0, btnSua9.getHeight());
    }//GEN-LAST:event_btnSua9MouseEntered

    private void btnSua9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSua9MouseExited
        jPopupMenu2.setVisible(false);
    }//GEN-LAST:event_btnSua9MouseExited

    private void btnSua9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua9ActionPerformed
       int selectedRow = tbVanBanNoiBo.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    isEditing = true; // Chuyển sang trạng thái sửa

    String soKyHieu = tbVanBanNoiBo.getValueAt(selectedRow, 0).toString();
    txtSoKyHieu.setText(soKyHieu);
    txtSoKyHieu.setEnabled(false); // Không cho phép sửa số ký hiệu

    // Hiển thị tab chỉnh sửa
    pnThan.setVisible(true);
    pnChinh.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChuaNoiDung.setSelectedIndex(1); // Tab chỉnh sửa
    
    }//GEN-LAST:event_btnSua9ActionPerformed

    private void btnXoa9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa9MouseEntered
         jPopupMenu3.show(btnXoa9, 0, btnXoa9.getHeight());
    }//GEN-LAST:event_btnXoa9MouseEntered

    private void btnXoa9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa9MouseExited
        // TODO add your handling code here:
         jPopupMenu3.setVisible(false);
    }//GEN-LAST:event_btnXoa9MouseExited

    private void btnXoa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa9ActionPerformed
        // TODO add your handling code here:
           int selectedRow = tbVanBanNoiBo.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.");
        return;
    }

     String soKyHieu = txtSoKyHieu.getText();
     
    // Hỏi xác nhận xóa
    int confirm = JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn xóa phòng ban này?", 
            "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
               try {
                   if(new VanBanNoiBoController().Xoa(soKyHieu)){
                       try {
                           JOptionPane.showMessageDialog(this, "Xóa thành công ");
                           fillDataVanBanNoiBo();
                       } catch (SQLException ex) {
                           Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   } } catch (SQLException ex) {
                   Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
               }

    }
        
    }//GEN-LAST:event_btnXoa9ActionPerformed

    private void btnVanBanNoiBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVanBanNoiBoActionPerformed

    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
    pnChuaNoiDung.setVisible(true);  // Hiển thị JTabbedPane pnChuaNoiDung
    pnVanBanNoiBo.setVisible(true);   
    pnPhongBan.setVisible(false);
    pnDSNoibo.setVisible(false);     
pnTimKiemThongKe.setVisible(false);
    // Đặt tab tương ứng trong JTabbedPane (ví dụ: tab đầu tiên)
    pnChuaNoiDung.setSelectedIndex(1); // Chuyển đến tab đầu tiên (VanBanNoiBo)
    }//GEN-LAST:event_btnVanBanNoiBoActionPerformed

    private void btnDsNoiBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDsNoiBoActionPerformed

    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
    pnChuaNoiDung.setVisible(true);  // Hiển thị JTabbedPane pnChuaNoiDung
    pnDSNoibo.setVisible(true);     
    pnPhongBan.setVisible(false);    
    pnVanBanNoiBo.setVisible(false); 
pnTimKiemThongKe.setVisible(false);

    pnChuaNoiDung.setSelectedIndex(2);
    }//GEN-LAST:event_btnDsNoiBoActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed

    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
    pnChuaNoiDung.setVisible(true); 
    pnPhongBan.setVisible(true);      
    pnDSNoibo.setVisible(false);     
    pnVanBanNoiBo.setVisible(false);  
  pnTimKiemThongKe.setVisible(false);
    pnChuaNoiDung.setSelectedIndex(0);
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void tbVanBanNoiBoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVanBanNoiBoMouseClicked
     try {
        int row = this.tbVanBanNoiBo.getSelectedRow();
        String sokyhieu = this.tbVanBanNoiBo.getValueAt(row, 0).toString();
        String tenvanban = this.tbVanBanNoiBo.getValueAt(row, 1).toString();
        String ngayBanHanhStr = this.tbVanBanNoiBo.getValueAt(row, 2).toString();
        String loaibanhanh = this.tbVanBanNoiBo.getValueAt(row, 3).toString();
        String phongbanhanh = this.tbVanBanNoiBo.getValueAt(row, 4).toString();
        String phongbannhan = this.tbVanBanNoiBo.getValueAt(row, 5).toString();
        String trichyeu = this.tbVanBanNoiBo.getValueAt(row, 6).toString();

        // Set giá trị cho các trường
        this.txtSoKyHieu.setText(sokyhieu);
        this.txtTenVanBan.setText(tenvanban);

        if (ngayBanHanhStr != null && !ngayBanHanhStr.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Thay đổi định dạng thành "yyyy-MM-dd"
            try {
                Date ngaybanhanh = sdf.parse(ngayBanHanhStr);
                this.dateNgayBanHanh.setDate(ngaybanhanh);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Ngày ban hành không hợp lệ!");
                e.printStackTrace();
            }
        }

        // Cập nhật các ComboBox
        if (((DefaultComboBoxModel) this.cmbLoaiBanHanh.getModel()).getIndexOf(loaibanhanh) != -1) {
            this.cmbLoaiBanHanh.setSelectedItem(loaibanhanh);
        }
        if (((DefaultComboBoxModel) this.cmbPhongBanHanh.getModel()).getIndexOf(phongbanhanh) != -1) {
            this.cmbPhongBanHanh.setSelectedItem(phongbanhanh);
        }
        if (((DefaultComboBoxModel) this.cmbPhongBanNhan.getModel()).getIndexOf(phongbannhan) != -1) {
            this.cmbPhongBanNhan.setSelectedItem(phongbannhan);
        }

        this.txtTrichYeu.setText(trichyeu);
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage());
    }
        
    }//GEN-LAST:event_tbVanBanNoiBoMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
     if (tableModelPhongBan == null) {
        initTablePhongBan();
    }
    PhongBanController controller = new PhongBanController();
    
    // Duyệt qua các dòng trong bảng
    for (int i = 0; i < tableModelPhongBan.getRowCount(); i++) {
        String tenPhongBan = (String) tableModelPhongBan.getValueAt(i, 1); // Cột tên phòng ban
        String maPhongBan = (String) tableModelPhongBan.getValueAt(i, 2); // Cột mã phòng ban (ẩn)
        
        // Kiểm tra dữ liệu rỗng
        if (tenPhongBan == null || tenPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền tên phòng ban ở dòng " + (i + 1) + ".");
            return;
        }

        // Kiểm tra trùng lặp trong bảng
        for (int j = 0; j < tableModelPhongBan.getRowCount(); j++) {
            if (i != j) { // Không so sánh với chính dòng hiện tại
                String tenPhongBanKhac = (String) tableModelPhongBan.getValueAt(j, 1);
                if (tenPhongBan.equalsIgnoreCase(tenPhongBanKhac)) {
                    JOptionPane.showMessageDialog(this, "Dữ liệu nhập ở dòng " + (i + 1) + " trùng với dòng " + (j + 1) + " trong bảng.");
                    return;
                }
            }
        }

        try {
            if (maPhongBan == null || maPhongBan.trim().isEmpty() || "null".equals(maPhongBan)) {
                // Thêm mới nếu mã phòng ban không tồn tại
                boolean isSuccess = controller.ThemPhongBan(tenPhongBan);
                if (!isSuccess) {
                    JOptionPane.showMessageDialog(this, "Thêm mới phòng ban thất bại: " + tenPhongBan);
                }
            } else {
                // Cập nhật nếu mã phòng ban đã tồn tại
                boolean isSuccess = controller.SuaPhongBan(maPhongBan, tenPhongBan);
                if (!isSuccess) {
                    JOptionPane.showMessageDialog(this, "Cập nhật phòng ban thất bại: " + tenPhongBan);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi lưu dữ liệu phòng: " + tenPhongBan);
        }
    }

    tableModelPhongBan.setRowCount(0); // Xóa dữ liệu hiện tại trên giao diện
    fillDataPhongBan(); // Nạp lại dữ liệu mới từ CSDL
    loadComboboxData();
    JOptionPane.showMessageDialog(this, "Lưu toàn bộ dữ liệu thành công.");
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
          int selectedRow = tbPhongBan.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.");
        return;
    }

    // Lấy mã phòng ban từ cột ẩn (giả sử cột MaPhongBan là cột thứ 2)
    String maPhongBan = (String) tableModelPhongBan.getValueAt(selectedRow, 2);

    // Hỏi xác nhận xóa
    int confirm = JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn xóa phòng ban này?", 
            "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
              try {
                  PhongBanController controller = new PhongBanController();
                  
                  if(new PhongBanController().XoaPhongBan(maPhongBan)){
                      JOptionPane.showMessageDialog(this, "Xóa phòng ban thành công");
                      fillDataPhongBan();
                     
                  }     } catch (SQLException ex) {
                  Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void pnChuaNoiDungAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnChuaNoiDungAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnChuaNoiDungAncestorAdded

    private void btnThem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem8ActionPerformed
     // Xóa nội dung các trường nhập liệu
    txtSoKyHieu.setText("");
    txtTenVanBan.setText("");
    txtNguoiNhan.setText("");
    txtNguoiKy.setText("");
    txtNguoiDuyet.setText("");
    txtTrichYeu.setText("");
    txtNoiDung.setText("");

    // Đặt lại ngày hiện tại cho trường Ngày ban hành
    dateNgayBanHanh.setDate(null);

    // Đặt giá trị mặc định cho các combobox
    cmbLoaiBanHanh.setSelectedIndex(0);
    cmbPhongBanHanh.setSelectedIndex(0);
    cmbPhongBanNhan.setSelectedIndex(0);

    // Khôi phục trạng thái hiển thị và kích hoạt của txtSoKyHieu
    txtSoKyHieu.setVisible(true);
    txtSoKyHieu.setEnabled(true);

    // Đặt con trỏ lại trường "Số ký hiệu"
    txtSoKyHieu.requestFocus();

    }//GEN-LAST:event_btnThem8ActionPerformed
    public void initTableVanBanNoiBo(){
         // mảng chưa Các cột tiêu đề 
         
        String[] colsName = new String[]{"Số ký hiệu","Tên văn bản","Ngày ban hành","Loại ban hành","Phòng ban hành","Phòng ban nhận","Trích yếu"}; 
        tableModelVanBanNoiBo.setColumnIdentifiers(colsName);// hiển thị tiêu dề dựa vaod các cột trong bảng
        tbVanBanNoiBo.setModel(tableModelVanBanNoiBo);
    }
    
    public void initTableVanBanNoiBo1(){
         // mảng chưa Các cột tiêu đề 
         
        String[] colsName = new String[]{"Số ký hiệu","Tên văn bản","Ngày ban hành","Loại ban hành","Phòng ban hành","Phòng ban nhận","Người nhận","Người ký","Người duyệt","Trích yếu","Nội dung"}; 
        tableModelVanBanNoiBo.setColumnIdentifiers(colsName);// hiển thị tiêu dề dựa vaod các cột trong bảng
        tbVanBanNoiBo1.setModel(tableModelVanBanNoiBo);
    }
    public void fillDataVanBanNoiBo() throws SQLException{
       // fill Data
            ArrayList<VanBanNoiBo> lst = null;
            lst = new VanBanNoiBoController().getAll();
            tableModelVanBanNoiBo.setRowCount(0);
            for(int i=0 ; i<lst.size() ; i++){
                String row[] = {
                    // i=1 // lặp qua tất cả phần tử trong ds và truy xuất 
                    lst.get(i).getSoKyHieu(),
                    lst.get(i).getTenVanBan(),
                    lst.get(i).getNgayBanHanh(),
                    lst.get(i).getLoaiBanHanh(),
                    lst.get(i).getPhongBanHanh(),
                    lst.get(i).getPhongNhan(),
                    lst.get(i).getNguoiNhan(),
                    lst.get(i).getNguoiKy(),
                    lst.get(i).getNguoiDuyet(),
                    lst.get(i).getTrichYeu(),
                    lst.get(i).getNoiDung()
                    
           
                };
                tableModelVanBanNoiBo.addRow(row);
      
            }
 }
    
    public void loadComboboxData() {
    try {
        VanBanNoiBoController controller = new VanBanNoiBoController();
        
        // Load dữ liệu cho cmbLoaiBanHanh
        ArrayList<String> loaiVanBanList = controller.getLoaiVanBan();
        cmbLoaiBanHanh.removeAllItems(); // Xóa dữ liệu cũ
        for (String loaiVanBan : loaiVanBanList) {
            cmbLoaiBanHanh.addItem(loaiVanBan); // Thêm từng mục vào combobox
        }

        // Load dữ liệu cho cmbPhongBanHanh
        ArrayList<String> phongBanList = controller.getPhongBan();
        cmbPhongBanHanh.removeAllItems();
        cmbPhongBanNhan.removeAllItems();
        for (String phongBan : phongBanList) {
            cmbPhongBanHanh.addItem(phongBan);
            cmbPhongBanNhan.addItem(phongBan); // Phòng nhận dùng cùng dữ liệu
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu lên Combobox: " + e.getMessage());
    }
}
     public void loadComboboxData1() {
    try {
        VanBanNoiBoController controller = new VanBanNoiBoController();
        
        // Load dữ liệu cho cmbLoaiBanHanh
        ArrayList<String> loaiVanBanList = controller.getLoaiVanBan();
        cmbLoaiBanHanh1.removeAllItems(); // Xóa dữ liệu cũ
        for (String loaiVanBan : loaiVanBanList) {
            cmbLoaiBanHanh1.addItem(loaiVanBan); // Thêm từng mục vào combobox
        }

        // Load dữ liệu cho cmbPhongBanHanh
        ArrayList<String> phongBanList = controller.getPhongBan();
        cmbPhongBanHanh1.removeAllItems();
        cmbPhongBanNhan1.removeAllItems();
        for (String phongBan : phongBanList) {
            cmbPhongBanHanh1.addItem(phongBan);
            cmbPhongBanNhan1.addItem(phongBan); // Phòng nhận dùng cùng dữ liệu
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu lên Combobox: " + e.getMessage());
    }
}

private boolean isEditing = false;
    private void btnLuu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu7ActionPerformed
 try {
    int[] selectedRows = tbDinhKem.getSelectedRows(); // Lấy tất cả hàng được chọn

    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn ít nhất một tài liệu.");
        return;
    }

    String soKyHieu = txtSoKyHieu.getText();
    String tenVanBan = txtTenVanBan.getText();
    Date ngayBanHanh = dateNgayBanHanh.getDate();
    String tenLoaiBanHanh = cmbLoaiBanHanh.getSelectedItem().toString();
    String tenPhongBanHanh = cmbPhongBanHanh.getSelectedItem().toString();
    String tenPhongBanNhan = cmbPhongBanNhan.getSelectedItem().toString();
    String nguoiNhan = txtNguoiNhan.getText();
    String nguoiKy = txtNguoiKy.getText();
    String nguoiDuyet = txtNguoiDuyet.getText();
    String trichYeu = txtTrichYeu.getText();
    String noiDung = txtNoiDung.getText();

    VanBanNoiBoController controller = new VanBanNoiBoController();

    if (soKyHieu.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập số ký hiệu.");
        txtSoKyHieu.requestFocus();
        return;
    }

    if (tenVanBan.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập tên văn bản.");
        txtTenVanBan.requestFocus();
        return;
    }

    if (ngayBanHanh == null) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày ban hành.");
        dateNgayBanHanh.requestFocus();
        return;
    }

    if (!isEditing && controller.kiemTraSoKyHieuTonTai(soKyHieu)) {
        JOptionPane.showMessageDialog(this, "Số ký hiệu đã tồn tại. Vui lòng nhập số ký hiệu khác.");
        txtSoKyHieu.requestFocus();
        return;
    }

    String maLoaiBanHanh = controller.layMaLoaiVanBan(tenLoaiBanHanh);
    String maPhongBanHanh = controller.layMaPhongBan(tenPhongBanHanh);
    String maPhongBanNhan = controller.layMaPhongBan(tenPhongBanNhan);

    // Duyệt qua từng hàng được chọn
    boolean success = true;
    for (int row : selectedRows) {
        int maTL = Integer.parseInt(tableModelTaiLieu.getValueAt(row, 0).toString());

        if (isEditing) {
            // Gọi hàm cập nhật
            if (!controller.capNhatVanBanNoiBo(soKyHieu, tenVanBan, ngayBanHanh, maLoaiBanHanh, maPhongBanHanh, maPhongBanNhan, nguoiNhan, nguoiKy, nguoiDuyet, trichYeu, noiDung, maTL)) {
                success = false;
            }
        } else {
            // Gọi hàm thêm mới
            if (!controller.themVanBanNoiBo(soKyHieu, tenVanBan, ngayBanHanh, maLoaiBanHanh, maPhongBanHanh, maPhongBanNhan, nguoiNhan, nguoiKy, nguoiDuyet, trichYeu, noiDung, maTL)) {
                success = false;
            }
        }
    }

    // Hiển thị thông báo thành công hoặc thất bại
    if (success) {
        JOptionPane.showMessageDialog(this, (isEditing ? "Cập nhật" : "Thêm") + " thành công.");
        isEditing = false; // Reset trạng thái
        fillDataVanBanNoiBo();
    } else {
        JOptionPane.showMessageDialog(this, (isEditing ? "Cập nhật" : "Thêm") + " thất bại cho một hoặc nhiều tài liệu.");
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
}

    }//GEN-LAST:event_btnLuu7ActionPerformed

    private void btnTaiLai8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLai8ActionPerformed
         // Xóa nội dung các trường nhập liệu
    txtSoKyHieu.setText("");
    txtTenVanBan.setText("");
    txtNguoiNhan.setText("");
    txtNguoiKy.setText("");
    txtNguoiDuyet.setText("");
    txtTrichYeu.setText("");
    txtNoiDung.setText("");

    // Đặt lại ngày hiện tại cho trường Ngày ban hành
    dateNgayBanHanh.setDate(null);

    // Đặt giá trị mặc định cho các combobox
    cmbLoaiBanHanh.setSelectedIndex(0);
    cmbPhongBanHanh.setSelectedIndex(0);
    cmbPhongBanNhan.setSelectedIndex(0);

 

    // Thông báo (nếu cần)
    JOptionPane.showMessageDialog(this, "Các trường đã được đặt lại!");
        
    }//GEN-LAST:event_btnTaiLai8ActionPerformed

    private void btnThemQuayLaiDeThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemQuayLaiDeThemActionPerformed
        // TODO add your handling code here:
        pnThan.setVisible(true);
        pnChuaThan.setVisible(true);
        pnTrangCHU.setVisible(false);
        pnChinh.setVisible(true);
        pnChuaNoiDung.setVisible(true);  // Hiển thị JTabbedPane pnChuaNoiDung
        pnVanBanNoiBo.setVisible(true);
        pnPhongBan.setVisible(false);
        pnDSNoibo.setVisible(false);

        // Đặt tab tương ứng trong JTabbedPane (ví dụ: tab đầu tiên)
        pnChuaNoiDung.setSelectedIndex(1); // Chuyển đến tab đầu tiên (VanBanNoiBo)

    }//GEN-LAST:event_btnThemQuayLaiDeThemActionPerformed

    private void btnThemQuayLaiDeThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemQuayLaiDeThemMouseExited
        jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_btnThemQuayLaiDeThemMouseExited

    private void btnThemQuayLaiDeThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemQuayLaiDeThemMouseEntered

        jPopupMenu1.show(btnThemQuayLaiDeThem, 0, btnThemQuayLaiDeThem.getHeight()); // dọc gắn liền btnThem
    }//GEN-LAST:event_btnThemQuayLaiDeThemMouseEntered
private Date getTodayStart() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getTodayEnd() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}

private Date getWeekStart() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getWeekEnd() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
    cal.add(Calendar.DAY_OF_WEEK, 6); // Tăng 6 ngày để đến cuối tuần
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}

private Date getMonthStart() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DAY_OF_MONTH, 1); // Ngày đầu tiên của tháng
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getMonthEnd() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // Ngày cuối cùng của tháng
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}

private Date getMonthStart(int month) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MONTH, month - 1); // Tháng bắt đầu từ 0 (tháng 1 là 0)
    cal.set(Calendar.DAY_OF_MONTH, 1); // Ngày đầu tiên của tháng
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getMonthEnd(int month) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MONTH, month - 1);
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // Ngày cuối cùng của tháng
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}

private Date getYearStart() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MONTH, Calendar.JANUARY); // Tháng 1
    cal.set(Calendar.DAY_OF_MONTH, 1); // Ngày đầu tiên của năm
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getYearEnd() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MONTH, Calendar.DECEMBER); // Tháng 12
    cal.set(Calendar.DAY_OF_MONTH, 31); // Ngày cuối cùng của năm
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}
private Date getPreviousYearStart() {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, -1); // Lùi lại 1 năm
    cal.set(Calendar.MONTH, Calendar.JANUARY); // Tháng 1
    cal.set(Calendar.DAY_OF_MONTH, 1); // Ngày đầu tiên
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
}

private Date getPreviousYearEnd() {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, -1); // Lùi lại 1 năm
    cal.set(Calendar.MONTH, Calendar.DECEMBER); // Tháng 12
    cal.set(Calendar.DAY_OF_MONTH, 31); // Ngày cuối cùng
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
}


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // Lấy giá trị đã chọn từ JComboBox
    String selectedItem = (String) jComboBox1.getSelectedItem();
    Date startDate = null, endDate = null;

    // Kiểm tra giá trị đã chọn và thiết lập thời gian bắt đầu và kết thúc
    switch (selectedItem) {
        case "Hôm nay":
            startDate = getTodayStart();
            endDate = getTodayEnd();
            break;
        case "Tuần này":
            startDate = getWeekStart();
            endDate = getWeekEnd();
            break;
        case "Tháng này":
            startDate = getMonthStart();
            endDate = getMonthEnd();
            break;
        case "Năm nay":
            startDate = getYearStart();
            endDate = getYearEnd();
            break;
        case "Tháng 1":
            startDate = getMonthStart(1);
            endDate = getMonthEnd(1);
            break;
              case "Tháng 2":
            startDate = getMonthStart(2);
            endDate = getMonthEnd(2);
            break;
             case "Tháng 3":
            startDate = getMonthStart(3);
            endDate = getMonthEnd(3);
            break;
             case "Tháng 4":
            startDate = getMonthStart(4);
            endDate = getMonthEnd(4);
            break;
             case "Tháng 5":
            startDate = getMonthStart(5);
            endDate = getMonthEnd(5);
            break;
             case "Tháng 6":
            startDate = getMonthStart(6);
            endDate = getMonthEnd(6);
            break;
             case "Tháng 7":
            startDate = getMonthStart(7);
            endDate = getMonthEnd(7);
            break;
             case "Tháng 8":
            startDate = getMonthStart(8);
            endDate = getMonthEnd(8);
            break;
             case "Tháng 9":
            startDate = getMonthStart(9);
            endDate = getMonthEnd(9);
            break;
             case "Tháng 10":
            startDate = getMonthStart(10);
            endDate = getMonthEnd(10);
            break;
             case "Tháng 11":
            startDate = getMonthStart(11);
            endDate = getMonthEnd(11);
            break;
             case "Tháng 12":
            startDate = getMonthStart(12);
            endDate = getMonthEnd(12);
            break;
        case "Năm trước":
            startDate = getPreviousYearStart();
            endDate = getPreviousYearEnd();
            break;
        default:
            break;
    }

    // Kiểm tra và thiết lập giá trị cho jDateChooser2 và jDateChooser3
    if (startDate != null && endDate != null) {
        jDateChooser2.setDate(startDate); // Đặt giá trị "từ ngày"
        jDateChooser3.setDate(endDate);   // Đặt giá trị "đến ngày"

        // Gọi phương thức để hiển thị danh sách văn bản trong khoảng thời gian
        filterAndDisplayVanBan(startDate, endDate);
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed
private void filterAndDisplayVanBan(Date startDate, Date endDate) {
    VanBanNoiBoController controller = new VanBanNoiBoController();
    try {
        // Lấy danh sách văn bản nội bộ theo khoảng thời gian
        ArrayList<VanBanNoiBo> vanBanList = controller.filterDataByDateRange(startDate, endDate);
        
        // Xóa toàn bộ dữ liệu cũ trong bảng
        tableModelVanBanNoiBo.setRowCount(0);
        
        // Thêm dữ liệu mới
        for (VanBanNoiBo vanBan : vanBanList) {
            tableModelVanBanNoiBo.addRow(new Object[]{
                vanBan.getSoKyHieu(),
                vanBan.getTenVanBan(),
                vanBan.getNgayBanHanh(),
                vanBan.getLoaiBanHanh(),
                vanBan.getPhongBanHanh(),
                vanBan.getPhongNhan(),
                vanBan.getNguoiNhan(),
                vanBan.getNguoiKy(),
                vanBan.getNguoiDuyet(),
                vanBan.getTrichYeu(),
                vanBan.getNoiDung()
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage());
    }
}



public void initTableTaiLieu() {
    // Mảng chứa các cột tiêu đề
    String[] colsName = new String[]{"Mã tài liệu","Tên tài liệu", "Ngày tạo", "Kích cỡ (KB)", "Loại","Đường dẫn"}; 
    tableModelTaiLieu = new DefaultTableModel(colsName, 0);
    tbDinhKem.setModel(tableModelTaiLieu);
    
     // Ẩn cột "MÃ Ptài liệu"
    tbDinhKem.getColumnModel().getColumn(0).setMinWidth(0);
    tbDinhKem.getColumnModel().getColumn(0).setMaxWidth(0);
    tbDinhKem.getColumnModel().getColumn(0).setWidth(0);

    // Ẩn cột "Đường dẫn"
    tbDinhKem.getColumnModel().getColumn(5).setMinWidth(0);
    tbDinhKem.getColumnModel().getColumn(5).setMaxWidth(0);
    tbDinhKem.getColumnModel().getColumn(5).setWidth(0);

}

public void fillDataTaiLieu() {
    try {
        // Lấy danh sách tài liệu từ Controller
      TaiLieuController tlController = new TaiLieuController();
        ArrayList<TaiLieu> lst = tlController.getAll(); // Gọi phương thức lấy dữ liệu

        // Xóa dữ liệu cũ trên bảng
        tableModelTaiLieu.setRowCount(0);

        // Thêm dữ liệu mới
        for (TaiLieu tl : lst) {
            String[] row = {
                tl.getMaTL(),
                tl.getTenTL(), // Tên tài liệu
                tl.getNgayTao(), // Ngày tạo
                tl.getKichCo(), // Kích cỡ
                tl.getLoai(), // Loại
                tl.getDuongDan()
            };
            tableModelTaiLieu.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi load dữ liệu: " + e.getMessage());
    }
}

// Phương thức lấy phần mở rộng của tệp tin
private String getFileExtension(File file) {
    String fileName = file.getName();
    int dotIndex = fileName.lastIndexOf(".");
    if (dotIndex > 0) {
        return fileName.substring(dotIndex + 1).toLowerCase();  // Lấy phần mở rộng, chuyển sang chữ thường
    }
    return "";  // Trả về chuỗi rỗng nếu không có phần mở rộng
}

    private void btnDinhKemFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinhKemFileActionPerformed
   initTableTaiLieu();
try {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  // Chế độ chọn tệp tin
    
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        // Thư mục gốc của dự án
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        
        // Thư mục "VanBanNoiBo" trong thư mục gốc
        Path allowedFolder = projectRoot.resolve("VanBanNoiBo");
        
        // Đường dẫn tuyệt đối của tệp đã chọn
        Path absolutePath = selectedFile.toPath();
        
        // Kiểm tra xem tệp có nằm trong thư mục "VanBanNoiBo" hay không
        if (!absolutePath.startsWith(allowedFolder)) {
            JOptionPane.showMessageDialog(this, "Tệp đã chọn không nằm trong thư mục VanBanNoiBo của dự án.");
            return;
        }
        
        // Chuyển đổi sang đường dẫn tương đối
        Path relativePath = projectRoot.relativize(absolutePath);
        String duongDanTuongDoi = relativePath.toString().replace("\\", "/");

        // Thông tin tài liệu
        String tenTL = selectedFile.getName();
        java.sql.Date sqlNgayTao = new java.sql.Date(System.currentTimeMillis());
        String kichCo = String.valueOf(selectedFile.length());  // Kích thước tệp tin
        
        // Lấy phần mở rộng của tệp (ví dụ: png, docx)
        String loaiTL = getFileExtension(selectedFile);  // Lấy phần mở rộng của tệp tin
        
        // Kiểm tra xem có phải là định dạng hợp lệ không (nếu cần)
        if (loaiTL == null || loaiTL.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tệp tin không có phần mở rộng hợp lệ.");
            return;
        }

        // Thực hiện thêm tài liệu vào cơ sở dữ liệu
        if (new TaiLieuController().ThemTaiLieu(tenTL, sqlNgayTao, kichCo, loaiTL, duongDanTuongDoi)) {
            JOptionPane.showMessageDialog(this, "Đính kèm tệp tin thành công");
            fillDataTaiLieu();
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi tải lên.");
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

    }//GEN-LAST:event_btnDinhKemFileActionPerformed

    private void btnXoaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFileActionPerformed
        // TODO add your handling code here: // TODO add your handling code here:
        int row = tbDinhKem.getSelectedRow();
        if(row>=0){
            // Lấy ra cột 1 của dòng đã đã chọn
            String MaTaiLieu = tbDinhKem.getValueAt(row, 0).toString();
            try {
                if(new TaiLieuController().XoaFile(MaTaiLieu)){
                    JOptionPane.showMessageDialog(null, "Xóa tài liệu thành công!");
                      fillDataTaiLieu();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xóa tài liệu thất bại!");
                }
            } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để xóa.");
        }
    }//GEN-LAST:event_btnXoaFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
          int row = tbDinhKem.getSelectedRow();
        if (row != -1) {
            // Lấy đường dẫn tệp từ cột thứ 6 (index 5)
            String duongDanFile = (String) tbDinhKem.getValueAt(row, 5);

            if (duongDanFile != null && !duongDanFile.isEmpty()) {
                // Đảm bảo thay thế dấu "\" bằng "/"
                String filePath = duongDanFile.replace("\\", "/");

                    File fileTaiXuong = new File(filePath);
                    if (fileTaiXuong.exists()) {
                        try {
                            // Mở tài liệu bằng Desktop API
                            Desktop desktop = Desktop.getDesktop();
                            desktop.open(fileTaiXuong); // Mở tệp
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, "Không thể mở tệp: " + e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Tệp không tồn tại.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy đường dẫn tài liệu.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu.");
            }
    }//GEN-LAST:event_btnDocFileActionPerformed

    private void pnChuaTimKiemThongKeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnChuaTimKiemThongKeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnChuaTimKiemThongKeAncestorAdded

    private void btnTKVanBandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKVanBandiActionPerformed
        // TODO add your handling code here:
        
    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
     pnChuaNoiDung.setVisible(false);
      pnTimKiemThongKe.setVisible(true);
     
    pnChuaTimKiemThongKe.setVisible(true); 
    ThongKeVanBanDi.setVisible(true);      
    ThongKeVanBanDen.setVisible(false);     
    ThongKeVanBanNoiBo.setVisible(false);  
  
    pnChuaTimKiemThongKe.setSelectedIndex(0);
    }//GEN-LAST:event_btnTKVanBandiActionPerformed

    private void btnThongKeVanBanDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeVanBanDenActionPerformed
        // TODO add your handling code here:
                
    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
    pnChuaNoiDung.setVisible(false);
    pnTimKiemThongKe.setVisible(true);
    
    pnChuaTimKiemThongKe.setVisible(true); 
    ThongKeVanBanDi.setVisible(false);      
    ThongKeVanBanDen.setVisible(true);     
    ThongKeVanBanNoiBo.setVisible(false);  
  
    pnChuaTimKiemThongKe.setSelectedIndex(1);
    }//GEN-LAST:event_btnThongKeVanBanDenActionPerformed

    private void btnThongKeVBNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeVBNBActionPerformed
        // TODO add your handling code here:
                
    pnThan.setVisible(true);
    pnChuaThan.setVisible(true);
    pnTrangCHU.setVisible(false);
    pnChinh.setVisible(true);
     pnChuaNoiDung.setVisible(false);
      pnTimKiemThongKe.setVisible(true);
    pnChuaTimKiemThongKe.setVisible(true); 
    ThongKeVanBanDi.setVisible(false);      
    ThongKeVanBanDen.setVisible(false);     
    ThongKeVanBanNoiBo.setVisible(true);  
  
    pnChuaTimKiemThongKe.setSelectedIndex(2);
    }//GEN-LAST:event_btnThongKeVBNBActionPerformed

    private void ThoiGianTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoiGianTimKiemActionPerformed
      // Lấy giá trị đã chọn từ JComboBox
    String selectedItem = (String) ThoiGianTimKiem.getSelectedItem();
    Date startDate = null, endDate = null;

    // Kiểm tra giá trị đã chọn và thiết lập thời gian bắt đầu và kết thúc
    switch (selectedItem) {
        case "Hôm nay":
            startDate = getTodayStart();
            endDate = getTodayEnd();
            break;
        case "Tuần này":
            startDate = getWeekStart();
            endDate = getWeekEnd();
            break;
        case "Tháng này":
            startDate = getMonthStart();
            endDate = getMonthEnd();
            break;
        case "Năm nay":
            startDate = getYearStart();
            endDate = getYearEnd();
            break;
        case "Tháng 1":
            startDate = getMonthStart(1);
            endDate = getMonthEnd(1);
            break;
        case "Tháng 2":
            startDate = getMonthStart(2);
            endDate = getMonthEnd(2);
            break;
             case "Tháng 3":
            startDate = getMonthStart(3);
            endDate = getMonthEnd(3);
            break;
             case "Tháng 4":
            startDate = getMonthStart(4);
            endDate = getMonthEnd(4);
            break;
             case "Tháng 5":
            startDate = getMonthStart(5);
            endDate = getMonthEnd(5);
            break;
             case "Tháng 6":
            startDate = getMonthStart(6);
            endDate = getMonthEnd(6);
            break;
             case "Tháng 7":
            startDate = getMonthStart(7);
            endDate = getMonthEnd(7);
            break;
             case "Tháng 8":
            startDate = getMonthStart(8);
            endDate = getMonthEnd(8);
            break;
             case "Tháng 9":
            startDate = getMonthStart(9);
            endDate = getMonthEnd(9);
            break;
             case "Tháng 10":
            startDate = getMonthStart(10);
            endDate = getMonthEnd(10);
            break;
             case "Tháng 11":
            startDate = getMonthStart(11);
            endDate = getMonthEnd(11);
            break;
             case "Tháng 12":
            startDate = getMonthStart(12);
            endDate = getMonthEnd(12);
            break;
        case "Năm trước":
            startDate = getPreviousYearStart();
            endDate = getPreviousYearEnd();
            break;
        default:
            break;
    }

    // Kiểm tra và thiết lập giá trị cho jDateChooser2 và jDateChooser3
    if (startDate != null && endDate != null) {
        jDateChooser4.setDate(startDate); // Đặt giá trị "từ ngày"
        jDateChooser5.setDate(endDate);   // Đặt giá trị "đến ngày"

        // Gọi phương thức để hiển thị danh sách văn bản trong khoảng thời gian
        filterAndDisplayVanBan(startDate, endDate);
    }
    }//GEN-LAST:event_ThoiGianTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
  // Lấy từ khóa từ các trường nhập liệu
    String loaiBanHanh = cmbLoaiBanHanh1.getSelectedItem().toString().trim().toLowerCase();
    String phongBanHanh = cmbPhongBanHanh1.getSelectedItem().toString().trim().toLowerCase();
    String phongBanNhan = cmbPhongBanNhan1.getSelectedItem().toString().trim().toLowerCase();
    String soKyHieu = txtSoKyHieu1.getText().trim().toLowerCase();
    String tenVanBan = txtTenVanBan1.getText().trim().toLowerCase();
    String trichYeu = txtTrichYeu1.getText().trim().toLowerCase();

    // Gọi phương thức tìm kiếm từ Controller
    VanBanNoiBoController controller = new VanBanNoiBoController();
    List<VanBanNoiBo> danhSachVanBan = controller.timKiemVanBan(
        loaiBanHanh, phongBanHanh, phongBanNhan, soKyHieu, tenVanBan, trichYeu
    );

    // Hiển thị kết quả tìm kiếm trong bảng
    if (danhSachVanBan.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Không tìm thấy văn bản phù hợp.");
    } else {
        fillDataVanBanNoiBoTK(danhSachVanBan);
    }
    }//GEN-LAST:event_btnTimKiemActionPerformed
// Hàm hiển thị dữ liệu tìm kiếm ra bảng
private void fillDataVanBanNoiBoTK(List<VanBanNoiBo> danhSachVanBan) {
    DefaultTableModel model = (DefaultTableModel) tbVanBanNoiBo1.getModel();
    model.setRowCount(0); // Xóa dữ liệu cũ trên bảng

    for (VanBanNoiBo vanBan : danhSachVanBan) {
        model.addRow(new Object[]{
            vanBan.getLoaiBanHanh(),
            vanBan.getPhongBanHanh(),
            vanBan.getPhongNhan(),
            vanBan.getSoKyHieu(),
            vanBan.getTenVanBan(),
            vanBan.getTrichYeu()
        });
    }
}
    private void tbVanBanNoiBo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVanBanNoiBo1MouseClicked

        int row = this.tbVanBanNoiBo1.getSelectedRow();
        if(row!=-1){
        String sokyhieu = this.tbVanBanNoiBo1.getValueAt(row, 0).toString();
        String tenvanban = this.tbVanBanNoiBo1.getValueAt(row, 1).toString();
        String ngayBanHanhStr = this.tbVanBanNoiBo1.getValueAt(row, 2).toString();
        String loaibanhanh = this.tbVanBanNoiBo1.getValueAt(row, 3).toString();
        String phongbanhanh = this.tbVanBanNoiBo1.getValueAt(row, 4).toString();
        String phongbannhan = this.tbVanBanNoiBo1.getValueAt(row, 5).toString();
        String nguoinhan = this.tbVanBanNoiBo1.getValueAt(row, 6).toString();
        String nguoiky = this.tbVanBanNoiBo1.getValueAt(row, 7).toString();
        String nguoiduyet = this.tbVanBanNoiBo1.getValueAt(row, 8).toString();
        String trichyeu = this.tbVanBanNoiBo1.getValueAt(row, 9).toString();
        String noidung = this.tbVanBanNoiBo1.getValueAt(row, 10).toString();
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Vui long chon 1 hang");
        }
        
    }//GEN-LAST:event_tbVanBanNoiBo1MouseClicked

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
/*  int row = this.tbVanBanNoiBo1.getSelectedRow();
    if (row != -1) {
        // Lấy thông tin từ dòng được chọn
        String sokyhieu = this.tbVanBanNoiBo1.getValueAt(row, 0).toString();
        String tenvanban = this.tbVanBanNoiBo1.getValueAt(row, 1).toString();
        String ngayBanHanhStr = this.tbVanBanNoiBo1.getValueAt(row, 2).toString();
        String loaibanhanh = this.tbVanBanNoiBo1.getValueAt(row, 3).toString();
        String phongbanhanh = this.tbVanBanNoiBo1.getValueAt(row, 4).toString();
        String phongbannhan = this.tbVanBanNoiBo1.getValueAt(row, 5).toString();
        String nguoinhan = this.tbVanBanNoiBo1.getValueAt(row, 6).toString();
        String nguoiky = this.tbVanBanNoiBo1.getValueAt(row, 7).toString();
        String nguoiduyet = this.tbVanBanNoiBo1.getValueAt(row, 8).toString();
        String trichyeu = this.tbVanBanNoiBo1.getValueAt(row, 9).toString();
        String noidung = this.tbVanBanNoiBo1.getValueAt(row, 10).toString();

        // Mở form Chi tiết và truyền dữ liệu
        ChiTietVanBanNoiBo vbChiTiet = new ChiTietVanBanNoiBo(
            sokyhieu, tenvanban, ngayBanHanhStr, loaibanhanh, phongbanhanh, phongbannhan,
            nguoinhan, nguoiky, nguoiduyet, trichyeu, noidung);
        vbChiTiet.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng!");
    }*/
    }//GEN-LAST:event_btnXemChiTietActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FormTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormTrangChu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormTrangChu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ThanhMenu;
    private javax.swing.JPanel ThanhMenu1;
    private javax.swing.JComboBox<String> ThoiGianTimKiem;
    private javax.swing.JPanel ThongKeVanBanDen;
    private javax.swing.JPanel ThongKeVanBanDi;
    private javax.swing.JPanel ThongKeVanBanNoiBo;
    private javax.swing.JButton btnDinhKemFile;
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnDsNoiBo;
    private javax.swing.JButton btnHeThong;
    private javax.swing.JButton btnHeThong1;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuu7;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnQLVBNoiBo;
    private javax.swing.JButton btnQLVBNoiBo1;
    private javax.swing.JButton btnQLVanBan;
    private javax.swing.JButton btnQLVanBan1;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnSua9;
    private javax.swing.JButton btnTKVanBandi;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnTaiLai1;
    private javax.swing.JButton btnTaiLai8;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThem8;
    private javax.swing.JButton btnThemQuayLaiDeThem;
    private javax.swing.JButton btnThongKeVBNB;
    private javax.swing.JButton btnThongKeVanBanDen;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTim_Thong;
    private javax.swing.JButton btnTim_Thong1;
    private javax.swing.JButton btnVanBanNoiBo;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoa9;
    private javax.swing.JButton btnXoaFile;
    private javax.swing.JComboBox<String> cmbLoaiBanHanh;
    private javax.swing.JComboBox<String> cmbLoaiBanHanh1;
    private javax.swing.JComboBox<String> cmbPhongBanHanh;
    private javax.swing.JComboBox<String> cmbPhongBanHanh1;
    private javax.swing.JComboBox<String> cmbPhongBanNhan;
    private javax.swing.JComboBox<String> cmbPhongBanNhan1;
    private com.toedter.calendar.JDateChooser dateNgayBanHanh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelButton1;
    private javax.swing.JPanel panelHeThong;
    private javax.swing.JPanel panelHeThong1;
    private javax.swing.JPanel panelQLVBNoiBo;
    private javax.swing.JPanel panelQLVBNoiBo1;
    private javax.swing.JPanel panelQLVanBan;
    private javax.swing.JPanel panelQLVanBan1;
    private javax.swing.JPanel panelTimThong;
    private javax.swing.JPanel panelTimThong1;
    private javax.swing.JPanel pnChinh;
    private javax.swing.JPanel pnChuaCacCard;
    private javax.swing.JPanel pnChuaCacCard1;
    private javax.swing.JTabbedPane pnChuaNoiDung;
    private javax.swing.JPanel pnChuaThan;
    private javax.swing.JTabbedPane pnChuaTimKiemThongKe;
    private javax.swing.JPanel pnDSNoibo;
    private javax.swing.JPanel pnPhongBan;
    private javax.swing.JPanel pnThan;
    private javax.swing.JPanel pnTimKiemThongKe;
    private javax.swing.JPanel pnTrangCHU;
    private javax.swing.JPanel pnVanBanNoiBo;
    private javax.swing.JTable tbDinhKem;
    private javax.swing.JTable tbPhongBan;
    private javax.swing.JTable tbVanBanNoiBo;
    private javax.swing.JTable tbVanBanNoiBo1;
    private javax.swing.JTextField txtNguoiDuyet;
    private javax.swing.JTextField txtNguoiKy;
    private javax.swing.JTextField txtNguoiNhan;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtSoKyHieu;
    private javax.swing.JTextField txtSoKyHieu1;
    private javax.swing.JTextField txtTenVanBan;
    private javax.swing.JTextField txtTenVanBan1;
    private javax.swing.JTextArea txtTrichYeu;
    private javax.swing.JTextArea txtTrichYeu1;
    // End of variables declaration//GEN-END:variables
}
