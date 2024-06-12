package Classes.GenericClass.Intro;

public class Print1<T>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
