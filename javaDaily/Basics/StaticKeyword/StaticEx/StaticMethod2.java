package StaticEx;

class MathUtils {
    static double add(double num1, double num2) {
        return num1 + num2;
    }
}
public class StaticMethod2 {
    public static void main(String[] args) {
        double a = MathUtils.add(18,67);
        System.out.println("Sum : "+a);
    }
}
