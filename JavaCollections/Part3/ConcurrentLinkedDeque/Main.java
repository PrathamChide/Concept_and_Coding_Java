package JavaCollections.Part3.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> ob = new ConcurrentLinkedDeque<>();
        ob.addFirst(2);
        ob.addFirst(1);
        System.out.println(ob.removeLast());
    }
}
