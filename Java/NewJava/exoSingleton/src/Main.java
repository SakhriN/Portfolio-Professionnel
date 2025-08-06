import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("db.host","localhost");
        map.put("db.port","5432");
        map.put("app.name","MyApplication");

        ConfigurationManager bloup = ConfigurationManager.getInstance(map);

        System.out.println("{ \"db.host\": \"" +
                bloup.hostname +
                "\", \"db.port\": \"" +
                bloup.port +
                "\", \"app.name\": \"" +
                bloup.nom +
                "\" }" );
    }
}