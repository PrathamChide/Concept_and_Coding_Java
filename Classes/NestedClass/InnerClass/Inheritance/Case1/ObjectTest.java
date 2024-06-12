package Classes.NestedClass.InnerClass.Inheritance.Case1;

public class ObjectTest {
    public static void main(String[] args) {
        OuterClass outerClassObj = new OuterClass();
        OuterClass.InnerClass2 innerClass2obj = outerClassObj.new InnerClass2();
        innerClass2obj.display();;
    }
}
