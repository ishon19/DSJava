package ds.queue;

public class MyQueue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int itemCount;

    public MyQueue(int size) {
      this.maxSize = size;
      this.queueArray = new long[size];
      front = 0;
      rear = -1;
      itemCount = 0;
    }

    public void insert(long j) {
        if(rear == maxSize-1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        itemCount++;
    }

    public long remove() {
        long temp = queueArray[front];
        front++;
        if(front == maxSize) {
            //If all the elements have been removed then reset the front
          front = 0;
        }
        itemCount--;
        return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }

    public boolean isFull() {
        return itemCount == maxSize;
    }

    public void view() {
        System.out.print('[');
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(" "+queueArray[i]+" ");
        }
        System.out.print(']');
    }
}
