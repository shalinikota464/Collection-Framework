
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Java");
        map.put(10, "Python");
        map.put(20, "SQL");
        map.put(10, "HTML");

        System.out.println("TreeMap: " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        map.remove(20);

        System.out.println("Final Map: " + map);
        System.out.println("Size: " + map.size());
    }
}
