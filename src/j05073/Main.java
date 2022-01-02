package j05073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- >0) {
            Hang hang = new Hang(in.next(), in.nextInt(), in.nextInt());
            System.out.println(hang);
        }
    }
}
