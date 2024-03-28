public class ArrayIndex {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3,4};
            int index = 10;

            if(index == 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index can't be 0 or greater than array length !"); //ArrayIndexOutOfBounds Exception got catched here
            }       // So, Normal flow not interrupted
            else{
                System.out.println("Number : "+numbers[index]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
