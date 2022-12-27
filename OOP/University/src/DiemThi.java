public class DiemThi {
    private String maHocPhan;
    private String maSv;
    private int lanThi;
    private float diemThi;


    public DiemThi(String maHocPhan, String maSv, int lanThi, float diemThi) {
        this.maHocPhan = maHocPhan;
        this.maSv = maSv;
        this.lanThi = lanThi;
        this.diemThi = diemThi;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    @Override
    public String toString() {
        return "DIEMTHI {MAHOCPHAN: " + this.maHocPhan + ", MASV: " + this.maSv +
                ", LANTHI: " + this.lanThi + ", DIEM: " + this.diemThi + "} ";
    }
}
