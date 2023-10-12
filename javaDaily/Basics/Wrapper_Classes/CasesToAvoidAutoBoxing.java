import java.util.ArrayList;
import java.util.List;

public class CasesToAvoidAutoBoxing {
    public static void main(String[] args) {

        Integer a = 600;    // Comparing objects created through auto-boxing creates
                            //unexpected results, due to different object references
        Integer s = 600;

        boolean val = (a == s) ? true : false;

        System.out.println("Val : "+val);   // false

        int y = 100;
        int u = 100;

        boolean i = (y == u) ? true : false;

        System.out.println("Value : "+i);   // true

        //Another case to avoid autoboxing is inside the loops

        List<Integer> nums = new ArrayList<>();
        for(int kl = 0; kl < 10000; kl++) {
            nums.add(kl);       //autoboxing happens before storing to nums - create large no. of objects
        }                       //leading to increased m/y, performance overheads

        List<Integer> numbers = new ArrayList<>();
        for (int df = 0; df < 10000; df++) {
            numbers.add(Integer.valueOf(df));   //usage of static factory method to convert prim to wrapper
                                                //by manual conversion rather than auto boxing
        }

        //Another case to avoid autoboxing while performing arithmetic operations, leads to low performance , precision issues

        Integer x = 6;
        Integer z = 2;

        Integer result = x/z;   //auto-boxing and unboxing happens here.

        int n = 9;
        int m = 3;

        int hj = n/m;

        Integer res1 = Integer.valueOf(hj); //Convert only if Integer is needed


        List<Integer> al = new ArrayList<>();
        for(int q = 0; q < 10000; q++) {
            al.add(q);
        }

        int[] we = new int[10000];
        for(int ty = 0; ty < 10000; ty ++) {
            we[ty] = ty;
        }

        Integer rap = 89;
        int gm = doSome(rap);

        int ed = 12;
        Integer ik = doCheck(ed);
    }

    public static int doSome(int f) {
        System.out.println(" f : "+f);
        return f;
    }

    public static Integer doCheck(Integer es) {
        System.out.println("es : "+es);
        return es;
    }
}
