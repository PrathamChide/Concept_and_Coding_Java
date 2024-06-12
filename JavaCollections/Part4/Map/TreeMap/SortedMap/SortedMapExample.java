package JavaCollections.Part4.Map.TreeMap.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> map2 = new TreeMap<>();
        map2.put(21, "SJ");
        map2.put(11, "PJ");
        map2.put(13, "KJ");
        map2.put(5, "TJ");

        System.out.println(map2.headMap(13)); //Exclusive

        System.out.println(map2.tailMap(13)); //Inclusive

        System.out.println(map2.firstKey());

        System.out.println(map2.lastKey());
    }
}
