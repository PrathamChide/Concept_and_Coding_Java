package Classes.NestedClass.InnerClass.Anonymous;

public class Test {
    public static void main(String[] args) {
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("Audi specific break changes");
            }
        };
        audiCarObj.pressBreak();
    }
}
