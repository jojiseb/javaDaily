public class FinalizeTest {
    int num;
    String j;

    FinalizeTest(int num, String j) {
        System.out.println("Initialise object..");
        this.num = num;
        this.j = j;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting Objects..");   // Java manages removing/destroying unused objects automatically
    }                                           //So that you don't need to focus on deletion like it was in C/C++

                                        //Even though, Java doesn't give any control  over removing objects, it does
    public static void main(String[] args) {    //provide you to perform some actions to perform before the
        FinalizeTest f;                 // destruction/removal of object. That is what finalize() is there for.
        for (int k = 1; k < 1000000000; k++) {
            f = new FinalizeTest(24, "Testing");
        }     //You can use finalize() to perform some clean up actions like closing network connections/file/DB
    }        // Connections
}            //You can provide it, but it is not sure to call this method everytime...It mostly happens when there is
            // some real load on heap