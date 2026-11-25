
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("SQL");
        set.add("Java");

        System.out.println(set);

        set.remove("SQL");

        System.out.println("Contains Java: " + set.contains("Java"));

        System.out.println("Final Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
