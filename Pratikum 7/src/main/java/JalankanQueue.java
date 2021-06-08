import java.util.Scanner;
public class JalankanQueue {
    public static void main(String[] args) {
        QueuePakaiList isiMakanan=new QueuePakaiList();
        Scanner mengisiQueue=new Scanner(System.in);

        //
        System.out.println("kondisi queue sebelum operasi = " +isiMakanan.makananFavorit);
        System.out.println("Apakah queue kosong sebelum operasi? = "+isiMakanan.cekApakahKosong());
        System.out.println();

        //
        System.out.println("apakah queue sudah penuh? = "+isiMakanan.cekApakahPenuh());
        System.out.println();
        //
        int ulang;
        System.out.print("ingin mengisi berapa kali? = ");
        ulang =mengisiQueue.nextInt();
        for (int i=0; i<ulang; i++){
            isiMakanan.enqueue();

        }
        System.out.println(isiMakanan.makananFavorit);
        isiMakanan.cariMakananDalamQueue();
        System.out.println();

        //
        isiMakanan.dequeue();
        System.out.println();

        //
        System.out.println("kondisi queue setelah operasi = " +isiMakanan.makananFavorit);
        System.out.println("Apakah queue kosong setelah operasi? = "+isiMakanan.cekApakahKosong());


    }



}
