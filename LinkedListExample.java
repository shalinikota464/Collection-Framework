
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println(list);

        list.addFirst("Orange");
        list.addLast("Grapes");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("Final List: " + list);
        System.out.println("Size: " + list.size());
    }
}
