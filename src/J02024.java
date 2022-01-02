import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Integer array[] = new Integer[n];
            int bina[] = new int[n];
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i=0 ; i<n;i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());
            solution(array , bina , list , n, 0);
            for(ArrayList<Integer> al : list){
                for(int i=0; i<al.size(); i++){
                    System.out.print(al.get(i)+" ");
                }
                System.out.println();
            }
        }
    }
    static void solution(Integer array[], int binary[],ArrayList<ArrayList<Integer>>list,
                               int num,int i){
        for(int j=0 ; j<=1 ; j++){
            binary[i]=j;
            if(i == num-1){
                int sum=0;
                for(int k=0 ; k<num ;k++){
                    if(binary[k]==1) sum+=array[k];
                }
                if(prime(sum)){
                    ArrayList<Integer> result=new ArrayList<>();
                    for(int k=0;k<num;k++){
                        if(binary[k]==1) result.add(array[k]);
                    }
                    list.add(result);
                }
            }
            else solution(array , binary,list, num, i+1);
        }
    }

    static boolean prime(int x) {
        if (x<2)
            return false;
        for (int i = 2; i <= Math.sqrt(x) ; i++) {
            if (x%i == 0)
                return false;
        }
        return true;
    }

}