public class Wrapper_Class1 {
    public static void main(String[] args) {
        String q = "200";
        System.out.println(q+400);
        int num = Integer.parseInt(q);  //parseType() - to convert String reps to corresponding primitive
        System.out.println(num+400);        //With help of static method of respective Wrapper class
                                        //Converting String to int
        String w = "89.56";
        System.out.println(w+10.9);
        double dou = Double.parseDouble(w); //converting String to double (primitive)
        System.out.println(dou+10.9);

        String e = "f";
        char c = e.charAt(0);   //No
        System.out.println(c);

        String f = "3.45f";
        System.out.println(f+10.9f);

        float fl = Float.parseFloat(f); //Converting String to primitive type float
        System.out.println(fl+10.9f);       //String to primitive type conversion , use parseType()

        String p = "123";
        System.out.println(p);

        Integer integer = Integer.valueOf(p);
        System.out.println(integer+p);

        String nu = Integer.toString(num);  //400
        System.out.println(nu+8);       //4008
    }
}
