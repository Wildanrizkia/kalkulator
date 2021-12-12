/**
 * Tambah
 */
public class Tambah extends Operator{
    public void  input(long value1,long value2) {
      System.out.println("nilai pertama : " + value1); 
      System.out.println("nilai kedua : " + value2); 
      long hasilTambah = value1 +value2;
      System.out.println(value1 + " + " + value2 + " = " + hasilTambah);

    }  
} 