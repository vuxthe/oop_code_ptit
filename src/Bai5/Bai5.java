package Bai5;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            String bd = in.next(), kt = in.next();
            String bd_new = convert_char(bd.charAt(0)) + bd.charAt(1);
            String kt_new = convert_char(kt.charAt(0)) + kt.charAt(1);
            Queue<Node> q = new LinkedList<>();
            q.add(new Node(bd_new, 0));
            Set<String> s = new HashSet<>();
            int arr[] = {-2, -1, 1, 2};
            int brr[] = {-2, -1, 1, 2};
            while (!q.isEmpty()) {
                Node top = q.peek();
                q.remove();
                String idx = top.str;
                int lv = top.lv;
                s.add(idx);
                if(idx.equals(kt_new)) {
                    System.out.println(lv);
                    break;
                }
                int row = Integer.parseInt(String.valueOf(idx.charAt(0)));
                int col = Integer.parseInt(String.valueOf(idx.charAt(1)));
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if(arr[i] - brr[j] != 0 && arr[i] + brr[j] != 0) {
                            if(row + arr[i] <= 8 && row + arr[i] >= 1
                                && col + brr[j] >= 1 && col + brr[j] <= 8) {
                                String tmp = String.valueOf(row + arr[i]) + String.valueOf(col + brr[j]);
                                if(!s.contains(tmp)) {
                                    q.add(new Node(tmp, lv + 1));
                                }
                            }
                        }
                    }
                }
//                if(row >= 2 && col >=3) {
//                    String tmp = "";
//                    tmp += String.valueOf(row-1);
//                    tmp += String.valueOf(col-2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row >= 2 && col >=3) {
//                    String tmp = "";
//                    tmp += String.valueOf(row-1);
//                    tmp += String.valueOf(col-2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row <= 7 && col >=3) {
//                    String tmp = "";
//                    tmp += String.valueOf(row+1);
//                    tmp += String.valueOf(col-2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row <= 6 && col >= 2) {
//                    String tmp = "";
//                    tmp += String.valueOf(row+1);
//                    tmp += String.valueOf(col-1);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row <= 6 && col <= 7) {
//                    String tmp = "";
//                    tmp += String.valueOf(row+1);
//                    tmp += String.valueOf(col+2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row >= 2 && col >=3) {
//                    String tmp = "";
//                    tmp += String.valueOf(row-1);
//                    tmp += String.valueOf(col-2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
//                if(row >= 2 && col >=3) {
//                    String tmp = "";
//                    tmp += String.valueOf(row-1);
//                    tmp += String.valueOf(col-2);
//                    if(!s.contains(tmp))
//                        q.add(new Node(tmp, lv+1));
//                }
            }
        }
    }
    static String convert(char c) {
        return Integer.parseInt(String.valueOf(c))+"";
    }

    static String convert_char(char c) {
        return  ((int)(c) - (int)('a') + 1) +"";
    }
}
