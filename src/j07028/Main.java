package j07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static ArrayList<GiangVien> dsgv = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("MONHOC.in"));
        Scanner in2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner in3 = new Scanner(new File("GIOCHUAN.in"));

        Map<String, String> map = new LinkedHashMap<>();
        int n = Integer.parseInt(in2.nextLine());
        for (int i = 0; i < n; i++) {
            map.put(in2.next(), in2.nextLine().trim());
        }

        float[] soGio = new float[n+1];
        Arrays.fill(soGio, 0f);


        int m = Integer.parseInt(in3.nextLine());
        while (m-- >0) {
            String maGv = in3.next();
            String maMh = in3.next();
            float sl = Float.parseFloat(in3.nextLine().trim());
            int stt = Integer.parseInt(maGv.substring(2));
            soGio[stt] += sl;
        }

        for (String str : map.keySet()) {
            int stt = Integer.parseInt(str.substring(2));
            String ten = map.get(str);
            if(soGio[stt] > 0) {
                System.out.println(ten + " " + String.format("%.2f", soGio[stt]));
            }
        }
    }

}
