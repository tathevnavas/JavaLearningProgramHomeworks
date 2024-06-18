package hw3.singleton;

import hw3.singleton.exceptions.InsufficientRightsException;

public class SessionManager {
    private static AccessChecker access = AccessChecker.getInstance();

    public Session createSession(User user, String accessedPath) {
        if (access.mayAccess(user, accessedPath)) {
            return new Session(user);
        } else {
            throw new InsufficientRightsException(user, accessedPath);
        }
    }
}
