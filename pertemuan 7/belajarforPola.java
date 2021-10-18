import java.util.Scanner;

public class belajarforPola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n =");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) { // variabel i menyatakan baris
            for (int j = 1; j<= i; j++) {
                if ( i % 2 == 0) { // jika genap
                    System.out.print("*");
                } else { //jika selain genap atau ganjil
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
