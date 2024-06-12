package JavaCollections.Part2.PriorityQueue.MaxPriorityQueue;

import java.util.PriorityQueue;

public class MaxPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ= new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        //lets print all the values
        maxPQ.forEach((Integer val) -> System.out.println(val));

        //remove top element from the PQ and print
        while (!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("remove form top: " + val);
        }
    }
}
