package JavaCollections.Part4.Map.LinkedHashMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
//With Access Order = True
public class LinkedHashMapWithAccessOrder {
    public static void main(String[] args) {
        System.out.println("--------below is LinkedHashMap Output---------");
        Map<Integer, String> map = new LinkedHashMap<>(16, .75F, true);
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");

        //accessing some data
        map.get(23);
        map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        //Thread safe HashMap
        Map<Integer, String> map2 = Collections.synchronizedMap(new LinkedHashMap<>());
        map2.put(1, "Pratham");
    }
}
