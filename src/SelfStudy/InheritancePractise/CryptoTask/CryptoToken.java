package SelfStudy.InheritancePractise.CryptoTask;

public class CryptoToken {

    private String name;
    private double price;
    private int quantity;
    private double marketCap;
    private double volume;
    private boolean isMineable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Quantity can not be '0' or less than '0': " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean getIsMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public CryptoToken(String name, double price, int quantity, double marketCap, double volume, boolean isMineable) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setMineable(isMineable);
    }

    public String toString() {
        return "CryptoToken{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", marketCap=" + getMarketCap() +
                ", volume=" + getVolume() +
                ", isMineable=" + getIsMineable() +
                '}';
    }

    public void totalPrice() {
        double totalPrice = price * quantity;
        System.out.println("Total Price: " + totalPrice);
    }
}
