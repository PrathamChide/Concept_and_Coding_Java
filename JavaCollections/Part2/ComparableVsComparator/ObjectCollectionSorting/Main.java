package JavaCollections.Part2.ComparableVsComparator.ObjectCollectionSorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV", "petrol");
        carArray[1] = new Car("Sedan", "diesel");
        carArray[2] = new Car("Hatchback", "CNG");
        Arrays.sort(carArray);
    }
}
