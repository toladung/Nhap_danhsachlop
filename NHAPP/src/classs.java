public class classs {
    private  String ten;
    private  int tuoi;

    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

    public classs (String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
