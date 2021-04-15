package pratikum6;
import java.util.Scanner;
import java.util.Stack;

public class Handphone {
    Stack<String> daftarHandphone;
    Handphone(){
        daftarHandphone = new Stack<String>();
    }

    public String tambahHandphone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan merk handphone (jika selesai input, kosongkan!!) [*PUSH]= ");
        String merkHandphone = scanner.nextLine();
        if(merkHandphone.equals("")) {
            return merkHandphone;
        }
        this.daftarHandphone.push(merkHandphone);
        return  merkHandphone;
    }

    public void hapusHandphone() {
        String mantanHandphone = this.daftarHandphone.pop();
        System.out.println(mantanHandphone + " baru saja dihapus dari Daftar Handphone [*POP]");
    }

    public boolean cekHandphone() {
        if(this.daftarHandphone.empty()) {
            System.out.println("Daftar Handphone Kosong !!! [*EMPTY]");
            return false;
        }
        System.out.println("Daftar Handphone ada " + this.daftarHandphone.size() + " handphone [*EMPTY]");
        return true;
    }

    public void peekHandphone() {
        String newHandphone = this.daftarHandphone.peek();
        System.out.println(newHandphone + " adalah handphone yang paling terbaru (PEEK)");
    }

    public void cariHandphone(String namaHandphone) {
        Integer pos = (Integer) daftarHandphone.search(namaHandphone);
        if(pos == -1) {
            System.out.println(namaHandphone + " tidak tersedia [*SEARCH]");
            return;
        }
        System.out.println(namaHandphone + " ditemukan [*SEARCH]");
    }

}
