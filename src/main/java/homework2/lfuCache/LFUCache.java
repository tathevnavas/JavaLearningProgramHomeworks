package homework2.lfuCache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

public class LFUCache {
    private final int size;
    private Map<Integer, String> valueMap = new HashMap<>();
    private Map<Integer, Integer> keyToFreq = new HashMap<>();
    private SortedMap<Integer, LinkedHashSet<Integer>> freqToKeys = new TreeMap<>();

    public LFUCache(int size){
        if(size < 1){
            throw new RuntimeException("invalid size");
        }
        this.size = size;
    }

    public String get(int key) throws NoSuchElementException {
        if(!valueMap.containsKey(key)){
            throw new NoSuchElementException();
        }

////        Node nodeToDelete = valueMap.get(key);
////        Node node = new Node(key, nodeToDelete.value());
////        int frequency = keyToFreq.get(key);
////        freqToKeys.get(frequency).remove(nodeToDelete);
////        removeIfListEmpty(frequency);
////        valueMap.remove(key);
////        valueMap.put(key, node);
////        freqToKeys.computeIfAbsent(frequency + 1, k -> new DoublyLinkedList()).add(node);
////        return valueMap.get(key).value();
//
//
//        //rewrite to make it simple get with frequency update
//    }
//
//    public void put(int key, String value){
//        if(!valueMap.containsKey(key)){
//            Node node = new Node (key, value);
//            if(valueMap.size() == size){
//                int lowestCount = freqToKeys.firstKey();
//                Node nodeToDelete = freqToKeys.get(lowestCount).head();
//                freqToKeys.get(lowestCount).remove(nodeToDelete);
//                removeIfListEmpty(lowestCount);
//
//                int keyToDelete = nodeToDelete.key();
//                valueMap.remove(keyToDelete);
//            }
//            freqToKeys.computeIfAbsent(1, k -> new DoublyLinkedList()).add(node);
//            valueMap.put(key, node);
//        } else {
//            Node node = new Node(key, value);
//            //Node nodeToDelete = valueMap.get(key);
//            freqToKeys.get(freq).remove(nodeToDelete);
//            removeIfListEmpty(freq);
//            valueMap.remove(key);
//            freqToKeys.compute(freq + 1, k -> new DoublyLinkedList()).add(node);
//        }
 //   }

 //   private void removeIfListEmpty(int frequency){
//        if(freqToKeys.get(frequency).length() == 0){
//            freqToKeys.remove(frequency);
//        }
        return "";
    }
}
