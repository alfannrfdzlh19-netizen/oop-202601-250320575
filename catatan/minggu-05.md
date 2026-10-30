# Catatan Minggu 05: Abstraction

## Yang saya kerjakan

Pada minggu ini saya mengubah kelas `Aset` menjadi abstract class dan menjadikan metode `hitungDenda()` sebagai metode abstrak. Saya juga mengimplementasikan interface `AturanDenda` pada kelas `DendaFlat` dan `DendaProgresif`. Selain itu, saya mengisi metode `bisaDipinjam()` sesuai ketentuan tugas dan menjalankan pengujian Minggu 1 sampai Minggu 5 dengan hasil seluruh 32 tes berhasil.

## Keputusan desain

Saya menggunakan abstract class pada `Aset` karena kelas tersebut menjadi dasar bagi berbagai jenis aset. Metode `hitungDenda()` dibuat abstrak agar setiap kelas turunan dapat memiliki implementasi perhitungan denda. Untuk denda progresif, saya menggunakan rumus denda flat ditambah jumlah hari keterlambatan dikalikan tarif harian. Keputusan rumus ini dicatat dalam `docs/asumsi.md`.

## Kendala

Kendala yang saya temui adalah menentukan rumus denda progresif yang memenuhi ketentuan pengujian. Saya mengatasinya dengan menggunakan rumus tambahan denda berdasarkan jumlah hari keterlambatan dan tarif harian. Saya juga perlu mengubah `minggu-aktif.txt` dari 4 menjadi 5 agar pengujian Minggu 5 ikut dijalankan.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: `Aset.java`, `DendaFlat.java`, `DendaProgresif.java`, dan pencatatan rumus pada `docs/asumsi.md`.
- Prompt utama:
  1. Bagaimana menjadikan metode `hitungDenda()` sebagai metode abstrak?
  2. Bagaimana mengimplementasikan metode `hitung()` pada `DendaFlat` dan `DendaProgresif`?
  3. Bagaimana menentukan rumus denda progresif sesuai aturan pengujian?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan penulisan dokumentasi asumsi agar mengikuti format yang sudah digunakan dalam file `docs/asumsi.md`.
- Satu hal yang saya pahami lebih baik sekarang: Abstract class dapat digunakan sebagai kelas dasar yang memiliki metode abstrak, sedangkan interface digunakan untuk menentukan kontrak perilaku yang harus diimplementasikan oleh kelas.