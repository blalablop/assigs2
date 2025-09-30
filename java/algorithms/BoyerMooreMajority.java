package algorithms;

public class BoyerMooreMajority {
    public static int majorityElement(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int candidate = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int occur = 0;
        for (int x : arr) if (x == candidate) occur++;
        if (occur > arr.length/2) return candidate;
        return Integer.MIN_VALUE;
    }
}
