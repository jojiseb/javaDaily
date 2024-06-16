
abstract class DeviceNamed {
    protected String name;
    protected String price;
    protected String color;

    DeviceNamed(String name, String price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    protected void setName(String n) {
        this.name = n;
    }
    protected void setPrice(String p) {
        this.price = p;
    }
    protected void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }

    abstract void deviceSpecs();
}

class NewPad extends DeviceNamed {
    protected boolean isTouch;
    NewPad(String name, String price, String color, boolean isTouch) {
        super(name, price, color);
        this.isTouch = isTouch;
    }
    protected void setTouch(boolean isTouch) {
        this.isTouch = isTouch;
    }
    public boolean getIsTouch() {
        return isTouch;
    }
    @Override
    void deviceSpecs() {
        System.out.println("Name : "+name+", Price : "+price+", Color : "+color+", Touchable : "+isTouch);
    }
}

class Keyboard extends DeviceNamed {
    protected String model;

    Keyboard(String name, String price, String color, String model) {
        super(name,price, color);
        this.model = model;
    }

    @Override
    void deviceSpecs() {
        System.out.println("Name : "+name+", Price : "+price+", Color : "+color+", Model : "+model);
    }
}

public class NamedClass4 {
    public static void main(String[] args) {
        NewPad newPad = new NewPad("i7", "200000", "Silver", true);
        newPad.deviceSpecs();

        Keyboard keyboard = new Keyboard("Sage", "25000", "Grey", "X5");
        keyboard.deviceSpecs();
    }
}
