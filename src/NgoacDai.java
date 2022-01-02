import java.util.Scanner;
import java.util.Stack;

public class NgoacDai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- >0) {
            String s = in.next();
            System.out.println(solution(s));
        }
    }

    private static int solution(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        st.add(-1);
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            if (si == '(') {
                st.add(i);
            }else {
                st.pop();
                if(!st.empty())
                    count = Math.max(count, i - st.peek());
                else st.add(i);
            }
        }
        return count;
    }
}
