import java.util.HashMap;
import java.util.Map;

public class SocksPairCounter {
	
	public static int countPairs(int[] socks) {
        // Create a HashMap to store the count of each sock color
        Map<Integer, Integer> sockCount = new HashMap<>();

        // Count the socks
        for (int sock : socks) {
            sockCount.put(sock, sockCount.getOrDefault(sock, 0) + 1);
        }

        // Count the pairs
        int pairCount = 0;
        for (int count : sockCount.values()) {
            pairCount += count / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] socks = {1, 2, 1, 2, 1, 3, 2};
        int pairCount = countPairs(socks);
        System.out.println("Number of pairs of socks: " + pairCount);
    }

}
