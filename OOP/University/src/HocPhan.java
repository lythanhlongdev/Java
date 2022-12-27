public class HocPhan {
    private String maHocPhan;
    private String tenHocPhan;
    private int soTinChi;

    public HocPhan(String maHocPhan, String tenHocPhan, int soTinChi) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "HOCPHAN {MAHOCPHAN: " + this.maHocPhan + ", TENHOCPHAN: " + this.tenHocPhan +
                "SOTINCHI: " + this.soTinChi + "} ";
    }
}
