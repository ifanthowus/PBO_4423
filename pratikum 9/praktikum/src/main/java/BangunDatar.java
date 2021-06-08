import java.util.Scanner;
public class BangunDatar {

    //
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double sisi;

    //
    Scanner komponenBangunDatar = new Scanner(System.in);

    //meminta panjang sisi pertama
    public double getSisi(){
        System.out.print("Masukkan sisi  = ");
        sisi=komponenBangunDatar.nextFloat();
        return sisi;
    }


    //
    public double getPanjang(){
        System.out.print("Masukkan panjang : ");
        panjang=komponenBangunDatar.nextFloat();
        return panjang;
    }

    //
    public double getLebar() {
        System.out.print("Masukkan lebar : ");
        lebar=komponenBangunDatar.nextFloat();
        return lebar;
    }

    //
    public double getTinggi(){
        System.out.print("Masukkan tinggi : ");
        tinggi=komponenBangunDatar.nextFloat();
        return tinggi;
    }

    //
    public double Luas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }

    //
    public double Luas(double panjang, double tinggi){

        return (panjang*tinggi*0.5);
    }

    //
    public void tampilkanLuas(String tipeBangun, double luas){
        System.out.println("Luas dari " +tipeBangun + " adalah = " +luas);
    }

    //
    public void tampilkanLuas(String tipeBangun, int luas){
        System.out.println("Luas dari " +tipeBangun + " adalah = " +luas);
    }
}
