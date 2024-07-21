package CollectionFramework;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);

        System.out.println(dq);

        dq.poll();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.offerFirst(10);
        dq.offerFirst(20);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peek());


        // Stack implmentaion using ArrayDeque 
        /* using Stack class , it is implmented by Vector , 
        there multithreading locking synchronization problem occur which slow down the process. */
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);


    }
}
