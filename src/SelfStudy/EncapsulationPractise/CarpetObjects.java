package SelfStudy.EncapsulationPractise;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5, 10, 50, true);
        System.out.println("carpet1 = " + carpet1);
        carpet1.setPersian(false);
        System.out.println("carpet1 = " + carpet1);

        System.out.println("carpet1 width = " + carpet1.getWidth());

    }
}
