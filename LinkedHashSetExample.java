
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Red");

        System.out.println("Set: " + set);

        set.remove("Blue");

        set.add("Yellow");

        System.out.println("Contains Green: " + set.contains("Green"));

        System.out.println("Final Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
