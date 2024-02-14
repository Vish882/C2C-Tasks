import java.util.Scanner;

public class MobileNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mobile number: ");
        long mobileNumber = scanner.nextLong();

        String result = playGame(mobileNumber);

        System.out.println("Game result: " + result);
    }

    public static String playGame(long mobileNumber) {
        StringBuilder finalResult = new StringBuilder();

        String numberString = String.valueOf(mobileNumber);
        for (int i = 0; i < numberString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberString.charAt(i));
            boolean isOdd = currentDigit % 2 != 0;
            int sum = 0;

            // Ensure we don't exceed the number's length:
            int j = i;
            while (true) {
                sum += currentDigit;
                if ((sum % 2 == 0) == isOdd) {
                    break;
                }
                // Wrap around to the beginning if necessary:
                j = (j + 1) % numberString.length();
                currentDigit = Character.getNumericValue(numberString.charAt(j));
            }

            finalResult.append(sum);
        }

        return finalResult.toString();
    }
}

