package hw3.singeltonTest;

import hw3.singleton.exceptions.InsufficientRightsException;
import hw3.singleton.exceptions.NoConfigFound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import hw3.singleton.SessionManager;
import hw3.singleton.User;

class singeltonDPTest {

    private final SessionManager manager = new SessionManager();

    @Test
    @DisplayName("Check Katé's missing access")
    void missingAccessTest() {
        assertThrows(
                InsufficientRightsException.class,
                () -> manager.createSession(new User("Kate"), "Accessed Path 1")
        );
    }

    @Test
    @DisplayName("Check Sarah is not missing access")
    void existingAccessTest() {
        assertDoesNotThrow(() -> manager.createSession(new User("Sarah"), "Accessed Path 2"));
    }

    @Test
    @DisplayName("Check Jackson missing access")
    void missingConfigsTest() {
        assertThrows(
                NoConfigFound.class,
                () -> manager.createSession(new User("Jackson"), "Accessed Path 2")
        );
    }
}
