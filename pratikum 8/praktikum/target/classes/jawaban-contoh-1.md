### Jawaban

**Nama  : Naufal Haidar Rauf**

**NIM   : A11.2019.12342**
1. program inheritance contoh #1

- Person.java

~~~
public class Person {
    //variabel milik parent class
    protected String name;
    protected String address;

    //method menampilkan nama dan alamat
    public void identity() {
        System.out.println("Nama : "+name);
        System.out.println("Alamat : "+address);
    }
}
~~~

- Student.java

~~~
//mewarisi method dan variabel
//dari parent class nya, 'Person'
public class Student extends Person{
    String nim;

    //method yang khas di class 'Student'
    public String getNim(){
        return nim;
    }
}

~~~

- InheritMain.java

~~~
public class InheritMain {
    public static void main(String[] args) {
        //memanggil class 'Student'
        //lewat variabel 'mahasiswa'
        Student mahasiswa = new Student();

        //memanggil method dari parent class
        // (class Person)
        mahasiswa.identity();

        //memanggil method dari class 'Student'
        // (anak dari class 'Person')
        String nim= mahasiswa.getNim();
        System.out.println(nim);

    }
}

~~~

Ditanyakan : output dari program tersebut

Hasil : 

~~~
Nama : null
Alamat : null
null

Process finished with exit code 0

~~~

Screenshot:

![bukti screenshot program!](https://github.com/naufalHaidar12342/pbo_4423/blob/main/pertemuan-8/praktikum/src/main/resources/contoh-soal-1.png)
