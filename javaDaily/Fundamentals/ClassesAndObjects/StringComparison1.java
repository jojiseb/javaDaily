public class StringComparison1 {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "apple";
        String s4 = "apricot";

        String s5 = "applepie";

        String s6 = "2";
        String s7 = "et";

        int r = s1.compareTo(s2);   //a in apple < b in banana

        if(r > 0) {
            System.out.println("apple > banana");
        }
        else if(r == 0) {
            System.out.println("apple = banana");
        }
        else {
            System.out.println("apple < banana");
        }

        System.out.println();

        int r1 = s1.compareTo(s3); //a in apple = a in apple

        if(r1 > 0) {
            System.out.println("apple > apple");
        }
        else if(r1 == 0) {
            System.out.println("apple = apple");
        }
        else {
            System.out.println("apple < apple");
        }

        System.out.println();

        int r2 = s1.compareTo(s4); //3rd character p in apple is < 3rd character
                            //r in apricot

        if(r2 > 0) {
            System.out.println("apple > apricot");
        }
        else if(r2 == 0) {
            System.out.println("apple = apricot");
        }
        else {
            System.out.println("apple < apricot");
        }

        int r3 = s2.compareTo(s1); //b in banana > a in apple

        if(r3 > 0) {
            System.out.println("banana > apple");
        }
        else if(r3 == 0) {
            System.out.println("banana = apple");
        }
        else {
            System.out.println("banana < apple");
        }

        System.out.println();
        int r4 = s2.compareTo(s4); //b in banana > a in apricot

        if(r4 > 0) {
            System.out.println("banana > apricot");
        }
        else if(r4 == 0) {
            System.out.println("banana = apricot");
        }
        else {
            System.out.println("banana < apricot");
        }

        System.out.println();

        int r5 = s4.compareTo(s1); // 3rd character r in apricot > 3rd character p in apple

        if(r5 > 0) {
            System.out.println("apricot > apple");
        }
        else if(r5 == 0) {
            System.out.println("apricot = apple");
        }
        else {
            System.out.println("apricot < apple");
        }

        System.out.println();

        int r6 = s4.compareTo(s2); //a in apricot < b in banana

        if(r6 > 0) {
            System.out.println("apricot > banana");
        }
        else if(r6 == 0) {
            System.out.println("apricot = banana");
        }
        else {
            System.out.println("apricot < banana");
        }

        System.out.println();

        int r7 = s1.compareTo(s5); //apple < applepie --Here, first 5 characters of both are same
                                //Still apple is considered less than applepie is based on difference in length

        //So, negative value is returned

        if(r7 > 0) {
            System.out.println("apple > applepie");
        }
        else if(r7 == 0) {
            System.out.println("apple = applepie");
        }
        else {
            System.out.println("apple < applepie");
        }

        System.out.println();

        int r8 = s5.compareTo(s1); //applepie is > apple , since both 5 characters are same in both Strings,
                            //So, apple is considered less than applepie because it's short in length

        if(r8 > 0) {
            System.out.println("applepie > apple");
        }
        else if(r8 == 0) {
            System.out.println("applepie = apple");
        }
        else {
            System.out.println("applepie < apple");
        }

        System.out.println();

        int r9 = s6.compareTo(s7);

        if(r9 > 0) {
            System.out.println("s6 > s7");
        }
        else if(r9 == 0) {
            System.out.println("s6 = s7");
        }
        else {
            System.out.println("s6 < s7");
        }
    }
}
