# Catatan Minggu 03: Inheritance

## Yang saya kerjakan

Pada Minggu 3, saya menerapkan inheritance atau pewarisan pada sistem aset pinjam. Saya membuat class `Ruang`, `Laptop`, dan `AlatLab` yang mewarisi atribut serta perilaku dasar dari class induk `Aset`. Setiap subclass memiliki atribut khusus, validasi data, getter, dan implementasi metode `getJenis()` sesuai jenis asetnya. Saya juga menjalankan pengujian Minggu 1 sampai Minggu 3 dan seluruh 19 tes berhasil.

## Keputusan desain

Class `Aset` menyimpan atribut umum yang dimiliki semua aset, yaitu kode, nama, status, dan kondisi. Sementara itu, `Ruang` memiliki atribut `kapasitas`, `Laptop` memiliki `spesifikasi` dan `nomorInventaris`, serta `AlatLab` memiliki `laboratorium` dan `tingkatRisiko`.

Saya menggunakan inheritance karena ketiga jenis aset tersebut memiliki karakteristik umum yang dapat diwariskan dari `Aset`. Field khusus menggunakan `private final` agar tidak dapat diubah setelah objek dibuat, sedangkan validasi dilakukan pada konstruktor untuk menjaga agar data tetap valid. Metode `getJenis()` diimplementasikan pada setiap subclass untuk mengembalikan jenis aset yang sesuai.

Inheritance kurang tepat jika objek hanya membutuhkan fitur dari objek lain tanpa memiliki hubungan pewarisan yang jelas. Contohnya, jika sistem membutuhkan fitur notifikasi untuk aset, lebih tepat menggunakan komposisi dengan menjadikan layanan notifikasi sebagai objek terpisah daripada membuat class aset mewarisi class notifikasi.

## Kendala

Saya sempat mengalami kesalahan penulisan pada metode `getKapasitas()` di class `Ruang`, karena sebagian kode lama tidak terhapus ketika mengganti isi metode. Saya mengatasinya dengan mengganti isi metode menjadi `return kapasitas;`, kemudian memeriksa ulang kode dan menjalankan pengujian. Hasil akhirnya menunjukkan bahwa seluruh 19 tes Minggu 1 sampai Minggu 3 berhasil tanpa kegagalan.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi konstruktor, validasi, getter, dan metode `getJenis()` pada class `Ruang`, `Laptop`, dan `AlatLab`.
- Prompt utama:
  1. Membantu menerapkan inheritance pada class `Ruang`, `Laptop`, dan `AlatLab` sesuai ketentuan Minggu 3.
  2. Menjelaskan validasi konstruktor dan penggunaan metode `getJenis()` pada setiap subclass.
  3. Membantu memeriksa kesalahan kode dan mengarahkan pengujian menggunakan `.\scripts\uji.ps1 -Minggu 3`.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mengikuti perubahan kode secara bertahap, memeriksa hasilnya, dan memperbaiki sendiri kesalahan penulisan yang ditemukan berdasarkan arahan AI. Saya tetap mempertahankan `hitungDenda(int)` untuk dikerjakan pada Minggu 4.
- Satu hal yang saya pahami lebih baik sekarang: Inheritance memungkinkan subclass menggunakan atribut dan perilaku umum dari class induk, sedangkan setiap subclass dapat memiliki atribut dan implementasi metode khusus sesuai kebutuhannya.