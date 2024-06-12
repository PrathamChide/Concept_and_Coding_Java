package JavaCollections.Part3.List.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<>();
        obj.add(0, 200);
        System.out.println(obj.get(0));
    }
}
