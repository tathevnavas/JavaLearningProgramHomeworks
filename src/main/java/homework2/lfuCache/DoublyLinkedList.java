package homework2.lfuCache;

public class DoublyLinkedList {
    private int n;
    private Node head;
    private Node tail;

//    public DoublyLinkedList(){
//        head = new Node("0");
//        tail = new Node("0");
//        head.next = tail;
//        tail.prev = head;
//    }

    public void add(Node node){
        if(head == null){
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        n++;
    }

    public void remove(Node node){
        if(node.next == null) {
            tail = node.prev;
        } else
            node.next.prev = node.prev;

        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        n--;
    }

    public Node head(){
        return head;
    }

    public int length(){
        return n;
    }
}
