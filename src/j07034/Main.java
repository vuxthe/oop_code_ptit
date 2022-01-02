package j07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DN.in"));
        ArrayList<Dn> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-->0) {
            ds.add(new Dn(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(ds);
        for (Dn mh : ds)
            System.out.println(mh);
    }
}
