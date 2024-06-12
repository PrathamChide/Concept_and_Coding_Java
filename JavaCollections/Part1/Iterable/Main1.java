package JavaCollections.Part1.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        //using iterator
        System.out.println("Iterating using iterating method");
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if(val == 3){
                valuesIterator.remove();
            }
        }
        System.out.println("Iterating using for-each loop");
        for (int val: values){
            System.out.println(val);
        }
        //using forEach Method(Java 1.8)
        System.out.println("Testing forEach Method");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
