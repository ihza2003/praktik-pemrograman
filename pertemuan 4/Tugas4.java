import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner kelasJ = new Scanner(System.in);
        System.out.print("Masukan nilai a =");
        double a = kelasJ.nextDouble();

        System.out.print("Masukan nilai b =");
        double b = kelasJ.nextDouble();
        double hasilTambah = a + b; //Pertambahan
        System.out.println("hasil a + b =" + hasilTambah);

        double hasilKurang = a - b; //Pengurangan
        System.out.println("hasil a - b =" + hasilKurang);

        double hasilKali = a * b; //Perkalian
        System.out.println("hasil a * b =" + hasilKali);

        double hasilBagi = a / b; //Pembagian
        System.out.println("hasil a / b =" + hasilBagi);

        double hasilSisa = a % b; //Modulus atau sisa
        System.out.println("hasil a % b =" + hasilSisa);
    }
}
