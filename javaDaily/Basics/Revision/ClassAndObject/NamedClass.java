
abstract class OneAbs {
    abstract void create();
}
public class NamedClass extends OneAbs { //Using named Class to extend abstract class

    private static int count;
    private int e;

    NamedClass() {  //Using constructor for initializing values
        System.out.println("Constructing e : "+e);
        e = 24;
        System.out.println("e : "+e);
        count++;
    }

    @Override
    void create() { //implementing parent class methods
        System.out.println("Part of creation...");
        System.out.println("Count : "+count);
    }
    public static void main(String[] args) {
        NamedClass namedClass = new NamedClass();
        namedClass.create();

        NamedClass unNamed = new NamedClass();
        unNamed.create();
    }
}
