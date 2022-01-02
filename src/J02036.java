import java.util.Scanner;

public class J02036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.print(arr[0] + " ");
            for (int i = 0; i < n-1; i++) {
                System.out.print(lcm(arr[i], arr[i+1]) + " ");
            }
            System.out.println(arr[n-1]);
        }
    }

    static int gcd(int a, int b) {
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a*b / gcd(a,b);
    }
}
