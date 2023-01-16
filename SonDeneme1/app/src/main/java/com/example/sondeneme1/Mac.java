package com.example.sondeneme1;

public class Mac {
    String tarih;
    String yer;
    int takimlogo1;
    int takimlogo2;

    public Mac(String tarih, String yer, int takimlogo1, int takimlogo2) {
        this.tarih = tarih;
        this.yer = yer;
        this.takimlogo1 = takimlogo1;
        this.takimlogo2 = takimlogo2;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public int getTakimlogo1() {
        return takimlogo1;
    }

    public void setTakimlogo1(int takimlogo1) {
        this.takimlogo1 = takimlogo1;
    }

    public int getTakimlogo2() {
        return takimlogo2;
    }

    public void setTakimlogo2(int takimlogo2) {
        this.takimlogo2 = takimlogo2;
    }
}
