package SelfStudy.InheritancePractise.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone();
        iPhone1.setInfo("Apple", "iphone 14 pro", "small", 1200, "white");
        System.out.println(iPhone1);

        iPhone1.call(965359512);
        iPhone1.text(256456123);
        iPhone1.faceTime("\"haliderdur@gmail.com\"");
        iPhone1.faceTime(856445556);

        System.out.println();

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung", "Galaxy", "medium", 800, "black");
        System.out.println(samsung1);

        samsung1.call(456456123);
        samsung1.text(123456789);
        samsung1.freeze();

        System.out.println();

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia", "6630", "large", 50, "Red");
        System.out.println(nokia1);

        nokia1.text(789456369);
        nokia1.selfDefense();

    }
}
