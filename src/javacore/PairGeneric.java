package javacore;


public class PairGeneric<F, S> {
    private F first; //first member of pair
    private S second; //second member of pair

    public PairGeneric(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    public static void main(String[] args) {
		PairGeneric<Integer, String> p = new PairGeneric<>(8, "d");
	}
}