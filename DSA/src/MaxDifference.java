
public class MaxDifference {
	
	public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 6, 8 }; // Example array
        int maxDifference = findMaxDifference(arr);
        System.out.println("Maximum difference: " + maxDifference);
    }

    public static int findMaxDifference(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int minVal = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minVal > maxDiff) {
                maxDiff = arr[i] - minVal;
            }

            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        return maxDiff;
    }

}
