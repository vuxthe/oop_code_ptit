import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        ArrayList<Integer> am = new ArrayList<>();
        ArrayList<Integer> duong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if(x < 0)
                am.add(x);
            else duong.add(x);
        }
        Collections.sort(am);
        int dem = 0;
        long sum = 0;
        if(am.size() > 0) {
            while (dem < k && dem < am.size()) {
                am.set(dem, -am.get(dem));
                dem++;
            }
        }
        for (Integer i : am)
            duong.add(i);
        Collections.sort(duong);
        int count = (k - dem)%2;
        if(count == 1) {
            duong.set(0, - duong.get(0));
        }
        for (Integer i : duong)
            sum += i;
        System.out.println(sum);
    }
}
