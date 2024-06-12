package JavaAnnotations.Types.UsedOverAnotherAnnotations.Repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
public @interface Category {

    String name();
}
