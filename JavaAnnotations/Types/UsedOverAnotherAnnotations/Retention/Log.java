package JavaAnnotations.Types.UsedOverAnotherAnnotations.Retention;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @java.lang.SafeVarargs
    public static void printLogValues(List<Integer>... logNumbersList){
        Object[] objList = logNumbersList;
        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objList[0] = stringValuesList;
    }
}
