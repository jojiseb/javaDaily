public interface Operations {
    int addition(int a, int b);
    int subtract(int a, int b);
    default void defaultMethod() {
        System.out.println("I am default implementation..");
    }
}

class Solve implements Operations {
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public void defaultMethod() {
        System.out.println("Implemented method..");
    }

    public static void main(String[] args) {
        Operations operations = new Solve(); //This approach uses polymorphism

        //Advantages
        // --> This method abstracts away implementation details. You can change implementation from
        //     Solve to any other class without changing code that uses operations
        // Eg: operations = new AdvancedSolve();
        // --> Since You can switch btw multiple implementations of Operations, Its more flexible

        // Solve solve = new Solve(); --> Usage of concrete class. Its more specific & can be useful
        // when need to access methods or fields specific to Solve class, not part of
        //Operations

        //Useful when Polymorphic behaviour is n't required or you are such implementations won't change much
        //over the years

        int sum = operations.addition(3,6);
        int difference = operations.subtract(11, 9);
        System.out.println("Sum : "+sum);
        System.out.println("Difference : "+difference);

        operations.defaultMethod();
    }
}
