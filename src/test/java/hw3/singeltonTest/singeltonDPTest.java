package hw3.singeltonTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hw3.singleton.SessionManager;
import hw3.singleton.User;

public class singeltonDPTest {
    @Test
    @DisplayName("Check Katé's missing access")
    void missingAccessTest(){
        new SessionManager().createSession(new User("Kate"), "Accessed Path 1");
    }

    @Test
    @DisplayName("Check Sarah's missing access")
    void existingAccessTest(){
        new SessionManager().createSession(new User("Sarah"), "Accessed Path 2");
    }

    @Test
    @DisplayName("Check Jackson missing access")
    void missingConfigsTest(){
        new SessionManager().createSession(new User("Jackson"), "Accessed Path 2");
    }
}
