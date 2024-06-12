package JavaAnnotations.Types.UserDefinedOrCustomAnnotations.ElementWithDefaultValues;

public @interface MyCustomAnnotation {
    String name() default "Hello";
}
