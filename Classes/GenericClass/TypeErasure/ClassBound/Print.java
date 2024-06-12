package Classes.GenericClass.TypeErasure.ClassBound;

public class Print<T extends Number> {
    T value;
    public void setValue(T val){
        this.value =val;
    }
}

//In Class Bound - Print is converted to Print1 where Generic T is converted to its extended child class
