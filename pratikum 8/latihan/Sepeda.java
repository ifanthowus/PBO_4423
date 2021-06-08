public class Sepeda {
    protected String tipeKendaraan = "Kendaraan jalur lambat";

}

public class SepedaRoda3 extends Sepeda {
    int roda = 3;

    public static void main(String[] args) {
        SepedaRoda3 milihSepeda = new SepedaRoda3();

        System.out.println("cocoknya di jalur mana? :" + milihSepeda.tipeKendaraan);
        System.out.println("berapa roda punya sepeda ini? : " + milihSepeda.roda);
    }
}
