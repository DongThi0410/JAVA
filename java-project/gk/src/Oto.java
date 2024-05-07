import java.util.Scanner;
import java.util.ArrayList;
public class Oto extends PhuongTien implements ICar{
    public ArrayList<Oto> DSOT = new ArrayList<>();
    
    private int slots;
    private String engineType;

    public Oto(String iD, String brand, int publishYear, double price, String color, int slots, String engineType) {
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
        System.out.println("Nhap so cho ngoi phuong tien:");
        slots = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap kieu dong co phuong tien:");
        engineType = sc.nextLine();
        Oto OtoMoi = new Oto(iD, brand, publishYear, price, color, slots, engineType);
        DSOT.add(OtoMoi);
    }
    
    public int getSlots() {
        return slots;
    }
    public void setSlots(int slots) {
        this.slots = slots;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public String toString() {
        return "Oto [slots=" + slots + ", engineType=" + engineType + ", toString()=" + super.toString() + "]";
    }

    public void showInfo(){
        int stt =0;
        System.out.println("****Danh sach thong tin phuong tien o to****");
        for (Oto oto : DSOT) {
            stt++;
            System.out.println("\nThong tin oto thu: "+stt
            +"\nID phuong tien :"+ oto.getiD()
            +"\nThuong hieu phuong tien :"+ oto.getBrand()
            +"\nNam san xuat phuong tien :"+ oto.getPublishYear()
            +"\nGia ban phuong tien :"+ oto.getPrice()
            +"\nMau sac phuong tien :"+ oto.getColor()
            +"\nSo cho ngoi phuong tien :"+ oto.getSlots()
            +"\nKieu dong co phuong tien :"+ oto.getEngineType()
            );

        }
    }

}
