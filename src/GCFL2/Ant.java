package GCFL2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initialPop = in.nextDouble();
        in.nextLine();
        double times = in.nextDouble();
        in.nextLine();
        int days = in.nextInt();
        double population = 0;
        for(int i =0;i<days;i++){
            population = initialPop*times;
            initialPop = population;
        }
        BigInteger k = BigDecimal.valueOf(initialPop).toBigInteger();
        System.out.println(k);
    }
}

class test{
    public static void main(String[] args) {
        double a = 4;
        System.out.println((int)a);
    }
}