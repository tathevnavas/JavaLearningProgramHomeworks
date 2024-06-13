package hw3.singleton;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import hw3.singleton.exceptions.InsufficientRightsException;
import hw3.singleton.exceptions.NoConfigFound;

public class ServerConfig {
    private static String configFilePath = "...";
    private static HashSet<Configuration> configs;
    private static ServerConfig instance;

    public static ServerConfig getInstance() throws IOException {
        if (instance == null) {
            instance =  new ServerConfig();
        }
        return instance;
    }

    private ServerConfig() throws InsufficientRightsException, IOException {
        loadConfigs();
        // validate
    }

    public String getAccessLevel(User user, String path) {
        var userConfig = configs.stream()
            .filter(u -> u.user.getName().equals(user.getName()))
            .findFirst()
            .orElseThrow(() -> new NoConfigFound(user));
        return userConfig.getAccessPaths().get(path).toString();
    }

    private void loadConfigs() throws IOException {
        ObjectMapper mapper =  new ObjectMapper();
        configs = mapper.readValue(new File("src/main/resources/configs.json"), new TypeReference<>() {});
    }
}
