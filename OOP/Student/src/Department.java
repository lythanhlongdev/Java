public class Department{
    public   static  int COUNT = 0;
    private  String maKhoa;
    private  String tenKhoa;
    private  String sdt;

    public Department(){
        COUNT++;
    }
    public Department(String maKhoa, String tenKhoa, String SDT) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.sdt = SDT;
        COUNT++;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "MAKHOA: "+this.maKhoa+", TENKHOA: "+this.tenKhoa+", SDT: "+this.sdt;
    }
}
