package AnonymousClasses;

class Car {
    String name;

    static int count;

    Car(String n) {
        this.name = n;
        count++;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return "Superb Car";
    }

    public void carDetails() {
        System.out.println(name+" and "+this.getDescription());
    }

    public int getCount() {
        return Car.count;
    }
}

public class AnonymousLearn11 {
    public static void main(String[] args) {
        Car c = new Car("Ferrari") {
            @Override
            public String getDescription() {
                return this.name + " is an amazing car !!";
            }
        };
                //fields/methods of anonymous is accessible, because anonymous
        System.out.println("Name : "+c.getName()); //class usage here is similar to extends
        System.out.println("Description : "+c.getDescription()); //in inheritance
        c.carDetails();

        System.out.println("Number of Cars : "+c.getCount());
    }
}
