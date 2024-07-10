package model;

public class TaiKhoanDangNhapDTO {

    private String tenDangNhap;
    private String matKhau;
    private int vaiTro;
    private String maNguoiDung;

    public TaiKhoanDangNhapDTO() {
        // Khởi tạo mặc định
    }

    public TaiKhoanDangNhapDTO(String tenDangNhap, String matKhau, int vaiTro, String maNguoiDung) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.maNguoiDung = maNguoiDung;
    }

    // Getter và setter cho các thuộc tính
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

}
