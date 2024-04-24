package UserDefined;

public class Compare {
    double number1;
    double number2;
    public Compare(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
    }
    public void largestOfNumbers(double number1, double number2) {
        if(number1 > number2) {
            System.out.println(number1+" is larger than "+number2);
        }
        else {
            System.out.println(number2+" is larger than "+number1);
        }
    }
    public static void smallestOfNumbers(double number1, double number2) {
        if(number1 < number2) {
            System.out.println(number1+" is smaller than "+number2);
        }
        else {
            System.out.println(number2+" is smaller than "+number1);
        }
    }
}
