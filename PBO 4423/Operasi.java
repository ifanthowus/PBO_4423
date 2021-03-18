/*
Buatlah program kalkulator yang dibuat menggunakan konsep Class dan Object
Class berisi library operasi aritmatika yang ada pada kalkulator, minimal ada +, /, -, *, modulus
Main class berisi object yang dibuat berdasarkan Class pada poin 1. Pemanggilan method atau attribute dilakukan di sini.
Angka yang dikalkulasi cukup 2 saja, misal a+b, a-b, dst.
 */
public class Operasi
{
    public void menu()
    {
        System.out.println("\n====================");
        System.out.println("Kalkulator Sederhana");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus");
        System.out.print("Masukan Pilihan Anda = ");
    }


    public float operasiAritmatika(int pilihan, float nom1, float nom2)
    {
        float total = 0;
        switch (pilihan)
        {
            case 1:
                System.out.println(+nom1 + " + " + nom2);
                System.out.print("Hasilnya = ");
                total = nom1 + nom2;
                break;
            case 2:
                System.out.println(+nom1 + " - " + nom2);
                System.out.print("Hasilnya = ");
                total = nom1 - nom2;
                break;
            case 3:
                System.out.println(+nom1 + " x " + nom2);
                System.out.print("Hasilnya = ");
                total = nom1 * nom2;
                break;
            case 4:
                System.out.println(+nom1 + " : " + nom2);
                System.out.print("Hasilnya = ");
                total = nom1 / nom2;
                break;
            case 5:
                System.out.println(+nom1 + " % " + nom2);
                System.out.print("Hasilnya = ");
                total = nom1 % nom2;
                break;

        }
        return total;
    }

}

/** Thowus Ajmalifanka (A11.2019.11677) */