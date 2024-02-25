
class One {
    static final int FIRST_NUMBER = 1;
    final String check;

    static final boolean isSunday;

    final int age;

    {
        age = 13;
    }

    static {
        isSunday = false;
    }

    public One(String ch) {
        this.check = ch;
    }


}
public class FinalField1 {
    public static void main(String[] args) {
        One one = new One("Hello");
        System.out.println("Check : "+one.check+"\nisSunday : "+One.isSunday+"\n FIRST_NUMBER : "+One.FIRST_NUMBER);
        System.out.println("Age : "+one.age);
    }
}
