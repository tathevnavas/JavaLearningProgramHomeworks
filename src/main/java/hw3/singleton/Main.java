package hw3.singleton;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new SessionManager().createSession(new User("Kate"), "Accessed Path 1");
    }
}
