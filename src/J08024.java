import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            Queue<String> queue = new LinkedList<>();
            queue.add("9");
            while (!queue.isEmpty()) {
                Integer num = Integer.parseInt(queue.peek());
                queue.remove();
                if(num%n == 0) {
                    System.out.println(num);
                    break;
                }
                queue.add(num + "0");
                queue.add(num + "9");
            }
        }
    }
}
