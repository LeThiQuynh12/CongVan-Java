/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCongVan.Controllers;

import QuanLyCongVan.Controllers.KetNoiCSDL;
import QuanLyCongVan.Model.LoaiVanBanModel;
import QuanLyCongVan.Model.SoVanBanModel;
import QuanLyCongVan.Model.VanBanDenModel;
import java.beans.*;
import java.net.SocketAddress;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class VanBanDenController extends KetNoiCSDL{
    public ArrayList<String> HienThiSoVanBan()
    {
        ArrayList<String> tenso = new ArrayList<>();
        PreparedStatement prst = null;
        ResultSet rs = null;

        try {
            if (conn == null) {
                conn = getConnection();  
            }

            String sql = "SELECT SOVANBAN,NAM FROM SOVANBAN WHERE DAXOA = 0 AND Sovanban = N'Số văn bản đến'";
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();

            while (rs.next()) {
                String ten = rs.getString("SOVANBAN"); // Tên cột phải chính xác
                int nam=rs.getInt("Nam");
                System.out.println(ten);
                System.out.println(nam);
                tenso.add(ten+"-"+nam); // Thêm giá trị vào danh sách
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // In lỗi ra console để gỡ lỗi
        }
        return tenso;
    }
    public ArrayList<String> hienThiLoaiVanBan()
    {
        ArrayList<String> loaivb=new ArrayList<String>();
        try
        {
            String sql="SELECT loaiVanBan from LOAIVANBAN";
            PreparedStatement prst=conn.prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                String loai=rs.getString("LOAIVANBAN");
                loaivb.add(loai);
            }
            
        }
        catch (Exception ex) {
            ex.printStackTrace(); // In lỗi ra console để gỡ lỗi
        }
        return loaivb;
    }
    public ArrayList<String> HienThiNoiBanHanh()
    {
        ArrayList<String> dsnoi= new ArrayList<String>();
        try
        {
            String sql="SELECT noiBanHanh from NOIBANHANH";
            PreparedStatement prst=conn.prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                String noi=rs.getString("noibanhanh");
                dsnoi.add(noi);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace(); // In lỗi ra console để gỡ lỗi
        }
        return dsnoi;
    }
//    public String LaySoVanBan()
//    {
//        try
//        {
//            String sovb="";
//            String sql="SELECT SOVANBAN FROM SOVANBAN, VANBANDEN WHERE DAXOA=0 AND SOVANBAN.MASO=VANBANDEN.MASO";
//            PreparedStatement prst=conn.prepareStatement(sql);
//            ResultSet rs=prst.executeQuery();
//            while(rs.next())
//            {
//                
//            }
//        }
//        catch (Exception ex) {
//            ex.printStackTrace(); // In lỗi ra console để gỡ lỗi
//        }
//    }
//    
    public ArrayList<VanBanDenModel> HienThiDanhSachVanBanDen()
    {
        ArrayList<VanBanDenModel> dsden=new ArrayList<VanBanDenModel>();
        try
        {
            String sql="SELECT * FROM VANBANDEN where daXoa=0";
            PreparedStatement prst=conn.prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                VanBanDenModel vbden=new VanBanDenModel();
                vbden.setMaSo(rs.getInt("maSo"));
                vbden.setSoKyHieu("soKyHieu");
                vbden.setNgayBanHanh(rs.getDate("ngayBanHanh"));
                vbden.setMaNoiBanHanh(rs.getInt("maNoiBanHanh"));
                vbden.setMaLoai(rs.getInt("maLoai"));
                vbden.setSoDen(rs.getInt("soDen"));
                vbden.setNgayDen(rs.getDate("ngayDen"));
                vbden.setSoTrang(rs.getInt("soTrang"));
                vbden.setNguoiNhan(rs.getString("nguoiNhan"));
                vbden.setNguoiKy(rs.getString("nguoiKy"));
                vbden.setNguoiDuyet(rs.getString("nguoiDuyet"));
                dsden.add(vbden);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace(); // In lỗi ra console để gỡ lỗi
        }
        return dsden;
    }
    public String layTenSoKiHieu()
    {
        String tenso="";
        //String sql="Select * from sovanban"
        return tenso;
    }
    public int Them(VanBanDenModel vanBan) {
    try {
        // SQL query để thêm một bản ghi vào bảng VANBANDEN
        String sql = "INSERT INTO VANBANDEN (MASO, SOKYHIEU, NGAYBANHANH, MANOIBANHANH, MALOAI, SODEN, NGAYDEN, SOTRANG, NGUOINHAN, NGUOIKY, NGUOIDUYET, TRICHYEU, NOIDUNG, DUONGDANFILE, DAXOA) "
                   + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Chuẩn bị câu lệnh SQL
        PreparedStatement prst = conn.prepareStatement(sql);
        
        // Gán các giá trị từ đối tượng vanBan vào câu lệnh SQL
        prst.setInt(1, vanBan.getMaSo());
        prst.setString(2, vanBan.getSoKyHieu());
        prst.setDate(3, new java.sql.Date(vanBan.getNgayBanHanh().getTime())); // Chuyển đổi Date sang java.sql.Date
        prst.setInt(4, vanBan.getMaNoiBanHanh());
        prst.setInt(5, vanBan.getMaLoai());
        prst.setInt(6, vanBan.getSoDen());
        prst.setDate(7, new java.sql.Date(vanBan.getNgayDen().getTime())); // Chuyển đổi Date sang java.sql.Date
        prst.setInt(8, vanBan.getSoTrang());
        prst.setString(9, vanBan.getNguoiNhan());
        prst.setString(10, vanBan.getNguoiKy());
        prst.setString(11, vanBan.getNguoiDuyet());
        prst.setString(12, vanBan.getTrichYeu());
        prst.setString(13, vanBan.getNoiDung());
        prst.setString(14, vanBan.getDuongDanFile());
        prst.setBoolean(15, vanBan.isDaXoa());  // Giả sử mặc định là false, bạn có thể thay đổi giá trị này khi cần.

        // Thực hiện câu lệnh SQL và trả về số bản ghi bị ảnh hưởng
        return prst.executeUpdate();
    } catch (Exception ex) {
        // In lỗi nếu có
        System.out.println("Lỗi: " + ex.getMessage());
    }
    return -1; // Trả về -1 nếu có lỗi xảy ra
}

}
