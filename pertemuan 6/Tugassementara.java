import java.util.Scanner;

public class Tugassementara {
    public static void main(String[] args) {
        System.out.println(".....Sistem siakad.....");
        System.out.println("1 . Tambah data");
        System.out.println("2 . Edit data");
        System.out.println("3 . Hapus data");
        System.out.println("4 . Lihat data");
        
        Scanner console = new Scanner(System.in);
        System.out.print("Menu yang ada pilih :");
        int Menu = console.nextInt();

        if (Menu == 1) {
            System.out.println("1. Tambah data Mahasiswa");
            System.out.println("2. Tambah data mata kuliah");
            System.out.println("3. Kembali");

            System.out.print("Menu yang anda pilih");
            int Menu1 = console.nextInt();
            console.nextLine();
             if (Menu1 == 1) {
                 System.out.println();
                 System.out.print("Masukan nama Anda :");
                 String nama = console.nextLine();
                 System.out.println("Nama anda adalah :" + nama);

             } else if (Menu1 == 2) {
                 System.out.println();
                 System.out.print("Masukkan mata Kuliah yang ingin ditambahkan : ");
                 String mataKuliah = console.nextLine();
                 System.out.println("Mata kuliah yang ingin ditambahkan adalah" + mataKuliah);

             } else if (Menu1 == 3) {
                 System.out.println();
                 System.out.println("......Terima kasih......");

             } else {
                 System.out.println("Menu tidak ada");
             }
        }else if (Menu >= 2 && Menu < 5) {
            System.out.println("Fitur belum ada");

        }else {
            System.out.println("Menu tidak ada");
        }
    }
}