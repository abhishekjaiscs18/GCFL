package GCFL2;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n;
        int min;
        for (int i = 1;i <= T; i++) {
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            min = Math.abs(arr[1] - arr[0]);
            for (int l = 2; l < arr.length; l++) {
                if (Math.abs(arr[l] - arr[l - 1]) < min) {
                    min = Math.abs(arr[l] - arr[l - 1]);
                }
            }
            System.out.println(min);
        }
    }
}
