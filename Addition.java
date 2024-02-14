import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
	int i = 0;
        while (N >= 10) {
            int sum =0;
            while (N > 0) {
                sum *= N % 10;
                N /= 10;
            }
            N = sum;
            i++;
        }

        System.out.println("Number of iterations required: " + i);
    }
}
        
