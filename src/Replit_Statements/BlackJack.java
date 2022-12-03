package Replit_Statements;


/*
Use `if statements` to help the Blackjack dealer determine who won. There will be an `int` `house` value and an `int` `player` value.
Use the following rules of blackjack to print out the result:
    > - if the `player` score is bigger than `21`, the result is `player bust`
    > - if the `player` score is equal to the `house` score, the result is `it's a tie`
    > - if the `player` score is equal to `21`, the result is `player win`
    > - if the `house` score is bigger than the `player` score, the result is `player lose`
    > - if the `player` score is bigger than the `house` score, the result is `player win`
                      Ex:
                            Input:
                                    8
                                    21

                            Output:
                                player win
 */

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter house number");
        int house = s.nextInt();

        System.out.println("Enter player number");
        int player = s.nextInt();

        String result;

        if (player > 21) {
            result = "player bust";
        } else if (player == house) {
            result = "its a tie";
        } else if (player == 21 || player > house) {
            result = "player win";
        } else {
            result = "player lose";
        }
        System.out.println(result);

        s.close();

    }
}
