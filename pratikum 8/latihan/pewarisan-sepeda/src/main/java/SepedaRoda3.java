public class SepedaRoda3 extends Sepeda{
        //karena sepeda roda 3
        //memiliki 3 roda, saya buat variabel
        //bertipe int yang punya nama 'roda'
        int roda=3;

        public static void main(String[] args) {
            //memanggil class 'SepedaRoda3'
            //lewat variabel 'milihSepeda'
            SepedaRoda3 milihSepeda = new SepedaRoda3();

            //menguji apakah kita bisa mengakses variabel
            // 'tipeKendaraan' milik kelas 'Sepeda' sebelumnya
            System.out.println("jalur yang cocok = "+milihSepeda.tipeKendaraan);

            //menampilkan berapa jumlah roda milik sepeda roda 3
            System.out.println("berapa jumlah roda punya sepeda ini? : "+milihSepeda.roda);
        }


}
