package Replit.OOP.ItemTask;

public class Item {

    public String name;
    public double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - $" + price;
    }
}
