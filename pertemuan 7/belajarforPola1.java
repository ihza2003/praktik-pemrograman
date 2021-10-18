import java.util.Scanner;

public class belajarforPola1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n =");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) { // variabel i menyatakan baris
            for (int j = 1; j<= i; j++) { // ini menentukan pengulangan dalam satu baris tersebut
                if ( i % 2 == 0) {
                    System.out.print("*");
                } else {                      // pola logika nya adalah jika misalkan jika i = 3 kan ganjil selanjutnya
                    if (j % 2 == 0) {         // jadi mekanisme nya adalah 3 if tdk memenuhi jdi # selanjutnya
                        System.out.print("-");// 2 memenuhi if maka - dan 1 tdk memenuhi if maka #
                    } else {                  // jdi outputnya jika i = 3 adalah #-#
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
    }
}
