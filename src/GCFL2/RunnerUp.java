package GCFL2;

import java.util.*;

public class RunnerUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> checker = new ArrayList<>();
        HashSet<Integer> container = new HashSet<>();
        ArrayList<Character> finalArr = new ArrayList<>();
        int tst = in.nextInt();
        in.nextLine();
        int z = 0;
        while (z < tst) {
            String a = in.nextLine().trim();
            int counter = 0;
            int ansCheccker = 0;
            char[] a1 = a.toCharArray();
            for (int i = 0; i < a1.length; i++) {
                for (int i1 = 0; i1 < a1.length; i1++) {
                    if (a1[i] == a1[i1]) {
                        counter++;
                    }
                }
                hashMap.put(a1[i], counter);
                counter = 0;
            }
            for (char i : hashMap.keySet()) {
                container.add(hashMap.get(i));
            }
            if (container.size() == 1) {
                System.out.println(-1);
            } else {
                checker.addAll(container);
                Collections.sort(checker);
                ansCheccker = checker.get(checker.size() - 2);
                for (char k : hashMap.keySet()) {
                    if (hashMap.get(k) == ansCheccker) {
                        finalArr.add(k);
                    }
                }
                    System.out.println(finalArr.get(0));
            }
            System.out.println();
            z++;
        }

    }
}