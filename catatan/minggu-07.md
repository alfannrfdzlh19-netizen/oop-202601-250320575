# Catatan Minggu 07: Koleksi

## Yang saya kerjakan

Pada minggu 7, saya mengimplementasikan beberapa method pada class `JadwalPeminjaman`, yaitu `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()`. Saya menggunakan koleksi List dan Map untuk menyimpan serta mengelola data peminjaman. Saya juga membuat pengujian sendiri pada `BatasBentrokTest.java` untuk memastikan peminjaman yang waktunya berurutan tidak dianggap bentrok. Setelah selesai, saya menjalankan seluruh pengujian sampai minggu 7 dan semua tes berhasil.

## Keputusan desain

Saya menggunakan List untuk menyimpan daftar peminjaman dan Map untuk mengelompokkan peminjaman berdasarkan kode aset. Saya menggunakan Comparator untuk mengurutkan peminjaman berdasarkan waktu mulai. Untuk aturan bentrok, saya memutuskan bahwa dua peminjaman tidak dianggap bentrok apabila waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman kedua. Keputusan ini dicatat pada `docs/asumsi.md` bagian A-08.

## Kendala

Kendala yang saya temui adalah menentukan aturan batas waktu bentrok dan memastikan tes buatan sendiri ikut dijalankan. Saya mengatasinya dengan membuat keputusan pada `docs/asumsi.md` dan menambahkan tag `week7` pada `BatasBentrokTest.java`. Saya juga menggunakan perintah `.\scripts\uji.ps1 -Minggu 7` agar pengujian minggu 7 ikut dijalankan.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi method pada class `JadwalPeminjaman.java`, pembuatan tes `BatasBentrokTest.java`, dan pemeriksaan hasil pengujian.
- Prompt utama:
  1. Bagaimana mengimplementasikan method `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()`?
  2. Bagaimana membuat tes untuk memastikan peminjaman yang waktu selesainya sama dengan waktu mulai peminjaman berikutnya tidak dianggap bentrok?
  3. Bagaimana menjalankan pengujian khusus sampai minggu 7?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menentukan sendiri bahwa waktu selesai yang sama dengan waktu mulai berikutnya tidak dianggap bentrok. Keputusan tersebut saya catat pada `docs/asumsi.md`.
- Satu hal yang saya pahami lebih baik sekarang: Saya memahami penggunaan List, Map, dan Comparator serta cara menentukan apakah dua rentang waktu peminjaman saling bertabrakan.