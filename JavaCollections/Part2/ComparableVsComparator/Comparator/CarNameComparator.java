package JavaCollections.Part2.ComparableVsComparator.Comparator;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2){
        return o2.carName.compareTo(o1.carName);
    }
}
