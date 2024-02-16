package objectAndClass;

class Engineer {
    int engId;
    String name;

    Engineer() {
        this.engId = 1;
        this.name = "Sam";
    }

    Engineer(int engId, String name) {
        this.engId = engId;
        this.name = name;
    }

    @Override
    public String toString() {
//        return (this+", Name: "+this.name);   // Trying to concatenate "this" will cause error in toString(), as we overriding toString() and trying to
        return ("\nId : "+this.engId+", Name : "+this.name); // append "this" will again trigger toString() which is a recursive call
    }                                                       // because java tries to convert all operand a string, if appended with another String type..here, this is forced to be String
}
public class Main7 {
    public static void main(String[] args) {
        Engineer one = new Engineer();
        Engineer two = one; // two is simply pointing to same object, no object creation
                                // or copying objects
        System.out.print(one);

        two.engId = 7;
        two.name = "Pooh";
        System.out.println(two);
        System.out.println("After..");  // 2 ref variables pointing to same object. If one of them have change in values other will also affected.
                                    //Both will return the same value.
        System.out.println(one);
    }
}
