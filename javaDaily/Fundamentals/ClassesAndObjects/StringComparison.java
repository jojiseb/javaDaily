import java.util.Objects;

public class StringComparison {
    public static void main(String[] args) {
        String one = "One";
        String two = "One";
        String three = new String("One");
        String four = one;
        String five =new String("One");

        String six = "Ona"; //Gets allocated new m/y since no content exists before, and gets interned automatically by JVM

        String seven = "Aone";

        String eight = "Pna";

        //Here, When one is initialized in String pool, it looks whether the content
        //exists already ? If n't, It stores it and returns the reference.

        //Since its created first time in String pool, it gets interned automatically
        //by JVM at compile-time. The JVM maintains a single copy of each String literal in
        //String pool.

        //When two is initialized, it checks if its content already exists. It finds out the content of one and reuses
        //the interned String..So, A new copy of same content is not getting created in String pool due to interning
        //of String literal.

        String hash = "one hash : "+one.hashCode()+", two hash : "+two.hashCode();
        if(one == two) { //Will be equal, since both refer to same m/y location
            System.out.println("Equals"); //== checks for m/y reference
            System.out.println(hash); //returns true since both refer to same Object in m/y
        }
        else {
            System.out.println("N't Equal");
            System.out.println(hash);
        }

        System.out.println();

        if(one == three) {  //N't equal, Since m/y location is different for one (String literal) and three (new Object created using new keyword)
            System.out.println("Equal"); //So, Obviously different references , will return false even though both are same content
            System.out.println(hash);
        }
        else {
            System.out.println("Not equal");
            System.out.println(hash);
        }

        System.out.println();

        System.out.println("three and 5");
        if(three == five) { //N't equal, since with each new keyword , a new object gets
            System.out.println("Equal"); //created even though they are of same content
            System.out.println(hash);
        }
        else {
            System.out.println("N't equal");
            System.out.println(hash);
        }

        System.out.println();

        if(one.equals(two)) { //Will be equal, since it compares by content
            System.out.println("Equals");
            System.out.println(hash); //returns true , Since both Strings have same content
        }
        else {
            System.out.println("N't Equal");
            System.out.println(hash);
        }
        System.out.println();
        if(one.equals(three)) { //Equal since String.equals() compares by content
            System.out.println("Equal");
            System.out.println(hash);
        }
        else {
            System.out.println("N't Equal");
            System.out.println(hash);
        }
        System.out.println();

        if(three.equals(five)) {    //Equal since String.equals() compares
            System.out.println("Equal"); //by content, even if it's a String literal or uses
            System.out.println(hash); // new keyword
        }
        else {
            System.out.println("N't Equal");
            System.out.println(hash);
        }

        System.out.println();
        if(Objects.equals(one, five)) { //Perform null check and then compares content
            System.out.println("Equal"); //Normally used to make sure Objects are null-safe while comparing
        }
        else {
            System.out.println("N't Equal");
        }

        System.out.println();
        if(Objects.equals(null, null)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("N't Equal");
        }

        System.out.println();
        if(Objects.equals(one, null)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("N't Equal");
        }

        System.out.println();

        int res = one.compareTo(two); //0 , since both are lexicograhically same

        if(res > 0) {
            System.out.println("one > two");
        }
        else if(res == 0) {
            System.out.println("one = two");
        }
        else {
            System.out.println("one < two");
        }

        System.out.println();

        int r1 = one.compareTo(six); //e in One is > a in Ona


        if(r1 > 0) {
            System.out.println("one > six");
        }
        else if(r1 == 0) {
            System.out.println("one = six");
        }
        else {
            System.out.println("one < six");
        }

        System.out.println();

        int r2 = one.compareTo(seven); //O in One is > A in Aone

        if(r2 > 0) {
            System.out.println("one > seven");
        }
        else if(r2 == 0) {
            System.out.println("one = seven");
        }
        else {
            System.out.println("one < seven");
        }

        int r3 = one.compareTo(eight); //o in One < P in Pna

        if(r3 > 0) {
            System.out.println("One > Pna");
        }
        else if(r3 == 0) {
            System.out.println("One = Pna");
        }
        else {
            System.out.println("One < Pna"); //1st Character in 2nd String > 1st Character in 1st String
        }

        System.out.println();
        int r4 = "BCA".compareTo("MCA"); //B in BCA is < M in MCA

        if(r4 > 0) {
            System.out.println("BCA > MCA");
        }
        else if(r4 == 0) {
            System.out.println("BCA = MCA");
        }
        else {
            System.out.println("BCA < MCA");
        }

        System.out.println();
        int r5 = "CB".compareTo("CC"); //2nd Character's are compared since 1st of both are same
                                    //B in CB < C in CC
        if(r5 > 0) {
            System.out.println("CB > CC");
        }
        else if(r5 == 0) {
            System.out.println("CB == CC");
        }
        else {
            System.out.println("CB < CC");
        }
    }
}
