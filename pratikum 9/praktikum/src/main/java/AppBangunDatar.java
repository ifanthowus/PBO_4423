public class AppBangunDatar {
    public static void main(String[] args) {
        BangunDatar menuBangunDatar;

        System.out.println("===== Belajar Bangun Datar =====");

        System.out.println(">Segitiga");
        //mengakses class Segitiga
        Segitiga aksesSegitiga = new Segitiga();
        menuBangunDatar =aksesSegitiga;

        //memanggil method turunan BangunDatar
        //dan memanggil method milik class Segitiga
        menuBangunDatar.getSisi();
        aksesSegitiga.getSisi2();
        aksesSegitiga.getSisi3();
        menuBangunDatar.getTinggi();
        System.out.println("Luas segitiga = "+menuBangunDatar.Luas() + " cm^2");
        System.out.println("Keliling segitiga = "+aksesSegitiga.KelilingSegitiga() + " cm");
        System.out.println();

        System.out.println(">Lingkaran");
        //mengakses class Lingkaran
        Lingkaran aksesLingkaran = new Lingkaran();
        menuBangunDatar=aksesLingkaran;

        //getJari_jari() hanya ada di class Lingkaran
        //jadi, kita akses langsung lewat 'aksesLingkaran'
        aksesLingkaran.getJari_jari();
        aksesLingkaran.diameterLingkaran();
        System.out.println("Luas lingkaran = "+menuBangunDatar.Luas() +" cm^2");
        System.out.println("Keliling lingkaran = "+aksesLingkaran.Keliling() +" cm");
        System.out.println();

        System.out.println(">Persegi");
        Persegi aksesPersegi = new Persegi();
        menuBangunDatar =aksesPersegi;

        //meminta panjang sisi
        menuBangunDatar.getSisi();
        System.out.println("Luas persegi = " +menuBangunDatar.Luas() + " cm^2");
        System.out.println("Keliling persegi = "+aksesPersegi.kelilingPersegi() + " cm");

        System.out.println("=====Selesai=====");
    }
}
