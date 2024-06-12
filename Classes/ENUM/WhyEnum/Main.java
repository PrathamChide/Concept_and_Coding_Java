package Classes.ENUM.WhyEnum;

import Classes.ENUM.Interfaces.EnumSample;

public class Main {
    public static void main(String[] args) {
        isWeekend(2);
        isWeekend(6);
        isWeekend(100);//this value is not expected but still we are able to send this in parameter
        //better code readability and full control on what value we can pass in parameter
        isWeekend(EnumSample.WEDNESDAY);
        isWeekend(EnumSample.SUNDAY);
    }
    public static boolean isWeekend(int day){
        if(WeekConstants.SATURDAY == day || WeekConstants.SUNDAY == day){
            return true;
        }
        return false;
    }
    public static boolean isWeekend(EnumSample day){
        if(EnumSample.SATURDAY == day || EnumSample.SUNDAY == day){
            return true;
        }
        return false;
    }
}
