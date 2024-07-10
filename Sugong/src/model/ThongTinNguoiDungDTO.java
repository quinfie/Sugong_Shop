package model;

import java.sql.Date;

public class ThongTinNguoiDungDTO {

    private String maNguoiDung;
    private String tenNguoiDung;
    private String gioiTinh;
    private Date ngaySinh;
    private String cccd;
    private String diaChi;
    private String sdt;

    public ThongTinNguoiDungDTO() {
    }

    public ThongTinNguoiDungDTO(String maNguoiDung, String tenNguoiDung, String gioiTinh, Date ngaySinh, String cccd, String diaChi, String sdt) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
