package j02025;

import java.util.*;

public class J02025 {
    static int[] brr = new int[15];
    static int[] arr = new int[15];
    static int n;
    static ArrayList<Word> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            quayLui(0);
            Collections.sort(ans);
            for (Word i : ans)
                System.out.println(i);
            ans.clear();
        }
    }

    static boolean primeNum(int sum) {
        if(sum < 2)
            return false;
        for (int i = 2; i*i <= sum ; i++) {
            if(sum%i == 0)
                return false;
        }
        return true;
    }
    static void xuLy() {
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * brr[i];
            if(brr[i] == 1)
                res.add(arr[i]);
        }
        Collections.sort(res, Collections.reverseOrder());
        if(primeNum(sum)) {
            String tmp = "";
            for (Integer i : res) {
                tmp += i + " ";
            }
            ans.add(new Word(tmp.trim()));
        }

    }
    static void quayLui(int i) {
        for (int j = 0; j < 2; j++) {
            brr[i] = j;
            if(i== n-1)
                xuLy();
            else quayLui(i+1);
        }
    }
}