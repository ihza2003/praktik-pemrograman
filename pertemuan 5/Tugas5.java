import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama Anda =");
        String nama = scanner.nextLine();

        System.out.print("Masukan Fakultas Anda =");
        String fakultas = scanner.nextLine();

        System.out.print("Masukan prodi anda =");
        String prodi = scanner.nextLine();
        
        System.out.println("Nama saya Adalah" + nama);
        System.out.println("fakultas =" + fakultas);
        System.out.println("prodi =" + prodi);

        System.out.print("Masukan Ipk Anda =");
        double ipk = scanner.nextDouble();
        System.out.print("Masukan lama studi belajar");
        int tahun = scanner.nextInt();
        if ( ipk >= 3.51 &&  ipk <= 4.00 && tahun <= 4) {
            System.out.println("Anda lulus dengan pujian tertinggi atau prdikat summa Cumlaude");
        } else if (ipk >= 3.51 && ipk <= 4.00 && tahun > 4) {
            System.out.println("Anda lulus dengan pujian atau predikat Cumlaude");
        } else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Anda lulus dengan sangat memuaskan");
        } else if (ipk >= 2.76 && ipk <3.01) {
            System.out.println("Anda lulus dengan memuaskan");
        } else if ( ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Anda lulus dengan cukup");
        } else if (ipk > 0 && ipk < 2.00) {
            System.out.println("Mohon maaf anda tidak lulus");
        } else if (ipk> 4.00 || ipk  <0  ) {
            System.out.println("Tidak valid");
        } else {
            System.out.println("anda tidak terdeteksi");
        }
        System.out.println("Terima kasih");
    }
}
