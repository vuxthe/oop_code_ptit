import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;


public class Bai1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        SortedMap<Integer, Integer> map1 = new TreeMap<>();
        SortedMap<Integer, Integer> map2 = new TreeMap<>();

        for (Integer i : ds1) {
            if(check(i)) {
                if(map1.containsKey(i)) {
                    map1.put(i, map1.get(i) + 1);
                }else map1.put(i, 1);
            }
        }

        for (Integer i : ds2) {
            if(check(i) && map1.containsKey(i)) {
                if(map2.containsKey(i)) {
                    map2.put(i, map2.get(i) + 1);
                }else map2.put(i, 1);
            }
        }


        int count = 0;
        for (Integer i : map2.keySet()) {
            if(count == 10) break;
            System.out.println(i + " " + (map1.get(i) + map2.get(i)));
            count++;
        }
    }

    static boolean check(int n) {
        String res = String.valueOf(n);
        StringBuilder rs = new StringBuilder();
        rs.append(res);
        if (!rs.toString().equals(rs.reverse().toString()))
            return false;
        if (res.length() % 2 == 0)
            return false;
        for (int i = 0; i < res.length(); i++) {
            if(Integer.parseInt(String.valueOf(res.charAt(i))) % 2 == 0)
                return false;
        }
        return true;
    }
}
