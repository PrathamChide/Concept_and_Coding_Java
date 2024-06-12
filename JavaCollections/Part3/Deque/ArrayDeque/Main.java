package JavaCollections.Part3.Deque.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

        //Deletion
        int element = arrayDequeAsQueue.removeFirst();
        System.out.println(element);

        //LIFO(Last In First Out)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

        //Deletion
        int removeElem = arrayDequeAsStack.removeFirst();
        System.out.println(removeElem);
    }
}
