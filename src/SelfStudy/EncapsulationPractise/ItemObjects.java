package SelfStudy.EncapsulationPractise;

public class ItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item("Coffee", 5, 4);
        System.out.println("item1 = " + item1);
        item1.setName("@#Tomato");
        System.out.println("item1 = " + item1);

        System.out.println("-------------------------------------------------------------");

        Item item2 = new Item("toilet paper", 5, 1);
        System.out.println("item2 = " + item2);
        item2.setQuantity(5);
        System.out.println("item2 = " + item2);

        System.out.println("-------------------------------------------------------------");

        Item item3 = new Item("Nike AirForce", 129.99, 3);
        System.out.println("item3 = " + item3);

        System.out.println(item3.getName() + " price: $" + item3.getUnitPrice());
        System.out.println("quantity: " + item3.getQuantity());
        System.out.println("Total cost of " + item3.getName() + ":$ " + item3.calcCost());


    }
}
