package OOPS;

public class Classes {

    public static void main(String[] args) {
        Student enggStudent = new Student();
        Student mbaStudent = new Student();
    }
}

class Student{
    int age; // data variables
    String address; // data variables

    void updateAddress(){
        //data method
    }

    int getAge(){
        return age;
    }
}
