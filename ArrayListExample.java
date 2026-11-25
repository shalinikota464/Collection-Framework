
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("SQL");
        list.add("Java");

        System.out.println(list);

        System.out.println("First Element: " + list.get(0));

        list.set(1, "HTML");

        list.remove("SQL");

        System.out.println("Contains Java: " + list.contains("Java"));

        System.out.println("Final List: " + list);
        System.out.println("Size: " + list.size());
    }
}
