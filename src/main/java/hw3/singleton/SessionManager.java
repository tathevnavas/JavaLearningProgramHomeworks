package hw3.singleton;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

import hw3.singleton.exceptions.InsufficientRightsException;

public class SessionManager {
    private static AccessChecker access;

    static {
        try {
            access = AccessChecker.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Session createSession(User user, String accessedPath) {
        if (access.mayAccess(user, accessedPath)) {
            return new Session(user);
        } else {
            throw new InsufficientRightsException(user, accessedPath);
        }
    }

}
