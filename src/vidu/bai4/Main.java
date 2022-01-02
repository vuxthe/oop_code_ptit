package vidu.bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Khach> dsKH = new ArrayList<>();
    static ArrayList<LoaiPhong> dsP = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- >0) {
            dsP.add(new LoaiPhong(in.nextLine()));
        }

        int m = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= m; i++) {
            String ten = in.nextLine(), maP = in.nextLine();
            dsKH.add(new Khach(i, ten, maP, in.nextLine(), in.nextLine(), searchById(maP.charAt(2)+"")));
        }
        Collections.sort(dsKH);
        for (Khach k : dsKH)
            System.out.println(k);
    }

    static LoaiPhong searchById(String ma) {
        for (LoaiPhong p : dsP)
            if(p.getMa().equals(ma))
                return p;
        return null;
    }
}
