
class Args {
    int y;
    Args(int y) {
        this.y = y;
        y = 7;
    }

    void output() {
        System.out.println("Y : "+this.y);
    }
}

public class FinalArguments {
    public static void main(String[] args) {
        Args args1 = new Args(8);
        args1.output();
    }
}
