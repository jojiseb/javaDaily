
final class Java {  //final applied on class, gets it from inherited
    private float fileSIze;     //avoiding further extension.

    String ad;  //Eg: String class is final. It avoids its methods getting over-ridden
    public void setFileSize(float fSize) { //by our specific String subclasses.
        this.fileSIze = fSize;          //And since String is widely used, if over-ridden, result will
    }                               //will be unpredictable.
    public float getFileSIze() {
        return this.fileSIze;
    }

    @Override
    public String toString() {
        return ("Size : "+this.getFileSIze()+", Ad : "+this.ad);
    }
}

//class Ruby extends Java {     //Shows error can't inherit a class Final
//
//}

public class FinalForClass {    //Immutability of an Object - state of object can't be changed, once object has been

    //created.
    public static void main(String[] args) {
        Java java = new Java();
        java.ad = "Hello";      //final keyword on class, doesn't mean its objects
        java.setFileSize(300); //are immutable

        System.out.println(java);   //We can change fields of Java objects

        java.ad = "World";
        java.setFileSize(200);

        System.out.println(java);

        // Here, State or instances are getting modified anytime, i.e., they are not immutable
    }   // Their values can be changed.
        // An Object is considered immutable if its state can't be modified after creation. i.e., ALl fields are final, so no setters/getters

    //Here, there are some fields which are not immutable,not marked as final
    //mutable objects
}
