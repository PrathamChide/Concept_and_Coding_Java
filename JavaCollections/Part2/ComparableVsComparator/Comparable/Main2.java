package JavaCollections.Part2.ComparableVsComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Car1> carList = new ArrayList<>();
        carList.add(new Car1("suv", "petrol"));
        carList.add(new Car1("sedan", "diesel"));
        carList.add(new Car1("hatchback", "cng"));

        Collections.sort(carList);

        carList.forEach((Car1 carObj) -> System.out.println(carObj.carName + ".." + carObj.carType)) ;

    }
}
