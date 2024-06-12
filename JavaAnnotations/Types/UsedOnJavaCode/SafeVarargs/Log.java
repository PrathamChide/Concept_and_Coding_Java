package JavaAnnotations.Types.UsedOnJavaCode.SafeVarargs;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList){
        Object[] objectList = logNumberList;
        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0] = stringValuesList;
    }
}
