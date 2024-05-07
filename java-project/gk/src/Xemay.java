import java.util.Scanner;
import java.util.ArrayList;

public class Xemay extends PhuongTien implements ICar{
    private int capacity;
    public ArrayList<Xemay> DSXM = new ArrayList<>();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Xemay(String iD, String brand, int publishYear, double price, String color, int capacity) {
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
        capacity = sc.nextInt();
        sc.nextLine();
        Xemay xeMayMoi = new Xemay(iD, brand, publishYear, price, color, capacity);
        DSXM.add(xeMayMoi);
    }

    public void showInfo(){
        int stt =0;
        System.out.println("****Danh sach thong tin phuong tien xe may****");
        for (Xemay xemay : DSXM) {
            stt++;
            System.out.println("\nThong tin xe may thu: "+stt
            +"\nID phuong tien :"+ xemay.getiD()
            +"\nThuong hieu phuong tien :"+ xemay.getBrand()
            +"\nNam san xuat phuong tien :"+ xemay.getPublishYear()
            +"\nGia ban phuong tien :"+ xemay.getPrice()
            +"\nMau sac phuong tien :"+ xemay.getColor()
            +"\nSo cho ngoi phuong tien :"+ xemay.getCapacity()
            );

        }
    }

    @Override
    public String toString() {
        return "Xemay [capacity=" + capacity + ", toString()=" + super.toString() + "]";
    }

    
}
