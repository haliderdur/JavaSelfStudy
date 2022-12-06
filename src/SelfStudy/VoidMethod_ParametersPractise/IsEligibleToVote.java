package SelfStudy.VoidMethod_ParametersPractise;

/*
Task1: create a method that can check if a person is eligible to vote
 */
public class IsEligibleToVote {
    public static void main(String[] args) {
        isELigibleToVote(14, "portugal");
    }

    public static void isELigibleToVote(int age, String country) {
        if (age >= 18 && country.equalsIgnoreCase("Portugal")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }


}
