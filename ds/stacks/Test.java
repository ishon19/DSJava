package ds.stacks;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(12);
        stack.push(34);
        System.out.println("Top Element as of now: "+ stack.peek());
        System.out.println("Printing all the elements in the stack: \n");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
