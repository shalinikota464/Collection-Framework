
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "SQL");
        map.put(3, "HTML");

        System.out.println("Map: " + map);

        System.out.println("Value of Key 1: " + map.get(1));

        map.remove(2);

        map.put(4, "React");

        System.out.println("Final Map: " + map);
        System.out.println("Size: " + map.size());
    }
}
