package j02025;

public class Word implements Comparable<Word>{
    private String str;

    public Word(String str) {
        this.str = str;
    }


    @Override
    public int compareTo(Word o) {
        return str.compareTo(o.str);
    }

    @Override
    public String toString() {
        return str +"";
    }
}
