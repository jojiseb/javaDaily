public class HeapMemoryExample {
    public static void main(String[] args) {
        PersonHeap personHeap = new PersonHeap("Don", 7);
        PersonHeap personHeap1 = new PersonHeap("Eddy", 2);

        personHeap.personDetails();
        personHeap1.personDetails();
    }
}

class PersonHeap {
    String name;
    int age;
    PersonHeap(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void personDetails() {
        System.out.println("Name : "+this.name+", Age : "+this.age);
    }
}
