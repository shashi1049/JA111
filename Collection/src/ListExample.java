import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicates are allowed

        System.out.println("List: " + numbers);
        System.out.println("Size: " + numbers.size());

        int secondElement = numbers.get(1);
        System.out.println("Second Element: " + secondElement);

        numbers.remove(0);
        System.out.println("List after removing first element: " + numbers);
    }

}
