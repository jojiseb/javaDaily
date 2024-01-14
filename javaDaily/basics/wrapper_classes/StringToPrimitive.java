public class StringToPrimitive {
    public static void main(String[] args) {
        //Going back from String to primitive , use parseType() --- parseInt(), parseFloat(), parseDouble() etc

        int q = 1;
        String s1 = Integer.toString(q);
        int p1 = Integer.parseInt(s1);

        float w = 89.78f;
        String s2 = Float.toString(w);
        float p2 = Float.parseFloat(s2);

        double e = 45469.566;
        String s3 = Double.toString(e);
        double p3 = Double.parseDouble(s3);

        short r = 23;
        String s4 = Short.toString(r);
        short p4 = Short.parseShort(s4);

        long t = 86956985;
        String s5 = Long.toString(t);
        long p5 = Long.parseLong(s5);

        char y = '\n';
        String s6 = Character.toString(y);
        char p6 = s6.charAt(0);     //No need to parse methods here to obtain primitive from String here, since char is already available
                                        //from String as String.charAt(index);

    }
}
