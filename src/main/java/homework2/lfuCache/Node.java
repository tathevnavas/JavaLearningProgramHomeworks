package homework2.lfuCache;

public class Node {
    private int key;
    private String val;
    Node next;
    Node prev;
    public Node(int key, String val){
        //this.key = key;
        this.val = val;
    }

    public int key() {
        return key;
    }

    public String value() {
        return val;
    }
}
