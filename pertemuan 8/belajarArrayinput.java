import java.util.Scanner;

public class belajarArrayinput {
    public static void main(String[] args) {
        int[] bilangan = new int[5]; // akan ada 5 inputan
        for (int i =0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan bilangan ke" +i+ "="); // ini untuk user memasukan input
            bilangan[i] = scan.nextInt();
        }
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Masukan bilangan ke" +i+ "=" + bilangan[i]); // ini untuk hasil akhir
        }
    }
}
