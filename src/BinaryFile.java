import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class BinaryFile {
    static int[] primeNum = new int[10002];
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        sang();
        SortedMap<Integer, Integer> map1 = new TreeMap<>();
        SortedMap<Integer, Integer> map2 = new TreeMap<>();
        SortedSet<Integer> prime = new TreeSet<>();
        for (Integer i : arr1) {
            if(primeNum[i] == 1 && soThuanNghich(i)) {
                if (map1.containsKey(i)) {
                    map1.put(i, map1.get(i) + 1);
                } else map1.put(i, 1);
                prime.add(i);
            }
        }
        for (Integer i : arr2) {
            if(primeNum[i] == 1 && soThuanNghich(i)) {
                if (map2.containsKey(i)) {
                    map2.put(i, map2.get(i) + 1);
                } else map2.put(i, 1);
                prime.add(i);
            }
        }

        for (Integer i : prime) {
            if(map1.containsKey(i) && map2.containsKey(i))
                System.out.println(i + " " + map1.get(i) + " " + map2.get(i));

        }
    }

    static void sang() {
        Arrays.fill(primeNum, 1);
        primeNum[0] = 0;
        primeNum[1] = 0;
        for (int i = 2; i*i <= 10000; i++) {
            if(primeNum[i] == 1) {
                for (int j = i * i; j <= 10000; j += i) {
                    primeNum[j] = 0;
                }
            }
        }
    }


    static boolean soThuanNghich(int x) {
        StringBuilder res = new StringBuilder();
        res.append(x);
        return res.toString().equals(res.reverse().toString());
    }
}