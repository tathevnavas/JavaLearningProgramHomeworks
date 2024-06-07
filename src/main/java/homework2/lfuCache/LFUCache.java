package homework2.lfuCache;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LFUCache {
    private final int size;
    private Map<Integer, Node> valueMap = new HashMap<>();
    private Map<Integer, Integer> countMap = new HashMap<>();
    private TreeMap<Integer, DoublyLinkedList> frequencyMap = new TreeMap<>();

    public LFUCache(int size){
        this.size = size;
    }

    public String get(int key) {
        if(!valueMap.containsKey(key) || size == 0){
            return "-1";
        }

        Node nodeToDelete = valueMap.get(key);
        Node node = new Node(key, nodeToDelete.value());
        int frequency = countMap.get(key);
        frequencyMap.get(frequency).remove(nodeToDelete);
        removeIfListEmpty(frequency);
        valueMap.remove(key);
        countMap.remove(key);
        valueMap.put(key, node);
        countMap.put(key, frequency + 1);
        frequencyMap.computeIfAbsent(frequency + 1, k -> new DoublyLinkedList()).add(node);
        return valueMap.get(key).value();
    }

    public void put(int key, String value){
        if(!valueMap.containsKey(key) && size > 0){
            Node node = new Node (key, value);
            if(valueMap.size() == size){
                int lowestCount = frequencyMap.firstKey();
                Node nodeToDelete = frequencyMap.get(lowestCount).head();
                frequencyMap.get(lowestCount).remove(nodeToDelete);
                removeIfListEmpty(lowestCount);

                int keyToDelete = nodeToDelete.key();
                valueMap.remove(keyToDelete);
                countMap.remove(keyToDelete);
            }
            frequencyMap.computeIfAbsent(1, k -> new DoublyLinkedList()).add(node);
            valueMap.put(key, node);
            countMap.put(key, 1);
        } else if (size > 0){
            Node node = new Node(key, value);
            Node nodeToDelete = valueMap.get(key);
            int freq = countMap.get(key);
            frequencyMap.get(freq).remove(nodeToDelete);
            removeIfListEmpty(freq);
            valueMap.remove(key);
            countMap.remove(key);
            valueMap.put(key, node);
            countMap.put(key, freq + 1);
            frequencyMap.computeIfAbsent(freq + 1, k -> new DoublyLinkedList()).add(node);
        }
    }

    private void removeIfListEmpty(int frequency){
        if(frequencyMap.get(frequency).length() == 0){
            frequencyMap.remove(frequency);
        }
    }
}
