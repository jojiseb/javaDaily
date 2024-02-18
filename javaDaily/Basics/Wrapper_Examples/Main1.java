
public class Main1 {
    public static void main(String[] args) {
        int[] swapVars = {2, 8};
        int a = swapVars[0];
        int b = swapVars[1];
        System.out.println("Before : ");
        System.out.println("a : "+a+", b : "+b);

        swap(swapVars); // Java is always pass-by-value. In this case of using Arrays(Object),
                    //We are again passing the value of reference, not the reference itself
                    //So, swapping will work
        a = swapVars[0];
        b = swapVars[1];
        System.out.println("After : ");
        System.out.println("a : "+a+", b : "+b);
    }
    static void swap(int[] var) {   //swap() receives copy of reference, pointing to the same object
        int temp = var[0];         //So, modifications made on this copy, which points to original object,
        var[0] = var[1];        //will affect original object
        var[1] = temp;

    }
}
