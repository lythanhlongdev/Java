import java.util.Date;

public class Class {
    public static  int COUNT = 0;
    private String  maLop;
    private  String tenLop;
    private  int khoaHoc;
    private  String heDaoTao;
    private Date namHoc;
    private  Department Khoa;

    public  Class(){
        COUNT++;
    }
    public Class(String maLop, String tenLop, int khoaHoc, String heDaoTao, Date namHoc, Department khoa) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.khoaHoc = khoaHoc;
        this.heDaoTao = heDaoTao;
        this.namHoc = namHoc;
        Khoa = khoa;
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

    public Department getKhoa() {
        return Khoa;
    }

    public void setKhoa(Department khoa) {
        Khoa = khoa;
    }

    @Override
    public String toString() {
        return "MALOP: "+this.maLop+", TENLOP: "+this.tenLop+
                ", KHOAHOC: "+this.khoaHoc+", HEDAOTAO: "+this.heDaoTao+
                ", NAMHOC: "+this.namHoc.toString() +this.Khoa.toString();
    }
}
