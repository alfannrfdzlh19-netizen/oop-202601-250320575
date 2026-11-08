
# Analisis Prinsip SOLID

## 1. Dependency Inversion Principle (DIP)

Kelas JdbcPeminjamanDAO menerapkan prinsip Dependency Inversion
Principle karena menerima AsetDAO melalui konstruktor.

Dengan menggunakan interface AsetDAO, JdbcPeminjamanDAO tidak
bergantung langsung pada implementasi konkret JdbcAsetDAO.
Hal ini membuat implementasi akses data lebih fleksibel dan
memudahkan pengujian menggunakan implementasi alternatif.

Kelas yang terkait:
- PeminjamanDAO
- AsetDAO
- JdbcPeminjamanDAO

## 2. Open/Closed Principle (OCP)

Prinsip Open/Closed Principle ditunjukkan melalui interface
AturanDenda yang memiliki implementasi DendaFlat dan
DendaProgresif.

Jenis aturan denda baru dapat ditambahkan dengan membuat
kelas baru yang mengimplementasikan AturanDenda tanpa harus
mengubah interface yang sudah ada.

Kelas yang terkait:
- AturanDenda
- DendaFlat
- DendaProgresif

Catatan:
Pola Strategy sudah terlihat melalui interface dan
implementasinya. Namun, LayananDenda masih dalam tahap
TODO sehingga integrasi strategi belum selesai.
