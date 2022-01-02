package j07029;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        SortedMap<Integer, Integer> map = new TreeMap<>();

        for (Integer i : arr1) {
            if (primeNum(i)) {
                set1.add(i);
            }
        }
        for (Integer i : arr2) {
            if (primeNum(i)) {
                set2.add(i);
            }
        }

        for (Integer i : set1) {
            if (i*2 < 1000000 && !set2.contains(1000000 - i)
                && set1.contains(1000000 - i) && !set2.contains(i) ) {
                map.put(i, 1000000 - i);
            }
        }
        for(Integer i : map.keySet()) {
            System.out.println(i + " " + (1000000 - i));
        }

    }

    static boolean primeNum(int n) {
        if (n<2)
            return false;
        for(int i=2; i*i<=n; i++)
            if(n%i == 0)
                return false;
        return true;
    }
}
