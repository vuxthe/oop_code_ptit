import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        SortedSet<String> set = new TreeSet<>();
        while (in.hasNext()) {
            if(in.hasNextInt()) {
                in.nextInt();
            }else {
                set.add(in.next());
            }
        }
        for(String str : set)
            System.out.println(str);
    }
}
