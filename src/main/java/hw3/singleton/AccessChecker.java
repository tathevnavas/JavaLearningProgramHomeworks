package hw3.singleton;

public final class AccessChecker {
    private final ServerConfig config = ServerConfig.getInstance();
    private static AccessChecker instance;

    public static synchronized AccessChecker getInstance() {
        if (instance == null) {
            instance = new AccessChecker();
        }
        return instance;
    }

    public boolean mayAccess(User user, String path) {
        AccessLevel userLevel = config.getAccessLevel(user, path);
        return userLevel == AccessLevel.TRUE;
    }
}
