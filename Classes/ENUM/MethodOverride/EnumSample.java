package Classes.ENUM.MethodOverride;

public enum EnumSample {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Default dummy method");
    }
}
