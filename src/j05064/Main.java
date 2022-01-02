package j05064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int countHT = 0, countHP = 0;
        for (int i = 0; i < n; i++) {
            GiaoVien gv = new GiaoVien(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            if(gv.getChucVu().equals("GV"))
                System.out.println(gv);
            else if(gv.getChucVu().equals("HT") && countHT < 1) {
                System.out.println(gv);
                countHT++;
            }
            else if(gv.getChucVu().equals("HP") && countHP < 2) {
                System.out.println(gv);
                countHP++;
            }
        }
    }
}
