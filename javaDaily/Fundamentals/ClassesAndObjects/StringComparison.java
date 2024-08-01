public class StringComparison {
    public static void main(String[] args) {
        String one = "One";
        String two = "One";
        String three = new String("One");
        String four = one;
        String five =new String("One");

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
    }
}
