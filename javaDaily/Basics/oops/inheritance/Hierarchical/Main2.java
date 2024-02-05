package inheritance.Hierarchical;

class Base {
    int parentNum = 10;
}

class Sub1 extends Base {
    int childNum = 1;
}

class Sub2 extends Base {
    int childNum = 2;
}

class Sub3 extends Base {
    int childNum = 3;
}

public class Main2 {
    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();
        Sub3 sub3 = new Sub3();

        System.out.println("Sub1.childNum * Sub1.parentNum : "+sub1.childNum * sub1.parentNum);
        System.out.println("Sub2.childNum * Sub2.parentNum : "+sub2.childNum * sub2.parentNum);
        System.out.println("Sub3.childNum * Sub3.parentNum : "+sub3.childNum * sub3.parentNum);
    }
}
