package model;

import java.util.Date;

public class HoaDonDTO {

    private int maHoaDon;
    private String maKhachHang;
    private String nguoiPhuTrach;
    private float thanhTien;
    private Date ngay;

    public HoaDonDTO(int maHoaDon, String maKhachHang, String nguoiPhuTrach, float thanhTien, Date ngay) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.nguoiPhuTrach = nguoiPhuTrach;
        this.thanhTien = thanhTien;
        this.ngay = ngay;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNguoiPhuTrach() {
        return nguoiPhuTrach;
    }

    public void setNguoiPhuTrach(String nguoiPhuTrach) {
        this.nguoiPhuTrach = nguoiPhuTrach;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
}
