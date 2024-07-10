package model;

public class BanDTO {

    private int maBan;
    private String tinhTrangBan;

    public BanDTO(int maBan, String tinhTrangBan) {
        this.maBan = maBan;
        this.tinhTrangBan = tinhTrangBan;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public String getTinhTrangBan() {
        return tinhTrangBan;
    }

    public void setTinhTrangBan(String tinhTrangBan) {
        this.tinhTrangBan = tinhTrangBan;
    }
}
