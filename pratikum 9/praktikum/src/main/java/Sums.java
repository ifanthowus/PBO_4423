public class Sums {
    //
    public int jumlah(int x, int y){
        return(x+y);
    }

    //
    public int jumlah(int x, int y, int z){
        return(x+y+z);
    }

    //
    public double jumlah(double x, double y){
        return(x+y);
    }

    public static void main(String[] args) {
        Sums accessSums=new Sums();

        //menampilkan method jumlah yang bertipe int
        // tapi parameternya hanya int x dan int y
        System.out.println("method tipe int, 2 parameter = "+accessSums.jumlah(10,20));

        //menampilkan method jumlah yang bertipe int
        //tapi parameternya  int x , int y, dan int z
        System.out.println("method tipe int, 3 parameter = "+accessSums.jumlah(10,20,30));

        //menampilkan method jumlah yang bertipe double
        //parameternya double x dan double y
        System.out.println("method tipe double, 2 parameter = "+accessSums.jumlah(10.4,10.3));
    }

}
