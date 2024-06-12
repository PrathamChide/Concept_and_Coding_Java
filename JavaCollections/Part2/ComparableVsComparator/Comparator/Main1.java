package JavaCollections.Part2.ComparableVsComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

//        Collections.sort(cars, new CarNameComparator());
        Collections.sort(cars, new Car1());

        cars.forEach((Car carObj) -> System.out.println(carObj.carName + " " + carObj.carType));
    }
}

