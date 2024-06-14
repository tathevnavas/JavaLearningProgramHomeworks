package hw2.lfuCache;

class Pair implements Comparable<Pair>{
    String value;
    int frequency;

    public Pair(String value, int frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Pair o) {
        return 0;
    }
}
