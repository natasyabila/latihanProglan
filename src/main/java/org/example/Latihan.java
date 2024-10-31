package org.example;

// Interface Tiket
public interface Latihan {
    double hitungBiayaTiket();
    double hitungDiskon();
    void tampilkanInformasi();
}

// Superclass Pemesanan
class Pemesanan {
    protected String nama;
    protected String asal;
    protected String tujuan;

    public Pemesanan(String nama, String asal, String tujuan) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
    }
}

// Subclass TiketPesawat yang mengimplementasikan Tiket dan mewarisi Pemesanan
class TiketPesawat extends Pemesanan implements Latihan {
    protected double hargaTiket;
    protected double diskon;

    public TiketPesawat(InfoPemesanan info, double hargaTiket, double diskon) {
        super(info.getNama(), info.getAsal(), info.getTujuan());
        this.hargaTiket = hargaTiket;
        this.diskon = diskon;
    }

    @Override
    public double hitungBiayaTiket() {
        return hargaTiket - (hargaTiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return hargaTiket * (diskon / 100);
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}

// Main class untuk menguji
class Main {
    public static void main(String[] args) {
        // Membuat objek InfoPemesanan
        InfoPemesanan infoPemesanan = new InfoPemesanan("Ahmad", "Jakarta", "Bali");

        // Membuat objek TiketPesawat menggunakan InfoPemesanan
        TiketPesawat tiketPesawat = new TiketPesawat(infoPemesanan, 1000000, 10);

        // Menampilkan informasi tiket pesawat
        tiketPesawat.tampilkanInformasi();
    }
}
