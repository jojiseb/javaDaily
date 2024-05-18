package StaticEx;

import java.io.PrintStream;

import static java.lang.System.out;

public class InnerClasses3 {

    private static PrintStream aliasOut = System.out;

    static class AnotherInner {
        private int sNo;
        private String name;
        AnotherInner(int sNo, String name) {
            this.sNo = sNo;
            this.name = name;
        }

        @Override
        public String toString() {
//            return "AnotherInner{" +
//                    "sNo=" + sNo +
//                    ", name='" + name + '\'' +
//                    '}';
            return this.name;
        }
    }
    public static void main(String[] args) {
        AnotherInner anotherInner = new AnotherInner(1, "One");
        AnotherInner second = new AnotherInner(2, "Two");

        out.println(anotherInner); //toString() of this class is displayed, since it exists
                                    //else Object's implementation would have displayed --> name

        aliasOut.println(second); //toString() of this class is displayed, since it exists,
    }                                   //else Object's implementation would have displayed --> name
}
