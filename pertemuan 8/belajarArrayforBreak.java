import java.util.Scanner;

public class belajarArrayforBreak {
    public static void main(String[] args) {
        int[] bilangan = new int[100]; // akan ada 5 inputan
        for (int i =0; i < 100; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan bilangan ke" +i+ "="); // ini untuk user memasukan input
            int cek = scan.nextInt();
            if ( cek == 0) {
                break;
            } else {
                bilangan[i] = cek;
            }
        }
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == 0) {
                break;
            } else {
                System.out.println("Masukan bilangan ke" +i+ "=" + bilangan[i]); // ini untuk hasil akhir
            }
        }
    }
}
