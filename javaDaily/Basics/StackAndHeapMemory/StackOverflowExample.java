public class StackOverflowExample {
    public static void main(String[] args) {
        try {
            recursiveCounter(1);
        }
        catch (StackOverflowError e) {  //It's not an Exception, but an Error, So, StackOverFlowError
            System.out.println("Stack overflow error caught: "+e.getMessage()); //Error raised since no space to create new Objects
        }   //Stack Memory is dependent o
    }
    public static void recursiveCounter(int number) {
        System.out.println("number : "+number);
        recursiveCounter(number + 1); //recursive method causing Stack Overflow error
    }

}
