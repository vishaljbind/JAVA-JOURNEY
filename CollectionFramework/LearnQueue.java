package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // q.add(12);
        // q.add(23);
        // q.add(45);
        // q.add(78);

        q.offer(12);
        q.offer(23);
        q.offer(45);
        q.offer(78);

        System.out.println(q);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        // System.out.println(q);
        // System.out.println(q.poll());
        // System.out.println(q.peek());
        // System.out.println(q);

    }
}
