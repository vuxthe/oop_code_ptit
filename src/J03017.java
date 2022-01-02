import java.util.ArrayList;
import java.util.Scanner;

public class J03017
{
    static class Pair{
        char first;
        int second;
        Pair(char first, int second){
            this.first = first;
            this.second = second;
        }
    }

    static int solution(String str)
    {
        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(new Pair('@', -1));
        int maxlen = 0;
        for (int i = 0; i < str.length(); ++i)
        {
            arr.add(new Pair(str.charAt(i), i));
            while (arr.size() >= 3 &&
                    arr.get(arr.size()-3).first=='1' &&
                    arr.get(arr.size()-2).first=='0' &&
                    arr.get(arr.size()-1).first=='0')
            {
                arr.remove(arr.size() - 3);
                arr.remove(arr.size() - 2);
                arr.remove(arr.size() - 1);
            }
            int tmp = arr.get(arr.size() - 1).second;
            maxlen = Math.max(maxlen, i - tmp);
        }

        return maxlen;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            System.out.println(solution(in.next()));
        }
    }
}

