public class InheritMain {
    public static void main(String[] args) {
        //memanggil class 'Student'
        //lewat variabel 'mahasiswa'
        Student mahasiswa = new Student();

        //mengisi nama, alamat , dan nim
        mahasiswa.getNama();
        mahasiswa.getAddress();
        mahasiswa.getNim();

        //menu tagihan
        mahasiswa.getSKS();
        mahasiswa.getSpp();
        mahasiswa.getModulKuliah();
        System.out.println();

        System.out.println("====================");
        System.out.println("Nama : "+mahasiswa.name);
        System.out.println("Alamat : "+mahasiswa.address);
        System.out.println("NIM : "+mahasiswa.nim);

        //menampilkan pekerjaan
        mahasiswa.pekerjaan();

        //menampilkan hobi
        mahasiswa.hobby();

        //menampilkan total tagihan
        System.out.println("Total tagihan : " +mahasiswa.hitungTagihan());
        System.out.println("====================");
        //akhir dari menu tagihan

        //memanggil identity milik student
        //mahasiswa.identity();


        //memanggil method dari parent class
        // (class Person)
        //mahasiswa.identity();

        //memanggil method dari class 'Student'
        // (anak dari class 'Person')
        //String nim= mahasiswa.getNim();
        //System.out.println(nim);

        //mahasiswa.nim="A11.2000.00001";

    }
}
