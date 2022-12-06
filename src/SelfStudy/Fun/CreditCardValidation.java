package SelfStudy.Fun;

import java.util.Scanner;

/*
You need to verify if the given credit card number is valid. For that you need to use the Luhn test.

Here is the Luhn formula:

Reverse the number. Multiple every second digit by 2.
Subtract 9 from all numbers higher than 9.
Add all the digits together.
Modulo 10 of that sum should be equal to 0.
Task:
Given a credit card number, validate that it is valid using the Luhn test. Also, all valid cards must have exactly 16 digits.

Input Format:
A string containing the credit card number you need to verify.

Output Format:
A string: 'valid' in case the input is a valid credit card number (passes the Luhn test and is 16 digits long),
or 'not valid', if it's not.

Sample Input:
4091131560563988

Sample Output:
valid

Explanation: Let's run the Luhn test for our input:
Reverse: 8893650651311904
Multiplying the even positions by 2: 8 16 9 6 6 10 0 12 5 2 3 2 1 18 0 8
Subtract 9 from >9: 8 7 9 6 6 1 0 3 5 2 3 2 1 9 0 8
The sum: 70
70 Modulo 10 is 0.
The input passed the Luhn test and contains 16 digits, making it a valid credit card number
 */
public class CreditCardValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter credit card number:");
        validateCreditCardNumber(input.next());
        input.close();
    }

    public static void validateCreditCardNumber(String cardNumber) {
        long total = 0;

        int[] creditCardArray = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            creditCardArray[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }

        for (int i = 0; i < creditCardArray.length; i = i + 2) {
            creditCardArray[i] = creditCardArray[i] * 2;
            if (creditCardArray[i] > 9) {
                creditCardArray[i] = creditCardArray[i] - 9;
            }
        }

        for (int j = 0; j < creditCardArray.length; j++) {
            total += creditCardArray[j];
        }
        if (total % 10 == 0)
            System.out.println(cardNumber + " is VALID credit card number");
        else
            System.err.println(cardNumber + " is INVALID credit card number");
    }
}
