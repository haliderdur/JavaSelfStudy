package SelfStudy.Fun.TaskAdam;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Person person1 = new Person();

        System.out.println(person1.getFirstName()); //"undefined"
        System.out.println(person1.getLastName()); //"undefined"
        System.out.println(person1.getAge()); // -1
        System.out.println(person1.toString()); //"undefined | undefined | -1"

        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAge(44);

        System.out.println(person1.toString()); // "John | Doe | 44"

        Person person2 = new Person("Fatima", "Lee", 22);

        System.out.println(person2.getFirstName()); //"Fatima"
        System.out.println(person2.getLastName()); //"Lee"
        System.out.println(person2.getAge()); // 22
        System.out.println(person2.toString()); //"Fatima | Lee | 22"

    }
}
