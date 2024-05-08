package StaticEx;


public class UtilityClassEx {

    static int findMax(int a, int b) {
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        int maxValue = UtilityClassEx.findMax(45, 12);
        System.out.println("max : "+maxValue);
    }
}
