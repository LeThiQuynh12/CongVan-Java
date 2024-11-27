/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCongVan.Controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VanBanDiController extends KetNoiCSDL{
    public ArrayList<String> HienThiSoVanBan()
    {
        ArrayList<String> tenso = new ArrayList<>();
        PreparedStatement prst = null;
        ResultSet rs = null;

        try {
            if (conn == null) {
                conn = getConnection();  
            }

            String sql = "SELECT SOVANBAN,NAM FROM SOVANBAN WHERE DAXOA = 0 AND Sovanban = N'Số văn bản đi'";
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
}
