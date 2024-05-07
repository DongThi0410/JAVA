import java.util.Scanner;
import java.util.ArrayList;

public class XeTai extends PhuongTien implements ICar{
    private int loadWeight;
    public ArrayList<XeTai> DSXT = new ArrayList<>();

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    public XeTai(String iD, String brand, int publishYear, double price, String color, int loadWeight) {
        super(iD, brand, publishYear, price, color);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID phuong tien:");
        iD = sc.nextLine();
        System.out.println("Nhap thuong hieu phuong tien:");
        brand = sc.nextLine();
        System.out.println("Nhap nam san xuat phuong tien:");
        publishYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gia tri phuong tien:");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap mau sac phuong tien:");
        color = sc.nextLine();
        System.out.println("Nhap cong suat phuong tien:");
        loadWeight = sc.nextInt();
        sc.nextLine();
        XeTai xeTaiMoi = new XeTai(iD, brand, publishYear, price, color, loadWeight);
        DSXT.add(xeTaiMoi);
    }
    public void showInfo(){
        int stt =0;
        System.out.println("****Danh sach thong tin phuong tien xe tai****");
        for (XeTai xeTai : DSXT) {
            stt++;
            System.out.println("\nThong tin xe Tai thu: "+stt
            +"\nID phuong tien :"+ xeTai.getiD()
            +"\nThuong hieu phuong tien :"+ xeTai.getBrand()
            +"\nNam san xuat phuong tien :"+ xeTai.getPublishYear()
            +"\nGia ban phuong tien :"+ xeTai.getPrice()
            +"\nMau sac phuong tien :"+ xeTai.getColor()
            +"\nSo cho ngoi phuong tien :"+ xeTai.getLoadWeight()
            );

        }
    }
    @Override
    public String toString() {
        return "XeTai [loadWeight=" + loadWeight + ", toString()=" + super.toString() + "]";
    }

}
