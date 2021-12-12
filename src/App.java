import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Tambah tambah = new Tambah();
      Pengurangan shelby = new Pengurangan();
      Perkalian tommy = new Perkalian ();
      Pembagian artur = new Pembagian();
      

        try (Scanner wildanInput = new Scanner(System.in)) {
            System.out.println("selamat datang di kalkulator shelby");
            System.out.println("1.pertambahan");
            System.out.println("2.pengurangan");
            System.out.println("3.perkalian");
            System.out.println(("4.pembagian"));
            System.out.print("masukan pilhan :" );
            int pilihan = wildanInput.nextInt();
           
            if (pilihan == 1) {
                System.out.print ("masukan nilai pertama : ");
                long value1 = wildanInput.nextLong();
                System.out.print("masukan nilai kedua : ");
                long value2 = wildanInput.nextLong();
                tambah.input(value1, value2);
            }
            else if (pilihan == 2) {
                System.out.print ("masukan nilai pertama : ");
                long value1 = wildanInput.nextLong();
                System.out.print("masukan nilai kedua : ");
                long value2 = wildanInput.nextLong();
                shelby.shelby(value1,value2);
            }
            else if (pilihan == 3 ) {
                System.out.print ("masukan nilai pertama : ");
                long value1 = wildanInput.nextLong();
                System.out.print("masukan nilai kedua : ");
                long value2 = wildanInput.nextLong();
                tommy.tommy(value1, value2);
            }
            else if (pilihan == 4) {
                System.out.print ("masukan nilai pertama : ");
                float value1 = wildanInput.nextFloat();
                System.out.print("masukan nilai kedua : ");
                float value2 = wildanInput.nextFloat();
                artur.artur(value1, value2);
                
            }
            // shelby.shelby(value1, value2);
            // artur.artur(value1, value2);
            // tommy.tommy(value1,value2);
           /// tambah.input(value1, value2);
        }
    }
}
