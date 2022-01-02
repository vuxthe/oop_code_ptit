package j07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<BangDiem> ds = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++) {
            ds.add(new BangDiem(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(ds);
        for (BangDiem bd : ds)
            System.out.println(bd);
    }
}
