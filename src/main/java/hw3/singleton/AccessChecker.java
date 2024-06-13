package hw3.singleton;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileNotFoundException;
import java.io.IOException;

final public class AccessChecker {
    private ServerConfig config = ServerConfig.getInstance();
    private static AccessChecker instance;
    private AccessChecker() throws IOException {
    }

    public static synchronized AccessChecker getInstance() throws IOException {
        if (instance == null) {
            instance = new AccessChecker();
        }
        return instance;
    }

    public boolean mayAccess(User user, String path){
        String userLevel = config.getAccessLevel(user, path);
        if(userLevel.equals("FALSE"))
            return false;
        return true;
    }

}
