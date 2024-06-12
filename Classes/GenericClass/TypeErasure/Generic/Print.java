package Classes.GenericClass.TypeErasure.Generic;

public class Print<T> {
    T value;
    public void setValue(T val){
        this.value = val;
    }
}

//In Generic Class Erasure - Print is converted to Print1 where generic T is converted to its
// parent class i.e. Object Class