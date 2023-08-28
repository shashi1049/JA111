
public class MultipleMissingNumbersWithoutCollection {
	
	public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9 }; // Example array with missing numbers
        int[] missingNumbers = findMissingNumbers(arr);
        
        System.out.print("Missing numbers: ");
        for (int num : missingNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] findMissingNumbers(int[] arr) {
        int n = arr.length + 1; // Total number of elements (including the missing ones)
        boolean[] found = new boolean[n + 1]; // Use an array to mark found elements
        
        for (int num : arr) {
            found[num] = true;
        }
        
        int countMissing = 0;
        for (boolean isFound : found) {
            if (!isFound) {
                countMissing++;
            }
        }
        
        int[] missingNumbers = new int[countMissing];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (!found[i]) {
                missingNumbers[idx++] = i;
            }
        }
        
        return missingNumbers;
    }

}
