//package vidu.bai5;
//
//import vidu.test.SanPham;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    static ArrayList<SanPham> dsSp = new ArrayList<>();
//    static ArrayList<KhachHang> dsKh = new ArrayList<>();
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(new File("MUAHANG.in"));
//        int n = Integer.parseInt(in.nextLine());
//        ArrayList<SanPham> ds = new ArrayList<>();
//        while (n-- >0) {
//            ds.add(new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
//        }
//        int m = Integer.parseInt(in.nextLine());
//        for (int i = 1; i <= m; i++) {
//            dsKh.add(i, in.nextLine(), in.nextLine(), sear(in.nextLine()), Integer.parseInt(in.nextLine()), in.nextLine());
//        }
//    }
//
//    static SanPham sear(String ma) {
//        for (SanPham sp : dsSp)
//            if(sp.getMa().equals(ma))
//                return sp;
//        return null;
//    }
//}
