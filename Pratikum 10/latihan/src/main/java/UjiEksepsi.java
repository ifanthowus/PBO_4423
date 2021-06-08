public class UjiEksepsi {
    public static void main(String[] args) {
        int arrayAngka[]=new int[10];

        for (int isiArray=0; isiArray<arrayAngka.length ; isiArray++){
            arrayAngka[isiArray]=isiArray+1;

        }
        try {
            System.out.println("panggil anggota bernilai 3"+arrayAngka[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ada eksepsi :"+ex);
        }
        finally {
            arrayAngka[0]=6;
            System.out.println("anggota pertama dari array bernilai= "+arrayAngka[0]);
            System.out.println("statement 'finally' sudah dijalankan");
        }
    }
}
