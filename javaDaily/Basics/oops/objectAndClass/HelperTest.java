package objectAndClass;

interface MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
}

public class HelperTest {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(7, 12));
        System.out.println(MathUtils.subtract(87, 4));
    }
}
