package inheritance.Hierarchical;

class OperatingSystem {

    double version;
    public OperatingSystem(double osv) {
        this.version = osv;
    }
    void commonUnits() {
        System.out.println("A task scheduler");
        System.out.println("Processing unit");
    }
}

class Windows extends OperatingSystem {
    public Windows(double osv) {
        super(osv);
    }

    void windowsUnique() {
        System.out.println("User-friendly");
        System.out.println("Proporatiary");
    }
}

class Linux extends OperatingSystem {

    public Linux(double osv) {
        super(osv);
    }

    void linuxUnique() {
        System.out.println("Techie-user");
        System.out.println("Open Source");
    }
}

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(11);
        windows.windowsUnique();
        Linux linux = new Linux(9);
        linux.linuxUnique();
    }
}
