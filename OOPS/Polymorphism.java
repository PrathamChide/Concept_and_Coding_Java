package OOPS;

// Method Overloading/ Compile Time Polymorphism/ Static Polymorphism
class Sum{
    int doSum(int a, int b){
        return a + b;
    }
    int doSum(String a, String b){
        return 0;
    }
    int doSum(int a, int b, int c){
        return  a + b + c;
    }

//    This is not allowed in method overloading -> This only check formal parameters
//    int doSum(int a, int b){
//        return  a + b;
//    }
//    String doSum(int a, int b){
//
//    }
}

// Method Overriding/ Run Time Polymorphism/ Dynamic Polymorphism
class A{
    boolean getEngine(){
        return true;
    }
}
class B extends A{
    boolean getEngine(){
        return false;
    }
}

//Note:- Here no. of formal parameters/ arguments need to be same for method overriding.

public class Polymorphism {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.getEngine();

        B obj2 = new B();
        obj2.getEngine();
    }
}