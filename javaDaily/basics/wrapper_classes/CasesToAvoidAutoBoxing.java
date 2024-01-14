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

        ArrayList<Integer> items = new ArrayList<>();
        for(int j = 0; j < 10000; j++) {
            items.add(j);   //auto-boxing happens just before storing - type changes from primitive to Integer
        }                 //leads to creation of lot of objects since, auto-boxing is Integer newItem = new Integer(j);..So, m/y intensive

        int[] io = new int[10000];
        for(int kl = 0; kl < 10000; kl++) {
            io[kl] = kl;
        }

        Integer ee = 27;
        Integer ff = 9;
                                //We are auto-boxing and un-boxing here , multiple times
        Integer kk = ee/ff;

        int ll = 27;
        int yy = 9;

        int re = ll/yy;         //Just use primitives for arithmetic operations and use Wrapper when necessary

        Integer aa = Integer.valueOf(re);

        Double kb = 56.67;
        Double ax = 56.67;

        if(kb == ax) {
            System.out.println("kb == ax");
        }
        else {
            System.out.println("kb != ax"); //They aren't equal even if same values , since primitives are auto-boxed to wrappers
        }                                   //And during this process, new objects are created, creating different object references.

        boolean red = (kb == ax) ? true : false;

        List<Integer> one = new ArrayList<>();
        for (int p = 0; p < 10000; p++) {
            one.add(new Integer(p));
        }

        List<Integer> two = new ArrayList<>();
        for(int b = 1; b < 10000; b++) {
            two.add(Integer.valueOf(b));    // Usage of static factory method to convert prim to wrapper by manual conversion
        }                                   // is preferred over auto-boxing
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
