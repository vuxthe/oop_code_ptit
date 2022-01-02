package Xeploai;


public class ketqua implements Comparable<ketqua> {
    private String id;
    private String name;
    private float cc,on,thi;

    public ketqua(int id, String name, float cc, float on, float thi) {
        this.id = "SV"+String.format("%02",id+1);
        this.name = name;
        this.cc = cc;
        this.on = on;
        this.thi = thi;
    }
    private String chuyenhoa() {
        String ma = name.toLowerCase().trim();
        String [] tu = ma.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String i:tu){
            res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    private float tong(){
        float a = (float) (cc*(0.25));
        float c = (float) (on*(0.35));
        float b = (float) (thi*(0.4));
        return  a+b+c;
    }
    private String dapan(){
        if(tong()>=8)
            return "GIOI";
        else if(tong()>=6.5)
            return "KHA";
        else if(tong()>=5)
            return "TRUNG BINH";
        else
            return "KEM";
    }

    @Override
    public String toString() {
        return id+" "+chuyenhoa()+" "+String.format("%.2f",tong())+" "+dapan();
    }

    @Override
    public int compareTo(ketqua o) {
        return o.tong() > this.tong() ? 1 : -1;
    }
}
