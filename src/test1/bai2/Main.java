package test1.bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<CaThi> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ds.add(new CaThi(i, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (CaThi ct : ds)
            System.out.println(ct);
    }
}
