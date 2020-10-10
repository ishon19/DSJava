package ds.linkedlist;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node currentNode = first;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public Node deleteFirst() {
        Node deletedNode = first;
        if(first.next != null) first = first.next;
        return deletedNode;
    }

    public void displayList() {
        Node currentNode = first;
        while(currentNode!= null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }
}
