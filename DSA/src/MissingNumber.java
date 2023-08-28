
public class MissingNumber {
	
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 }; // Example array with a missing number
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Total number of elements (including the missing one)
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }

}
