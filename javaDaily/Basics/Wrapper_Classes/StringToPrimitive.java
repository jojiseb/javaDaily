public class StringToPrimitive {
    public static void main(String[] args) {
        //Going back from String to primitive , use parseType() --- parseInt(), parseFloat(), parseDouble() etc

        int q = 12;

        String w = Integer.toString(q);

        int p1 = Integer.parseInt(w);

        float e = 5.67f;

        String w1 = Float.toString(e);

        float p2 = Float.parseFloat(w1);

        double r = 455.67;

        String w2 = Double.toString(r);

        double p3 = Double.parseDouble(w2);
    }
}
