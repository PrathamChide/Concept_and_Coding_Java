package JavaCollections.Part5.Set.ThreadSafeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeSet {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet = concurrentHashMap.newKeySet();
        threadSafeSet.add(1);
        threadSafeSet.add(2);

        Iterator<Integer> iterator = threadSafeSet.iterator();
        while (iterator.hasNext()){
            int val = iterator.next();
            if(val == 1){
                //iterator.remove(); //we can remove
                threadSafeSet.add(9); //we should be able to add in the set as its thread safe
            }
        }
        threadSafeSet.forEach((Integer val) -> System.out.println(val));
    }
}
