
public class MissingElement {
	
	public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 }; // Example array with one missing element
        int n = arr.length + 1; // Total number of elements (including the missing one)

        int xor1 = 0; // XOR of elements in the array
        for (int num : arr) {
            xor1 ^= num;
        }

        int xor2 = 0; // XOR of natural numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }

        int missingElement = xor1 ^ xor2;
        System.out.println("Missing element: " + missingElement);
    }

}
