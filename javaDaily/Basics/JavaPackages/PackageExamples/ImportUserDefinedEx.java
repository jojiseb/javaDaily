
import UserDefined.MyClass;
public class ImportUserDefinedEx {
    public static void main(String[] args) {
        String name = "Learning user-defined packages";
        MyClass myClass = new MyClass(); //Creating an instance of class MyClass
        //in current package

        myClass.getName(name);
    }
}
