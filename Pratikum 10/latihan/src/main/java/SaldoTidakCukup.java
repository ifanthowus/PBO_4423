public class SaldoTidakCukup extends Exception{
    private double saldo;

    public SaldoTidakCukup(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}
