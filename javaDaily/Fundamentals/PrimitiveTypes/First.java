public class First {
    public static void main(String[] args) {
        int score = 90;

        byte t = 30; //A compact data type, great for conserving memory

        short sh = 100; // larger than byte but smaller than int

        //  byte < short < int

        long lo = 73874874388L; //To represent vast numbers or large integers
                                //which can't be represented with int type because it exceeds int range

        long op = 8968779996111113894L;

//        int num = 20;
//
//        long factorial = 1L;
//
//        for(int i = 1; i <= num; i++) {
//            factorial = factorial * i;
//        }


//         int num = 20;
//         long factorial = 1L; //To store vast numbers
//         for(int i = 1; i <= num; i++){
//             factorial *= i;
//         }

        int num = 20;
        int factorial = 1;
        System.out.println("Factorial of "+num+" : "+factorial);
    }   //2432902008176640000
}
