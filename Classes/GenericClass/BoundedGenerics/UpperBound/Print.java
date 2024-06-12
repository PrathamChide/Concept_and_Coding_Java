package Classes.GenericClass.BoundedGenerics.UpperBound;

public class Print<T extends Number> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}
