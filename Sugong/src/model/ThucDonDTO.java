package model;

public class ThucDonDTO {

    private int maMon;
    private String tenMon;
    private String thanhPhan;
    private int gia;
    private String hinhAnh;
    private int maLoaiThucDon;

    public ThucDonDTO() {
    }

    public ThucDonDTO(int maMon, String tenMon, String thanhPhan, int gia, String hinhAnh, int maLoaiThucDon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.thanhPhan = thanhPhan;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
        this.maLoaiThucDon = maLoaiThucDon;
    }

    // Getters and setters
    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getThanhPhan() {
        return thanhPhan;
    }

    public void setThanhPhan(String thanhPhan) {
        this.thanhPhan = thanhPhan;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getMaLoaiThucDon() {
        return maLoaiThucDon;
    }

    public void setMaLoaiThucDon(int maLoaiThucDon) {
        this.maLoaiThucDon = maLoaiThucDon;
    }
}
