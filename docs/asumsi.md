# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## Rumus Denda Progresif

**Pertanyaan:** Bagaimana rumus perhitungan denda progresif?

**Keputusan:** Menggunakan rumus denda flat ditambah biaya progresif sebesar jumlah hari keterlambatan dikalikan tarif denda per hari.

Rumus:

Denda Progresif = Denda Flat + (Hari Terlambat × Tarif Harian)

**Alasan:** Rumus ini sederhana dan memastikan denda progresif tidak lebih murah daripada denda flat. Semakin lama keterlambatan, semakin besar denda yang harus dibayar.

**Dampak ke kode:** Diterapkan pada class `DendaProgresif.java` melalui interface `AturanDenda`.

**Tes pembuktian:** Denda 0 hari bernilai 0, denda progresif tidak lebih murah daripada denda flat, nilainya tidak menurun ketika hari keterlambatan bertambah, dan pada hari ke-30 nilainya lebih besar daripada denda flat.
