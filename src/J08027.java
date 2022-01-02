import java.util.*;

public class J08027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '>') {
                if(!st2.isEmpty()) {
                    st1.add(st2.peek());
                    st2.pop();
                }
            }
            else if( c == '<') {
                if (!st1.isEmpty()) {
                    st2.add(st1.peek());
                    st1.pop();
                }
            }
            else if(c == '-') {
                if(!st1.isEmpty())
                    st1.pop();
            }else {
                st1.add(c);
            }
        }
        Deque<Character> ans1 = new ArrayDeque<>(st1);
        for (Character c : ans1)
            System.out.print(c);
        while (!st2.empty()) {
            System.out.print(st2.pop());
        }
    }
}
