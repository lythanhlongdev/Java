public class HocPhi {
    private String maSV;
    private String maKhoa;
    private String maLop;
    private int hocKy;
    private double hocPhi;

    public HocPhi(String maSV, String maKhoa, String maLop, int hocKy, double hocPhi) {
        this.maSV = maSV;
        this.maKhoa = maKhoa;
        this.maLop = maLop;
        this.hocKy = hocKy;
        this.hocPhi = hocPhi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "HocPhi { MASV: " + this.maSV + ", MAKHOA: " + this.maKhoa + ", MALOP: " +
                this.maLop + ", HOCKY: " + this.hocKy + ", HOCPHI: " + this.hocPhi + "} ";
    }

}
