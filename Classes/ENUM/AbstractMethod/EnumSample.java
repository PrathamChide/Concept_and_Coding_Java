package Classes.ENUM.AbstractMethod;

public enum EnumSample {
    MONDAY{
        public void dummyMethod(){
            System.out.println("in Monday");
        }
    },
    TUESDAY{
        public void dummyMethod(){
            System.out.println("in Tuesday");
        }
    },
    SUNDAY{
        public void dummyMethod(){
            System.out.println("in Sunday");
        }
    };

    public abstract void dummyMethod();
}
