import java.util.Scanner;

public class Siakad {
    Mahasiswa [] mahasiswa = new Mahasiswa [1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad(); // agar tidak eror jika class nya tidak pakai static
        int menu = 0;
        while (menu != 10) { // user hanya bisa memilih menu sebanyak 4 kali
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.melihatData();
            } else if (menu == 2) {
                siakad.menambahData();
            }  else if (menu == 3) {
                siakad.RerataIPK();
            } else if (menu == 4) {
                siakad.mencariDatabyNim();
            } else if ( menu == 5) {
                siakad.menghapusData();
            } else if ( menu == 6) {
                siakad.mengeditNama();
            }
        }
    }

    private static int tampilanMenu() { //ini tidak usah pakai siakad.tampilan menu karena dia memakai static
        Scanner scan = new Scanner(System.in);
        System.out.println("..Menu..");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Rerata IPK");
        System.out.println("4. Mencari data");
        System.out.println("5. Menghapus Data");
        System.out.println("6. Mengedit nama");
        System.out.println("10. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
    }

    

    private void melihatData() {
        if (jumlahData == 0) {
            System.out.println("Data belum ada "); 
        }
        else {
            System.out.println("Berikut data Mahasiswa ");
            System.out.println("NIM\t\tNama\t\tIPK\t\tTinggi badan\tSemester");
            System.out.println("-------------------------------------------------------------------------");
            for( int i = 0; i < jumlahData; i++ ) {
               mahasiswa[i].getDetail();
            }
        }
        RerataIPK();
    }

    private void menambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa : ");
        String nim = scan.nextLine();
        //memasukan nim mahasiswa
        System.out.print("Masukan nama Mahasiswa : ");
        String nama = scan.nextLine();
        //memasukan nama identitas
        System.out.print("Masukan ipk anda : ");    
        double ipk = scan.nextDouble();
        //memasukan ipk mahasiswa
        System.out.print("Masukan Tinggi badan anda : ");
        double tinggi = scan.nextDouble();
        //masukan tinggi mahasiswa
        System.out.print("Masukan Semester Mahasiswa : ");
        int semester = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk); // constractor
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setSemesterMahasiswa(semester);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++; // di plus' agar jumlah data sesuai dengan data yang masuk
        melihatData();
    }


    private void RerataIPK() {
        double total = 0.0;
        for(int i = 0; i < jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total / jumlahData;
        System.out.println("Rata Rata Ipk Mahasiswa adalah " + rerata);
    }
    
    public void mencariDatabyNim() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang akan dicari :");
        String nim = scan.nextLine();
        int index = getIndexbyNim(nim);
        if ( index == -1) {
            System.out.println("Data yang anda ingin ubah namanya tidak ada ");
            

        }
        else {
            mahasiswa[index].getDetail();
        }
        
    }

    public int getIndexbyNim(String nim) {
        //method ini digunakan untuk mencari index dan bermanfaat untuk cari data hapus data dan edit
        for(int i = 0; i < jumlahData; i++) {
            if(mahasiswa[i].getNIM().equals(nim)){
                //memakai get nim karena yang akan user masukan untuk mencari adalah nim
                return i ;
                // dia akan mereturn i yang merupakan letak nim tersebut
            }
        }
        return -1;
        //karena index tidak mungkin min 1 dan return ini hanya berfungsi supaya method index gak eror
    }
    
    public void mengeditNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang akan kamu ubah : ");
        String nim = scan.nextLine();
        int index = getIndexbyNim(nim);
        if ( index == -1) {
            System.out.println("Data yang anda ingin ubah namanya tidak ada ");
        }
        else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan nama Mahasiswa yang baru : ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            //ini menggunakan set nama karena set fungsinya untuk menyetel agar nama terubah di data
            mahasiswa[index].getDetail();
        }
    }

    public void menghapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa dari data yang akan dihapus : ");
        String nim = scan.nextLine();
        int index = getIndexbyNim(nim);
        if ( index == -1) {
            System.out.println("Data yang anda ingin ubah namanya tidak ada ");
        }
        else {
            for(int i= index; i < jumlahData; i++) {
                //di for karena nanti cara menghapusnya untuk menggeser
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            // di minus karena akan menghapus
            melihatData();
        }
    }

   
}