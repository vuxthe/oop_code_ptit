package test1.bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<MonHoc> dsmh = new ArrayList<>();
    static ArrayList<CaThi> dsct = new ArrayList<>();
    static ArrayList<LichThi> dslt = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in1 = new Scanner(new File("MONTHI.in"));
        Scanner in2 = new Scanner(new File("CATHI.in"));
        Scanner in3 = new Scanner(new File("LICHTHI.in"));
        int n = Integer.parseInt(in1.nextLine());
        for (int i = 0; i<n; i++) {
            dsmh.add(new MonHoc(in1.nextLine(), in1.nextLine(), in1.nextLine()));
        }

        int m = Integer.parseInt(in2.nextLine());
        for (int i = 1; i <= m; i++) {
            dsct.add(new CaThi(i, in2.nextLine(), in2.nextLine(), in2.nextLine()));
        }

        int q = Integer.parseInt(in3.nextLine());
        for (int i = 1; i <= q; i++) {
            dslt.add(new LichThi(sear2(in3.next()), sear(in3.next()), in3.next(), in3.nextInt()));
        }
        Collections.sort(dslt);
        for (LichThi lt: dslt)
            System.out.println(lt);
    }

    static MonHoc sear(String ma) {
        for (MonHoc mh : dsmh) {
            if (mh.getMa().equals(ma))
                return mh;
        }
        return null;
    }

    static CaThi sear2(String ma) {
        for (CaThi ct:dsct) {
            if (ct.getMa().equals(ma))
                return ct;
        }
        return null;
    }
}
