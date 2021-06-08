public class Lingkaran extends BangunDatar{
    double jari_jari;
    double pi=3.14;

    //
    public double getJari_jari(){
        System.out.print("Masukkan jari-jari : ");
        jari_jari=komponenBangunDatar.nextFloat();
        return jari_jari;
    }

    //hanya menampilkan diameter lingkaran
    public void diameterLingkaran(){
        double diameter;
        diameter=2*jari_jari;
        System.out.println("Diameter lingkaran = "+diameter +" cm");
    }

    //Luas lingkaran
    public double Luas(){
        double luas;
        luas=pi*jari_jari*jari_jari;
        return luas;
    }

    //keliling lingkaran
    public double Keliling(){
        double keliling;
        keliling=2*pi*jari_jari;
        return keliling;
    }
}
