import java.util.Map;

public class ConfigurationManager {
    String hostname;
    String port;
    String nom;

    private static ConfigurationManager instance;

    private ConfigurationManager(String hostname, String port, String nom) {
        this.hostname = hostname;
        this.port = port;
        this.nom = nom;
    }

    public static synchronized ConfigurationManager getInstance(Map<String,String> map) {
        if (instance == null) {
            instance = new ConfigurationManager(map.get("db.host"), map.get("db.port"), map.get("app.name"));
        }
        return instance;
    }
}
