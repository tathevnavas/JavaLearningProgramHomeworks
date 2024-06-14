package hw2.lfuCache;

public class Main {
    public static void main(String[] args) {
        LFU lfuCache = new LFU(4);
        lfuCache.refer("1");
        lfuCache.refer("2");
        lfuCache.refer("3");
        lfuCache.refer("4");
        lfuCache.refer("5");
        lfuCache.refer("1");
        lfuCache.refer("2");
    }
}
