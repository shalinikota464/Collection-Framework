
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "SQL");
        map.put(1, "HTML");

        System.out.println(map);

        System.out.println("Value of Key 2: " + map.get(2));

        map.remove(3);

        System.out.println("Contains Key 1: " + map.containsKey(1));

        System.out.println("Final Map: " + map);
        System.out.println("Size: " + map.size());
    }
}
