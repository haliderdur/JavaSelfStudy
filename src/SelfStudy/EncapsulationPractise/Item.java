package SelfStudy.EncapsulationPractise;

/*
Item Task
    private variables: name, unitPrice, quantity
    Encapsulate all the fields:
Conditions:
    name can not be empty or blank
    name can not contain any special characters other than space
    name must start with letters
    unit price can not be negative
    quantity can not be negative
    if the Item name is toilet paper(case insensitive) then the quantity can not be more than 1
    Add a constructor that allows user to set all the fields when the object is created.
    (If the arguments are not valid it should not be set to the instances)
instance methods:
    calcCost(): returns the total cost
    toString(): returns the name, unit price, quantity and
    total cost info as calculated by calcCost()
 */
public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {

        boolean isValidName = false;

        if (name.isEmpty()) {
            return;
        } else {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
                    isValidName = true;
                    this.name = name;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0 || (name.equalsIgnoreCase("toilet paper") && quantity > 1)) {
            return;
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name= '" + name + '\'' +
                ", unitPrice= " + unitPrice +
                ", quantity= " + quantity +
                ", Total= $" + calcCost() +
                '}';
    }
}
