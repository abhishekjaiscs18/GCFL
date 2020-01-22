package GCFL2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int i =0;
        int counter =0;
        while (i<test) {
            int length = in.nextInt();
            in.nextLine();
            String[] a = in.nextLine().trim().split(" ");
            int[] arr = new int[a.length];
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1] = Integer.parseInt(a[i1]);
            }
            Arrays.sort(arr);
            System.out.println("Min=" + arr[0] + " Max=" + arr[arr.length-1]);
            i++;
        }
    }
}
