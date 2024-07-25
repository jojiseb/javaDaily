public class Cat {

    private String color; //states
    private String mood; //private to not allow access to internal state outside te class
                        //To avoid writes/inconsistencies
    public Cat(String color, String mood) {
        this.color = color;
        this.mood = mood;
    }
    public String getColor() { //public methods since to provide read-only access to class
        return color; //states --> This is a common practice to enable encapsulation
    }
    public String getMood() {
        return mood;
    }

    //Only accessible within this class, Cat --> its private since it's internal to Cat
    private void changeMood(String newMood) { //Useful to keep what happens internally hidden
        mood = newMood;                 //No one can't override how a mood is changed
    }                 //Hides the internal implementation details of how mood change happens behind the
                    //scenes
                //Why ??? External code doesn't need to know how mood Change happens. It needs to know
            //that calling makeHappy() will make the cat happy !

    //New changes / maintainence will be  made in changeMood() internally, public method doesn't get affected

    public void purr() {
        System.out.println("Cat purrs...");
    }
    public void makeHappy() { //public method to access private method changeMood()
        changeMood("Happy"); //It's to bring control and limit to how and when mood of cat can be
        purr(); //changed
    }

    //Making changeMood() private to ensure that mood of cat can only be changed in a specific, controlled manner
    //No other way to change it directly or use some-other way

    //providing it in makeHappy(), a public method, provides a controlled way to alter the mood of the object's state,
    //which makes sure that the changes are intended and controlled, remain consistent to class's use


    public static void main(String[] args) {
        Cat kahuna = new Cat("White", "Sad");
        System.out.println("Color : "+kahuna.getColor());
        System.out.println("Mood : "+kahuna.getMood());

        kahuna.makeHappy();
        System.out.println("Current Mood : "+kahuna.getMood());

        //public methods make sure to provide controlled ways to interact with cat's mood

        //Any changes to how mood is changed, its only made to private method changeMood() and
        //not impacted to makeHappy()
    }
}
