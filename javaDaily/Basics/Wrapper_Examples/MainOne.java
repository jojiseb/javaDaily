
public class MainOne {
    public static void main(String[] args) {
        int c = 56;

        Integer v = 850;
        // Wrapper classes were introduced to make the extended functionalities to primitive types,
        // to truly use them like objects

        Integer b = new Integer(90);

        System.out.println(c);  // You can't apply dot operator here
                        //So, predictable functionality as integers;

        System.out.println(v);  // Can apply dot operator as this is an Object

        // A class is just group of props and behaviours, so just like that wrapper classes consist of them too
        // we can use them as needed

        // Wrapper classes are for basically using primitive types as objects

        int a = 11;

        System.out.println("Before swapping : \na : "+a+"\nc : "+c);
        swap(a,c);                                      // Here, Swapping doesn't work as primitive types are pass-by-value (copy of original is passed)
        System.out.println("After swapping : \na : "+a+"\nc : "+c); // So, Even if swapping happens, it is just scoped to the swap(),
                                                                    // and main() retains original values

    }

    static void swap(int a , int c) {
        int temp = a;
        a = c;
        c  = temp;
    }

    static class MyClass {

    }
}
