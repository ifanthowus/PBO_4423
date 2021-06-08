public abstract class BangunDatar {
    int x,y;
    int jumlahSisi;
    double Luas,Keliling;

    //konstruktor
    BangunDatar (int sisi){
     this.jumlahSisi=sisi;
    }

    public int getJumlahSisi(){
        return jumlahSisi;
    }
    public double getLuas(){
        return Luas;
    }
    public double getKeliling(){
        return Keliling;
    }
    public void pindahkan(int a, int b)
    {
        x = a;
        y = b;
    }

    public abstract void draw();
    public abstract void resize();
}
