import java.util.Arrays;
import java.util.Scanner;

public class J01020 {
    static boolean[] digits = new boolean[10];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            if (n==0)
                System.out.println("Impossible");
            else {
                String tmp = String.valueOf(n);
                Arrays.fill(digits, false);
                if (check(n)) {
                    System.out.println(n);
                }
                //            for (int i = 0; i < 10; i++) {
                //                digits[i]
                //            }
                int dem = 2;
                while (true) {
                    if (check(n * dem)) {
                        System.out.println(n * dem);
                        break;
                    }
                    dem++;
                }
            }

        }
    }

    static boolean check(int n) {
        String tmp = String.valueOf(n);
        for (int i = 0; i < tmp.length(); i++) {
            if(checkTrue())
                return true;
            int digit = Integer.parseInt(String.valueOf(tmp.charAt(i)));
            digits[digit] = true;
        }
        return checkTrue();
    }

    static boolean checkTrue() {
        for (int i = 0; i < 10;i++) {
            if (!digits[i])
                return false;
        }
        return true;
    }
}
