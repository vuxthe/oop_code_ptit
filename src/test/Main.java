package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arr = (ArrayList<Pair>) in.readObject();
        Set<Pair> set = new LinkedHashSet<>();
        Collections.sort(arr);
        for (Pair p : arr) {
            if (p.getFirst() < p.getSecond())
                set.add(p);
        }
        for (Pair p : set)
            System.out.println(p);
    }

//    static int gcd(int a, int b) {
//        if(b == 0)
//            return a;
//        return gcd(b, a%b);
//    }

}
