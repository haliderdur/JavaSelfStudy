package Replit_Loop;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 0;
        int size = 0;
        int growth = 0;

        for (int i = 1; i <= 10; i++) {
            if (year < 3) {
                growth = 1;
                size += 1;
                System.out.println("year " + i + " - growth " + growth + " cm\n" + "tree size: " + size + " cm");
            } else {
                growth = 2;
                size+=2;
                System.out.println("year " + i + " - growth " + growth + " cm\n" + "tree size: " + size + " cm");
            }
            year++;
        }
    }
}
