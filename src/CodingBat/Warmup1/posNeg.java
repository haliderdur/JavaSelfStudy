package CodingBat.Warmup1;

public class posNeg {

        /*
        Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.


        posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true
        */


    public boolean posNeg(int a, int b, boolean negative) {

        if (negative == true) {
            if (a < 0 && b < 0) {
                return true;
            } else {
                return false;
            }
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        posNeg posNegObj = new posNeg();
        System.out.println(posNegObj.posNeg(1, -1, false));
    }
}

