import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07021 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        List<String> list = new LinkedList<>();
        while (in.hasNext()) {
            if(in.hasNextInt())
                in.nextInt();
            else list.add(in.next());
        }
        Collections.sort(list);
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
