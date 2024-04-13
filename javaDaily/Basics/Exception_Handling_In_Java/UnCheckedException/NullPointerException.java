package UnCheckedException;

public class NullPointerException {
    String content;

    public void driving(String c) {
        this.content = c;
        if (content == null) {
            throw new java.lang.NullPointerException("Content is null");
        }
        else {
            System.out.println("Content : "+content);
        }
    }
    public static void main(String[] args) {
        NullPointerException exception = new NullPointerException();
        exception.driving(null);
    }
}
