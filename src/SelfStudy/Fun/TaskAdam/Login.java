package SelfStudy.Fun.TaskAdam;

public class Login {
    public static void main(String[] args) {

        Credentials credentials = new Credentials();

        System.out.println(credentials);

        System.out.println(credentials.getUsername());
        credentials.setUsername("halid");
        System.out.println(credentials.getUsername());

        System.out.println(credentials.getPassword());
        credentials.setPassword("12345");
        System.out.println(credentials.getPassword());

        System.out.println(credentials);


    }
}
