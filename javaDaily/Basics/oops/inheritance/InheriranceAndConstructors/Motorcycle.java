package inheritance.InheriranceAndConstructors;

public class Motorcycle extends Bike {

    int seatHeight;

    Motorcycle(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    void adjustSeatHeight(int newHeight) {
        seatHeight -= newHeight;
    }

    @Override
    public String toString() {
        return (super.toString()+", This is seatHeight : "+seatHeight);
    }

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(4, 60, 25);
        System.out.println(motorcycle.toString());
        motorcycle.adjustSeatHeight(10);
        motorcycle.changeGear(5);
        motorcycle.speedUp(80);
        System.out.println("New State..");
        System.out.println(motorcycle.toString());
    }
}
