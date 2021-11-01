public class belajarMethod {
    public static void main(String[] args) { // method yang dipanggil pertama kali dan string args adalah parameter
        menampilkanTeks();
        cobacoba();
        teksdenganParamter("ihza");
        String teks = Tambahkata("kalimat awal");
        System.out.println(teks);
    }
    public static void menampilkanTeks() {
        System.out.println("Coba");
    }
    public static void cobacoba() {
        System.out.println("menampilkan teks yang lain");
    }
    public static void teksdenganParamter(String nama) { //method dengan parameter
        System.out.println("nama anda adalah" + nama);
    }

    public static String Tambahkata(String kataAwal) {
        String kalimat = "ini adalah kalimat tambahan " + kataAwal;
        return kalimat;
    }
}
