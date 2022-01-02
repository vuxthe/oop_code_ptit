package Xeploai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BANGDIEM.in"));
        ArrayList<ketqua> ds = new ArrayList<>();
        int t = Integer.parseInt(input.nextLine());
        for(int i=0;i<t;i++){
            String name = input.nextLine();
            float cc = Float.parseFloat(input.nextLine());
            float on = Float.parseFloat(input.nextLine());
            float thi = Float.parseFloat(input.nextLine());
            ds.add(new ketqua(i,name,cc,on,thi));
        }
        Collections.sort(ds);
        for(ketqua i:ds){
            System.out.println(i);
        }
    }
}
