import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int test = in.nextInt();
        int test = 1;
//        while (test-- >0) {
            int n = in.nextInt(), m = in.nextInt();
            int[] arr = new int[m];
            int[] brr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = in.nextInt();
                brr[i] = n - arr[i];
            }
            long ans = Math.max(solution(arr), solution(brr));
            System.out.println(ans);
//        }
    }

    static long solution(int[] arr) {
        int len = arr.length;
        Stack<Integer> s = new Stack<>();
        long maxArea = 0;
        for (int i = 0; i <= len; i++) {
            int h = (i == len ? 0 : arr[i]);
            if (s.isEmpty() || h >= arr[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, (long) arr[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}