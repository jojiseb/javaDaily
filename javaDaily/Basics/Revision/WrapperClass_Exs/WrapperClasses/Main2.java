package WrapperClasses;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20,30};
        System.out.println("Before swapping : numbers[0] : "+numbers[0]+", numbers[1] : "+numbers[1]);

        swapFunction(numbers);//We are passing an Array,
        //so it's not a copy,But reference to original array itself
        //(Reference points to m/y location in which actual object resides in m/y)
       // So Swapping happens on original value residing in memory

        System.out.println("After swapping : numbers[0] : "+numbers[0]+", numbers[1] : "+numbers[1]);
    }

    public static void swapFunction(int[] num) { //Original value gets swapped
        System.out.println("Inside swapFunc, Before : num[0] : "+num[0]+", num[1] : "+num[1]);
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
        System.out.println("Inside swapFunc, After : num[0] : "+num[0]+", num[1] : "+num[1]);
    }
}
