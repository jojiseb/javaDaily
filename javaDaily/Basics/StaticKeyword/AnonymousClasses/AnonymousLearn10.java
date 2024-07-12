package AnonymousClasses;

class Bank {
    String name;
    Bank(String name) {
        this.name = name;
    }
    void bankWork() {
        System.out.println(this.name+" has Main branch");
    }
}

class SubBank {
    void subMethod() {
        Bank b = new Bank("ICICI") {
            @Override
            public void bankWork() {
                System.out.println("This is from "+this.name);
            }
        };

        b.bankWork();
    }
}

public class AnonymousLearn10 {
    public static void main(String[] args) {
        SubBank sb = new SubBank();
        sb.subMethod();
    }
}
