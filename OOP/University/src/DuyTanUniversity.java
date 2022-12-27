import java.util.ArrayList;
import java.util.Scanner;

public class DuyTanUniversity {
    private ArrayList<Khoa> KHOA;
    private ArrayList<Lop> LOP;
    private ArrayList<SinhVien> SINHVIEN;
    private ArrayList<HocPhan> HOCPHAN;
    private ArrayList<DiemThi> DIEMTHI;


    // Khoi tao du lieu
    public DuyTanUniversity() {
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

    private void themKhoa() {

    }

    private void xuaKhoa() {
        for (int i = 0; i < KHOA.size(); i++) {
            System.out.println(KHOA.get(i).toString());
        }
    }

    private void themLop() {
    }

    private void xuatLop() {
        for (int i = 0; i < LOP.size(); i++) {
            System.out.println(LOP.get(i).toString());
        }
    }

    private void themSinhVien() {

    }

    private void xuatSinhVien() {
        for (int i = 0; i < SINHVIEN.size(); i++) {
            System.out.println(SINHVIEN.get(i).toString());
        }
    }

    private void themHocPhan() {

    }

    private void xuatHocPhan() {
        for (int i = 0; i < HOCPHAN.size(); i++) {
            System.out.println(HOCPHAN.get(i).toString());
        }
    }

    private void themDiem() {

    }

    private void xuatDiem() {
        for (int i = 0; i < DIEMTHI.size(); i++) {
            System.out.println(DIEMTHI.get(i).toString());
        }
    }

    public void QuanLy() {
        int choose = 0;
        do {
            System.out.println("1.Khoa");
            System.out.println("2.Lop");
            System.out.println("3.Sinh vien");
            System.out.println("4.Hoc Phan");
            System.out.println("5.Diem Thi");
            System.out.println("0. Thoat; !");
            Scanner input = new Scanner(System.in);
            choose = input.nextInt();
            switch (choose) {
                case 1: {
                    int choose1 = 0;
                    do {
                        System.out.println("1. Them Khoa");
                        System.out.println("2. Xuat Khoa");
                        System.out.println("0. Quay Lai");
                        choose1 = input.nextInt();
                        switch (choose1) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                xuaKhoa();
                                break;
                            }
                        }
                    } while (choose1 != 0);
                    break;
                }
                case 2: {
                    int choose2 = 0;
                    do {
                        System.out.println("1. Them Lop");
                        System.out.println("2. Xuat Lop");
                        System.out.println("0. Quay Lai");
                        choose2 = input.nextInt();
                        switch (choose2) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                xuatLop();
                                break;
                            }
                        }
                    } while (choose2 != 0);
                    break;
                }
                case 3: {
                    int choose3 = 0;
                    do {
                        System.out.println("1. Them Sinh Vien");
                        System.out.println("2. Xuat Sinh Vien");
                        System.out.println("0. Quay Lai");
                        choose3 = input.nextInt();
                        switch (choose3) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                xuatSinhVien();
                                break;
                            }
                        }
                    } while (choose3 != 0);
                    break;
                }
                case 4: {
                    int choose4 = 0;
                    do {
                        System.out.println("1. Them Hoc Phan");
                        System.out.println("2. Xuat Hoc Phan");
                        System.out.println("0. Quay Lai");
                        choose4 = input.nextInt();
                        switch (choose4) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                xuatHocPhan();
                                break;
                            }
                        }
                    } while (choose4 != 0);
                    break;
                }
                case 5: {
                    int choose5 = 0;
                    do {
                        System.out.println("1. Them Diem thi");
                        System.out.println("2. Xuat Diem Thi");
                        System.out.println("0. Quay Lai");
                        choose5 = input.nextInt();
                        switch (choose5) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                xuatDiem();
                                break;
                            }
                        }
                    } while (choose5 != 0);
                    break;
                }
                default: {
                }
            }
        } while (choose != 0);

    }
}
