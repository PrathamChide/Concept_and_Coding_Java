package JavaCollections.Part2.ComparableVsComparator.Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer a[] = {6,4,1,8,11,2};
        Arrays.sort(a); //Uses Comparable compareTo function implicitly
        for(int v: a){
            System.out.println(v);
        }
    }
}
