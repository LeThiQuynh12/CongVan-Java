/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyCongVan.Views.QuanLyVanBan;

import QuanLyCongVan.Controllers.LoaiVanBanController;
import QuanLyCongVan.Controllers.NoiBanHanhController;
import QuanLyCongVan.Controllers.SoVanBanController;
import QuanLyCongVan.Controllers.VanBanDenController;
import QuanLyCongVan.Controllers.VanBanDiController;
import QuanLyCongVan.Model.LoaiVanBanModel;
import QuanLyCongVan.Model.NoiBanHanhModel;
import QuanLyCongVan.Model.SoVanBanModel;
import QuanLyCongVan.Model.VanBanDenModel;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormSoVanBan extends javax.swing.JFrame {

    DefaultTableModel tablemodel;
    ArrayList<SoVanBanModel> dsvb;
    ArrayList<LoaiVanBanModel> dsl;
    ArrayList<NoiBanHanhModel> dsnoi;
    ArrayList<VanBanDenModel> dsvbden;
    public FormSoVanBan() {
        initComponents();
        KhoiTao();
        HienThiNamVaVanBan();
        HienThiTableLoaiVanBan();
        HienThiTableNoiBanHanh();
        KhoiTaoVanBanDen();
        KhoiTaoVanBanDi();
    }
    private void KhoiTao()
    {
        CardLayout cardLayout = (CardLayout) pnChuaCacCard.getLayout();
        // Thêm từng panel vào CardLayout với key tương ứng
        pnChuaCacCard.add(panelHeThong, "heThong");
        pnChuaCacCard.add(panelQLVanBan, "quanLyVanBan");
        pnChuaCacCard.add(panelQLVBNoiBo, "quanLyVanBanNoiBo");
        pnChuaCacCard.add(panelTimThong, "timThong");
        
        // Thêm từng panel vào CardLayout với key tương ứng
        pnChuaCacCard.add(panelHeThong, "heThong");
        pnChuaCacCard.add(panelQLVanBan, "quanLyVanBan");
        pnChuaCacCard.add(panelQLVBNoiBo, "quanLyVanBanNoiBo");
        pnChuaCacCard.add(panelTimThong, "timThong");
        btnXoa.setToolTipText("Xóa");
        btnLuu.setToolTipText("Lưu");
        btnThem.setToolTipText("Thêm mới");
        btnXoa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "xoa");
        btnXoa.getActionMap().put("xoa", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnXoaActionPerformed(e);
            }
        });
        btnThem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "them");
        btnThem.getActionMap().put("them", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnThemActionPerformed(e); 
            }
        });
        btnLuu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "them");
        btnLuu.getActionMap().put("luu", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               btnLuuActionPerformed(e);
            }
        });
        HienThiNamVaVanBan();
    }
    private void KhoiTaoMenuCardLayout()
    {
        CardLayout menuCard=(CardLayout) menu.getLayout();
        menu.add(panelSoVanBan,"SoVanBan");
        menu.add(panelLoaiVanBan,"LoaiVanBan");
        menu.add(panelNoiBanHanh,"NoiBanHanh");
        menu.add(panelVanBanDen,"VanBanDen");
        menu.add(panelVanBanDi,"VanBanDi");
        menu.add(panelDanhSachDen,"DSDen");
        menu.add(panelDanhSachDi,"DSDi");
    }
    private void HienThiNamVaVanBan()
    {
        int currentYear=java.time.LocalDate.now().getYear();
        for(int i=1990;i<=2024;i++)
        {
            cboNam.addItem(String.valueOf(i));
        }
        cboNam.setSelectedItem(String.valueOf(currentYear));
        HienThiTable();
    }         
        
    public void HienThiTable() {
    try {
        SoVanBanController soControl = new SoVanBanController();
        int year = Integer.parseInt(cboNam.getSelectedItem().toString());  // Lấy năm từ ComboBox
        System.out.println("Năm chọn: " + year);  // In năm chọn để kiểm tra

        // Giả sử dsvb đã được cập nhật ở đâu đó trong chương trình
        dsvb = soControl.HienThiSoVanBan(year);  // Gọi phương thức lấy dữ liệu từ controller
    DefaultTableModel model = (DefaultTableModel) tblSoVanBan.getModel();
        model.setRowCount(0);  // Xóa hết dữ liệu cũ trong bảng

        // Kiểm tra nếu có dữ liệu trong dsvb
        if (dsvb != null && !dsvb.isEmpty()) {
            // Thêm các dòng dữ liệu mới vào bảng
            for (int i = 0; i < dsvb.size(); i++) {
                int stt = i + 1;  // Số thứ tự
                String soVanBan = dsvb.get(i).getSoVanBan();
                boolean soden = dsvb.get(i).isSoDen();
                int nam = dsvb.get(i).getNam();
                Object[] so = new Object[]{stt, soVanBan, soden, nam};
                model.addRow(so);  // Thêm dòng vào bảng
            }
        }
        //else {
//            // Không có dữ liệu, hiển thị một bảng trống
//            JOptionPane.showMessageDialog(null, "Không có dữ liệu cho năm này.");
//        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
    }
}


    public void KhoiTaoVanBanDen()
    {
        // Hien thi so van ban
        try
        {
            VanBanDenController vbController=new VanBanDenController();
            ArrayList<String> danhsachso=vbController.HienThiSoVanBan();
            for(String x:danhsachso)
            {
                cboSoVanBanDen.addItem(x);
            }
            Date today = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
            dateNgayBanHanhDen.setDate(today);
            dateNgayDen.setDate(today);
            ArrayList<String> danhsachloai=vbController.hienThiLoaiVanBan();
            for(String s:danhsachloai)
            {
                cboLoaiVanBanDen.addItem(s);
            }
            ArrayList<String> danhsachnoi=vbController.HienThiNoiBanHanh();
            for(String x:danhsachnoi)
            {
                cboNoiBanHanhDen.addItem(x);
            }
            //txtSoKyHieuDen.setText(t);
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,  "Đã xảy ra lỗi: " + ex.getMessage(),  "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void KhoiTaoVanBanDi()
    {
        // Hien thi so van ban
        try
        {
            VanBanDiController vbController=new VanBanDiController();
            ArrayList<String> danhsachso=vbController.HienThiSoVanBan();
            for(String x:danhsachso)
            {
                cboSoVanBanDi.addItem(x);
            }
            Date today = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
            dateNgayBanHanhDi.setDate(today);
            ArrayList<String> danhsachloai=vbController.hienThiLoaiVanBan();
            for(String s:danhsachloai)
            {
                cboLoaiVanBanDi.addItem(s);
            }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,  "Đã xảy ra lỗi: " + ex.getMessage(),  "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void HienThiDanhSachVanBanDen()
    {
        try
        {
            VanBanDenController dsden=new VanBanDenController();
            dsvbden=dsden.HienThiDanhSachVanBanDen();
            for(int i=0;i<dsvbden.size();i++)
            {
                DefaultTableModel danhSachDen=(DefaultTableModel)tblDanhSachVanBanDen.getModel();
                int stt=i+1;
                String soVanBan;
                String loaiVanBan;
                String soKyHieu;
                int soDen;
                Date ngayBanHanh;
                Date ngayDen;
                String DonViGui;
                String trichYeu;
            }
        }
        catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
    }
    }
    public void HienThiTableLoaiVanBan()
    {
        try {
        // Khởi tạo controller
        LoaiVanBanController loaiVBController = new LoaiVanBanController();
        
        // Lấy danh sách loại văn bản từ controller
        dsl = loaiVBController.HienThiLoaiVanBan();
        
        // Kiểm tra nếu danh sách dsl không null và không rỗng
        if (dsl != null && !dsl.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tblLoaiVanBan.getModel();
            model.setRowCount(0);  // Xóa hết dữ liệu cũ trong bảng
            
            // Thêm các dòng dữ liệu mới vào bảng
            for (int i = 0; i < dsl.size(); i++) {
                int stt = i + 1;  // Số thứ tự
                String maLoai = dsl.get(i).getMaLoai();
                String loaiVanBan = dsl.get(i).getLoaiVanBan();
                String moTa = dsl.get(i).getMoTa();
                Object[] loai = new Object[]{stt, maLoai, loaiVanBan, moTa};
                model.addRow(loai);  // Thêm dòng vào bảng
            }
        } else {
            // Nếu danh sách rỗng, hiển thị thông báo
            JOptionPane.showMessageDialog(null, "Không có dữ liệu loại văn bản.");
        }
    } catch (Exception ex) {
        // Bắt lỗi và hiển thị thông báo chi tiết lỗi
        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
    }
    }
    public void HienThiTableNoiBanHanh()
    {
        try {
       NoiBanHanhController nbhController = new NoiBanHanhController();
       dsnoi = nbhController.HienThiNoiBanHanh();  
        DefaultTableModel model = (DefaultTableModel) tblNoiBanHanh.getModel();
        model.setRowCount(0);

        for (int i = 0; i < dsnoi.size(); i++) {
            int stt = i + 1;  
            String noiBanHanh = dsnoi.get(i).getNoiBanHanh();  
            String moTa = dsnoi.get(i).getMoTa();  

            Object[] noi = new Object[]{stt, noiBanHanh, moTa};
            model.addRow(noi);  
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        ex.printStackTrace();  
    }
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
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btnThem1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnTaiLai1 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        ThanhMenu1 = new javax.swing.JPanel();
        panelButton1 = new javax.swing.JPanel();
        btnHeThong1 = new javax.swing.JButton();
        btnQLVBNoiBo1 = new javax.swing.JButton();
        btnTim_Thong1 = new javax.swing.JButton();
        btnQLVanBan1 = new javax.swing.JButton();
        pnChuaCacCard1 = new javax.swing.JPanel();
        panelHeThong1 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        panelQLVanBan1 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        panelQLVBNoiBo1 = new javax.swing.JPanel();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        panelTimThong1 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
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
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton65 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        btnSoVanBan = new javax.swing.JButton();
        btnNoiBanHanh = new javax.swing.JButton();
        btnVanBanDen = new javax.swing.JButton();
        btnLoaiVanBan = new javax.swing.JButton();
        btnDSDen = new javax.swing.JButton();
        btnDSDi = new javax.swing.JButton();
        btnVanBanDi = new javax.swing.JButton();
        panelQLVBNoiBo = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        panelTimThong = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        menu = new javax.swing.JTabbedPane();
        panelSoVanBan = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSoVanBan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        panelLoaiVanBan = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnThemLoai = new javax.swing.JButton();
        btnTaiLaiLoai = new javax.swing.JButton();
        btnXoaLoai = new javax.swing.JButton();
        btnLuuLoai = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLoaiVanBan = new javax.swing.JTable();
        panelNoiBanHanh = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        brnThemNoi = new javax.swing.JButton();
        btnTaiLaiNoi = new javax.swing.JButton();
        btnXoaNoi = new javax.swing.JButton();
        btnLuuNoi = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNoiBanHanh = new javax.swing.JTable();
        panelVanBanDen = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        btnThemVanBanDen = new javax.swing.JButton();
        btnTaiLaiNoi1 = new javax.swing.JButton();
        btnLuuVanBanDen = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSoKyHieuDen = new javax.swing.JTextField();
        cboSoVanBanDen = new javax.swing.JComboBox<>();
        dateNgayBanHanhDen = new com.toedter.calendar.JDateChooser();
        cboNoiBanHanhDen = new javax.swing.JComboBox<>();
        txtSoDen = new javax.swing.JTextField();
        dateNgayDen = new com.toedter.calendar.JDateChooser();
        txtSoTrangDen = new javax.swing.JTextField();
        txtNguoiNhanDen = new javax.swing.JTextField();
        txtNguoiDuyetDen = new javax.swing.JTextField();
        txtNguoiKyDen = new javax.swing.JTextField();
        cboLoaiVanBanDen = new javax.swing.JComboBox<>();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        panelVanBanDi = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        brnThemNoi2 = new javax.swing.JButton();
        btnTaiLaiNoi2 = new javax.swing.JButton();
        btnXoaNoi2 = new javax.swing.JButton();
        btnLuuNoi2 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
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
        jLabel26 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtSoKiHieuDi = new javax.swing.JTextField();
        cboSoVanBanDi = new javax.swing.JComboBox<>();
        dateNgayBanHanhDi = new com.toedter.calendar.JDateChooser();
        cboLoaiVanBanDi = new javax.swing.JComboBox<>();
        txtSoLuongBanDi = new javax.swing.JTextField();
        txtSoTrangDi = new javax.swing.JTextField();
        txtNguoiGuiDi = new javax.swing.JTextField();
        txtNguoiDuyetDi = new javax.swing.JTextField();
        txtNguoiKyDi = new javax.swing.JTextField();
        txtNoiNhanDi = new javax.swing.JTextField();
        txtSoDi = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        panelDanhSachDen = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        brnThemNoi3 = new javax.swing.JButton();
        btnTaiLaiNoi3 = new javax.swing.JButton();
        btnXoaNoi3 = new javax.swing.JButton();
        btnLuuNoi3 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDanhSachVanBanDen = new javax.swing.JTable();
        panelDanhSachDi = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        brnThemNoi4 = new javax.swing.JButton();
        btnTaiLaiNoi4 = new javax.swing.JButton();
        btnXoaNoi4 = new javax.swing.JButton();
        btnLuuNoi4 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel50 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblLoaiVanBan8 = new javax.swing.JTable();
        jButton64 = new javax.swing.JButton();

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

        jPanel19.setBackground(new java.awt.Color(204, 255, 255));

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

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel21.setBackground(new java.awt.Color(230, 247, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 153), null));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 102, 51));
        jLabel126.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN ĐI VÀ ĐẾN");
        jLabel126.setToolTipText("");

        jButton72.setBackground(new java.awt.Color(255, 249, 196));
        jButton72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton72.setForeground(new java.awt.Color(0, 102, 51));
        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton72.setText("Tìm kiếm thống kê");

        jButton73.setBackground(new java.awt.Color(255, 249, 196));
        jButton73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton73.setForeground(new java.awt.Color(0, 102, 51));
        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/open-book.png"))); // NOI18N
        jButton73.setText("Danh sách văn bản đến");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(255, 249, 196));
        jButton74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton74.setForeground(new java.awt.Color(0, 102, 51));
        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton74.setText("Văn bản đến");

        jButton75.setBackground(new java.awt.Color(255, 249, 196));
        jButton75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton75.setForeground(new java.awt.Color(0, 102, 51));
        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/software.png"))); // NOI18N
        jButton75.setText("Số văn bản");

        jButton76.setBackground(new java.awt.Color(255, 249, 196));
        jButton76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton76.setForeground(new java.awt.Color(0, 102, 51));
        jButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton76.setText("Loại văn bản");

        jButton77.setBackground(new java.awt.Color(255, 249, 196));
        jButton77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton77.setForeground(new java.awt.Color(0, 102, 51));
        jButton77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton77.setText("Nơi ban hành");

        jButton78.setBackground(new java.awt.Color(255, 249, 196));
        jButton78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton78.setForeground(new java.awt.Color(0, 102, 51));
        jButton78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton78.setText("Văn bản đi");

        jButton79.setBackground(new java.awt.Color(255, 249, 196));
        jButton79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton79.setForeground(new java.awt.Color(0, 102, 51));
        jButton79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton79.setText("Danh sách văn bản đi");

        jButton80.setBackground(new java.awt.Color(255, 249, 196));
        jButton80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton80.setForeground(new java.awt.Color(0, 102, 51));
        jButton80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton80.setText("Tìm kiếm thống kê");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel129.setText("jLabel5");

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/len.png"))); // NOI18N

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel132.setText("jLabel5");

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel136.setText("jLabel5");

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel137.setText("jLabel5");

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton76)
                        .addGap(22, 22, 22)
                        .addComponent(jButton77)
                        .addGap(13, 13, 13)
                        .addComponent(jButton75))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)))
                                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton79)
                        .addGap(43, 43, 43)
                        .addComponent(jButton80))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton73)
                        .addGap(87, 87, 87)
                        .addComponent(jButton72))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton74)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton72, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel131)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton77, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jButton75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel127))
                .addGap(0, 0, 0)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel144)
                .addGap(0, 0, 0)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel142, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel22.setBackground(new java.awt.Color(230, 247, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 204), null));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(0, 102, 51));
        jLabel145.setText("QUY TRÌNH QUẢN LÝ VĂN BẢN NỘI BỘ");
        jLabel145.setToolTipText("");

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel146.setText("jLabel5");

        jButton81.setBackground(new java.awt.Color(255, 249, 196));
        jButton81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton81.setForeground(new java.awt.Color(0, 102, 51));
        jButton81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton81.setText("Loại văn bản");

        jButton82.setBackground(new java.awt.Color(255, 249, 196));
        jButton82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton82.setForeground(new java.awt.Color(0, 102, 51));
        jButton82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton82.setText("Phòng ban hành");

        jButton83.setBackground(new java.awt.Color(255, 249, 196));
        jButton83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton83.setForeground(new java.awt.Color(0, 102, 51));
        jButton83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton83.setText("Phòng ban nhận");

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jButton84.setBackground(new java.awt.Color(255, 249, 196));
        jButton84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton84.setForeground(new java.awt.Color(0, 102, 51));
        jButton84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton84.setText("Văn bản nội bộ");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(255, 249, 196));
        jButton85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton85.setForeground(new java.awt.Color(0, 102, 51));
        jButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/private-account.png"))); // NOI18N
        jButton85.setText("Danh sách văn bản nội bộ");

        jButton86.setBackground(new java.awt.Color(255, 249, 196));
        jButton86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton86.setForeground(new java.awt.Color(0, 102, 51));
        jButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/search.png"))); // NOI18N
        jButton86.setText("Tìm kiếm thống kê");

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/1.png"))); // NOI18N
        jLabel151.setText("jLabel5");

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/2.png"))); // NOI18N

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/xuong.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton82)
                        .addGap(18, 18, 18)
                        .addComponent(jButton83)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel154)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton86, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
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

        jButton87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/selecting.png"))); // NOI18N
        jButton87.setText("Phân quyền nhân viên");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton88.setText("Thông tin người ký duyệt");

        jButton89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/team.png"))); // NOI18N
        jButton89.setText("Quản lý người dùng");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton88, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton89, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        panelHeThong1.add(jPanel23, "card2");

        pnChuaCacCard1.add(panelHeThong1, "card3");

        panelQLVanBan1.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVanBan1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelQLVanBan1.setLayout(new java.awt.CardLayout());

        jButton90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        jButton90.setText("Số văn bản");

        jButton91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        jButton91.setText("Nơi ban hành");

        jButton92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        jButton92.setText("Văn bản đến");

        jButton93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        jButton93.setText("Loại văn bản");

        jButton94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        jButton94.setText("Danh sách văn bản đến");

        jButton95.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        jButton95.setText("Danh sách văn bản đi");

        jButton96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        jButton96.setText("Văn bản đi");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton96, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton94, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelQLVanBan1.add(jPanel24, "card2");

        pnChuaCacCard1.add(panelQLVanBan1, "card2");

        panelQLVBNoiBo1.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVBNoiBo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton97.setText("Văn bản nội bộ");

        jButton98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton98.setText("Danh sách văn bản nội bộ");

        jButton99.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton99.setText("Phòng ban");

        javax.swing.GroupLayout panelQLVBNoiBo1Layout = new javax.swing.GroupLayout(panelQLVBNoiBo1);
        panelQLVBNoiBo1.setLayout(panelQLVBNoiBo1Layout);
        panelQLVBNoiBo1Layout.setHorizontalGroup(
            panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton99, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelQLVBNoiBo1Layout.setVerticalGroup(
            panelQLVBNoiBo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBo1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pnChuaCacCard1.add(panelQLVBNoiBo1, "card4");

        panelTimThong1.setBackground(new java.awt.Color(204, 255, 255));
        panelTimThong1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm - Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/seo-report.png"))); // NOI18N
        jButton100.setText("Thống kê văn bản đến");

        jButton101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        jButton101.setText("Thống kê văn bản nội bộ");
        jButton101.setToolTipText("");

        jButton102.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analytics.png"))); // NOI18N
        jButton102.setText("Thống kê văn bản đi");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton101, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jButton102, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTimThong1Layout = new javax.swing.GroupLayout(panelTimThong1);
        panelTimThong1.setLayout(panelTimThong1Layout);
        panelTimThong1Layout.setHorizontalGroup(
            panelTimThong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimThong1Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTimThong1Layout.setVerticalGroup(
            panelTimThong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimThong1Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(ThanhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThanhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setRequestFocusEnabled(false);

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
                .addGap(0, 0, 0)
                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 569, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(525, 525, 525))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addContainerGap(146, Short.MAX_VALUE))
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
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
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

        btnSoVanBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSoVanBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/text-box.png"))); // NOI18N
        btnSoVanBan.setText("Số văn bản");
        btnSoVanBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSoVanBanMouseClicked(evt);
            }
        });
        btnSoVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoVanBanActionPerformed(evt);
            }
        });

        btnNoiBanHanh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNoiBanHanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/location.png"))); // NOI18N
        btnNoiBanHanh.setText("Nơi ban hành");

        btnVanBanDen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVanBanDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/go-to-location.png"))); // NOI18N
        btnVanBanDen.setText("Văn bản đến");

        btnLoaiVanBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoaiVanBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/chat.png"))); // NOI18N
        btnLoaiVanBan.setText("Loại văn bản");

        btnDSDen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDSDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous (1).png"))); // NOI18N
        btnDSDen.setText("Danh sách văn bản đến");

        btnDSDi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDSDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/previous.png"))); // NOI18N
        btnDSDi.setText("Danh sách văn bản đi");

        btnVanBanDi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVanBanDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/back.png"))); // NOI18N
        btnVanBanDi.setText("Văn bản đi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVanBanDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNoiBanHanh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSoVanBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDSDi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(btnLoaiVanBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(btnVanBanDi, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(btnDSDen, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSoVanBan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoaiVanBan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoiBanHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVanBanDi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDSDen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDSDi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelQLVanBan.add(jPanel6, "card2");

        pnChuaCacCard.add(panelQLVanBan, "card2");

        panelQLVBNoiBo.setBackground(new java.awt.Color(204, 255, 255));
        panelQLVBNoiBo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý văn bản nội bộ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/encrypted.png"))); // NOI18N
        jButton26.setText("Văn bản nội bộ");

        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/compliant.png"))); // NOI18N
        jButton27.setText("Danh sách văn bản nội bộ");

        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/security.png"))); // NOI18N
        jButton28.setText("Phòng ban");

        javax.swing.GroupLayout panelQLVBNoiBoLayout = new javax.swing.GroupLayout(panelQLVBNoiBo);
        panelQLVBNoiBo.setLayout(panelQLVBNoiBoLayout);
        panelQLVBNoiBoLayout.setHorizontalGroup(
            panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelQLVBNoiBoLayout.setVerticalGroup(
            panelQLVBNoiBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLVBNoiBoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pnChuaCacCard.add(panelQLVBNoiBo, "card4");

        panelTimThong.setBackground(new java.awt.Color(204, 255, 255));
        panelTimThong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm - Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/seo-report.png"))); // NOI18N
        jButton29.setText("Thống kê văn bản đến");

        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analysis.png"))); // NOI18N
        jButton30.setText("Thống kê văn bản nội bộ");
        jButton30.setToolTipText("");

        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/analytics.png"))); // NOI18N
        jButton32.setText("Thống kê văn bản đi");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        menu.setPreferredSize(new java.awt.Dimension(1371, 500));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jButton9.setText("Tải lại");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jButton13.setText("Excel");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách sổ văn bản"));

        tblSoVanBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Sổ văn bản", "Số đến", "Năm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSoVanBan);

        jLabel2.setText("Năm");

        cboNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboNamMouseClicked(evt);
            }
        });
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSoVanBanLayout = new javax.swing.GroupLayout(panelSoVanBan);
        panelSoVanBan.setLayout(panelSoVanBanLayout);
        panelSoVanBanLayout.setHorizontalGroup(
            panelSoVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSoVanBanLayout.createSequentialGroup()
                .addGroup(panelSoVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSoVanBanLayout.setVerticalGroup(
            panelSoVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSoVanBanLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.addTab("Sổ văn bản", panelSoVanBan);

        btnThemLoai.setText("Thêm");
        btnThemLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiActionPerformed(evt);
            }
        });

        btnTaiLaiLoai.setText("Tải lại");
        btnTaiLaiLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiLoaiMouseClicked(evt);
            }
        });

        btnXoaLoai.setText("Xóa");
        btnXoaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLoaiActionPerformed(evt);
            }
        });

        btnLuuLoai.setText("Lưu");
        btnLuuLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuLoaiMouseClicked(evt);
            }
        });
        btnLuuLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuLoaiActionPerformed(evt);
            }
        });

        jButton17.setText("Excel");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách loại văn bản"));

        tblLoaiVanBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã loại", "Loại văn bản", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLoaiVanBan);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLoaiVanBanLayout = new javax.swing.GroupLayout(panelLoaiVanBan);
        panelLoaiVanBan.setLayout(panelLoaiVanBanLayout);
        panelLoaiVanBanLayout.setHorizontalGroup(
            panelLoaiVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoaiVanBanLayout.createSequentialGroup()
                .addGroup(panelLoaiVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLoaiVanBanLayout.setVerticalGroup(
            panelLoaiVanBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoaiVanBanLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.addTab("Loại văn bản", panelLoaiVanBan);

        brnThemNoi.setText("Thêm");
        brnThemNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnThemNoiActionPerformed(evt);
            }
        });

        btnTaiLaiNoi.setText("Tải lại");
        btnTaiLaiNoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiNoiMouseClicked(evt);
            }
        });
        btnTaiLaiNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiNoiActionPerformed(evt);
            }
        });

        btnXoaNoi.setText("Xóa");
        btnXoaNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNoiActionPerformed(evt);
            }
        });

        btnLuuNoi.setText("Lưu");
        btnLuuNoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuNoiMouseClicked(evt);
            }
        });
        btnLuuNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuNoiActionPerformed(evt);
            }
        });

        jButton21.setText("Excel");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(brnThemNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoaNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnThemNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách nơi ban hành"));

        tblNoiBanHanh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Nơi ban hành", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblNoiBanHanh);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNoiBanHanhLayout = new javax.swing.GroupLayout(panelNoiBanHanh);
        panelNoiBanHanh.setLayout(panelNoiBanHanhLayout);
        panelNoiBanHanhLayout.setHorizontalGroup(
            panelNoiBanHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoiBanHanhLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoiBanHanhLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNoiBanHanhLayout.setVerticalGroup(
            panelNoiBanHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoiBanHanhLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.addTab("Nơi ban hành", panelNoiBanHanh);

        btnThemVanBanDen.setText("Thêm");
        btnThemVanBanDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVanBanDenActionPerformed(evt);
            }
        });

        btnTaiLaiNoi1.setText("Tải lại");
        btnTaiLaiNoi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiNoi1MouseClicked(evt);
            }
        });

        btnLuuVanBanDen.setText("Lưu");
        btnLuuVanBanDen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuVanBanDenMouseClicked(evt);
            }
        });
        btnLuuVanBanDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuVanBanDenActionPerformed(evt);
            }
        });

        jButton25.setText("Excel");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnThemVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiNoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(846, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiNoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("Văn bản đến"));

        jLabel3.setText("Sổ văn bản");

        jLabel4.setText("Ngày ban hành");

        jLabel5.setText("Số ký hiệu");

        jLabel6.setText("Nơi ban hành");

        jLabel7.setText("Loại văn bản");

        jLabel8.setText("Ngày đến");

        jLabel9.setText("Số đến");

        jLabel10.setText("Số trang");

        jLabel12.setText("Người nhận");

        jLabel13.setText("Người ký");

        jLabel14.setText("Người duyệt");

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Phê duyệt xử lý nội bộ"));

        jLabel11.setText("Chưa duyệt");

        jLabel15.setText("Người duyệt");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateNgayBanHanhDen.setDateFormatString("dd/MM/yyyy");

        dateNgayDen.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNoiBanHanhDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoKyHieuDen)
                            .addComponent(cboSoVanBanDen, 0, 152, Short.MAX_VALUE)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateNgayBanHanhDen, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoTrangDen)
                                    .addComponent(dateNgayDen, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoDen, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(cboLoaiVanBanDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNguoiNhanDen)
                        .addComponent(txtNguoiDuyetDen, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addComponent(txtNguoiKyDen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboSoVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLoaiVanBanDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoKyHieuDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSoDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtNguoiKyDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateNgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(dateNgayBanHanhDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboNoiBanHanhDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtSoTrangDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(txtNguoiNhanDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNguoiDuyetDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder("Trích yếu"));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Nội dung"));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder("Đính kèm file"));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelVanBanDenLayout = new javax.swing.GroupLayout(panelVanBanDen);
        panelVanBanDen.setLayout(panelVanBanDenLayout);
        panelVanBanDenLayout.setHorizontalGroup(
            panelVanBanDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelVanBanDenLayout.createSequentialGroup()
                .addGroup(panelVanBanDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelVanBanDenLayout.setVerticalGroup(
            panelVanBanDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVanBanDenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Văn bản đến", panelVanBanDen);

        brnThemNoi2.setText("Thêm");
        brnThemNoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnThemNoi2ActionPerformed(evt);
            }
        });

        btnTaiLaiNoi2.setText("Tải lại");
        btnTaiLaiNoi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiNoi2MouseClicked(evt);
            }
        });

        btnXoaNoi2.setText("Xóa");
        btnXoaNoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNoi2ActionPerformed(evt);
            }
        });

        btnLuuNoi2.setText("Lưu");
        btnLuuNoi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuNoi2MouseClicked(evt);
            }
        });
        btnLuuNoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuNoi2ActionPerformed(evt);
            }
        });

        jButton35.setText("Excel");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(brnThemNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoaNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnThemNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder("Văn bản đi"));

        jLabel16.setText("Sổ văn bản");

        jLabel17.setText("Ngày ban hành");

        jLabel18.setText("Số ký hiệu");

        jLabel19.setText("Nơi nhận");

        jLabel20.setText("Loại văn bản");

        jLabel21.setText("Số lượng bản");

        jLabel22.setText("Số đi");

        jLabel23.setText("Số trang");

        jLabel24.setText("Người gửi");

        jLabel25.setText("Người ký");

        jLabel26.setText("Người duyệt");

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder("Phê duyệt xử lý nội bộ"));

        jLabel27.setText("Chưa duyệt");

        jLabel28.setText("Người duyệt");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel27)
                .addGap(32, 32, 32)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSoKiHieuDi.setPreferredSize(new java.awt.Dimension(80, 22));

        cboSoVanBanDi.setName(""); // NOI18N
        cboSoVanBanDi.setPreferredSize(new java.awt.Dimension(80, 22));

        dateNgayBanHanhDi.setDateFormatString("dd/MM/yyyy");
        dateNgayBanHanhDi.setPreferredSize(new java.awt.Dimension(80, 22));

        cboLoaiVanBanDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtSoLuongBanDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtSoTrangDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtNguoiGuiDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtNguoiDuyetDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtNguoiKyDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtNoiNhanDi.setPreferredSize(new java.awt.Dimension(80, 22));

        txtSoDi.setPreferredSize(new java.awt.Dimension(80, 22));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSoKiHieuDi, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(cboSoVanBanDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dateNgayBanHanhDi, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoiNhanDi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoDi, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(cboLoaiVanBanDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTrangDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoLuongBanDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel24))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNguoiKyDi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNguoiGuiDi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNguoiDuyetDi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cboLoaiVanBanDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cboSoVanBanDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtSoKiHieuDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)
                            .addComponent(txtNguoiKyDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(dateNgayBanHanhDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel23)
                            .addComponent(txtSoTrangDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoiNhanDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoLuongBanDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNguoiGuiDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNguoiDuyetDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder("Trích yếu"));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder("Nội dung"));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder("Đính kèm file"));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelVanBanDiLayout = new javax.swing.GroupLayout(panelVanBanDi);
        panelVanBanDi.setLayout(panelVanBanDiLayout);
        panelVanBanDiLayout.setHorizontalGroup(
            panelVanBanDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelVanBanDiLayout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVanBanDiLayout.setVerticalGroup(
            panelVanBanDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVanBanDiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Văn bản đi", panelVanBanDi);

        brnThemNoi3.setText("Thêm");
        brnThemNoi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnThemNoi3ActionPerformed(evt);
            }
        });

        btnTaiLaiNoi3.setText("Tải lại");
        btnTaiLaiNoi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiNoi3MouseClicked(evt);
            }
        });

        btnXoaNoi3.setText("Xóa");
        btnXoaNoi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNoi3ActionPerformed(evt);
            }
        });

        btnLuuNoi3.setText("Lưu");
        btnLuuNoi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuNoi3MouseClicked(evt);
            }
        });
        btnLuuNoi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuNoi3ActionPerformed(evt);
            }
        });

        jButton39.setText("Excel");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(brnThemNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoaNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnThemNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuNoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn thời gian lọc thông tin"));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách văn bản đến"));

        tblDanhSachVanBanDen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Sổ văn bản", "Loại văn bản", "Sổ ký hiệu", "Sổ đến", "Ngày ban hành", "Ngày đến", "Đơn vị gửi", "Trích yếu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblDanhSachVanBanDen);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDanhSachDenLayout = new javax.swing.GroupLayout(panelDanhSachDen);
        panelDanhSachDen.setLayout(panelDanhSachDenLayout);
        panelDanhSachDenLayout.setHorizontalGroup(
            panelDanhSachDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachDenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelDanhSachDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDanhSachDenLayout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDanhSachDenLayout.createSequentialGroup()
                        .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDanhSachDenLayout.createSequentialGroup()
                        .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelDanhSachDenLayout.setVerticalGroup(
            panelDanhSachDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachDenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Danh sách văn bản đến", panelDanhSachDen);

        brnThemNoi4.setText("Thêm");
        brnThemNoi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnThemNoi4ActionPerformed(evt);
            }
        });

        btnTaiLaiNoi4.setText("Tải lại");
        btnTaiLaiNoi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaiLaiNoi4MouseClicked(evt);
            }
        });

        btnXoaNoi4.setText("Xóa");
        btnXoaNoi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNoi4ActionPerformed(evt);
            }
        });

        btnLuuNoi4.setText("Lưu");
        btnLuuNoi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuNoi4MouseClicked(evt);
            }
        });
        btnLuuNoi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuNoi4ActionPerformed(evt);
            }
        });

        jButton43.setText("Excel");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(brnThemNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLuuNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnXoaNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTaiLaiNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnThemNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLaiNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuNoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn thời gian lọc thông tin"));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách văn bản đi"));

        tblLoaiVanBan8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Sổ văn bản", "Loại văn bản", "Sổ ký hiệu", "Số đi", "Ngày ban hành", "Nơi nhận", "Trích yếu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblLoaiVanBan8);
        if (tblLoaiVanBan8.getColumnModel().getColumnCount() > 0) {
            tblLoaiVanBan8.getColumnModel().getColumn(1).setHeaderValue("Mã");
        }

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDanhSachDiLayout = new javax.swing.GroupLayout(panelDanhSachDi);
        panelDanhSachDi.setLayout(panelDanhSachDiLayout);
        panelDanhSachDiLayout.setHorizontalGroup(
            panelDanhSachDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachDiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelDanhSachDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDanhSachDiLayout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDanhSachDiLayout.createSequentialGroup()
                        .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelDanhSachDiLayout.setVerticalGroup(
            panelDanhSachDiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachDiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        menu.addTab("Danh sách văn bản đi", panelDanhSachDi);

        javax.swing.GroupLayout ThanhMenuLayout = new javax.swing.GroupLayout(ThanhMenu);
        ThanhMenu.setLayout(ThanhMenuLayout);
        ThanhMenuLayout.setHorizontalGroup(
            ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChuaCacCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        ThanhMenuLayout.setVerticalGroup(
            ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ThanhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThanhMenuLayout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ThanhMenuLayout.createSequentialGroup()
                        .addComponent(pnChuaCacCard, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ThanhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ThanhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyCongVan/Images/user.png"))); // NOI18N
        jButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton64MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton64MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton84ActionPerformed

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

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton87ActionPerformed

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

    private void jButton64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseEntered
        jPopupMenu6.show(jButton64, 0, jButton64.getHeight());
    }//GEN-LAST:event_jButton64MouseEntered

    private void jButton64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseExited
        if (!jPopupMenu6.getBounds().contains(evt.getPoint()) &&
            !jButton64.getBounds().contains(evt.getPoint())) {
            jPopupMenu6.setVisible(false);
        }
    }//GEN-LAST:event_jButton64MouseExited

    private void jButton65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseEntered
        // Hiển thị jPopupMenu5 khi chuột di chuyển vào jButton65
        jPopupMenu5.show(jButton65, 0, jButton65.getHeight());
    }//GEN-LAST:event_jButton65MouseEntered

    private void jButton65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseExited
        // Khi chuột rời khỏi jButton65, chỉ ẩn jPopupMenu5 nếu chuột không ở trong jPopupMenu5
        if (!jPopupMenu5.getBounds().contains(evt.getPoint())) {
            jPopupMenu5.setVisible(false);
        }
    }//GEN-LAST:event_jButton65MouseExited

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

    private void btnSoVanBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoVanBanMouseClicked
        FormSoVanBan so=new FormSoVanBan();
        so.show();
        this.dispose();
    }//GEN-LAST:event_btnSoVanBanMouseClicked

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed

        HienThiTable();  
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboNamMouseClicked

        HienThiTable();

    }//GEN-LAST:event_cboNamMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        try {
            DefaultTableModel tablemodel = (DefaultTableModel) tblSoVanBan.getModel(); // Lấy mô hình bảng hiện tại
            boolean isSuccess = true;

            SoVanBanController soController = new SoVanBanController();

            // Duyệt qua từng dòng của bảng
            for (int row = 0; row < tablemodel.getRowCount(); row++) {
                String soVanBan = (String) tablemodel.getValueAt(row, 1);
                Boolean soDen = (Boolean) tablemodel.getValueAt(row, 2);
                Integer nam = (Integer) tablemodel.getValueAt(row, 3);

                if (soVanBan == null || soVanBan.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Sổ văn bản không được để trống tại dòng " + (row + 1), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                SoVanBanModel soVanBanModel = dsvb.get(row);
                int maSo = soVanBanModel.getMaSo();
                soVanBanModel.setSoVanBan(soVanBan);
                soVanBanModel.setSoDen(soDen);
                soVanBanModel.setNam(nam);

                int result;
                if (maSo == 0) {
                    // Bản ghi mới -> gọi hàm Them
                    result = soController.Them(soVanBanModel);
                } else {
                    // Bản ghi cũ -> gọi hàm Luu
                    result = soController.Luu(soVanBanModel);
                }

                if (result <= 0) {
                    isSuccess = false;
                    JOptionPane.showMessageDialog(this, "Lưu thất bại tại dòng: " + (row + 1), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi ngoại lệ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // Lấy chỉ số dòng đã chọn trong bảng
        int selectedRow = tblSoVanBan.getSelectedRow();

        // Kiểm tra nếu không có dòng nào được chọn
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Hiển thị hộp thoại xác nhận xóa
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tài liệu này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return;  // Nếu người dùng chọn "No", không thực hiện xóa
        }

        // Lấy đối tượng SoVanBanModel từ danh sách dsvb dựa trên chỉ số dòng
        SoVanBanModel soVanBanModel = dsvb.get(selectedRow); // Lấy đối tượng tại dòng được chọn

        // Tạo controller để gọi phương thức xóa
        SoVanBanController soControl = new SoVanBanController();
        int result = soControl.XoaTaiLieu(soVanBanModel);  // Gọi phương thức xóa tài liệu

        // Kiểm tra kết quả xóa
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Xóa tài liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            // Cập nhật lại bảng sau khi xóa thành công
            dsvb.remove(selectedRow);  // Loại bỏ đối tượng khỏi danh sách dsvb
            HienThiTable(); // Cập nhật lại bảng
        } else {
            JOptionPane.showMessageDialog(this, "Xóa tài liệu thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        HienThiTable();
    }//GEN-LAST:event_jButton9MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
         // Kiểm tra nếu danh sách dsvb là null, cần khởi tạo nó
        if (dsvb == null) {
            dsvb = new ArrayList<>();
        }

        DefaultTableModel tablemodel = (DefaultTableModel) tblSoVanBan.getModel(); // Lấy mô hình bảng hiện tại

        // Kiểm tra nếu bảng đã có một dòng trống, không thêm dòng mới nữa
        if (tablemodel.getRowCount() > 0) {
            Object lastRowData = tablemodel.getValueAt(tablemodel.getRowCount() - 1, 1);
            if (lastRowData == null || ((String) lastRowData).trim().isEmpty()) {
                // Nếu dòng cuối cùng có dữ liệu trống, không thêm dòng mới
                return;
            }
        }

        // Tạo đối tượng mới với giá trị mặc định
        SoVanBanModel newSoVanBan = new SoVanBanModel();
        newSoVanBan.setSoVanBan("");  // Giá trị mặc định
        newSoVanBan.setSoDen(false);  // Giá trị mặc định
        newSoVanBan.setNam(Integer.parseInt(cboNam.getSelectedItem().toString())); // Giá trị mặc định

        // Thêm đối tượng vào danh sách dsvb
        dsvb.add(newSoVanBan);
        // Thêm dòng trống vào bảng
        tablemodel.addRow(new Object[] {tablemodel.getRowCount() + 1, "", false, Integer.parseInt(cboNam.getSelectedItem().toString())});
        // Đảm bảo cột STT không được chỉnh sửa, và các cột khác có thể chỉnh sửa
        tblSoVanBan.getColumnModel().getColumn(0).setCellEditor(null); // Cột STT không thể chỉnh sửa
        tblSoVanBan.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JTextField())); // Cột "Sổ Văn Bản" có thể chỉnh sửa
        tblSoVanBan.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox())); // Cột "Sổ Đến" có thể chỉnh sửa (Checkbox)
        tblSoVanBan.getColumnModel().getColumn(3).setCellEditor(null);  // Cột "Năm" có thể chỉnh sửa
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThemLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiActionPerformed
       try {
        // Khởi tạo danh sách nếu chưa tồn tại
        if (dsl == null) {
            dsl = new ArrayList<>();
        }

        // Lấy mô hình bảng
        DefaultTableModel tablemodel = (DefaultTableModel) tblLoaiVanBan.getModel();

        // Kiểm tra nếu bảng đã có một dòng trống, không thêm dòng mới
        if (tablemodel.getRowCount() > 0) {
            Object lastRowData = tablemodel.getValueAt(tablemodel.getRowCount() - 1, 1);
            if (lastRowData == null || lastRowData.toString().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Dòng cuối cùng còn trống. Vui lòng hoàn thành trước khi thêm dòng mới.", 
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // Tạo đối tượng LoaiVanBanModel mới
        LoaiVanBanModel newLoai = new LoaiVanBanModel();
        newLoai.setMaLoai(""); // Giá trị mặc định trống
        newLoai.setLoaiVanBan(""); // Giá trị mặc định
        newLoai.setMoTa(""); // Giá trị mặc định

        // Thêm đối tượng mới vào danh sách
        dsl.add(newLoai);

        // Thêm dòng trống vào bảng
        tablemodel.addRow(new Object[] {
            tablemodel.getRowCount() + 1, // STT
            "",                          // Mã loại
            "",          // Loại văn bản
            ""             // Mô tả
        });

       

    } catch (Exception ex) {
        // Xử lý lỗi chung
        JOptionPane.showMessageDialog(this, 
            "Đã xảy ra lỗi: " + ex.getMessage(), 
            "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnThemLoaiActionPerformed

    private void btnTaiLaiLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiLoaiMouseClicked
        HienThiTableLoaiVanBan();
    }//GEN-LAST:event_btnTaiLaiLoaiMouseClicked
    
    private void btnXoaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLoaiActionPerformed
       try {
        DefaultTableModel model = (DefaultTableModel) tblLoaiVanBan.getModel();
        int rowSelected = tblLoaiVanBan.getSelectedRow();

        // Kiểm tra nếu không có hàng nào được chọn
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tài liệu để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lấy mã loại từ bảng
        String maLoai = tblLoaiVanBan.getValueAt(rowSelected, 1).toString(); // Cột mã loại
        System.out.println(maLoai);

        // Hiển thị hộp thoại xác nhận
        int lc = JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn xóa tài liệu này?", 
            "Xác nhận xóa", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

        if (lc == JOptionPane.YES_OPTION) {
            // Gọi phương thức xóa từ controller
            LoaiVanBanController loaiVBController = new LoaiVanBanController();
            int result = loaiVBController.Xoa(maLoai);

            if (result > 0) {
                // Xóa thành công: cập nhật lại bảng
                JOptionPane.showMessageDialog(this, "Xóa tài liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                HienThiTableLoaiVanBan(); // Hàm cập nhật lại bảng
            } else {
                // Xóa thất bại
                JOptionPane.showMessageDialog(this, "Xóa tài liệu thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception ex) {
        // Xử lý lỗi chung
        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnXoaLoaiActionPerformed

    private void btnLuuLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuLoaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuLoaiMouseClicked

    private void btnLuuLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuLoaiActionPerformed
                
 try {
            DefaultTableModel tablemodel = (DefaultTableModel) tblLoaiVanBan.getModel(); // Lấy mô hình bảng hiện tại
            boolean isSuccess = true;

            LoaiVanBanController loaiController = new LoaiVanBanController();

            // Duyệt qua từng dòng của bảng
            for (int row = 0; row < tablemodel.getRowCount(); row++) {
                String maLoai = (String) tablemodel.getValueAt(row, 1);
                String tenLoai = (String) tablemodel.getValueAt(row, 2);
                String moTa = (String) tablemodel.getValueAt(row, 3);

                if (maLoai == null || maLoai.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Mã loại văn bản không được để trống tại dòng " + (row + 1), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (tenLoai == null || tenLoai.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Loại văn bản không được để trống tại dòng " + (row + 1), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                LoaiVanBanModel loaiVanBanModel = dsl.get(row);
                loaiVanBanModel.setMaLoai(maLoai);
                loaiVanBanModel.setLoaiVanBan(tenLoai);
                loaiVanBanModel.setMoTa(moTa);
                loaiVanBanModel.setDaXoa(false);

                int result;
                if (!loaiController.kiemTraTonTai(maLoai)) {
                    // Bản ghi mới -> gọi hàm Them
                    result = loaiController.Them(loaiVanBanModel);
                } else {
                    // Bản ghi cũ -> gọi hàm Luu
                    result = loaiController.Update(loaiVanBanModel);
                }

                if (result <= 0) {
                    isSuccess = false;
                    JOptionPane.showMessageDialog(this, "Lưu thất bại tại dòng: " + (row + 1), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi ngoại lệ", JOptionPane.ERROR_MESSAGE);
        }                         
    
    }//GEN-LAST:event_btnLuuLoaiActionPerformed

    private void brnThemNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnThemNoiActionPerformed
         // Kiểm tra nếu danh sách dsvb là null, cần khởi tạo nó
        if (dsnoi == null) {
            dsnoi = new ArrayList<>();
        }

        DefaultTableModel tablemodel = (DefaultTableModel) tblNoiBanHanh.getModel(); // Lấy mô hình bảng hiện tại

        // Kiểm tra nếu bảng đã có một dòng trống, không thêm dòng mới nữa
        if (tablemodel.getRowCount() > 0) {
            Object lastRowData = tablemodel.getValueAt(tablemodel.getRowCount() - 1, 1);
            if (lastRowData == null || ((String) lastRowData).trim().isEmpty()) {
                // Nếu dòng cuối cùng có dữ liệu trống, không thêm dòng mới
                return;
            }
        }

        // Tạo đối tượng mới với giá trị mặc định
        NoiBanHanhModel newPlace = new NoiBanHanhModel();
        newPlace.setNoiBanHanh("");  // Giá trị mặc định
        newPlace.setMoTa("");

        // Thêm đối tượng vào danh sách dsvb
        dsnoi.add(newPlace);
        // Thêm dòng trống vào bảng
        tablemodel.addRow(new Object[] {tablemodel.getRowCount() + 1, "", "", ""});
        // Đảm bảo cột STT không được chỉnh sửa, và các cột khác có thể chỉnh sửa
        tblNoiBanHanh.getColumnModel().getColumn(0).setCellEditor(null); 
        tblNoiBanHanh.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JTextField())); 
        tblNoiBanHanh.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JTextField())); 
 
    }//GEN-LAST:event_brnThemNoiActionPerformed

    private void btnTaiLaiNoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiNoiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiNoiMouseClicked

    private void btnXoaNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNoiActionPerformed

        int selectedRow = tblNoiBanHanh.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nơi ban hành cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nơi ban hành này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return; 
        }

        NoiBanHanhModel noiModel = dsnoi.get(selectedRow);
        for(NoiBanHanhModel noi:dsnoi)
        {
            System.out.println(noi.toString());
        }
        NoiBanHanhController noiControl = new NoiBanHanhController();
        int result = noiControl.XoaNoiBanHanh(noiModel);  // Gọi phương thức xóa tài liệu

        // Kiểm tra kết quả xóa
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Xóa tài liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            //dsnoi.remove(selectedRow);
            HienThiTable(); // Cập nhật lại bảng
        } else {
            JOptionPane.showMessageDialog(this, "Xóa tài liệu thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        HienThiTable();
    }//GEN-LAST:event_btnXoaNoiActionPerformed

    private void btnLuuNoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuNoiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoiMouseClicked

    private void btnLuuNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuNoiActionPerformed
        
         try {
            DefaultTableModel tablemodel = (DefaultTableModel) tblNoiBanHanh.getModel(); // Lấy mô hình bảng hiện tại
            boolean isSuccess = true;

            NoiBanHanhController noiController = new NoiBanHanhController();

            // Duyệt qua từng dòng của bảng
            for (int row = 0; row < tablemodel.getRowCount(); row++) {
                String noiBanHanh = (String) tablemodel.getValueAt(row, 1);
                String moTa = (String) tablemodel.getValueAt(row, 2);
                
                if (noiBanHanh == null || noiBanHanh.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Nơi ban hành không được để trống tại dòng " + (row + 1), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                NoiBanHanhModel noiModel = dsnoi.get(row);
                int maNoi = noiModel.getMaNoiBanHanh();
                noiModel.setNoiBanHanh(noiBanHanh);
                noiModel.setMoTa(moTa);
                noiModel.setDaXoa(false);

                int result;
                if (maNoi == 0) {
                    // Bản ghi mới -> gọi hàm Them
                    result = noiController.ThemNoiBanHanh(noiModel);
                } else {
                    // Bản ghi cũ -> gọi hàm Luu
                    result = noiController.CapNhatNoiBanHanh(noiModel);
                }

                if (result <= 0) {
                    isSuccess = false;
                    JOptionPane.showMessageDialog(this, "Lưu thất bại tại dòng: " + (row + 1), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi ngoại lệ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLuuNoiActionPerformed

    private void btnThemVanBanDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVanBanDenActionPerformed
        try
        {
            VanBanDenController vbDenContrl=new VanBanDenController();
            VanBanDenModel vb=new VanBanDenModel();
            int maSo;
            String soKyHieu;
            Date ngayBanHanh;
            int maNoiBanHanh;
            int maLoai;
            int soDen;
            Date ngayDen;
            int soTrang;
            String nguoiNhan;
            String nguoiKy;
            String nguoiDuyet;
            String trichYeu;
            String noiDung;
            String duongDanFile;
            boolean daXoa;
            

                    
                   
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi ngoại lệ", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnThemVanBanDenActionPerformed

    private void btnTaiLaiNoi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiNoi1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiNoi1MouseClicked

    private void btnLuuVanBanDenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuVanBanDenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuVanBanDenMouseClicked

    private void btnLuuVanBanDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuVanBanDenActionPerformed
        VanBanDenController vbden=new VanBanDenController();
    }//GEN-LAST:event_btnLuuVanBanDenActionPerformed

    private void brnThemNoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnThemNoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnThemNoi2ActionPerformed

    private void btnTaiLaiNoi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiNoi2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiNoi2MouseClicked

    private void btnXoaNoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNoi2ActionPerformed

    private void btnLuuNoi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuNoi2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi2MouseClicked

    private void btnLuuNoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuNoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi2ActionPerformed

    private void brnThemNoi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnThemNoi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnThemNoi3ActionPerformed

    private void btnTaiLaiNoi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiNoi3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiNoi3MouseClicked

    private void btnXoaNoi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNoi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNoi3ActionPerformed

    private void btnLuuNoi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuNoi3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi3MouseClicked

    private void btnLuuNoi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuNoi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi3ActionPerformed

    private void brnThemNoi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnThemNoi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnThemNoi4ActionPerformed

    private void btnTaiLaiNoi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiLaiNoi4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaiLaiNoi4MouseClicked

    private void btnXoaNoi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNoi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNoi4ActionPerformed

    private void btnLuuNoi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuNoi4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi4MouseClicked

    private void btnLuuNoi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuNoi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuNoi4ActionPerformed
   
    private void btnSoVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoVanBanActionPerformed
        
    }//GEN-LAST:event_btnSoVanBanActionPerformed

    private void btnTaiLaiNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiNoiActionPerformed
       HienThiTableNoiBanHanh();
    }//GEN-LAST:event_btnTaiLaiNoiActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSoVanBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ThanhMenu;
    private javax.swing.JPanel ThanhMenu1;
    private javax.swing.JButton brnThemNoi;
    private javax.swing.JButton brnThemNoi2;
    private javax.swing.JButton brnThemNoi3;
    private javax.swing.JButton brnThemNoi4;
    private javax.swing.JButton btnDSDen;
    private javax.swing.JButton btnDSDi;
    private javax.swing.JButton btnHeThong;
    private javax.swing.JButton btnHeThong1;
    private javax.swing.JButton btnLoaiVanBan;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuuLoai;
    private javax.swing.JButton btnLuuNoi;
    private javax.swing.JButton btnLuuNoi2;
    private javax.swing.JButton btnLuuNoi3;
    private javax.swing.JButton btnLuuNoi4;
    private javax.swing.JButton btnLuuVanBanDen;
    private javax.swing.JButton btnNoiBanHanh;
    private javax.swing.JButton btnQLVBNoiBo;
    private javax.swing.JButton btnQLVBNoiBo1;
    private javax.swing.JButton btnQLVanBan;
    private javax.swing.JButton btnQLVanBan1;
    private javax.swing.JButton btnSoVanBan;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnTaiLai1;
    private javax.swing.JButton btnTaiLaiLoai;
    private javax.swing.JButton btnTaiLaiNoi;
    private javax.swing.JButton btnTaiLaiNoi1;
    private javax.swing.JButton btnTaiLaiNoi2;
    private javax.swing.JButton btnTaiLaiNoi3;
    private javax.swing.JButton btnTaiLaiNoi4;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThemLoai;
    private javax.swing.JButton btnThemVanBanDen;
    private javax.swing.JButton btnTim_Thong;
    private javax.swing.JButton btnTim_Thong1;
    private javax.swing.JButton btnVanBanDen;
    private javax.swing.JButton btnVanBanDi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoaLoai;
    private javax.swing.JButton btnXoaNoi;
    private javax.swing.JButton btnXoaNoi2;
    private javax.swing.JButton btnXoaNoi3;
    private javax.swing.JButton btnXoaNoi4;
    private javax.swing.JComboBox<String> cboLoaiVanBanDen;
    private javax.swing.JComboBox<String> cboLoaiVanBanDi;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboNoiBanHanhDen;
    private javax.swing.JComboBox<String> cboSoVanBanDen;
    private javax.swing.JComboBox<String> cboSoVanBanDi;
    private com.toedter.calendar.JDateChooser dateNgayBanHanhDen;
    private com.toedter.calendar.JDateChooser dateNgayBanHanhDi;
    private com.toedter.calendar.JDateChooser dateNgayDen;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelButton1;
    private javax.swing.JPanel panelDanhSachDen;
    private javax.swing.JPanel panelDanhSachDi;
    private javax.swing.JPanel panelHeThong;
    private javax.swing.JPanel panelHeThong1;
    private javax.swing.JPanel panelLoaiVanBan;
    private javax.swing.JPanel panelNoiBanHanh;
    private javax.swing.JPanel panelQLVBNoiBo;
    private javax.swing.JPanel panelQLVBNoiBo1;
    private javax.swing.JPanel panelQLVanBan;
    private javax.swing.JPanel panelQLVanBan1;
    private javax.swing.JPanel panelSoVanBan;
    private javax.swing.JPanel panelTimThong;
    private javax.swing.JPanel panelTimThong1;
    private javax.swing.JPanel panelVanBanDen;
    private javax.swing.JPanel panelVanBanDi;
    private javax.swing.JPanel pnChuaCacCard;
    private javax.swing.JPanel pnChuaCacCard1;
    private javax.swing.JTable tblDanhSachVanBanDen;
    private javax.swing.JTable tblLoaiVanBan;
    private javax.swing.JTable tblLoaiVanBan8;
    private javax.swing.JTable tblNoiBanHanh;
    private javax.swing.JTable tblSoVanBan;
    private javax.swing.JTextField txtNguoiDuyetDen;
    private javax.swing.JTextField txtNguoiDuyetDi;
    private javax.swing.JTextField txtNguoiGuiDi;
    private javax.swing.JTextField txtNguoiKyDen;
    private javax.swing.JTextField txtNguoiKyDi;
    private javax.swing.JTextField txtNguoiNhanDen;
    private javax.swing.JTextField txtNoiNhanDi;
    private javax.swing.JTextField txtSoDen;
    private javax.swing.JTextField txtSoDi;
    private javax.swing.JTextField txtSoKiHieuDi;
    private javax.swing.JTextField txtSoKyHieuDen;
    private javax.swing.JTextField txtSoLuongBanDi;
    private javax.swing.JTextField txtSoTrangDen;
    private javax.swing.JTextField txtSoTrangDi;
    // End of variables declaration//GEN-END:variables
}
