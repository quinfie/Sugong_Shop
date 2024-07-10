/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ChiTietDonHangDTO {

    private int maDatHang;
    private int maMon;
    private int soLuong;

    public ChiTietDonHangDTO(int maDatHang, int maMon, int soLuong) {
        this.maDatHang = maDatHang;
        this.maMon = maMon;
        this.soLuong = soLuong;
    }

    public int getMaDatHang() {
        return maDatHang;
    }

    public void setMaDatHang(int maDatHang) {
        this.maDatHang = maDatHang;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
