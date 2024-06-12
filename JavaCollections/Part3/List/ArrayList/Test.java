package JavaCollections.Part3.List.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//Thread safeVersion
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0, 100);
        System.out.println(list.get(0));
    }
}
