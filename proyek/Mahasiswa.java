public class Mahasiswa extends Manusia { 
    // artinya Mahasiswa akan menjadi anak dari Mahasiswa
    // set untuk menyetel data sedangkan get untuk menampilkan data
    private String nim;
    //private itu kita harus menggunakan suatu langkah agar variabel private bisa di akses di class lain
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        // Mahasiswa ini adalah constaractor yaitu nama yang sama dengan class nya sampe besar kecil hruf sama
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;

    }

    public void setNIM(String nim) { // kalo set dia membutuhkan parameter dan nim di parameter beda dengan nim di atas
        this.nim = nim;// ini fungsinya adalah supaya nim di string dan nim parameter sama sehinhgga nim parameter bisa mengisi di atas
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() { // masih digunkan untuk menghitung rerata ipk
        return this.ipk;
    }

    public void getDetail() {
        // tinggiBadan bisa langsung tnpa menggunakan get karna menggunakan protected
        System.out.println(this.nim +"\t\t" + this.nama.toUpperCase() + "\t\t" + this.ipk +"\t\t" + this.tinggiBadan +"\t\t" + this.Semester);
    }


}

