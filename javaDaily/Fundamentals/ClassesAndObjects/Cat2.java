public class Cat2 {
    private String name; //encapsulated from outside world
    private String age;
    public Cat2(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { //providing getters to read access in controlled manner
        return name;
    }
    public String getAge() {
        return age;
    }
    public void setName(String name) { //providing setters to write in controlled manner
        this.name = name;
    }
    public void setAge(String age) { //getters and setters enable interaction with states in a safe manner
        this.age = age;
    }
    public void catDetails() {
        System.out.println(this.name+" is "+this.age+" years old !");
    }
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2("Snowbell", "3");

        cat2.catDetails();
        System.out.println("After 5 years..");

        cat2.setAge("8"); //Using getters and setters avoid the states getting changed unintentionally
                        //but also acts as a controlled interface to interact with object states
        cat2.catDetails();
    }
}
