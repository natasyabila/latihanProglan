# Latihan Proglan: Pemesanan Tiket Pesawat

Proyek ini adalah simulasi sederhana dari pemesanan tiket pesawat yang melibatkan perhitungan harga tiket, diskon, pajak, dan menyediakan opsi pembatalan tiket. Proyek ini menggunakan konsep OOP (Object-Oriented Programming) dalam bahasa Java dan mengimplementasikan interface untuk memperluas fungsionalitas.

## Fitur

1. **Hitung Biaya Tiket**: Menentukan harga tiket setelah diskon diterapkan.
2. **Hitung Diskon**: Menghitung jumlah diskon berdasarkan persentase yang diberikan.
3. **Hitung Pajak Tiket**: Menghitung pajak sebesar 10% dari harga tiket sebelum diskon.
4. **Total Pembayaran**: Menghitung total yang harus dibayar setelah diskon dan pajak.
5. **Pembatalan Tiket**: Mengatur tiket yang dibatalkan sehingga biaya tiket menjadi 0.

## Struktur Proyek

- **`Latihan` (interface)**: Mengandung metode untuk menghitung biaya tiket, menghitung diskon, dan menampilkan informasi tiket.
- **`Pemesanan` (superclass)**: Menyimpan informasi dasar pemesanan seperti nama penumpang, asal, dan tujuan.
- **`TiketPesawat` (subclass)**: Mengimplementasikan interface `Latihan` dan menambahkan fitur diskon, pajak, total pembayaran, serta pembatalan tiket.

## Persyaratan

- **Java Development Kit (JDK)** versi 8 atau yang lebih baru
- **Git** (untuk mengelola proyek)

## Cara Menjalankan Proyek

1. **Clone Repositori**:
   Jalankan perintah berikut di terminal untuk meng-clone proyek:
   ```bash
   git clone https://github.com/natasyabila/latihanProglan.git
   cd latihanProglan
