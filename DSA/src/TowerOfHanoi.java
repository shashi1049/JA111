
public class TowerOfHanoi {
	
	public static void main(String[] args) {
        int numDisks = 3; // Number of disks
        char source = 'A'; // Source peg
        char auxiliary = 'B'; // Auxiliary peg
        char destination = 'C'; // Destination peg

        solveTowerOfHanoi(numDisks, source, auxiliary, destination);
    }

    public static void solveTowerOfHanoi(int numDisks, char source, char auxiliary, char destination) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(numDisks - 1, source, destination, auxiliary);
        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);
        solveTowerOfHanoi(numDisks - 1, auxiliary, source, destination);
    }

}
