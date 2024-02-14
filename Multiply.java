import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
	int iterations = 0;
        while (N >= 10) {
            int product = 1;
            while (N > 0) {
                product *= N % 10;
                N /= 10;
            }
            N = product;
            iterations++;
        }

        System.out.println("Number of iterations required: " + iterations);
    }
}
        
