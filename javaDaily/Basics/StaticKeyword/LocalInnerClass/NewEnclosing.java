package LocalInnerClass;

public class NewEnclosing {

    private static String type = "String";
    private static int num = 7;

    String item = "Item";

    int now = 100;

    void outerDisplay() {
        System.out.println("Outer check");
    }

    void localMethodInner() {

        class Inside { //Class is defined inside a method block, or scope block,
                        // So, It's called Local Classes
            //Since, It's inside block, they can't have access modifiers in their declaration

            //They can have access to both static and non-static members in enclosing context

//            static void test() {
//
//            }

//            static String i = "two";

            String g = "GGGGggggggg"; //Can only define instance members

            //instance variable

            void innerDisplay() { //instance method
                outerDisplay();
                System.out.println("Type : "+type);
                System.out.println("Number : "+num);
                System.out.println("Item : "+item);
                System.out.println("Now : "+now);
            }
        }

        Inside inside = new Inside();
        inside.innerDisplay();
    }

    public static void main(String[] args) {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.localMethodInner();
    }
}
