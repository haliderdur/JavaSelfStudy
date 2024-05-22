package CodingBat.Warmup1;

public class sleepIn {

    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        sleepIn person = new sleepIn();
        System.out.println(person.sleepIn(false, true));
    }

}
