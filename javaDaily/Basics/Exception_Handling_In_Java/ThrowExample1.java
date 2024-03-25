public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            int divide = divide(10,0);
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws MyException{  //Warning to those who will use this method, Now its there responsibility to avoid the error
        if(b == 0) {
            throw new MyException("You can't divide by zero"); //Explicitly throwing a custom exception
        }
        return a/b;
    }
}
