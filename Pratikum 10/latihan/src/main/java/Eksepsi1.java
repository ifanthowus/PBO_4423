public class Eksepsi1 {
    public static void main(String[] args) {
        try {
            int arrayAngka[]=new int[10];
            arrayAngka[10]=23;
        }
        catch (ArrayIndexOutOfBoundsException aksesEksepsi){
            System.out.println("Maaf, ada eksepsi : "+aksesEksepsi.getMessage());
        }
    }
}
