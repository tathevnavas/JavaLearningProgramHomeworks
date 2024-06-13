package hw3.singleton;

public class Session {
    public Session(User u){
        System.out.println(String.format("Session has been created for the %s", u.toString()));
    }
}
