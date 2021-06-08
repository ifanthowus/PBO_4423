public class Segitiga extends BangunDatar{
    double sisi2;
    double sisi3;


    //meminta panjang sisi kedua
    public double getSisi2(){
        System.out.print("Masukkan sisi 2 = ");
        sisi2=komponenBangunDatar.nextFloat();
        return sisi2;

    }

    //meminta panjang sisi ketiga
    public double getSisi3(){
        System.out.print("Masukkan sisi 3 = ");
        sisi3=komponenBangunDatar.nextFloat();
        return sisi3;
    }

    //overloading method public double Luas()
    public double Luas(){
        return (sisi*tinggi*0.5);
    }

    //
    public double KelilingSegitiga(){
        double keliling;
        keliling = sisi+sisi2+sisi3;
        return keliling;
    }

}
