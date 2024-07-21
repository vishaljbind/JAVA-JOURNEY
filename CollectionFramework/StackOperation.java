package CollectionFramework;

import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        
        Stack<String> fruStack = new Stack<>();

        fruStack.push("A");
        fruStack.push("B");
        fruStack.push("C");
        fruStack.push("D");

        System.out.println(fruStack.pop());
        System.out.println(fruStack);
        System.out.println(fruStack.pop());

        System.out.println(fruStack.peek());
        System.out.println(fruStack);
        System.out.println(fruStack.empty());
    }
}
