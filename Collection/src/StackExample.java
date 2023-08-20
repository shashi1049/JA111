import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.empty());

        int position = stack.search("Banana");
        System.out.println("Position of 'Banana': " + position);
    }

}
