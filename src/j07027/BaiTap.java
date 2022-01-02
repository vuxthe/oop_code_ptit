package j07027;

public class BaiTap {
    private int stt;
    private String ten;

    public BaiTap(int stt, String ten) {
        this.stt = stt;
        this.ten = ten;
    }

    public int getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return stt + " " + ten;
    }
}
