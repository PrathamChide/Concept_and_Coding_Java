package Classes.ENUM.CustomValues;

public class Main {
    public static void main(String[] args) {
        EnumSample sampleVar = EnumSample.getEnumFromValue(107);
        System.out.println(sampleVar.getComment());
    }
}
