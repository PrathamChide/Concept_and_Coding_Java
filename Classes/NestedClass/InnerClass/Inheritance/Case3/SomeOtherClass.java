package Classes.NestedClass.InnerClass.Inheritance.Case3;

public class SomeOtherClass extends OuterClass.InnerClass{
    SomeOtherClass(){
        new OuterClass().super();
        //as you know, when child class constructor invoked, it first invoked the constructor of
        //parent is inner class, so, it can be accessed by the object of outerClass only
    }
    public void display1(){
        display();
    }

}
