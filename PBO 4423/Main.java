import java.util.Scanner;

public class Main {
    static float total = 0, nom1 = 1, nom2 = 2;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Operasi kalkulator = new Operasi();
        while(nom2 != 0 & nom1 != 0)
        {
            total=0;
            // Tampilkan pilihan menu
            kalkulator.menu();

            // Inputkan pilihan
            int pilihan = input.nextInt();
            if(pilihan >=1 & pilihan <=5)
            {
                // Inputan nominal pertama
                System.out.print("Masukan Bilangan Ke-1 = ");
                nom1 = input.nextFloat();

                // Inputan nominal kedua
                System.out.print("Masukan Bilangan Ke-2 = ");
                nom2 = input.nextFloat();

                // Proses
                total =  kalkulator.operasiAritmatika(pilihan,nom1,nom2);

                // Output Hasilnya
                System.out.println(total);
            }else
                {
                    System.out.println("Anda harus mengisi pilihan dengan benar");
                }
        }
    }
}

/** Thowus Ajmalifanka (A11.2019.11677) */