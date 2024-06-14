package hw2.lfuCache;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LFU {
    int cacheSize;
    Map<String, Pair> cache;
    PriorityQueue<Pair> minHeap;

    public LFU(int cacheSize) {
        if(cacheSize < 1){
            throw new InvalidSize("Invalid size" + cacheSize);
        }
        this.cacheSize = cacheSize;
        this.cache = new HashMap<>();
        this.minHeap = new PriorityQueue<>();
    }

    public void increment(String value) {
        if (cache.containsKey(value)) {
            Pair pair = cache.get(value);
            pair.frequency += 1;
            minHeap.remove(pair);
            minHeap.offer(pair);
        }
    }

    public void insert(String value) {
        if (cache.size() == cacheSize) {
            evictLFU();
        }

        Pair newPair = new Pair(value, 1);
        cache.put(value, newPair);
        minHeap.offer(newPair);
        System.out.println("Cache block " + value + " inserted.");
    }

    public void refer(String value) {
        if (!cache.containsKey(value)) {
            insert(value);
        } else {
            increment(value);
        }
    }

    public void evictLFU() {
        Pair lfuPair = minHeap.poll();
        cache.remove(lfuPair.value);
        System.out.println("Cache block " + lfuPair.value + " removed.");
    }

    public Map<String, Pair> getCache(){
        return cache;
    }
}

