package objectAndClass;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<String> one = new Box<>("One");
        Box<Integer> two = new Box<>(34);

        System.out.println(one);
        System.out.println(two);

        System.out.println("String Content : "+one.content);
        System.out.println("Integer Content : "+two.getContent());
    }
}
