import java.util.ArrayList;
import java.util.Scanner;
public class NamaSiswa {
    ArrayList<String> daftarNama;
    Scanner IsiNama = new Scanner(System.in);

    String nama;

    NamaSiswa() {
        daftarNama = new ArrayList<>();
    }

    public String mintaNama() {
        System.out.print("masukkan nama = ");
        nama = IsiNama.nextLine();
        IsiNama.nextLine();
        return nama;

    }

    //
    void pushKeDaftarNama() {
        daftarNama.add(nama);

    }

    public boolean isEmpty() {
        return daftarNama.isEmpty();

    }

    //
    public String popNama() {
        if (!isEmpty()) {
            String popNamaPilihan = daftarNama.get(daftarNama.size() - 1);
            String anggotaTerhapus;
            anggotaTerhapus = daftarNama.remove(daftarNama.size() - 1);
            System.out.println("anggota dari stack yang terhapus = " + anggotaTerhapus);
            return popNamaPilihan;

        } else {
            // System.out.println("Stack sudah kosong");
            return "pop dari stack yang kosong";
        }

    }

    //
    void intipAnggotaPalingAtas() {
        System.out.print("anggota stack yang paling atas sekarang = " + daftarNama.get(daftarNama.size() - 1));
        System.out.println();
    }

    void cariLetakAnggota(){
        int indeksAnggotaDicari;
        String anggotaDicari;
        System.out.print("nama yang akan dicari posisinya = ");
        anggotaDicari=IsiNama.nextLine();
        if(daftarNama.contains(anggotaDicari)){
            indeksAnggotaDicari=daftarNama.indexOf(anggotaDicari);
            System.out.println("anggota stack bernama : "+anggotaDicari+", ditemukan pada index = "+indeksAnggotaDicari);
        }else{
            System.out.println("anggota stack bernama :"+anggotaDicari+" sudah tidak ada dalam stack");
        }
    }
}
