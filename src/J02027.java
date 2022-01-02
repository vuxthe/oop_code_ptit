import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt(),array[]=new int[n];
            for(int i=0 ; i< n; i++){
                array[i]=sc.nextInt();
            }
            Arrays.sort(array);
            long result=0;
            int pos=0;
            for(int i=0 ; i<n ;i++){
                int check=1;
                for(int j=Math.max(i+1,pos); j<n; j++){
                    if(array[i]+k <= array[j]){
                        result+=j-i-1;
                        pos=j;
                        check=0;
                        break;
                    }
                }
                if(check==1){
                    long x=n-i, y=n-i-1;
                    result+=(x*y)/2;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}