# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan

Saya mengerjakan tiga pendekatan pemrograman pada tugas Minggu 1, yaitu prosedural, OOP, dan fungsional. Pada pendekatan prosedural, saya melengkapi method `sapa()` untuk menghasilkan sapaan yang memuat nama dan NIM. Pada pendekatan OOP, saya menggunakan field `private`, konstruktor, dan method `sapa()`. Pada pendekatan fungsional, saya menggunakan lambda melalui `Function<String, String>`. Setelah itu, saya menjalankan skrip pengujian Minggu 1 dan kelima tes berhasil.

## Keputusan desain

Saya menggunakan pendekatan yang berbeda untuk menghasilkan keluaran sapaan yang sama. Pendekatan prosedural menggunakan method statis, pendekatan OOP menyimpan nama dan NIM sebagai field objek, sedangkan pendekatan fungsional mengembalikan fungsi melalui lambda. Pada pendekatan OOP, field dibuat `private` agar akses langsung dari luar kelas dibatasi. Pada pendekatan fungsional, `Function<String, String>` digunakan karena fungsi menerima nama bertipe `String` dan menghasilkan sapaan bertipe `String`.

Untuk sistem peminjaman aset, pendekatan prosedural memiliki kelebihan berupa struktur yang sederhana sehingga cocok untuk proses seperti menghitung denda atau menampilkan informasi peminjaman. Keterbatasannya, jika fitur semakin banyak, fungsi-fungsi dapat sulit dikelola apabila tidak disusun dengan baik.

Pendekatan OOP memiliki kelebihan karena data dan perilaku dapat dikelompokkan dalam objek, misalnya objek peminjam atau aset. Field `private` juga membantu membatasi akses langsung terhadap data. Keterbatasannya, program membutuhkan perancangan class dan objek yang lebih terstruktur sehingga perlu pemahaman tambahan.

Pendekatan fungsional memiliki kelebihan karena fungsi dapat digunakan kembali dan lambda membuat operasi sederhana lebih ringkas, misalnya untuk membentuk pesan informasi peminjaman. Keterbatasannya, penggunaan lambda dan fungsi sebagai nilai mungkin lebih sulit dipahami bagi pemula, terutama ketika logika program semakin kompleks.

## Kendala

Saya sempat perlu memahami lokasi file sumber dan bagian `TODO` yang harus diubah. Saya mengatasinya dengan memeriksa isi file melalui terminal dan mengubah method yang sesuai. Saya juga menjalankan skrip pengujian repository untuk memastikan implementasi berjalan sesuai tes.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Implementasi dan penjelasan `HelloOOP.java` dan `HelloFungsional.java`, serta pemeriksaan `HelloProsedural.java` dan proses pengujian.
- Prompt utama:
  1. Meminta bantuan melanjutkan pengerjaan tugas OOP Minggu 1 pada repository `oop-202601-250320575`.
  2. Meminta penjelasan lokasi file dan bagian kode yang perlu diubah pada `HelloFungsional.java`.
  3. Meminta panduan memeriksa dan menjalankan pengujian Minggu 1.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menerapkan perubahan pada method yang ditunjukkan dan memeriksa hasilnya melalui pengujian. Saya belum menolak saran tertentu. Saya perlu memastikan kembali bahwa saya memahami setiap bagian kode sebelum mengumpulkannya.
- Satu hal yang saya pahami lebih baik sekarang: Perbedaan pendekatan prosedural, OOP, dan fungsional, khususnya penggunaan field `private`, konstruktor, serta lambda dan `Function<String, String>`.
