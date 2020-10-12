package ds.circularlinkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if(isEmpty()){
            last = newNode;
        }
        first = newNode;
    }

    private Boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        Node currentNode = first;
        while(currentNode!=null) {
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
    }
}
