package Classes.NestedClass.StaticInnerClass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{
        public void print(){
            System.out.println(classVariable);
        }
    }
}
