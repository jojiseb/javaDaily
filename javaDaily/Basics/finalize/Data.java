public class Data {

    protected void finalize() {
        System.out.println("Removing the Object..."+this.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        Data data = new Data();
        data = null;

        System.gc();

        System.out.println("GC is called !! ");
    }
}
