
import java.util.Scanner;
import java.util.ArrayList;
public class PhuongTien {
    private String iD;
    private String brand;
    private int publishYear;
    private double price;
    private String color;
    ArrayList<Oto> DSOT = new ArrayList<>();
    ArrayList<Xemay> DSXM = new ArrayList<>();
    ArrayList<XeTai> DSXT = new ArrayList<>();
    
    public PhuongTien(String iD, String brand, int publishYear, double price, String color) {
        this.iD = iD;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }
    public String getiD() {
        return iD;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "PhuongTien [iD=" + iD + ", brand=" + brand + ", publishYear=" + publishYear + ", price=" + price
                + ", color=" + color + "]";
    }
    
    
}
