package j08025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- >0) {
            String arr = "", brr = "";
            for (int i = 0; i < 6; i++) {
                arr += in.nextInt();
            }

            for (int i = 0; i < 6; i++) {
                brr += in.nextInt();
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(arr, 0));
            Set<String> set = new HashSet<>();
            while (!queue.isEmpty()) {
                Node top = queue.peek();
                queue.remove();
                String crr = top.arr;
                int lv = top.level;
                set.add(crr);
                if(crr.equals(brr)) {
                    System.out.println(lv);
                    break;
                }
                String res = "";
                res += crr.charAt(3);
                res += crr.charAt(0);
                res += crr.charAt(2);
                res += crr.charAt(4);
                res += crr.charAt(1);
                res += crr.charAt(5);
                if(!set.contains(res))
                    queue.add(new Node(res, top.level+1));
                res = "";
                res += crr.charAt(0);
                res += crr.charAt(4);
                res += crr.charAt(1);
                res += crr.charAt(3);
                res += crr.charAt(5);
                res += crr.charAt(2);
                if(!set.contains(res))
                    queue.add(new Node(res, top.level+1));
            }
        }

    }
}
