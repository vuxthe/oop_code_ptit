package j05073;

public class Hang {
    private String ma;
    private int gia, sl;

    public Hang(String ma, int gia, int sl) {
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
    }

    private double thue(){
        double res = gia*sl;
        if(ma.charAt(0) == 'T')
            return 29/100.0* res;
        if(ma.charAt(0) == 'C')
            return 10/100.0 * res;
        if(ma.charAt(0) == 'D')
            return 8/100.0 * res;
        return 2/100.0 * res;
    }

    private double phiShip(){
        double res = gia*sl;
        if(ma.charAt(0) == 'T')
            return 4/100.0 * res;
        if(ma.charAt(0) == 'C')
            return 3/100.0 * res;
        if(ma.charAt(0) == 'D')
            return 2.5/100.0 * res;
        return 0.5/100.0 * res;
    }

    private boolean checkGiayTo() {
        return ma.charAt(3) == 'C';
    }

    private double giaBan() {
        double tongThue = thue();
        double ship = phiShip();
        if(checkGiayTo()) tongThue*=95/100.0;
        double kq = (gia * sl + tongThue + ship) * 120/100.0 / sl;

        return (double) Math.round(kq * 100) / 100;
    }

    @Override
    public String toString() {
        return ma + " " + String.format("%.2f", giaBan());
    }
}
