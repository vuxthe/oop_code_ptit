import java.util.Scanner;
import java.util.Stack;

public class HCN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            long maxArea = 0;
            int[] pre = preGreater(arr, n);
            int[] next = nextGreater(arr, n);
            for (int i = 0; i < n; i++) {
                maxArea = Math.max(maxArea, (long) arr[i] * (next[i] - pre[i] + 1));
            }
            System.out.println(maxArea);
        }
    }

    static int[] preGreater(int[] arr, int n) {
        int[] pre = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(!st.empty()) {
                while (!st.empty() && arr[st.peek()] < arr[i])
                    st.pop();
            }

            if(st.empty()) pre[i] = i;
            else pre[i] = st.pop();
            st.push(i);
        }
        return pre;
    }

    static int[] nextGreater(int[] arr, int n) {
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if(!st.empty()) {
                while (!st.empty() && arr[st.peek()] < arr[i])
                    st.pop();
            }

            if(st.empty()) next[i] = i;
            else next[i] = st.pop();
            st.push(i);
        }
        return next;
    }


}
