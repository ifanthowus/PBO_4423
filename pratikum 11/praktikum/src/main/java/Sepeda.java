public class Sepeda extends Kendaraan{
    private boolean isAuto;

    //override
    @Override
    public void nyalakan() {
        int kecepatanSepeda = 0;
        System.out.println("yuk, kita gowes sepedanya! ");
        System.out.println("sekarang kecepatan sepedamu adalah "+kecepatanSepeda+" km/jam");
    }

    //
    void jenis(){
        if (isAuto){
            System.out.println("Sepeda otomatis");
        }else {
            System.out.println("Sepeda kayuh");
        }
    }
}
