package GCFL2;

import java.util.Scanner;

public class ChocolateOffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int allHave = in.nextInt();
        in.nextLine();
        int days = in.nextInt();
        in.nextLine();
        int givesChoc = in.nextInt();
        in.nextLine();
        int totalChoc = 0;
        for(int i = 0;i<days;i++){
            totalChoc  = allHave + givesChoc;
            allHave = totalChoc;
        }
        totalChoc = totalChoc - days;
        System.out.println(totalChoc);


    }
}
