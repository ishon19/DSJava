package ds.stacks;

public class MyStack {
    int maxSize;
    long[] data;
    int top = -1;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        data = new long[maxSize];
    }

    void push(long element) {
        data[++top] = element;
    }

    long pop() {
        int oldIndex = top--;
        return data[oldIndex];
    }

    boolean isEmpty() {
        return top==-1;
    }

    long peek() {
        return data[top];
    }
}
