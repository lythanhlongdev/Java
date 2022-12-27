
public class SinhVien {
    private String maSv;
    private String hoDem;
    private String ten;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String noiSinh;
    private String maLop;

    public SinhVien(String maSv, String hoDem, String ten, Date ngaySinh, boolean gioiTinh, String noiSinh, String maLop) {
        this.maSv = maSv;
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.noiSinh = noiSinh;
        this.maLop = maLop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return "SINHVIEN {MASV: "+this.maSv+", HODEM: "+this.hoDem+", TEN: "+this.ten+", NGAYSINH: "+
                this.ngaySinh+", GIOITINH: "+this.gioiTinh+", NOISINH: "+this.noiSinh+", MALOP: "+this.maLop+"}";
    }

    @Override
    public boolean equals(Object obj) {
        return this.maSv == ((SinhVien)obj).maSv;
    }
}
