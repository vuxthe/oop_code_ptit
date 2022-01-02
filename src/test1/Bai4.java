package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        Map<Integer, Integer> map1 = new HashMap<>();
        SortedMap<Integer, Integer> map2 = new TreeMap<>();
        for (Integer i : arr1) {
            if (checkNum(i)) {
                if (map1.containsKey(i))
                    map1.put(i, map1.get(i) + 1);
                else map1.put(i, 1);
            }
        }
        for (Integer i : arr2) {
            if (checkNum(i) && map1.containsKey(i)) {
                if (map2.containsKey(i))
                    map2.put(i, map2.get(i) + 1);
                else map2.put(i, 1);
            }
        }
        for (Integer i : map2.keySet()) {
            System.out.println(i + " " + map1.get(i) + " " + map2.get(i));
        }

    }

    static boolean checkNum(int x) {
        if (x<10)
            return false;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length()-1; i++) {
            if (Integer.parseInt(str.charAt(i) + "") > Integer.parseInt(str.charAt(i+1) + ""))
                return false;
        }
        return true;
    }
}
