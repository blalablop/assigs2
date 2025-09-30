package cli;

import algorithms.*;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,5,6};
        InsertionSort.sort(arr);
        System.out.println("Insertion sorted:");
        for (int x: arr) System.out.print(x + " ");
        System.out.println();
    }
}
