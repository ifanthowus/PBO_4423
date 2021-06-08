import java.io.*;
import java.util.Scanner;
public class CheckingAccount {
    private double saldo;
    private int rekening;
    Scanner infoNasabah=new Scanner(System.in);

    //
    public double getSaldo() throws SaldoNotMatch{
        saldo=infoNasabah.nextDouble();
        if (infoNasabah.hasNext()){
            throw new RekeningNotMatch("\n anda memasukkan huruf dalam saldo.saldo hanya boleh berisi angka");
        }else if(infoNasabah.hasNextInt()) {
            throw new RekeningNotMatch("\n anda memasukkan angka dalam saldo. rekening hanya boleh berisi angka");
        }else {
            System.out.println("format saldo diterima.silahkan lanjut mengisi nominal uang yang akan ditarik");
            return saldo;
        }

    }

    //
    public int getRekening()throws RekeningNotMatch{
        rekening=infoNasabah.nextInt();
        if (infoNasabah.hasNext()){
            throw new RekeningNotMatch("\n anda memasukkan huruf dalam rekening.rekening hanya boleh berisi angka");
        }else if(infoNasabah.hasNextDouble()) {
            throw new RekeningNotMatch("\n anda memasukkan angka dengan koma dalam rekening. rekening hanya boleh berisi angka");
        }else {
            System.out.println("format rekening diterima. silahkan lanjut mengisi saldo");
            return rekening;
        }
    }

    //
    public void simpanUang(double jumlahSetor){
        saldo=saldo+jumlahSetor;
    }

    //
    public void tarikUang(double jumlahTarik) throws SaldoTidakCukup{
        if (jumlahTarik<=saldo){
            saldo=saldo-jumlahTarik;
        }
        else {
            double kebutuhan=jumlahTarik-saldo;
            throw new SaldoTidakCukup(kebutuhan);
        }
    }

}
