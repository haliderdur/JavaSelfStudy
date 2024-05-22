package CodingBat.Warmup1;

public class diff21 {

    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    */

    public int diff21(int n) {

        int sum = (21 - n) * -2;
        if (n > 21) {
            return sum;
        }
        return 21 - n;
    }

    public static void main(String[] args) {
        diff21 diff21Obj = new diff21();
        System.out.println(diff21Obj.diff21(11));
    }

}
