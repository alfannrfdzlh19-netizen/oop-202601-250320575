package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

@Tag("week7")
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulai() {
        JadwalPeminjaman jadwal = new JadwalPeminjaman(1);

        // Peminjaman pertama: pukul 09.00 sampai 11.00
        jadwal.tambah(pinjam(
                "1",
                id.ac.upb.asetpinjam.TestSupport.peminjam("P1"),
                id.ac.upb.asetpinjam.TestSupport.ruang("R-1"),
                9, 11
        ));

        // Peminjaman kedua: pukul 11.00 sampai 13.00
        var baru = pinjam(
                "2",
                id.ac.upb.asetpinjam.TestSupport.peminjam("P2"),
                id.ac.upb.asetpinjam.TestSupport.ruang("R-1"),
                11, 13
        );

        // Tidak bentrok karena waktu selesai sama dengan waktu mulai.
        assertThat(jadwal.bentrok(baru)).isFalse();
    }
}
