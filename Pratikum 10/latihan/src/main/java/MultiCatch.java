import java.util.*;
public class MultiCatch {
    public static void main(String[] args) {
        double a = 50.4;
        int b = 34;
        Integer c=0;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Masukkan angka: ");
            c = s.nextInt();
            int d=s.nextInt();
            System.out.println("c/d = "+c/d);
        }
        catch (InputMismatchException salahTipeInput){
            System.out.println("Inputan harus berupa bilangan bulat");
            salahTipeInput.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException diluarIndeks){
            diluarIndeks.printStackTrace();
        }catch (NullPointerException inputanNull){
           inputanNull.getMessage();
           inputanNull.printStackTrace();
        }

    }
}
