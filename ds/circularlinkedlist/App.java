package ds.circularlinkedlist;

public class App {
    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.insertFirst(12);
        linkedList.insertFirst(33);
        linkedList.insertLast(3);
        linkedList.displayList();
    }
}
