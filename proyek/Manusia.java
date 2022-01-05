public class Manusia {
    protected double tinggiBadan; // protected untuk supaya di class lain tidak bisa mengakses namun anak classnya bisa
    protected int Semester;
    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public double getTinggiBadan() {
        return this.tinggiBadan;
    }
    
    public void setSemesterMahasiswa(int Semester) {
        this.Semester = Semester;
    }

    public int getSemesterMahasiswa() {
        return this.Semester;
    }
}

