package com.example.sondeneme1;

public class Takim {
    private String takimad;
    private String takimligi;
    private int takimlogo;


    public Takim(String takimad, String takimligi, int takimlogo) {
        this.takimad = takimad;
        this.takimligi = takimligi;
        this.takimlogo = takimlogo;
    }

    public String getTakimad() {
        return takimad;
    }
    public void setTakimad(String takimad){this.takimad= takimad;}

    public String getTakimligi() {
        return takimligi;
    }
    public void setTakimligi(String takimligi){this.takimligi= takimligi;}

    public int getTakimlogo() {
        return takimlogo;

    }
    public void setTakimlogo(int takimlogo){this.takimlogo= takimlogo;}
}
