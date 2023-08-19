
public class MissingElementFinder {
	
	public static int findMissingElement(int[] arr, int n) {
        // Calculate the expected sum of elements from 1 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing element is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Assuming one element is missing
        int n = arr.length + 1; // Length of array if the missing element is added
        int missingElement = findMissingElement(arr, n);
        System.out.println("Missing element: " + missingElement);
    }

}
