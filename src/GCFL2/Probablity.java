package GCFL2;

import java.util.ArrayList;
import java.util.Scanner;

public class Probablity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> no = new ArrayList<>();
        for(int i =0;i<3;i++){
            arr.add(in.nextInt());
        }
        int buying =0;
        in.nextLine();
        int amount = in.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<amount){
                buying++;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < amount){
                System.out.printf("%.3f",1.0/buying);
                System.out.println();
            }
            else{
                System.out.printf("%.3f",0.0);
                System.out.println();
            }
        }
    }
}
