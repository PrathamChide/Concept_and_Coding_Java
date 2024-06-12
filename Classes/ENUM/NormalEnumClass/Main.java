package Classes.ENUM.NormalEnumClass;

public class Main {
    public static void main(String[] args) {
//        1. usage of values() and ordinal()
        for(EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }
//        2. usage of valueOf() and name()
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());
    }
}
