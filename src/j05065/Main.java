package j05065;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        while (n-- >0) {
            String ma = in.next();
            String ten = in.nextLine().trim();
            if(ma.substring(0, 2).equals("GD") && Integer.parseInt(ma.substring(4)) > 1
                || ma.substring(0, 2).equals("TP") && Integer.parseInt(ma.substring(4)) > 3
                    || ma.substring(0, 2).equals("PP") && Integer.parseInt(ma.substring(4)) > 3) {
                String maMoi = "NV" + ma.substring(2);
                ds.add(new NhanVien(maMoi, ten));
            } else ds.add(new NhanVien(ma, ten));
        }

        Collections.sort(ds);

        int test = in.nextInt();
        while (test-- >0) {
            String ten = in.next();
            for (NhanVien nv : ds) {
                if (check(nv.getTen(), ten))
                    System.out.println(nv);
            }
            System.out.println();
        }
    }
    static boolean check(String s, String q) {
        StringBuilder tmp = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s.toLowerCase().trim());
        while (st.hasMoreTokens()) {
            tmp.append(st.nextToken());
        }
        return tmp.toString().contains(q.toLowerCase());
    }
}
