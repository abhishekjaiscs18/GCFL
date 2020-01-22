package GCFL2;

import java.util.Scanner;

public class GroupOfBoys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int j =0;
        int result =0;
        while(j<test){
            String[] arr = in.nextLine().split(" ");
            long[] arrNew = new long[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = Long.valueOf(arr[i]);
            }
            for(int i = 1;i<=arrNew[0] && i<= arrNew[1];i++){
                if(arrNew[0] % i == 0 && arrNew[1] % i == 0){
                   result =i;
                }
            }
            if(result != 1){
                System.out.println(arrNew[0]/result + " " + arrNew[1]/result);
            }
            else{
                System.out.println("Not Possible");
            }
            j++;
        }
    }
}
