public class Pair implements Comparable<Pair>{
    long key;
    String val;
    public Pair(long key, String val){
        this.key = key;
        this.val = val;
    }
    public String toString(){
        return key + "=" + val;
    }
    
    public int compareTo(Pair o) {
        return this.val.compareTo(o.val);
    }
}
