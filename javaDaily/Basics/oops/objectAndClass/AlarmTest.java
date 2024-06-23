package objectAndClass;

interface Clock {
    default void alarmOn() {
        System.out.println("Clock Alarm is ON");
    }
    default void alarmOff() {
        System.out.println("Clock Alarm is OFF");
    }
}

interface Bank {
    default void alarmOn() {
        System.out.println("Bank Alarm is ON");
    }
    default void alarmOff() {
        System.out.println("Bank Alarm is OFF");
    }
}

public class AlarmTest implements Clock, Bank{

    @Override
    public void alarmOn() {
        Clock.super.alarmOn(); //Specifically calling alarmOn() implementation of Clock interface
    }

    @Override
    public void alarmOff() {
        Bank.super.alarmOff(); //Specifically calling alarmOff() implementation of Bank interface
    }

    public static void main(String[] args) {
        AlarmTest alarmTest = new AlarmTest();
        alarmTest.alarmOn();
        alarmTest.alarmOff();
    }   //So, When implementing multiple interfaces having same default methods, needs manual overriden
}       //implementation in the sub-class
