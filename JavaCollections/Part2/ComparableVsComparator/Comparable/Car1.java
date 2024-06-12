package JavaCollections.Part2.ComparableVsComparator.Comparable;

public class Car1 implements Comparable<Car1>{
    String carName;
    String carType;

    Car1(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compareTo(Car1 o2) {
        return this.carType.compareTo(o2.carType);
    }
}
