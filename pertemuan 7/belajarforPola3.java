import java.util.Scanner;

public class belajarforPola3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n =");
        int n = scan.nextInt();
        if ( n % 2 == 0) {
            for ( int i = 1; i <= n; i++) {  // menyatakan pengulangan baris
                for( int j = 1; j <= i; j++) { // perulangan bintangnya
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= n; i++) {// variabel i menyatakan baris
                for (int j = n; j>=1; j--) {
                    if (j <= i) {
                        System.out.print("*");  // mekanisme logikanya adalah jika kita masukan n = 5
                    } else {                    // langkahnya adalah pertama 5 sampe 4 kan if tdk memenuhi jdi else
                        System.out.print(" ");  // dan pada saat 1 if nya memenuhi jdi * jdi output spasi 4x bru bintang
                    }                           // begitu pun seterus i = 4 hingga 1
                }
                System.out.println();
            } 
        }
    }
}
