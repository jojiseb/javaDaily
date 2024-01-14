package objectAndClass;

public class Cycle {
    public int speed;
    public int gear;
    public Cycle(int sp, int gr) {
        this.speed = sp;
        this.gear = gr;
        System.out.println(this.hashCode());
        System.out.println(this.getClass().getName());
    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public void applyBrakes(int decrement) {
        speed =- decrement;
    }
    public void changeGear(int gr) {
        gear = gr;
    }

    public String toString() {
        return "Number of gears : "+gear+", And Speed of Bicycle is : "+speed;
    }
}
