package j07018;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(sv);
        }
    }
}
