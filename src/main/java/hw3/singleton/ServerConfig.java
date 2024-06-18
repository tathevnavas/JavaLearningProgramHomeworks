package hw3.singleton;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import hw3.singleton.exceptions.NoConfigFound;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class ServerConfig {
    private static String configFilePath = "src/main/resources/configs.json";
    private static HashSet<Configuration> configs;
    private static ServerConfig instance;

    private ServerConfig() {
        loadConfigs();
    }

    public static ServerConfig getInstance() {
        if (instance == null) {
            instance = new ServerConfig();
        }
        return instance;
    }

    public AccessLevel getAccessLevel(User user, String path) {
        var userConfig = configs.stream()
                .filter(u -> u.user.getName().equals(user.getName()))
                .findFirst()
                .orElseThrow(() -> new NoConfigFound(user));
        return userConfig.getAccessPaths().getOrDefault(path, AccessLevel.FALSE);
    }

    private static void loadConfigs() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            configs = mapper.readValue(new File(configFilePath), new TypeReference<>() {
            });
        } catch (IOException ex) {
            throw new Error("NO DATA IN FILE");
        }
    }
}
