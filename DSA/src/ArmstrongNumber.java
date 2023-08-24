
public class ArmstrongNumber {
	
	public static void main(String[] args) {
        int number = 153; // Replace with the number you want to check
        boolean isArmstrong = checkArmstrong(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean checkArmstrong(int num) {
        int originalNumber = num;
        int numDigits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNumber;
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
