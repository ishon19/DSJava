package ds.linkedlist;

public class App {
    public static void main(String[] args) {
      SinglyLinkedList linkedList = new SinglyLinkedList();
      linkedList.insertAtFirst(12);
      linkedList.insertAtFirst(67);
      linkedList.insertAtFirst(66);
      linkedList.insertLast(99);
        linkedList.insertAtFirst(11);
      linkedList.displayList();
    }

    public static int nodeLength(Node node) {
        int length = 0;

        while(node.next != null){
            length++;
            node = node.next;
        }
        return length;
    }
}
