# Catatan Minggu 02: Struktur OOP - Class, Object, Encapsulation

## Yang saya kerjakan

Pada minggu kedua, saya melengkapi class `Aset` dengan menerapkan konsep enkapsulasi. Saya membuat field menjadi `private`, menambahkan konstruktor, getter, dan setter untuk mengatur akses terhadap data aset. Saya juga menambahkan validasi agar kode dan nama aset tidak boleh kosong, serta status dan kondisi tidak boleh bernilai `null`. Setelah itu, saya menjalankan pengujian Minggu 1 dan Minggu 2 menggunakan skrip pengujian PowerShell.

## Keputusan desain

Saya memilih menggunakan `private final String kode` agar kode aset tidak dapat diubah setelah objek dibuat. Field `nama` tetap dapat diubah melalui setter, sedangkan status dan kondisi memiliki nilai awal `TERSEDIA` dan `BAIK`.

Saya juga memilih melakukan normalisasi dengan `trim()` pada kode dan nama untuk menghapus spasi di awal dan akhir teks. Saya tidak mengubah huruf menjadi huruf besar karena aturan tugas tidak mewajibkannya.

## Kendala

Awalnya, pengujian hanya menjalankan tes Minggu 1 karena file `minggu-aktif.txt` masih berisi angka `1`. Saya mengatasinya dengan menjalankan perintah `.\scripts\uji.ps1 -Minggu 2` agar pengujian Minggu 1 dan Minggu 2 dijalankan bersama. Hasil pengujian menunjukkan bahwa seluruh 11 tes berhasil tanpa kegagalan.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi field, konstruktor, getter, setter, validasi pada class `Aset`, serta pemahaman terhadap skrip pengujian.
- Prompt utama:
  1. Jelaskan cara melengkapi class `Aset` sesuai aturan tugas Minggu 2.
  2. Bagaimana cara membuat getter dan setter dengan validasi?
  3. Bagaimana cara menjalankan pengujian khusus sampai Minggu 2 menggunakan PowerShell?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mengikuti pendekatan perubahan bertahap pada bagian yang masih TODO agar struktur kode yang sudah ada tetap terjaga. Saya memilih menggunakan `trim()` tanpa mengubah huruf menjadi kapital karena normalisasi tersebut sudah cukup untuk menghapus spasi di awal dan akhir.
- Satu hal yang saya pahami lebih baik sekarang: Enkapsulasi membatasi akses langsung terhadap field melalui modifier `private`. Getter digunakan untuk membaca data, sedangkan setter digunakan untuk mengubah data dengan tetap menerapkan validasi.