package objectAndClass;

class Cup {
    int cupNo;
    double width, breadth, height;

    Cup() {
        this.cupNo = 12;
        this.breadth = 10;
        this.width = 11;
        this.height = 15;
    }

    Cup(double w, double b, double h) {
        this.width = w;
        this.breadth = b;
        this.height = h;
    }

    Cup(int cupNo, double w, double b, double h) {
        this(w, b, h);
        this.cupNo = cupNo;
    }

    @Override
    public String toString() {
        return "No: "+this.cupNo+", Width : "+this.width+", Breadth : "+this.breadth+", Height : "+this.height;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Cup cup = new Cup();
        Cup cup1 = new Cup(1, 22, 33, 44);
        Cup cup2 = new Cup(5,10,15);

        System.out.println(cup);
        System.out.println(cup1);
        System.out.println(cup2);
    }
}
