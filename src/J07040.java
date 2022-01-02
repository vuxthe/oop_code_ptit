import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in1 = new Scanner(new File("VANBAN.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> ds = (ArrayList<String>) in2.readObject();

        Set<String> set2 = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        for (String i : ds) {
            String[] tmp = i.split("\\s+");
            for (String j : tmp)
                set2.add(j.toLowerCase());
        }

        while (in1.hasNext()) {
            String tmp = in1.next().toLowerCase();
            if(set2.contains(tmp)) {
                set1.add(tmp);
            }
        }

        for (String i : set1)
            System.out.println(i);
    }
}
