import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        // memanggil kelas 'Siswa'
        Siswa akses_kelas_Siswa = new Siswa();

        // memanggil scanner lewat variabel
        Scanner pilihanUser = new Scanner(System.in);
        // membuat variabel 'isiUlang'
        // bertipe integer untuk menampung pilihan
        // input data
        int isiUlang;

        try {
            // memanggil fungsi Nim
            akses_kelas_Siswa.getNIM();
            akses_kelas_Siswa.setNIM();

            //// memanggil fungsi Nama
            akses_kelas_Siswa.getNama();
            akses_kelas_Siswa.setNama();

            //// memanggil fungsi Teori
            akses_kelas_Siswa.getTeori();
            akses_kelas_Siswa.setTeori();

            // memanggil fungsi Praktek
            akses_kelas_Siswa.getPraktek();
            akses_kelas_Siswa.setPraktek();
            System.out.print("ingin isi berapa data lagi? = ");
            isiUlang = pilihanUser.nextInt();

            for (int i = 0; i < isiUlang; i++) {
                akses_kelas_Siswa.getNIM();
                akses_kelas_Siswa.setNIM();
                akses_kelas_Siswa.getNama();
                akses_kelas_Siswa.setNama();
                akses_kelas_Siswa.getTeori();
                akses_kelas_Siswa.setTeori();
                akses_kelas_Siswa.getPraktek();
                akses_kelas_Siswa.setPraktek();
            }
            // menampilkan isi dari semua arraylist//
            akses_kelas_Siswa.tampilkanIsiData();
        } finally {
            pilihanUser.close();
        }
    }
}
