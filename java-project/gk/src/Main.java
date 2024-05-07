import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    

    public static void main(String[] args) {
        ArrayList<Oto> DSOT = new ArrayList<>();
        ArrayList<Xemay> DSXM = new ArrayList<>();
        ArrayList<XeTai> DSXT = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("*****Danh sach phuong tien*****"
                + "%n 1.Oto,"
                + "%n 2.Xe may."
                + "%n 3.Xe tai");
        System.out.println("*****Danh sach phuong tien ban muon them*****"
                + "%n 1.Oto,"
                + "%n 2.Xe may."
                + "%n 3.Xe tai");
        System.out.println("Nhap so thu tu tuong ung voi phuong tien ban muon hien thi thong tin: ");

        int chonHienThi ;
        chonHienThi = sc.nextInt();
        System.out.println("Nhap so thu tu tuong ung voi phuong tien ban muon them: ");

        int chonThemMoi ;
        chonThemMoi = sc.nextInt();
        switch (chonHienThi) {
            case 1:
                System.out.println("****Danh sach thong tin phuong tien o to****");
                for (Oto oto : DSOT) {
                    oto.showInfo();
                }
                break;
            case 2:
                System.out.println("****Danh sach thong tin phuong tien xe may****");
                for (Xemay xemay : DSXM) {
                    xemay.showInfo();
                }
                break;
            case 3:
                System.out.println("****Danh sach thong tin phuong tien xe tai****");
                for (XeTai xeTai : DSXT) {
                    xeTai.showInfo();
                }
                break;
            default:
                break;
        }
        switch (chonThemMoi) {
            case 1:
                
                break;
            case 2:
                System.out.println("****Danh sach thong tin phuong tien xe may****");
                for (Xemay xemay : DSXM) {
                    xemay.showInfo();
                }
                break;
            case 3:
                System.out.println("****Danh sach thong tin phuong tien xe tai****");
                for (XeTai xeTai : DSXT) {
                    xeTai.showInfo();
                }
                break;
            default:
                break;
        }
    }
}

