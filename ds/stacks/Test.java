package ds.stacks;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push('A');
        stack.push('B');
        System.out.println("Top Element as of now: "+ stack.peek());
        System.out.println("Printing all the elements in the stack: \n");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //reversing the string using the stack
        String input = "Shreyans";
        System.out.println("Reversing the String "+input+" :"+reverseString(input));
    }

    public static String reverseString(String input) {
        String reverse = "";
        MyStack stack = new MyStack(input.length());

        //push the characters one by one
        for(var i=0; i<input.length(); i++) {
            stack.push(input.charAt(i));
        }

        //pop and reverse
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse+=stack.pop();
        }
        return reverse;
    }
}
