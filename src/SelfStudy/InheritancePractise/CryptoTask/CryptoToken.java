package SelfStudy.InheritancePractise.CryptoTask;

public class CryptoToken {

    public String name;
    public double price;
    public int quantity;
    public double marketCap;
    public double volume;
    public boolean isMineable;

    public void setInfo(String name, double price, int quantity, double marketCap, double volume, boolean isMineable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                " name= " + name +
                ", price= $" + price +
                ", quantity= " + quantity +
                ", marketCap= " + marketCap +
                ", volume= " + volume +
                ", isMineable= " + isMineable +
                '}';
    }

    public void totalPrice() {
        double totalPrice = price * quantity;
        System.out.println("Total Price: " + totalPrice);
    }
}
