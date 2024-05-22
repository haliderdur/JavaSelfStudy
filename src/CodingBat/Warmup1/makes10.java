package CodingBat.Warmup1;

public class makes10 {

    /*
      Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

      makes10(9, 10) → true
      makes10(9, 9) → false
      makes10(1, 9) → true
     */

    public boolean makes10(int a, int b) {

        int sum = a + b;
        if (a == 10 || b == 10 || sum == 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        makes10 makes10Obj = new makes10();
        System.out.println(makes10Obj.makes10(1, 9));
    }
}
