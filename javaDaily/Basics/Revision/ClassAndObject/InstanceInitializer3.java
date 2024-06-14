public class InstanceInitializer3 {
    public void createAnonymousClass() {
        Object obj = new Object() { //In anonymous classes, you can't define a constructor
            int a;  //So, Instance initializer blocks is used to initialize fields

            {
                System.out.println("Instance initializer");
                a = 45;
            }
        };
    }
}

//Why anonymous classes doesn't have a constructor, because these classes doesn't
//have a name and therefore, Can't have explicitly defined constructors
