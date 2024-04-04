public class Finally2 {
    public static void main(String[] args) {
        try {   //All doubtful statements are inside try block
            int number = 12/0;
            System.out.println("Number : "+number);
        }
        catch (Exception e) {
//            System.out.println(e.getMessage());
            System.out.println("Can't divide by zero !");
        }
        finally {   //Mostly Resources are closed here, db connections, file processes etc
                    //Also, Code which needs to be executed no matter what
            System.out.println("try-catch is over !!");
        }
    }
}
