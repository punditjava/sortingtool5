import java.util.Comparator;

public class Mapa implements Comparable<Mapa> {
    private String word;
    private int data;
    private long Long;
    public Mapa(String w,int d){
        word=w;
        data=d;
    }
    public Mapa(long l,int d){
        Long=l;
        data=d;
    }

@Override
public int compareTo(Mapa map){
        return (this.data - map.data);
}
    public static Comparator<Mapa> LongComparable = new Comparator<Mapa>() {
        @Override
        public int compare(Mapa m1, Mapa m2) {
            return (int) (m1.getLong() - m2.getLong());
        }
    };
    public static Comparator<Mapa> WordComparable = new Comparator<Mapa>() {
        @Override
        public int compare(Mapa m1, Mapa m2) {
            return m1.getWord().compareTo(m2.getWord());
        }
    };
    public void addData() {
        data++;
    }

    public int getData()
    {
        return data;
    }

    public String getWord() {
        return word;
    }
    public long getLong(){
        return Long;
    }
    public void outWord(int summa){
        System.out.println(word+": "+data+" time(s), "+ data*100/summa+"%");
    }
    public void outLong(int summa){
        System.out.println(Long+": "+data+" time(s), "+ data*100/summa+"%");
    }
}
