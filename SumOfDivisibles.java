public class SumOfDivisibles {

    public static int sumOfDivisible(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 4 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfDivisible(n);
        System.out.println("The sum of integers divisible by 3 and 5 but not 4 up to " + n + " is: " + sum);
    }
}
