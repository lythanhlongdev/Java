public class HocPhi {
    private String maSV;
    private String maLop;
    private int hocKy;
    private double hocPhi;

    public HocPhi(String maSV, String maLop, int hocKy, double hocPhi) {
        this.maSV = maSV;
        this.maLop = maLop;
        this.hocKy = hocKy;
        this.hocPhi = hocPhi;
    }



    @Override
    public String toString() {
        return "HocPhi { MASV: " + this.maSV  + ", MALOP: " +
                this.maLop + ", HOCKY: " + this.hocKy + ", HOCPHI: " + this.hocPhi + "} ";
    }

}
