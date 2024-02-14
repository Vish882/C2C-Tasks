public static int LargestGap(int[] arr) {
  Arrays.sort(arr);
  int largestGap = 0, previousElement = arr[0];
  for (int i = 1; i < arr.length; i++) {
    int currentGap = arr[i] - previousElement;
    largestGap = Math.max(largestGap, currentGap);
    previousElement = arr[i];
  }
  return largestGap;
}

