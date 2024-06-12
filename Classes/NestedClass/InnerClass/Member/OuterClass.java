package Classes.NestedClass.InnerClass.Member;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;
    class InnerClass{
        public void print(){
            System.out.println(classVariable + instanceVariable);
        }
    }
}
