# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya mengimplementasikan metode `hitungDenda(int)` pada kelas `Aset`, `Ruang`, `Laptop`, dan `AlatLab`. Perhitungan denda menggunakan tarif dasar dari `Varian.aktif().dendaPerHari`, dengan pengali 1 untuk ruang, 2 untuk laptop, dan 4 untuk alat laboratorium. Saya juga melengkapi dua metode `cari()` pada `KatalogAset` untuk mencari aset berdasarkan nama dan jenis aset. Setelah selesai, saya menjalankan tes Minggu 1 sampai 4 dan seluruh 27 tes berhasil tanpa kegagalan atau error.

## Keputusan desain
Saya menggunakan overriding pada metode `hitungDenda(int)` untuk menerapkan pengali denda yang berbeda pada setiap jenis aset. Saya menggunakan overloading pada metode `cari()` karena pencarian dapat dilakukan berdasarkan kata saja atau berdasarkan kata dan jenis aset. Pencarian nama tidak membedakan huruf besar dan kecil.

## Kendala
Saya perlu memahami perbedaan overriding dan overloading serta menentukan bagian kode yang harus diubah tanpa mengganggu materi minggu berikutnya. Saya mengatasinya dengan memeriksa struktur kelas, mengimplementasikan metode sesuai aturan tugas, dan menjalankan tes otomatis.

## Penggunaan AI
- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: `Aset.java`, `Ruang.java`, `Laptop.java`, `AlatLab.java`, dan `KatalogAset.java`.
- Prompt utama:
  1. Membantu mengimplementasikan `hitungDenda(int)` sesuai aturan Minggu 4.
  2. Membantu mengimplementasikan dua overload `cari()` yang tidak membedakan huruf besar dan kecil.
  3. Membantu menjelaskan langkah perubahan kode dan menjalankan tes Minggu 4.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mengikuti saran implementasi yang diberikan dan memeriksa hasilnya melalui tes otomatis.
- Satu hal yang saya pahami lebih baik sekarang: Overriding memungkinkan subclass memiliki implementasi metode yang berbeda, sedangkan overloading memungkinkan beberapa metode memiliki nama sama dengan parameter berbeda.