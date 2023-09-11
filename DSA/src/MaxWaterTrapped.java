
public class MaxWaterTrapped {
	
	public static int maxWater(int[] heights) {
        int left = 0; // left pointer
        int right = heights.length - 1; // right pointer
        int maxWater = 0; // variable to store the maximum water trapped

        while (left < right) {
            int minHeight = Math.min(heights[left], heights[right]); // find the minimum height between the two pointers
            int width = right - left; // calculate the width of the container

            int currentWater = minHeight * width; // calculate the current water trapped between the two pointers
            maxWater = Math.max(maxWater, currentWater); // update the maximum water if necessary

            // Move the pointers inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = maxWater(heights);
        System.out.println("Maximum water that can be trapped: " + max);

}
