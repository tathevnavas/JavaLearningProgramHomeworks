package hw3.singleton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {
    public User user;
    //public AccessLevels accessLevel;
    private Map<String, AccessLevels> accessPaths = new HashMap<>();

    public Configuration(){

    }

    public Map<String, AccessLevels> getAccessPaths() {
        return accessPaths;
    }
}
