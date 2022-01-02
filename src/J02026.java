import java.util.*;

public class J02026 {
    static int[] arr = new int[16];
    static int[] brr = new int[16];
    static int n, k;
    static ArrayList<String> set = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            n = in.nextInt();
            k = in.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr, 0, n);
            solution(0, n-1, 0);
            for (String s : set)
                System.out.println(s.trim());
            set.clear();
        }
    }

    static void solution(int start, int end, int idx) {
        if (idx == k)
        {
            String tmp = "";
            for (int i = 0; i < k; i++) {
                tmp += brr[i] + " ";
            }
            set.add(tmp);
            return;
        }

        for (int i = start; i <=end && end-i+1 >= k-idx; i++) {
            brr[idx] = arr[i];
            solution(i+1, end, idx+1);
        }
    }
}
