package objectAndClass;

class Cup {
    int cupNo;
    double width, breadth, height;

    //"this" keyword means what object you are referring to
//Examples of multiple constructors

    //"this" keyword gets replaced by reference variable, where-ever its used
    //Its same as using dot operator to assign value inside object to instance variable
    //What happens inside constructor or a method call where "this" is used
    //this.propertyName = refVariable.propertyName

    Cup() {
        this.cupNo = 12;
        this.breadth = 10;
        this.width = 11;
        this.height = 15;
    }

    Cup(Cup cup) {
        this.cupNo = cup.cupNo;
        this.height = cup.height;
        this.width = cup.width;
        this.breadth = cup.breadth;
    }

    Cup(double w, double b, double h) {
        this.width = w;
        this.breadth = b;
        this.height = h;
    }

    Cup(int cupNo, double w, double b, double h) {
        this(w, b, h);  //calling another constructor inside another constructor
        this.cupNo = cupNo;
    }

    @Override
    public String toString() {
        return "No: "+this.cupNo+", Width : "+this.width+", Breadth : "+this.breadth+", Height : "+this.height;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Cup cup = new Cup();
        Cup cup1 = new Cup(1, 22, 33, 44);
        Cup cup2 = new Cup(5,10,15);

        System.out.println(cup);
        System.out.println(cup1);
        System.out.println(cup2);

        Cup cup3 = new Cup(cup2);

        System.out.println(cup3);
        System.out.println("cup2 hash : "+cup2.hashCode()+", cup3 hash : "+cup3.hashCode());
    }
}
