
class Z {
    private final Integer i = 90;
            // Can't re-assign a final variable
//    public void setI(Integer i) {
//        this.i = i;
//    }

    public Integer getI() {
        return i;
    }
}

public class FinalVars1 {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println("I : "+z.getI());
    }
}
