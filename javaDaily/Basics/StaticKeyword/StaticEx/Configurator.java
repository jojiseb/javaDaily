package StaticEx;

public class Configurator {
    void loadConfig() {
        System.out.println("Loading base config");
    }

    public static void main(String[] args) {
        Configurator configurator = new Configurator();
        configurator.loadConfig();
    }
}

