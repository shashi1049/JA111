
public class MaxElementInArray {
	
	public static void main(String[] args) {
        int[] arr = { 12, 45, 8, 27, 67, 3, 92 }; // Example array
        int maxElement = findMaxElement(arr);
        System.out.println("Maximum element in the array: " + maxElement);
    }

    public static int findMaxElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
