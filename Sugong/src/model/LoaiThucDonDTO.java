package model;

public class LoaiThucDonDTO {

    private int maLoaiThucDon;
    private String tenLoaiThucDon;

    public LoaiThucDonDTO() {
    }

    public LoaiThucDonDTO(int maLoaiThucDon, String tenLoaiThucDon) {
        this.maLoaiThucDon = maLoaiThucDon;
        this.tenLoaiThucDon = tenLoaiThucDon;
    }

    public int getMaLoaiThucDon() {
        return maLoaiThucDon;
    }

    public void setMaLoaiThucDon(int maLoaiThucDon) {
        this.maLoaiThucDon = maLoaiThucDon;
    }

    public String getTenLoaiThucDon() {
        return tenLoaiThucDon;
    }

    public void setTenLoaiThucDon(String tenLoaiThucDon) {
        this.tenLoaiThucDon = tenLoaiThucDon;
    }
}
