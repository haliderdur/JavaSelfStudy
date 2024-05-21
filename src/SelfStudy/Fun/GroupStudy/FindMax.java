package SelfStudy.Fun.GroupStudy;

public class FindMax {

    public static void main(String[] args) {

        int[] nums = {15, 25, 78, 12, 46, 7, 11, -4, -18};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
