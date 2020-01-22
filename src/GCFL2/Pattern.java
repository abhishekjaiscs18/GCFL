package GCFL2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a; i1++) {
                if (i1 == a / 2) {
                    System.out.print("*");
                } else if (i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a - 1; i1++) {
                if (i1 == 0) {
                    System.out.print("*");
                }
                if (i == a - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a; i1++) {
                if (i1 == 0 || i1 == a - 1) {
                    System.out.print("*");
                } else if (i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        int k = (a+1)/2;
        for(int i=0;i<k-1;i++){
            for(int j=0;j<a;j++)
                if(j==i || j==a-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println("");
            for(int j=0;j<a;j++)
                if(j==i || j==a-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println("");
        }
        for(int i=0;i<a;i++)
            if(i == k-1)
                System.out.print("*");
            else
                System.out.print(" ");
        System.out.println();
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a - 1; i1++) {
                if (i == 0 || i == a / 2 || i == a - 1) {
                    System.out.print("*");
                }
                if (i1 == 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a - 1; i1++) {
                if(i == 0 || i == a-1){
                    System.out.print("*");
                }
                if(i1 == 0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

