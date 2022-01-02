import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J03022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = "";
        while (in.hasNext()) {
            res += in.nextLine();
        }
        String[] ans = res.trim().replaceAll("\\s+", " ").toLowerCase().split("[.?!]");
        for (String str : ans) {
            String tmp = str.trim();
            System.out.println(tmp.toUpperCase().charAt(0) + tmp.substring(1));
        }
    }
}
