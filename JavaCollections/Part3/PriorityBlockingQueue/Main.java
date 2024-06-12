package JavaCollections.Part3.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(2);

        System.out.println(pq.peek());
    }
}
