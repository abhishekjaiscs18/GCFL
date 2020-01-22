package GCFL2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int k =0;
        while (k<test) {
            double a = in.nextDouble();
            double result = Math.sqrt(a);
            Pattern pattern = Pattern.compile("\\d*(\\.[0]*)$");
            Matcher matcher = pattern.matcher(String.valueOf(result));
            boolean isMatch = matcher.matches();
            if (isMatch) {
                System.out.println("Perfect Square");
            } else {
                System.out.println("Not a Perfect Square");
            }
            k++;
        }
    }
}
