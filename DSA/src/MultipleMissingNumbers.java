import java.util.ArrayList;
import java.util.List;

public class MultipleMissingNumbers {
	
	public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9 }; // Example array with missing numbers
        List<Integer> missingNumbers = findMissingNumbers(arr);
        
        System.out.println("Missing numbers: " + missingNumbers);
    }

    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        
        int n = arr.length + 1; // Total number of elements (including the missing ones)
        boolean[] found = new boolean[n + 1]; // Use an array to mark found elements
        
        for (int num : arr) {
            found[num] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!found[i]) {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }

}
