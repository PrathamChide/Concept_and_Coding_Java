package JavaCollections.Part1;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 1; //insert element
        int val = arr[0]; //get front element

        Vector<Integer> vector = new Vector<>();
        //insert and element in vector
        vector.add(1);
        //get element
        vector.get(0);
    }
}
