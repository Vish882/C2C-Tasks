public class MinRemovals {

    public static int minRemovals(String string) {
        int removals = 0;
        int i = 0;
        int j = 1;

        while (j < string.length()) {
            if (string.charAt(i) == string.charAt(j)) {
                removals++;
                j++;
            } else {
                i = j;
                j++;
            }
        }

        if (i > 0 && string.charAt(i - 1) == string.charAt(i)) {
            removals++;
        }

        return removals;
    }

    public static void main(String[] args) {
        String string1 = "AABAA";
        String string2 = "ABAB";
        String string3 = "AAABBB";

        System.out.println(minRemovals(string1));  // Output: 1
    }
}
