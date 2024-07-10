package model;

import java.util.ArrayList;
import java.util.List;

public class GioHang {

    private List<ThucDonDTO> gioHangList;

    public GioHang() {
        gioHangList = new ArrayList<>();
    }

    public List<ThucDonDTO> getGioHangList() {
        return gioHangList;
    }

    public void setGioHangList(List<ThucDonDTO> gioHangList) {
        this.gioHangList = gioHangList;
    }

    public void themMonVaoGioHang(ThucDonDTO mon) {
        gioHangList.add(mon);
    }
}
