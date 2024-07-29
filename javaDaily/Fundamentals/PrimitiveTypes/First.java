public class First {
    public static void main(String[] args) {
        int score = 90;

        byte t = 30; //A compact data type, great for conserving memory

        //1 byte = 8 bits, i.e., 1 byte occupies 8 bits in m/y -- represents uni-code characters

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
//        int factorial = 1;  factorial variable can't be int, since the result will overflow int range
        //So, we use long datatype to handle that vast range

        long factorial = 1;

        //long is 64 bits

        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+num+" : "+factorial);  //2432902008176640000

        //We typically use long when it needs to handle vast numbers (i.e., numbers that are obtained may exceed)
        //int range

        //We use long in timestamps , handling date and time , also for performing large calculations
        //that include large intermediates or final results such as factorial, power, large sums etc

        //Using "long" for database keys and timestamps is a best practice due to its large range,
        //precision and efficiency

        //For db keys , it ensures scalability and uniqueness, as the db grows which is essential in maintaining data
        //integrity in large and distributed systems

        //For timestamps , it provides a precise and standardized way to represent time, better storage performance, time calculations etc.

        long sum = 0L;
        for(int i = 1; i <= 2000000; i++) {
            sum += i;
        }

        System.out.println("Sum of first 2000000 numbers : "+sum);


        float singlePrecisionNumber = 3.145616479695789567321f;
        System.out.println(singlePrecisionNumber); //3.1456165 - 6-7 digits is shown
                                    //last digit gets rounded

        //float is 32 bits, i.e., a float type occupies 32 bits in m/y

        double doublePrecisionNumber = 3.145616479695789567321;
        System.out.println(doublePrecisionNumber); //3.1456164796957897 - 15-16 digits is shown
                                    //last digit gets rounded

        //double is 64 bits, i.e., double occupies 64 bits in m/y

        char a = 'A'; //char datatype is designed and managed to store single character
        System.out.println("Unicode for A : "+'\u0041');

        //char is 16 bits, i.e., char occupies 16 bits in m/y

        char digit = '5';
        char symbol = '$';
        char unicodeChar = '\u0349'; //Omega
        System.out.println(unicodeChar);

        char summation = '\u2211'; //Sigma
        System.out.println(summation);

        System.out.println(symbol);

        char yenSign = '\u00A5';
        System.out.println(yenSign);

        //Uni-code acts as a single standard that includes all the characters
        //simplifies text processing. So, Developers and Systems only need to handle single encoding
        //scheme than multiple schemes which was a headache before

        //Now, If something is represented as unicode, it gets communicated correctly across
        //all platforms, all languages etc.

        boolean yes = true;

        System.out.println(yes);

        char t1 = 'B';

        System.out.println(t1);

        System.out.println("Next character");

        char t2 = (char)(t1 + 1);

        System.out.println(t2); //C

        char lastAlpha = (char)(a + 25); //A + 25
        System.out.println(lastAlpha); //Z

        char firstAlpha = (char) (lastAlpha - 25);
        System.out.println("first alphabet : "+firstAlpha);
    }
}
