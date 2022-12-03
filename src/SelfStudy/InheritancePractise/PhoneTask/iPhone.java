package SelfStudy.InheritancePractise.PhoneTask;

public class iPhone extends Phone {

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber + " through facetime");
    }

    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is sending email to " + email + " through facetime");
    }


}
