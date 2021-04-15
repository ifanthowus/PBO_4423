package pratikum6;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Handphone handphone = new Handphone();
        // Perulangan untuk menambahkan handphone
        while (true) {
            String merkHandphone = handphone.tambahHandphone();
            if(merkHandphone.equals("")) {
                break;
            }
        }

        // Cek Jumlah Handphone [EMPTY]
        if(!handphone.cekHandphone()){
            return;
        }

        // Cek Data Teratas [PEEK]
        handphone.peekHandphone();

        // hapus handphone [DELETE]
        handphone.hapusHandphone();

        // Perulangan untuk mencari handphone [SEARCH]
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan merk handphone yang akan dicari (jika selesai input, kosongkan!!) [*SEARCH]= ");
            String namaHandphone = scanner.nextLine();
            if(namaHandphone.equals("")) {
                break;
            }
            laptop.cariHandphone(namaHandphone);
        }
    }
}
