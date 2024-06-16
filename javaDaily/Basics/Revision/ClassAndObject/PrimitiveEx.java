public class PrimitiveEx {
    private int intValue;
    private boolean isIntValueSet;
    private double doubleValue;
    private boolean isDoubleValueSet;

    public void setIntValue(int intValue) {
        this.intValue = intValue;
        this.isIntValueSet = true;
    }
    public void setDoubleValue(double val) {
        this.doubleValue = val;
        this.isDoubleValueSet = true;
    }
    public double getDoubleValue() {
        return this.doubleValue;
    }
    public void performAction() {
        if(isIntValueSet) {
            System.out.println("\nInt value is set : "+intValue);
        }
        else {
            System.out.println("\nInt value doesn't exist");
        }

        if(isDoubleValueSet) {
            System.out.println("Double Value is Set : "+this.getDoubleValue()+"\n");
        }
        else {
            System.out.println("Double value doesn't exist\n");
        }
    }

    public static void main(String[] args) {
        PrimitiveEx prim = new PrimitiveEx();
        prim.performAction();

        System.out.println("Let's set some values !");

        prim.setIntValue(12);

        prim.performAction();

        prim.setDoubleValue(33.67);

        prim.performAction();
    }

}
