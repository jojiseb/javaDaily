package StaticEx;

public class Main {
    public static void main(String[] args) {
        Human one = new Human(10, "Sarup", 5000000, false);
        Human two = new Human(20, "Alex", 270000,  true);

        System.out.println(one.name);
        System.out.println(two.isMarried);
    }
}
