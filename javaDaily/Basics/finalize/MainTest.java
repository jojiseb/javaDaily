
class LapTop {
    String color;
    float price;

    LapTop(String color, float price) {
        this.color = color;
        this.price = price;
    }

    protected void finalize() {
        System.out.println("Destroying Laptop..");
    }
}

class Phone {
    float memory;
    float price;

    Phone(float memory, float price) {
        this.memory = memory;
        this.price = price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Phone 's destruction");
    }
}
public class MainTest {
    public static void main(String[] args) {
        LapTop lapTop;
        Phone phone;

        for (int i = 1; i < 200000000; i++) {   // Since, This is creating lot of objects in heap, finalize() is called
            lapTop = new LapTop("Black", 2000000); //based on need
            phone = new Phone(12, 2000000); //finalize() of Laptop and Phone is called
        }                           //So, objects of both gets destroyed, and you get to perform some clean up
    }           //So, You don't need to use System.gc() to perform it explicitly -- even then , it's not sure
}
