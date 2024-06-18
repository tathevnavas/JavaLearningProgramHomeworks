package hw3.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    public User user;
    private final Map<String, AccessLevel> accessPaths = new HashMap<>();

    public Map<String, AccessLevel> getAccessPaths() {
        return accessPaths;
    }
}
