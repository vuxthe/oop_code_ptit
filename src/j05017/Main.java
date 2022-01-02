package j05017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Nuoc> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Nuoc nuoc = new Nuoc(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            ds.add(nuoc);
        }
        Collections.sort(ds);
        for (Nuoc nuoc : ds)
            System.out.println(nuoc);
    }
}
