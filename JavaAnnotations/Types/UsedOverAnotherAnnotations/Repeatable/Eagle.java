package JavaAnnotations.Types.UsedOverAnotherAnnotations.Repeatable;

@Category(name = "Bird")
@Category(name = "LivingThing")
@Category(name = "Carnivores")

public class Eagle {
    public void fly(){
        System.out.println("Fly");
    }
}
