
public class SubstringExample {
	
	public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Extract a substring starting from index 7 (inclusive)
        String substring1 = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring1);
        
        // Extract a substring starting from index 0 (inclusive) to index 5 (exclusive)
        String substring2 = originalString.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);
    }

}
