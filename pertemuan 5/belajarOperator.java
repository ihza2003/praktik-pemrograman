import java.util.Scanner;

public class belajarOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai A =");
        double a = scanner.nextDouble();
        System.out.print("masukan nilai B =");
        double b = scanner.nextDouble();
        System.out.println("A == B =" + (a == b));
        System.out.println("A != B +" + (a != b));
        System.out.println("A > B =" + (a > b));
        System.out.println("A < B =" + ( a < b));
        System.out.println("A >= B =" + (a >= b));
        System.out.println("A <= B =" + (a <= b));
        boolean hasilAND = (a < 5 && b > 2);
        System.out.println("A < 5 && b > 2 =" + hasilAND);
        boolean hasilOR = (a < 5 || b > 2);
        System.out.println("A < 5 || B > 2 =" + hasilOR);
        System.out.println("!(A < 5 && B > 2) =" + !hasilAND);
    }
}
