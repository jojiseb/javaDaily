package WrapperClasses;

public class Main3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2};
        System.out.println("Before...");
        System.out.println("nums[0] : "+nums[0]);
        System.out.println("nums[1] : "+nums[1]);

        int[] swappedArr = swapFun(nums);
        System.out.println("After...");
        System.out.println("nums[0] : "+swappedArr[0]);
        System.out.println("nums[1] : "+swappedArr[1]);
    }

    public static int[] swapFun(int[] array) {
        return new int[] {array[1], array[0]};  //swapping without using a third variable
    }                                           //Here, Swapped array is returned to main()
}
