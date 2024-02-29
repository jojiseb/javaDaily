
class Resource {
    private int resourceId;

    public Resource(int rId) {
        this.resourceId = rId;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("Cleaning resource with Id : "+this.resourceId);
        }
        finally {
            super.finalize();
        }
    }

}
public class ResourceMain {
    public static void main(String[] args) {
        Resource resource = new Resource(10);
        Resource resource1 = new Resource(20);

        resource = null;
        resource1 = null;
    }
}
