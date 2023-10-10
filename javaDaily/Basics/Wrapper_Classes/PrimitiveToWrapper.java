public class PrimitiveToWrapper {
    public static void main(String[] args) {
        //Methods to convert primitive to wrapper

        //Using constructors or static factory methods

        Integer q  = new Integer(3);

        Integer w = Integer.valueOf(2);

        //Usage of factory methods are recommended since constructors
        //are mostly deprecated

        //valueOf() returns cached value, makes it more efficient

    }
}
