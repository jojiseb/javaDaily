package SingletonTest.Enum;

public enum DBConnection {
    INSTANCE;       //Using ENUM to easily solve without even the need to write code as much of Bill Pugh Singleton
                // All constructors are private by default

    // For enum, only one object is created as per the JVM, so it will be singleton

    //In enum, Only one instance exists per JVM
}
