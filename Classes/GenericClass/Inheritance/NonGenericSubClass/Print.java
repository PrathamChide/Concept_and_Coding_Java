package Classes.GenericClass.Inheritance.NonGenericSubClass;

public class Print<T> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}
