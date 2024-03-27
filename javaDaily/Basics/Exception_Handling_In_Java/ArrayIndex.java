public class ArrayIndex {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int index = 1090;

        if(index == 0)
            throw new ArrayIndexOutOfBoundsException("index can't be greater than lenght of array");
        try {
            System.out.println(nums[index]);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
