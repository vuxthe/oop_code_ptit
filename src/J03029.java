import java.util.ArrayList;
import java.util.Scanner;

public class J03029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "(?=[.!?])";
        ArrayList<String> ans = new ArrayList<>();
        while (in.hasNext()) {
            String[] tmp = in.nextLine().trim().replaceAll("\\s+", " ").split(regex);
            for (String i : tmp) {
                String res = i.trim().toLowerCase();
                ans.add(Character.toUpperCase(res.charAt(0)) + res.substring(1));
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            String tmp = ans.get(i);
            if (i < ans.size() - 1 && ans.get(i+1).length() == 1) {
                tmp += ans.get(i+1);
                System.out.println(tmp);
                i++;
            }else {
                tmp += ".";
                System.out.println(tmp);
            }
        }
    }
}
