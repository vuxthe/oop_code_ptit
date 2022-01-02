package j08026;

import java.util.*;

public class J08026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- >0) {
            int s = in.nextInt(), t = in.nextInt();
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(s, 0));
            Set<Integer> set = new HashSet<>();
            while (!queue.isEmpty()) {
                Node top = queue.peek();
                queue.remove();
                int key = top.key, val = top.val;
                set.add(key);
                if(key == t) {
                    System.out.println(val);
                    break;
                }
                if(!set.contains(key-1) && key-1 > 0)
                    queue.add(new Node(key-1, val+1));
                if(!set.contains(key*2) && key*2 < 10000)
                    queue.add(new Node(key*2, val+1));
            }
        }
    }
}
