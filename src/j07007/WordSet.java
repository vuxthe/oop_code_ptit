package j07007;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordSet {
    private String tenFile;
    SortedSet<String> set = new TreeSet<>();

    public WordSet(String tenFile) throws IOException {
        Scanner in = new Scanner(new File(tenFile));
        while (in.hasNext()) {
            set.add(in.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        for (String str : set)
            System.out.println(str);
        return "";
    }
}
