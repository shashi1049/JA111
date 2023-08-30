
public class BinarySearchExample {
	
	public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;

        int result = binarySearch(sortedArray, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            if (arr[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Element not found
    }

}
