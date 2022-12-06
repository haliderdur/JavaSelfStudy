package SelfStudy.VoidMethod_ParametersPractise;

public class SalimEtut {
    public static void main(String[] args) {
        greeting();
        System.out.println("---------------");

        sum(5,10);
    }

    public static String greeting(){
        String result = "";
        result = "Welcome onboard!";
        System.out.println(result);
        return result;
    }

    public static void sum(int num1,int num2){
        int total = num1 + num2;
        System.out.println(total);
    }
}
