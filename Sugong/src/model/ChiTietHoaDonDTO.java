package model;

public class ChiTietHoaDonDTO {

    private int maHoaDon;
    private int maMon;
    private int soLuongMon;

    // Constructor
    public ChiTietHoaDonDTO(int maHoaDon, int maMon, int soLuongMon) {
        this.maHoaDon = maHoaDon;
        this.maMon = maMon;
        this.soLuongMon = soLuongMon;
    }

    // Getters and Setters
    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getSoLuongMon() {
        return soLuongMon;
    }

    public void setSoLuongMon(int soLuongMon) {
        this.soLuongMon = soLuongMon;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonDTO{"
                + "maHoaDon=" + maHoaDon
                + ", maMon=" + maMon
                + ", soLuongMon=" + soLuongMon
                + '}';
    }
}
