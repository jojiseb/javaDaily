
class Args {
    int y;
    Args(final int y) {
        this.y = y;
//        y = 7; --> Can't do this as variable y is passed as a final argument, and since final variable is initialized once, can't initialize again.
    }

    void output() {
        System.out.println("Y : "+this.y);
    }

    void test(final String jar) {
        System.out.println("Hello World.."+jar);
//        jar = "New";  //throws issues from using final keyword
                        //since a final
    }
}

public class FinalArguments {
    public static void main(String[] args) {
        Args args1 = new Args(8);
        args1.output();
        args1.test("Jam");
    }
}
