package vidu;

import java.io.*;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in1 = new Scanner(new File("VANBAN.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> ds = (ArrayList<String>) in2.readObject();

        Set<String> set2 = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        for (String i : ds)
            if(!i.equals(""))
                set2.add(i.toLowerCase());

        while (in1.hasNextLine()) {
            String[] tmp = in1.nextLine().trim().split("\\s+");
            for (String i : tmp) {
                if (set2.contains(i.toLowerCase())  && !i.equals("")) {
                    set1.add(i.toLowerCase());
                }
            }
        }

        for (String i : set1)
            System.out.println(i);
    }
}
