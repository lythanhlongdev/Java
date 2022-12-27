
public class Lop {
    public static int COUNT = 0;
    private String maLop;
    private String tenLop;
    private int khoaHoc;
    private String heDaoTao;
    private Date namHoc;
    private String makhoa;

    public Lop() {
        COUNT++;
    }

    public Lop(String maLop, String tenLop, String heDaoTao, Date namHoc, String khoa) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        // khoa hoc tu dong tang theo nam
        this.khoaHoc = (int)2022 - namHoc.getYear() ;
        this.heDaoTao = heDaoTao;
        this.namHoc = namHoc;
        makhoa = khoa;
        COUNT++;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(short khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public Date getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(Date namHoc) {
        this.namHoc = namHoc;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    @Override
    public String toString() {
        return "LOP {MALOP: " + this.maLop + ", TENLOP: " + this.tenLop +
                ", KHOAHOC: " + this.khoaHoc + ", HEDAOTAO: " + this.heDaoTao +
                ", NAMHOC: " + this.namHoc.toString() +", MAKHOA: "+ this.makhoa + "} ";
    }

    @Override
    public boolean equals(Object obj) {
        return this.maLop == ((Lop)obj).maLop &&
                this.makhoa == ((Lop)obj).makhoa;
    }
}
