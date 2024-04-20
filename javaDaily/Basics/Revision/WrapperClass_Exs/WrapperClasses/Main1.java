package WrapperClasses;

public class Main1 {
    public static void main(String[] args) {
        int a = 12; //primitive types
        int b = 34;

        System.out.println(a); //You can't use dot operator with primitive types.

        //JAVA isn't a fully OOP programming language, since primitive types aren't Objects

        //You can't perform any extended functionalities on primitive types. Behaviour of a primitive type is always predictable.

        //So, You can't use dot (.) operator on primitive types, since there is no extended functionalities to perform using methods

        Integer p = 6;

        System.out.println(p); //You can extend some functionality on p using dot operator

        Integer integer = new Integer(8);

        System.out.println(integer);

        System.out.println("Before swapping : a : "+a+", b : "+b);

        swapFunction(a, b); //In Java, Primitive types are pass-by-value. So, Here its passing a copy of original value

        System.out.println("After Swapping : a : "+a+", b : "+b);
     }
     public static void swapFunction(int a, int b) {    //swapping is performed on the copied value, not on original value
        System.out.println("Inside swapFunc, Before : a : "+a+", b : "+b);   //in memory ...So, it is not reflected
        int temp = a;                           //outside this function
        a = b;
        b = temp;
        System.out.println("Inside swapFunc, After : a : "+a+", b : "+b);
     }
}
