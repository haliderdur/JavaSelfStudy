package SelfStudy.InheritancePractise.PhoneTask;

public class Phone {

    public String brand, model, size;
    public double price;
    public String color;

    public void setInfo(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", size= '" + size + '\'' +
                ", price= $" + price +
                ", color= '" + color + '\'' +
                '}';
    }
}
