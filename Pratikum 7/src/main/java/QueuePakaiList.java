import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueuePakaiList {

    //konstruktor queue
    Queue<String> makananFavorit;

    QueuePakaiList(){
        makananFavorit=new LinkedList<>();
    }
    //memanggil scanner lewat variabel 'tanyaMakanan'
    Scanner tanyaMakanan=new Scanner(System.in);

    //membuat variable 'namaMakanan' bertipe string
    String namaMakanan;

    /*
    * membuat method 'cekApakahPenuh'
    * penuh disini memiliki arti: sudah ada isinya, meski cuma 1 anggota saja
    * jika banyak anggota dalam queue=0, berarti nilainya false.
    * sebaliknya, jika banyak anggota dalam queue > 0,berarti nilainya true */
    boolean cekApakahPenuh(){
        if(makananFavorit.size() <=0){
            return false;
        }else{
            return true;
        }
    }

    //
    boolean cekApakahKosong(){
        if(makananFavorit.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    //
    void enqueue(){
        System.out.print("makanan kesukaan kalian apa nih? = ");
        namaMakanan= tanyaMakanan.nextLine();
        makananFavorit.add(namaMakanan);
        tanyaMakanan.nextLine();
        System.out.println(namaMakanan +" dimasukkan dalam queue");
        System.out.println();
    }

    //
    void dequeue(){
        if (makananFavorit.isEmpty()){
            System.out.println("queue sudah kosong,tidak bisa menghapus anggota queue lagi");
        }else {
            String makananDihapus;
            makananDihapus=makananFavorit.remove();
            System.out.println("makanan yang terhapus adalah = "+makananDihapus);
        }

    }

    void cariMakananDalamQueue(){
        String makananDicari;
        System.out.print("masukkan makanan yang dicari = ");
        makananDicari= tanyaMakanan.nextLine();
        if(makananFavorit.contains(makananDicari)){
                System.out.println(makananDicari+" ada di dalam queue makanan favorit!");
        }else {
            System.out.println(makananDicari+ " sudah tidak ada dalam queue makanan favorit");
        }


    }

}
