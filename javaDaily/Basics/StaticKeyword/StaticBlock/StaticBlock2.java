package StaticBlock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Colors {
    private static List<String> colors = new ArrayList<>();
    public List<String> getColors() {
        return colors;
    }

    static { //Multiple static blocks can be used
        colors.add("Red");
        colors.add("Violet");
    }

    static { //static blocks can be used to initialise static variables if they are
        colors.add("White"); //not initialised during declaration
    }
    //Mostly block initialization is used to apply some complex initialization , or need some sort of error handling , or config values etc.
    @Override
    public String toString() {
        return colors.toString(); //Here, toString() of ArrayList is called ...So, It won't create a infinite loop here
    }
}

public class StaticBlock2 {
    public static void main(String[] args) {
        Colors colors = new Colors();
        System.out.println("List of Colors : "+colors.getColors());
        System.out.println(colors);
    }
}
