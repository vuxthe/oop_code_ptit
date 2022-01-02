package vdv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<VDV> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            VDV vdv = new VDV(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(vdv);
        }
        ArrayList<SortVDV> sortByRank = new ArrayList<>();
        for (VDV vdv : ds) {
            SortVDV sortVDV = new SortVDV(vdv.getId(), vdv.getName(), vdv.thanhTich(), vdv.uuTien(), vdv.ketQua(), ranked(ds, vdv));
            sortByRank.add(sortVDV);
        }
        Collections.sort(sortByRank);
        for (SortVDV i : sortByRank)
            System.out.println(i);
    }

    static int ranked(ArrayList<VDV> ds, VDV x) {
        int dem = 1;
        for (VDV vdv : ds) {
            if(!vdv.equals(x)) {
                if(x.ketQua().compareTo(vdv.ketQua()) > 0) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
