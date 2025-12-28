import java.util.Map;

public class MapOf {
    public static void main(String[] args) {
        Map<String,String> empty = Map.of();
        Map<String,Integer> scores = Map.of("Alice",10,"Bob",20);

        Map<String,String> capitals = Map.of(
                "France","Paris",
                "Germany","Berlin"
        );

        System.out.println(empty);
        System.out.println(scores);
        System.out.println(capitals);
    }
}
