package StaticEx;

public class StaticAndFinal {

    private static final int a = 20;

    int b;

//    b = 67; --> Error, Since java doesn't allow assigning values to any variables in class body, outside any method or block

    //Either initialize during declaration, or inside some block or method

//    private static final int b;   //Error since static final variables must be initialized

    private static final int c;

//    private static final int Pi;
//
//    Pi = 3.14; //Error, Must be initialized along with declaration

    static { //Static variables can be initialized apart with declaration in the static block
        c = 50;
    }

    public static void main(String[] args) {
        System.out.println("a : "+a);

//        a++; Error , Since final variables can't be modified
    }
}
