package ds.queue;

public class App {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.insert(12);
        queue.insert(2);
        queue.insert(44);
        queue.insert(56);
        queue.insert(8);
        queue.insert(77);
        queue.view();
    }
}
