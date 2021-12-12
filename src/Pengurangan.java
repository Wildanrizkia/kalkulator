public class Pengurangan extends Operator{
    public void shelby(long value1,long value2 ) {
        this.value1=value1;
        this.value2=value2;
    System.out.println("nilai pertama : " + this.value1 );
    System.out.println("nilai keuda : " + this.value2);
    long hasilKurang = this.value1 - this.value2;
    System.out.println("hasil pengurangannya : " + hasilKurang);
    System.out.println(this.value1 + "-" + this.value2 + "=" + hasilKurang);

    }   
}
