package inheritance;

import objectAndClass.Cycle;

public class MountainBike extends Cycle {
    public int seatHeight;
    public MountainBike(int speed, int gear, int sh) {
        super(speed, gear);
        System.out.println(this.hashCode());
        System.out.println(this.getClass().getName());
        this.seatHeight = sh;
    }
    public void adjustSeatHeight(int height) {
        seatHeight = height;
    }
    public String toString() {
        return (super.toString()+"\n Seat height is : "+seatHeight);
    }

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(60, 4, 15);
        System.out.println(mb.toString());
    }

}
