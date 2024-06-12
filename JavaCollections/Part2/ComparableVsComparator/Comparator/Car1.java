package JavaCollections.Part2.ComparableVsComparator.Comparator;

import java.util.Comparator;

public class Car1 implements Comparator<Car> {
    String carName;
    String carType;

    Car1(){

    }
    Car1(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compare(Car o1, Car o2){
        return o1.carName.compareTo(o2.carName);
    }

}
