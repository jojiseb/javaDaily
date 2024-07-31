import java.util.Objects;

public class DemoClass {
    int a, b;

    String s1 = "First String";

    String s2 = new String(s1);

    String s3 = "First String";

    String s4 = new String("First String");

    DemoClass(int a,int b) {
        this.a = a;
        this.b = b;
    }
    int addition() {
        return a + b;
    }
    int subtraction() {
        return a - b;
    }
    public static void main(String[] args) {
        DemoClass dc = new DemoClass(7,9);
        System.out.println("Sum : "+dc.addition());
        System.out.println("Difference : "+dc.subtraction());

        System.out.println("s1 : "+dc.s1);
        System.out.println("s2 : "+dc.s2);

        if(Objects.equals(dc.s1, dc.s2)) {
            System.out.println("Equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s2 hashCode : "+dc.s2.hashCode());
        }
        else {
            System.out.println("Not equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s2 hashCode : "+dc.s2.hashCode());
        }
        System.out.println();
        if(Objects.equals(dc.s1, dc.s3)) {
            System.out.println("Equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s3 hashCode : "+dc.s3.hashCode());
        }
        else {
            System.out.println("Not equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s3 hashCode : "+dc.s3.hashCode());
        }
        System.out.println();

        if(Objects.equals(dc.s1, dc.s4)) {
            System.out.println("Equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s4 hashCode : "+dc.s4.hashCode());
        }
        else {
            System.out.println("Not equal !");
            System.out.println("s1 hashCode : "+dc.s1.hashCode());
            System.out.println("s4 hashCode : "+dc.s4.hashCode());
        }

        //So, Object.equals() looks for null heck first before comparing the content

        System.out.println("String equals() ..");
        if(dc.s1.equals(dc.s2)) { //Checks for the content only, doesn't look for
            System.out.println("equal");        //reference or memory location
        }
        else {
            System.out.println("Not equal");
            System.out.println("s1 hash : "+dc.s1.hashCode());
            System.out.println("s2 hash : "+dc.s2.hashCode());
        }

        System.out.println();

        if(dc.s1.equals(dc.s4)) { //equal since we are comparing using content
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
            System.out.println("s1 hash : "+dc.s1.hashCode());
            System.out.println("s4 hash : "+dc.s4.hashCode());
        }
    }
}
