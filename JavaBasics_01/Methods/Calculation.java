package JavaBasics_01.Methods;

public class Calculation {
    public int sum(int val1, int val2) {
        int total = val1 + val2;
        System.out.print("The sum is " + total);
        return total;
    }
    public int getPriceOfPen(){
        int capPrice = 2;
        int penBodyPrice = 5;
        int totalPenPrice = sum(capPrice, penBodyPrice);
        return totalPenPrice;
    }
}
