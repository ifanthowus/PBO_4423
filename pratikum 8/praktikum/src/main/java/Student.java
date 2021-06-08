import java.util.Scanner;
//mewarisi method dan variabel
//dari parent class nya, 'Person'
public class Student extends Person{
    //nim akan bertipe string
    String nim;

    //sks, spp, dan modul kuliah
    //tidak mungkin diambil setengah.
    //oleh karena itu, di deklarasikan
    //bertipe Integer
    Integer sks,spp,modulKuliah;

    //mendeklarasikan variabel 'total tagihan'
    int totalTagihan;
    //memisalkan harga per sks
    Integer hargaSKS=150000;

    //memisalkan harga per modul/ buku paket
    Integer hargaModul=100000;

    //memanggil fungsi scanner lewat
    //variabel 'tanyaMahasiswa'
    Scanner tanyaMahasiswa = new Scanner(System.in);

    //konstruktor untuk 'Student'
    public Student(){
        System.out.println("Inside Student : Constructor ");
    }

    //method yang khas di class 'Student'
    public String getNim(){
        System.out.print("masukkan NIM kamu :");
        nim=tanyaMahasiswa.nextLine();
        //tanyaMahasiswa.nextLine();
        System.out.println();
        return nim;
    }

    //method untuk meminta berapa banyak sks yang diambil
    public Integer getSKS(){
        System.out.print("berapa SKS yang diambil?(max. 20 sks) : ");
        sks= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return sks;
    }

    //method untuk meminta harga spp yang diambil
    public Integer getSpp(){
        System.out.print("besaran SPP yang diambil? : ");
        spp= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return sks;
    }
    //method untuk meminta berapa modul yang diambil semester ini
    public Integer getModulKuliah() {
        System.out.print("berapa modul yang diambil? : ");
        modulKuliah= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return modulKuliah;
    }

    //method ini akan digunakan untuk
    //menghitung tagihan
    //cukup dipanggil lewat println
    public int hitungTagihan(){
        totalTagihan=(sks*hargaSKS)+(modulKuliah*hargaModul)+spp;
        return totalTagihan;
    }

    /*Override = mengganti method/fungsi dengan nama
    * yang sama menjadi fungsi yang dinyatakan di bawah
    * 'Override' .
    * //
    * Kali ini akan mengganti isi method 'void identity()
    * yang sudah di deklarasikan di parent class 'Person'
    * dengan method 'void identity()' di dalam
    * class 'Student' ini */
    @Override
    public void identity() {
        System.out.println("NIM : "+getNim());
        System.out.println("Nama :"+super.name);
        System.out.println("Alamat :"+super.address);
    }

    //method ini hanya menampilkan pekerjaan
    //cukup dipanggil langsung tanpa println
    //dan tanpa ditampung dalam variabel
    void pekerjaan(){
        System.out.println("Pekerjaan : Mahasiswa");
    }

    //memanggil perintah override

    //@Override
    //public void identity(){
    //    System.out.println("NIM : "+getNim());
    //}

    //override kedua
//    @Override
//    public void identity() {
//        //super.identity();
//        System.out.println("NIM : "+getNim());
//        //super.identity();
//    }


}
