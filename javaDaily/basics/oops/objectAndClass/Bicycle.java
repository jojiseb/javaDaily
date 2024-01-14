package objectAndClass;

public class Bicycle {
    int cadence = 0;
    int gear = 1;
    int speed = 0;
    void changeCadence(int value) {
        cadence = value;
    }
    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    void changeGear(int newGear) {
        gear = newGear;
    }
    void printStates() {
        System.out.println("Cadence : "+cadence+", Speed : "+speed+", Gear : "+gear);
    }

}
