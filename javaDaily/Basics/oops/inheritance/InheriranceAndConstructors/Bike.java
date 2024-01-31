package inheritance.InheriranceAndConstructors;

public class Bike {
    int gear;
    int speed;
    public Bike(int gr, int sp) {
        this.gear = gr;
        this.speed = sp;
    }
    void changeGear(int newGear) {
        this.gear = newGear;
    }
    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public String toString() {
        return "Gear : "+this.gear+" & Speed : "+this.speed;
    }
}
