package SelfStudy.EncapsulationPractise;

/*
Carpet Task
    private variables: width, length, unitPrice, isPersian (boolean)
    Encapsulate all the fields:
Conditions:
    width can not be negative
    length can not be negative
    unit price can not be negative
    Add a constructor to set all the instances
instance methods:
    calcCost(): should be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
    total price of carpet = (width * length) * unitPrice
    if the carpet is persian  carpet, add 200$ to the totalPrice
 */
public class Carpet {
    private double width;
    private double length;
    private double unitPrice;
    private boolean isPersian;


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            return;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            return;
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean isPersian) {
        this.isPersian = isPersian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost() {
        if (isPersian) {
            return ((width * length) * unitPrice) + 200;
        } else {
            return (width * length) * unitPrice;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width= " + width +
                ", length= " + length +
                ", unitPrice= " + unitPrice +
                ", isPersian= " + isPersian +
                ", Total= $" + calcCost() +
                '}';
    }
}
