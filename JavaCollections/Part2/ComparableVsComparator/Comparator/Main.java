package JavaCollections.Part2.ComparableVsComparator.Comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer a[] = {6, 4, 1, 9, 2, 11};
        Arrays.sort(a, ((Integer val1, Integer val2) -> val1 - val2 )); //Ascending Order
//        Arrays.sort(a, ((Integer val1, Integer val2) -> val2 - val1 )); //Descending Order
//        Arrays.sort(a); /It uses Comparable compareTo() implicitly
        for(int v: a){
            System.out.println(v);
        }
    }
}
