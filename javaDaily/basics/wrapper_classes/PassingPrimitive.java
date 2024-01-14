public class PassingPrimitive {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before modify : num - "+num);
        modifyValue(num);
        System.out.println("Returning from modify : ");
        System.out.println("num : "+num);
    }                          //Here, Original value of primitive type n't modified, since we pass by value
                            //So, No original value is modified, but the copy

    public static void modifyValue(int num) {
        System.out.println("Inside modify value : num - "+num);
        num = 200;
        System.out.println("After modify : num - "+num);
    }
}
