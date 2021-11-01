import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Masukan Nilai A = ");
        int nilaiA = console.nextInt();
        System.out.print("Masukan Nilai B = ");
        int nilaiB = console.nextInt();
        
        int hasil = penjumlahan( nilaiA, nilaiB);
        System.out.println("nilai A + nilai B = " + hasil);

    }

    public static int penjumlahan(int a, int b) {
        int hasil = a + b;
        return hasil;

    }
}
