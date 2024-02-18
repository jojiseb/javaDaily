public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[] {10,40};

        int a = arr[0];
        int b = arr[1];

        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        int[] afterSwapping = swap(a,b);
        a = afterSwapping[0];
        b = afterSwapping[1];
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }

    static int[] swap(int a, int b) {
        return new int[]{b,a};      //Swapping easily without a temp. variable
    }
}
