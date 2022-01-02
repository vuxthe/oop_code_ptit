package j05071;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<ThanhPho> dstp = new ArrayList<>();
    static ArrayList<CuocGoi> dscg = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (n-- >0) {
            ThanhPho tp = new ThanhPho(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            dstp.add(tp);
        }

        int m = Integer.parseInt(in.nextLine());
        while (m-- >0) {
            String sdt = in.next();
            CuocGoi cg = new CuocGoi(sdt, searchById(maVung(sdt)),in.next(), in.next());
            dscg.add(cg);
        }
        Collections.sort(dscg);
        for (CuocGoi cg : dscg)
            System.out.println(cg);
    }

    static String maVung(String sdt) {
        if(sdt.charAt(0) == '0')
            return sdt.substring(1,3);
        return sdt.substring(0,2);
    }
    static ThanhPho searchById(String id) {
        for (ThanhPho tp : dstp) {
            if(tp.getMaVung().equals(id))
                return tp;
        }
        return null;
    }
}
