package inheritance.Hierarchical;

class OperatingSystem {

    double version;
    public OperatingSystem(double osv) {
        this.version = osv;
        System.out.println("OS !");
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

class MacOS extends OperatingSystem {
    public MacOS(double osv) {
        super(osv);
    }

    void macOSUnique() {
        System.out.println("Proprietory");
        System.out.println("Secure");
    }
}

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(11);
        windows.commonUnits();
        windows.windowsUnique();
        Linux linux = new Linux(9);
        linux.commonUnits();
        linux.linuxUnique();
        MacOS macOS = new MacOS(10);
        macOS.commonUnits();
        macOS.macOSUnique();
    }
}
