
public class ArmstrongNumbersInRange {
	
	public static void main(String[] args) {
        int lowerLimit = 1; // Lower limit of the range
        int upperLimit = 1000; // Upper limit of the range

        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + ":");
        findArmstrongNumbersInRange(lowerLimit, upperLimit);
    }

    public static void findArmstrongNumbersInRange(int lower, int upper) {
        for (int num = lower; num <= upper; num++) {
            if (isArmstrongNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numDigits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

}
