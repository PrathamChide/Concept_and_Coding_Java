package Classes.ENUM.Interfaces;

public enum EnumSample implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
