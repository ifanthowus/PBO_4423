import java.util.Scanner;
public class PersegiPanjang extends BangunDatar implements Resizable{
    double panjang,lebar;
    double ukuranResize;
    Scanner hitung = new Scanner(System.in);
    //konstruktor dari kelas PersegiPanjang
    PersegiPanjang(int sisi) {
        super(sisi);
    }

    public double getPanjang() {
        System.out.print("Masukkan panjang kotak = ");
        panjang= hitung.nextDouble();
        return panjang;
    }

    public double getLebar() {
        System.out.print("Masukkan lebar kotak = ");
        lebar= hitung.nextDouble();
        return lebar;
    }

    public double getLuasKotak() {
        super.Luas=panjang*lebar;
        return super.Luas;
    }

    public double getKelilingKotak() {
        super.Keliling=2*(panjang+lebar);
        return super.Keliling;
    }

    @Override
    public void draw() {
        Luas=panjang*lebar;
    }

    @Override
    public void resize() {
        System.out.println("Persegi berukuran "+super.Luas +" cm2");
    }

    @Override
    public double Resize (double pelebaran){
        super.Luas=(pelebaran*(panjang)*pelebaran*(lebar));
        return super.Luas;
    }

    public double resizeKeliling(double pelebaran){
        super.Keliling=2*(pelebaran*(panjang)+pelebaran*(lebar));
        return super.Keliling;
    }


}
