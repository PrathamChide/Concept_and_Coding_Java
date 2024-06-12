package JavaAnnotations.Types.UsedOverAnotherAnnotations.Inherited;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ChildClass().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));
    }
}

//Note: If we remove @Inherited from the same, the result will be null