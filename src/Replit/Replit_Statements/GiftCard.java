package Replit.Replit_Statements;

import java.util.Scanner;

/*
You got a $100 gift card for your birthday, but we can't use it yet. We need to build the application for the store in order to use our gift card.

The program will ask the user to enter the item they want to buy. Then it will check if that item is in the store inventory.
If the item is available there will be a confirmation message displayed and the remaining balance on the gift card will be output as well.
In some cases that item may not be available in the store and in other cases we may not have enough money on the gift card to buy an item.
So we must handle both of these conditions as well. We can only make one purchase at a time.

        ** List of items, with prices, available in the store:**
        > - Blanket: $60
        > - Charger: $5
        > - Hat: $25
        > - Headphones: $30
        > - Laptop: $200
        > - Pants: $50
        > - Pillow: $40
        > - Smartphone: $1000
        > - Socks: $5
        > - USB cable: $10

- If the item is not in the list, display message: `Sorry, that is an invalid item`
- If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`

#### Hint: Use a switch statement to avoid having to compare String values in if statements. Don't forget to create your Scanner object.

  **Example Flows:**

          Hello, which item would you like?
          Hat
          Thank you for your purchase!
          Your current balance is: 75$
       ------
          Hello, which item would you like?
          Laptop
          Sorry, not enough funds on your gift card
       ------
          Hello, which item would you like?
          Cupcake
          Sorry, that is an invalid item
 */
public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.nextLine();

        String result = "";
        int cardBalance = 100,
                blanket = 60,
                charger = 5,
                hat = 25,
                headphones = 30,
                laptop = 200,
                smartphone = 1000,
                pants = 50,
                pillow = 40,
                socks = 5,
                USBcable = 10;

        switch (item) {
            case "Blanket":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - blanket) + "$";
                break;
            case "Charger":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - charger) + "$";
                break;
            case "Hat":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - hat) + "$";
                break;
            case "Headphones":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - headphones) + "$";
                break;
            case "Laptop":
            case "Smartphone":
                result = "Sorry, not enough funds on your gift card";
                break;
            case "Pants":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - pants) + "$";
                break;
            case "Pillow":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - pillow) + "$";
                break;
            case "Socks":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - socks) + "$";
                break;
            case "USBcable":
                result = "Thank you for your purchase!\nYour current balance is: " + (cardBalance - USBcable) + "$";
                break;
            default:
                result = "Sorry, that is an invalid item";

        }
        System.out.println(result);
        input.close();

    }
}
