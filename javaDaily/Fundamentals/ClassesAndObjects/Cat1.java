public class Cat1 {

    public void meow() {
        System.out.println("Meow!");
    }
    public void scratch() {
        System.out.println("Scratch!");
    }
    private void changeMood(String newMood) { //internal operation, so access is controlled and also
         String mood = newMood;                //internal implementation is hidden
    }
    public void displayInfo() {
        meow(); //methods show modularity, re-usability when needed
        scratch();
        changeMood("Curious"); //Changing mood happens internally, triggered
    }      //only in a controlled manner, Another thing is its implementation remains hidden

    public static void main(String[] args) {
        Cat1 brown = new Cat1(); //create object using new keyword

        brown.meow();
        brown.scratch(); //both methods are used once

        brown.displayInfo(); //used one again which shows re-usability, modularity
    }
}
