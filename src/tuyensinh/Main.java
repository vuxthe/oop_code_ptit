package tuyensinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            System.out.println(ts);
        }
    }
}
