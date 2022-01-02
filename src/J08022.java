import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            int[] res = new int[n];
            for (int i = n-1; i >= 0; i--) {
                if(!st.empty()) {
                    while (!st.empty() && arr[i] >= st.peek()) {
                        st.pop();
                    }
                }
                res[i] = st.empty() ? -1 : st.peek();
                st.add(arr[i]);
            }

            for (int i : res)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
