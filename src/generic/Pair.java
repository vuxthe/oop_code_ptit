package generic;

public class Pair<N, I extends Number> {
    private N num1, num2;

    public Pair(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public boolean isPrime() {
        if (primeNum(num1) && primeNum(num2))
            return true;
        return false;
    }

    private boolean primeNum(N x) {
        Integer k = (Integer) x;
        if(k<2)
            return false;
        for (int i = 2; i*i<=k; i++)
            if(k%i ==0)
                return false;
        return true;
    }

    @Override
    public String toString() {
        return num1 + " " + num2;
    }
}
