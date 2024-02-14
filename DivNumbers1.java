public class DivNumbers1 {
public static void main(String args[]) {
    for (int i = 1; i <= 1000; i++) {
      boolean divisible = true;

      if (i%5 == 0) {
        divisible = false;
      }

      if (divisible) {
        System.out.println(i);
      }
    }
  }
}