import java.util.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        Set<Integer> set = new HashSet<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i <inp.length() ; i++) {
            char c = inp.charAt(i);
            int m =  (c - 'A');
            if(set.contains(m)){
                arr2[m] = i;
            }
            else {
                arr1[m] = i;
                set.add(m);
            }
        }
        int dem = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if(arr1[i] < arr1[j]
                    && arr1[j] < arr2[i]
                        && arr2[i] < arr2[j]) {
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
}
