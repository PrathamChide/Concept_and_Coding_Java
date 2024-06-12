package JavaAnnotations.Types.UsedOverAnotherAnnotations.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs {
}
