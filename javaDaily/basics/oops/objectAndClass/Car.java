package objectAndClass;

public class Car {
    private String model;
    private int year;
    private float price;

    Car() {

    }
    Car(String mo, int yr, float pr) {
        this.model = mo;
        this.year = yr;
        this.price = pr;
    }
    private void setModel(String m) {
        this.model = m;
    }
    public String getModel() {
        return model;
    }
    private void setYear(int y) {
        this.year = y;
    }
    public int getYear() {
        return year;
    }
    private void setPrice(float p) {
        this.price = p;
    }
    public float getPrice() {
        return price;
    }
    public void carDetails() {  //instance method always operates on current instance, can call non-static members without
                                //Object reference.
        System.out.println("Car brought new is \n Model - "+model+", Year : "+getYear()+", Price : "+price);
    }
    public static void main(String[] args) {
        Car c  = new Car();
        c.carDetails(); //In a static context, to access non-static members requires obj reference
        Car newOne = new Car("Toyota", 1998, 750000);
        newOne.carDetails();

        c.setModel("TATA Indica");
        c.setYear(1997);
        c.setPrice(760000);

        c.carDetails();

        newOne.setModel("Mercedez Benz");
        newOne.setYear(2006);
        newOne.setPrice(9000000);

        newOne.carDetails();
    }

}
