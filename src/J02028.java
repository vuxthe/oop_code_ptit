import java.util.*;

public class J02028 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            long k = in.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(solution(arr, k));
        }
    }

    static String solution(int[] nums, long k) {
        long sum = 0;
        HashSet<Long> set = new HashSet<>();
        set.add(0L);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (set.contains(sum - k))
                return "YES";
            set.add(sum);
        }
        return "NO";
    }
}