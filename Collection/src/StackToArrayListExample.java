import java.util.ArrayList;
import java.util.Stack;

public class StackToArrayListExample {
	
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        ArrayList<Integer> arrayList = new ArrayList<>(stack);

        System.out.println("Stack: " + stack);
        System.out.println("ArrayList: " + arrayList);
    }

}
