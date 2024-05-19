package SingletonTest;

public class SingletonObj {

    private SingletonObj() {    //private Constructor, to avoid creation of a new object apart from the one created.

    }   //This constructor won't be accessible outside this class, so no more object creation

    private static SingletonObj singletonObj;
    private static int count;

    public static SingletonObj getSingletonInstance() {
        if(singletonObj == null) {  //If no single object is created, its created here in the class
            singletonObj = new SingletonObj();
            System.out.println("count : "+(++count)); //count : 1 displayed. We can see only a single object is created
        }                   //and reused everytime
        return singletonObj;    //No more objects are created or can't be created
    }
}
