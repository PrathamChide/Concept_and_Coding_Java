package JavaAnnotations.Types.UsedOverAnotherAnnotations.Retention;
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(TestClass.class.getAnnotation(MyCustomAnnotationWithInherited.class));
    }
}
