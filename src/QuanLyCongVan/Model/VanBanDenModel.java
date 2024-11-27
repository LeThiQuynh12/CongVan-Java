/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCongVan.Model;

import java.util.Date;

public class VanBanDenModel {
    private int id;
    private int maSo;
    private String soKyHieu;
    private Date ngayBanHanh;
    private int maNoiBanHanh;
    private int maLoai;
    private int soDen;
    private Date ngayDen;
    private int soTrang;
    private String nguoiNhan;
    private String nguoiKy;
    private String nguoiDuyet;
    private String trichYeu;
    private String noiDung;
    private String duongDanFile;
    private boolean daXoa;

    public VanBanDenModel() {
    }

    public VanBanDenModel(int id, int maSo, String soKyHieu, Date ngayBanHanh, int maNoiBanHanh, int maLoai, int soDen, Date ngayDen, int soTrang, String nguoiNhan, String nguoiKy, String nguoiDuyet, String trichYeu, String noiDung, String duongDanFile, boolean daXoa) {
        this.id = id;
        this.maSo = maSo;
        this.soKyHieu = soKyHieu;
        this.ngayBanHanh = ngayBanHanh;
        this.maNoiBanHanh = maNoiBanHanh;
        this.maLoai = maLoai;
        this.soDen = soDen;
        this.ngayDen = ngayDen;
        this.soTrang = soTrang;
        this.nguoiNhan = nguoiNhan;
        this.nguoiKy = nguoiKy;
        this.nguoiDuyet = nguoiDuyet;
        this.trichYeu = trichYeu;
        this.noiDung = noiDung;
        this.duongDanFile = duongDanFile;
        this.daXoa = daXoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getSoKyHieu() {
        return soKyHieu;
    }

    public void setSoKyHieu(String soKyHieu) {
        this.soKyHieu = soKyHieu;
    }

    public Date getNgayBanHanh() {
        return ngayBanHanh;
    }

    public void setNgayBanHanh(Date ngayBanHanh) {
        this.ngayBanHanh = ngayBanHanh;
    }

    public int getMaNoiBanHanh() {
        return maNoiBanHanh;
    }

    public void setMaNoiBanHanh(int maNoiBanHanh) {
        this.maNoiBanHanh = maNoiBanHanh;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getSoDen() {
        return soDen;
    }

    public void setSoDen(int soDen) {
        this.soDen = soDen;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public String getNguoiKy() {
        return nguoiKy;
    }

    public void setNguoiKy(String nguoiKy) {
        this.nguoiKy = nguoiKy;
    }

    public String getNguoiDuyet() {
        return nguoiDuyet;
    }

    public void setNguoiDuyet(String nguoiDuyet) {
        this.nguoiDuyet = nguoiDuyet;
    }

    public String getTrichYeu() {
        return trichYeu;
    }

    public void setTrichYeu(String trichYeu) {
        this.trichYeu = trichYeu;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getDuongDanFile() {
        return duongDanFile;
    }

    public void setDuongDanFile(String duongDanFile) {
        this.duongDanFile = duongDanFile;
    }

    public boolean isDaXoa() {
        return daXoa;
    }

    public void setDaXoa(boolean daXoa) {
        this.daXoa = daXoa;
    }

    @Override
    public String toString() {
        return "VanBanDenModel{" + "id=" + id + ", maSo=" + maSo + ", soKyHieu=" + soKyHieu + ", ngayBanHanh=" + ngayBanHanh + ", maNoiBanHanh=" + maNoiBanHanh + ", maLoai=" + maLoai + ", soDen=" + soDen + ", ngayDen=" + ngayDen + ", soTrang=" + soTrang + ", nguoiNhan=" + nguoiNhan + ", nguoiKy=" + nguoiKy + ", nguoiDuyet=" + nguoiDuyet + ", trichYeu=" + trichYeu + ", noiDung=" + noiDung + ", duongDanFile=" + duongDanFile + ", daXoa=" + daXoa + '}';
    }
    

}
