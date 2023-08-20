import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.addFirst("Bob"); // Adding to the beginning
        names.addLast("Charlie"); // Adding to the end

        System.out.println("List: " + names);
        System.out.println("Size: " + names.size());

        String firstElement = names.getFirst();
        String lastElement = names.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        names.removeLast();
        System.out.println("List after removing last element: " + names);
    }

}
