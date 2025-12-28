import java.util.List;

public class ListOfDemo {
    public static void main(String[] args) {
        List<String> empty = List.of();
        List<Integer> numbers = List.of(1,2,3,3);
        List<String> names = List.of("Alice","Bob","Charlie");
        final List<String> ROLES = List.of("ADMIN","USER","GUEST");

        System.out.println(empty);
        System.out.println(numbers);
        System.out.println(names);
        System.out.println(ROLES);

        getTags();
    }

    public static List<String> getTags()
    {
        return List.of("java","immutable","collections");
    }
}
