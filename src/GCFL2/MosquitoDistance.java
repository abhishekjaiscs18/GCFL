package GCFL2;

import java.util.Scanner;

public class MosquitoDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        while(k<test){
            String[] arr = in.nextLine().trim().split(" ");
            double[] arrInt = new double[arr.length];
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = Double.parseDouble(arr[i]);
            }
            double base =  arrInt[2]*arrInt[1];
            double hypo = Math.pow(arrInt[0],2) + Math.pow(base,2);
            double newDist = Math.sqrt(hypo);
            double distCovered = newDist-arrInt[0];
            double newTime = Double.valueOf(distCovered)/arrInt[2];
            System.out.printf("%.3f",newTime);
            System.out.println();
            k++;
        }
    }
}
