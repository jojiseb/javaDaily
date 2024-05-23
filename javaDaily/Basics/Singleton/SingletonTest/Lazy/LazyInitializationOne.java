package SingletonTest.Lazy;

public class LazyInitializationOne {
    private static LazyInitializationOne singleton;

    private LazyInitializationOne() {

    }
    public static LazyInitializationOne getInstance() {
        if(singleton == null) {     //Lazily initialized, i.e., Created when necessary inside method
            singleton = new LazyInitializationOne();    //WWorks well in single-threaded envt. Mess up in multi-threaded envt.
            //Multiple instances get created, which doesn't fit to the concept Singleton..Cuz, i block is accessed same time
        }   //Ends up multiple objects with diff hashCode

            //Inconsistent results in multi-threaded envt
        return singleton;
    }
}
