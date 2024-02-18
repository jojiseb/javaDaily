public class Main3 {
    public static void main(String[] args) {    //Using custom mutable class that holds integer value.
        MutableInteger m = new MutableInteger(5);   //Helps to directly modify integer it holds
        MutableInteger n = new MutableInteger(20);  //enables swapping through object references.

        System.out.println("Before swapping : \nm : "+m.getValue()+"\nn : "+n.getValue());
        swap(m, n);
        System.out.println("After swapping : \nm : "+m.value+"\nn : "+n.value);

    }

    static class MutableInteger {
        private int value;

        MutableInteger(int val) {
            this.value = val;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int val) {
            this.value = val;
        }
    }

    static void swap(MutableInteger p, MutableInteger q) {
        int temp = p.getValue();
        p.setValue(q.getValue());
        q.setValue(temp);
    }
}
