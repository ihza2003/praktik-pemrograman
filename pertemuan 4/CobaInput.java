import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama Anda :");
        String namaDepan = scanner.nextLine();

        System.out.print("Masukan umur Anda :");
        int umur = scanner.nextInt();

        System.out.println("Nama saya Adalah :" + namaDepan);
        System.out.println("umur saya :" + umur);
    }
}