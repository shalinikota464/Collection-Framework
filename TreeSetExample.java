
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(10);

        System.out.println("TreeSet: " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        set.remove(40);

        System.out.println("Final Set: " + set);
        System.out.println("Size: " + set.size());
    }
}
