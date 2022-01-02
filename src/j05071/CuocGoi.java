package j05071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuocGoi implements Comparable<CuocGoi>{
    private String sdt;
    private ThanhPho tp;
    private Date start, end;

    public CuocGoi(String sdt, ThanhPho tp, String start, String end) throws ParseException {
        this.sdt = sdt;
        this.tp = tp;
        this.start = new SimpleDateFormat("HH:mm").parse(start);
        this.end = new SimpleDateFormat("HH:mm").parse(end);
    }


    private int soPhut() {
        long kc = end.getTime()-start.getTime();
        float phut = (kc / (1000 *60));
        if(sdt.charAt(0) != '0')
            return Math.round(phut/3);
        return (int) phut;
    }

    private long tongTien() {
        if(sdt.charAt(0) != '0')
            return 800 * soPhut();
        return tp.getGia()* soPhut();
    }


    @Override
    public String toString() {
        if(sdt.charAt(0) != '0')
            return sdt + " " + "Noi mang" + " " + soPhut() + " " + tongTien();
        return sdt + " " + tp + " " + soPhut() + " " + tongTien();
    }

    @Override
    public int compareTo(CuocGoi o) {
        return tongTien() > o.tongTien() ? -1 : 1;
    }
}
