import java.util.ArrayList;
import java.util.Scanner;

public class DuyTanUniversity {
    private ArrayList<Khoa> KHOA;
    private ArrayList<Lop> LOP;
    private ArrayList<SinhVien> SINHVIEN;
    private ArrayList<HocPhan> HOCPHAN;
    private ArrayList<DiemThi> DIEMTHI;

    private Scanner sc;


    // Khoi tao du lieu
    public DuyTanUniversity() {
        // NHAP
        sc = new Scanner(System.in);

        // Khoa
        KHOA = new ArrayList<>();
        KHOA.add(new Khoa("international", "Cong Nghe Thong Tin - Viet My", "000-000-000"));
        KHOA.add(new Khoa("cntt", "Cong Nghe Thong Tin", "001-000-000"));
        KHOA.add(new Khoa("qtkd", "Quan Trị Kinh Doanh", "002-000-000"));
        KHOA.add(new Khoa("dl", "Du Lich", "003-000-000"));

        // Lop, lop sinh hoat  (lop(1) - (n)SinhVien)
        LOP = new ArrayList<>();
        LOP.add(new Lop("k25-cmu-tpm1", "Khoa 25 tin phan mem viet my 1", "Chinh Quy", new Date(11, 07, 2019), KHOA.get(0).getMaKhoa()));
        LOP.add(new Lop("k26-cntt-tpm1", "Khoa 26 cong nghe thong tin tin phan mem 1 ", "Chinh Quy", new Date(11, 07, 2020), KHOA.get(1).getMaKhoa()));
        LOP.add(new Lop("k25-qtkd", "Khoa 26 quan tri kinh doanh", "Chinh Quy", new Date(11, 07, 2019), KHOA.get(1).getMaKhoa()));

        // SINH VIEN ,
        SINHVIEN = new ArrayList<>();
        SINHVIEN.add(new SinhVien("2521120xxxx", "Ly Thanh", "Long", new Date(11, 12, 2001), true, "Gia Lai", LOP.get(0).getMaLop()));
        SINHVIEN.add(new SinhVien("2521120xxxx", "Ngo Thi Huyen", "Trang", new Date(04, 11, 2001), false, "Da Nang", LOP.get(2).getMaLop()));

        // HOC PHAN
        HOCPHAN = new ArrayList<>();
        HOCPHAN.add(new HocPhan("CMUCS303202201012", "Fundamentals of Computing 1 ", 4));
        HOCPHAN.add(new HocPhan("CMUCS316202201001", "Fundamentals of Computing 2 ", 4));

        // Diem Thi
        DIEMTHI = new ArrayList<>();
        DIEMTHI.add(new DiemThi(HOCPHAN.get(0).getMaHocPhan(), SINHVIEN.get(0).getMaSv(), 1, 9.5f));
        DIEMTHI.add(new DiemThi(HOCPHAN.get(1).getMaHocPhan(), SINHVIEN.get(0).getMaSv(), 1, 8f));
    }

    public void themKhoa() {
        System.out.println("KHOA");
        System.out.println("Ma: ");
        String maKhoa = sc.nextLine();
        System.out.println("Ten ");
        String tenKhoa = sc.nextLine();
        System.out.println("SDT: ");
        String sdt = sc.nextLine();

        for (var item : KHOA) {
            if (item.getMaKhoa() == maKhoa) {
                System.out.println("That Bai: " + maKhoa + " Da Ton Tai ");
                System.out.println(item.toString());
                return;
            }
        }
        KHOA.add(new Khoa(maKhoa, tenKhoa, sdt));
        System.out.println("Them Khoa Thanh Cong");
    }

    public void thongTinKhoa(String maKhoa) {
        for (var item : KHOA) {
            if (item.getMaKhoa() == maKhoa){
                item.toString();
                return;
            }
        }
        System.out.println("Nhap sai ma khoa hoac khoa khong ton tai");
    }


    private void themLop() {
    }

    private void thongTinLop(String maLop) {
    }

    private void themSinhVien() {
    }

    private void thongTinSinhVien() {
    }

    private void themHocphi() {
    }

    private void xuatHocPhi() {
    }

    private void nhapDiemThi() {
    }

    private void xuatDiemThi(String maHocPhan, String maSV) {
    }

}
