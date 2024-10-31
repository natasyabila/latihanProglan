package org.example;

// Class InfoPemesanan (Introduce Parameter Object)
public class InfoPemesanan {
    private String nama;
    private String asal;
    private String tujuan;

    public InfoPemesanan(String nama, String asal, String tujuan) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }
}
