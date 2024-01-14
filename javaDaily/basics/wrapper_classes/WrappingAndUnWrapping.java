import java.util.ArrayList;
import java.util.List;

public class WrappingAndUnWrapping {
    public static void main(String[] args) {
        int a = 34;

        System.out.println(a);
        Integer q = 23;

        System.out.println(q);

        Integer w = new Integer(a);
        System.out.println(w);

        Integer e = new Integer(q);
        System.out.println(e);

        List<Integer> arr = new ArrayList<>();
        arr.add(56);    //primitive value will be automatically/internally converted
                    //to Wrapper classes by valueOf(), before stored in arr
                //Earlier, it needed manual conversion before storing like arr.add(new Integer(56));


    }
}
