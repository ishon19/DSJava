package ds.stacks;

public class MyStack {
    private int maxSize;
    private char[] data;
    private int top = -1;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        data = new char[maxSize];
    }

    void push(char element) {
        if(isFull()) {
            System.out.println("The stack is already full");
            return;
        }
        data[++top] = element;
    }

    char pop() {
        if(isEmpty()) {
            System.out.println("The stack is already empty");
            return '0';
        }
        int oldIndex = top--;
        return data[oldIndex];
    }

    boolean isEmpty() {
        return top==-1;
    }

    boolean isFull() {
        return top==maxSize-1;
    }

    char peek() {
        return data[top];
    }
}
