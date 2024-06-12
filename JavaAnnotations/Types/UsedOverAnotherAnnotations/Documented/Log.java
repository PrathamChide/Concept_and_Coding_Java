package JavaAnnotations.Types.UsedOverAnotherAnnotations.Documented;

import java.util.ArrayList;
import java.util.List;

public class Log{
    @SafeVarargs
    public static void printLogValues(Object[] logNumbersList){
        Object[] objectList = logNumbersList;
        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0] = stringValuesList;
    }
}