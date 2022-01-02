import java.util.Scanner;

class J03030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isInteger((int) 2338823));

    }
    static public boolean isInteger(Object o) {
        if (o instanceof Byte || o instanceof Short ||
                o instanceof Integer || o instanceof Long) {
            return true;
        }
        return false;
    }
}