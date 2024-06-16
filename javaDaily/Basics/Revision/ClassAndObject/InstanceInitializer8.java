
interface Framework {
    void uI();
    void backend();

    default void typeOfFramework() {
        System.out.println("Normal");
    }
}

public class InstanceInitializer8 {
    public static void main(String[] args) {
        Framework framework = new Framework() { //Anonymous class using instance initializer
            String name;
            boolean isUI;
            boolean isBackend;

            {
                name = "Spring boot";
                isUI = false;
                isBackend = true;
            }

            @Override
            public void uI() {
                if(isUI)
                    System.out.println(name+" is a UI Framework");
                else
                    System.out.println(name+" is not UI Framework");
            }
            @Override
            public void backend() {
                if(isBackend)
                    System.out.println(name+" is a Backend framework");
                else
                    System.out.println(name+" is not Backend Framework");
            }

//            @Override
//            public void typeOfFramework() {
//                System.out.println("Abnormal");
//            }
        };

        framework.uI();
        framework.backend();
        framework.typeOfFramework();
    }
}
