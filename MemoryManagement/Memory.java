package MemoryManagement;


public class Memory {
    public static void main(String[] args) {
        int primitiveVariable = 10;
        Person personObj = new Person();
        String stringLiteral = "24";
        Memory memObj = new Memory();
        memObj.memoryManagementTest(personObj);
    }
    public void memoryManagementTest(Person personObj){
        Person personObj2 = personObj;
        String stringliteral2 = "24";
        String stringliteral3 = new String("24");
    }
}
