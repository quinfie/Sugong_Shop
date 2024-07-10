package model;

import java.util.Date;

public class DonDatHangDTO {

    private int maDatHang;
    private Date ngayDatHang;
    private String maKhachHang;
    private String nguoiPhuTrach;
    private String trangThaiDonHang;
    private float thanhTien;

    public DonDatHangDTO() {
    }

    public DonDatHangDTO(int maDatHang, Date ngayDatHang, String maKhachHang, String nguoiPhuTrach, String trangThaiDonHang, float thanhTien) {
        this.maDatHang = maDatHang;
        this.ngayDatHang = ngayDatHang;
        this.maKhachHang = maKhachHang;
        this.nguoiPhuTrach = nguoiPhuTrach;
        this.trangThaiDonHang = trangThaiDonHang;
        this.thanhTien = thanhTien;
    }

    // Getters and Setters
    public int getMaDatHang() {
        return maDatHang;
    }

    public void setMaDatHang(int maDatHang) {
        this.maDatHang = maDatHang;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
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

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
}
