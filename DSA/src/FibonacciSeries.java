
public class FibonacciSeries {
	
	public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

}
