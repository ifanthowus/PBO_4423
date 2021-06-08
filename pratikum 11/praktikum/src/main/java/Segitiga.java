import java.util.Scanner;
public class Segitiga extends BangunDatar{
    double alas,sisiB,sisiC,tinggi;
    Scanner sisiSegitiga = new Scanner(System.in);

    //konstruktor
    Segitiga(int sisi){
        super(sisi);
    }

    public double getAlas() {
        System.out.print("Masukkan alas segitiga = ");
        alas=sisiSegitiga.nextDouble();
        return alas;
    }

    public double getSisiB() {
        System.out.print("Masukkan sisi kedua segitiga = ");
        sisiB=sisiSegitiga.nextDouble();
        return sisiB;
    }

    public double getSisiC() {
        System.out.print("Masukkan sisi ketiga segitiga = ");
        sisiC=sisiSegitiga.nextDouble();
        return sisiC;
    }

    public double getTinggi() {
        System.out.print("Masukkan tinggi segitiga = ");
        tinggi=sisiSegitiga.nextDouble();
        return tinggi;
    }

    public double getLuasSegi3() {
        super.Luas=0.5*alas*tinggi;
        return super.getLuas();
    }

    @Override
    public double getKeliling() {
        super.Keliling=alas+sisiB+sisiC;
        return super.getKeliling();
    }

    @Override
    public void draw(){
        System.out.println("segitiga memiliki 3 jenis yaitu :");
        System.out.println("segitiga sama sisi, segitiga siku-siku, segitiga sembarang");
    }

    @Override
    public void resize(){
        System.out.println("segitiga siku-siku punya teorema triple pythagoras");
    }
}
