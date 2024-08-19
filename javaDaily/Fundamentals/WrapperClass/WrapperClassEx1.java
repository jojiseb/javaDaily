import java.util.Optional;

public class WrapperClassEx1 {
    public static void main(String[] args) {
        int num = 450;

        Integer wrappedInt = new Integer(num); //int is converted to its wrapper class object Integer
        System.out.println("wrappedInt : "+wrappedInt);

        Integer wrap1 = Integer.valueOf(num); //Another way to convert int to its wrapper Integer

        //The process of converting a primitive datatype into its corresponding wrapper class object is called Boxing.

        //Boxing allows to work with primitive datatypes in a more Object-Oriented manner, by using more methods , functionalities
        //whereas earlier it is just used along with math operators

        System.out.println(wrappedInt.getClass()); //To know whether the primitive type actually got converted , displays class java.lang.Integer
        System.out.println();

        int prim = wrappedInt.intValue(); //Integer is converted back to its primitive type
        //prim is assigned the primitive int value which got extracted from its wrapper object

        //The process of converting a wrapper class object to its corresponding primitive data type is called Unboxing.
        //Therefore, Unboxing is the reverse of boxing.

        System.out.println("prim : "+prim);

        int intItem = 77;
        Integer newWrappedInt = intItem;
        //Here, The primitive data type int got automatically converted to its
        // wrapper class object Integer, Without any explicit methods like valueOf(int), new Integer(int)

        //Java automatically does it. This automatic conversion by java from primitive type int to wrapper class equivalent
        // Integer is called autoboxing


        Integer boxedInt = Integer.valueOf(78); //converting int to Integer
        System.out.println("Wrapped item : "+boxedInt);

        int primInt = boxedInt;
        //Wrapper object Integer got automatically converted to its primitive datatype int is
        //called as Auto-unboxing

        //This boxing, un-boxing, auto-boxing & auto-unboxing is done between all primitive datatypes and Wrapper Classes

        //Autoboxing, Auto-Unboxing was introduced to make code more readable or to make less intervention
        //from the developers

        //boxing, unboxing still exists even though autoboxing and auto unboxing exists
        //because sometimes manual intervention is necessary to have more control over conversion.

        //One such scenario is to handle NullPointerException shown below :

//        Integer autoboxFailTest1 = null;
//        int testCheck = autoboxFailTest1;
//
//        System.out.println(testCheck); //NPE is thrown

        //What happens under the hood is autoboxFailTest1.intValue() i.e., trying to
        //extract int value from corresponding wrapper class. But since null represents absence of object,
        //it won't be able to extract int value from integer Object

        //Auto-unboxing can lead to NPE if not handled carefully

        //One other case is that explicit boxing or un-boxing is done when working on performance critical apps
        //Because, in those every conversion should be as controllable to identify and measure performance

        //Other case is to maintain older code functional

        //Now to handle NPE during autounboxing, we perform null check
        Integer nullCheck = null;
        int checkNull = (nullCheck != null) ? nullCheck : 0; //Check for null, If yes , default int value 0 is assigned

        System.out.println("checkNull : "+checkNull);

        //or using java Optional for java 8+

        Integer nullForI = null;
        int checkNull1 = Optional.ofNullable(nullForI).orElse(0); //Get the value if it exists or provide a default value

        System.out.println("checkNull1 : "+checkNull1);

        Integer item = 34;
        Integer optionalTest = Optional.of(item).get(); //If value exists, get that value
        System.out.println("nullForInt : "+optionalTest);

        Optional<Integer> testOptional = Optional.of(item);

        System.out.println("testOptional : "+testOptional.get()); //getting the value since it exists

        Integer testInt = Integer.valueOf(23);

        Optional<Integer> value = Optional.of(testInt); //Optional.of() will throw NPE if no value exists
        System.out.println("value : "+value.get());

        //Optional.of() clearly communicates that value should never be null. It's a way of saying : "I'm sure this value isn't null,
        // and if it is, it's a programming error".

        //It's a way of saying "This value mustn't be null and if it is, Deal with it immediately !"
    }
}
