public class OutOfMemoryDemo1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[100000 * 100000]; //Throws OutOfMemory error.
    }         // JVM has a limited amt of memory available for heap, area where new objects & arrays are stored.
}

//You cab either reduce the array size OR Increase JVM Heap size
//It's better not to manipulate heap size