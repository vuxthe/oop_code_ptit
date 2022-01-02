package j07014;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordSet {
    private SortedSet<String> set = new TreeSet<>();

    public WordSet(SortedSet<String> set) {
        this.set = set;
    }

    public WordSet(String nameFile) throws IOException {
        Scanner in = new Scanner(new File(nameFile));
        while (in.hasNext()) {
            set.add(in.next().toLowerCase());
        }
    }


    public WordSet difference(WordSet s) {
        SortedSet<String> giao = new TreeSet<>();
        for (String str : set) {
            if(!s.set.contains(str))
                giao.add(str);
        }
        WordSet res = new WordSet(giao);
        return res;
    }

    @Override
    public String toString() {
        for (String i : set)
            System.out.print(i + " ");
        return "";
    }
}
