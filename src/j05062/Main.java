package j05062;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soSv = in.nextInt(), soHb = Integer.parseInt(in.nextLine().trim());
        ArrayList<SinhVien> ds = new ArrayList<>();
        ArrayList<SinhVien> sort_ds = new ArrayList<>();
        for (int i = 0; i < soSv; i++) {
            SinhVien sv = new SinhVien(in.nextLine(), in.nextFloat(), Integer.parseInt(in.nextLine().trim()));
            ds.add(sv);
            sort_ds.add(sv);
        }
        Collections.sort(sort_ds);
        float gpaDat = sort_ds.get(soHb-1).getGpa();
        for (SinhVien sv : ds) {
            System.out.print(sv.getName() + ": ");
            if(sv.getGpa()>=gpaDat ) {
                System.out.println(sv.loaiHocBong(1));
            }else System.out.println("KHONG");
        }
    }
}
