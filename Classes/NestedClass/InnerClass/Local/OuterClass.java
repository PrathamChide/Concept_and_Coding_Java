package Classes.NestedClass.InnerClass.Local;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 2;
    public void display(){
        int methodLocalVariable = 3;
        class LocalInnerClass{
            final int localInnerVariable = 4;
            public void print(){
                System.out.println(instanceVariable + classVariable + methodLocalVariable + localInnerVariable);
            }
        }
        LocalInnerClass localObj = new LocalInnerClass();
        localObj.print();
    }
}
