package objectAndClass;
// 3 props of Object :

    //--> State of Object
    //--> Behaviour of Object
    //--> Identity of Object
class Item {
    String shape;   //State - attributes/props that Item Object holds.
    float price; //these are common to all Item objects

    float weight;   //Values of state changes as fields are updated.

    public Item(String shape, float price, float weight) {
        this.shape = shape;
        this.price = price;
        this.weight = weight;
    }

    //Behaviour is method/operations that an object perform
    //on its state
   public void displayItemInfo(Item item) {
       System.out.println("Item Shape : "+item.shape+", Price : "+item.price+", Weight : "+item.weight);
   }
}
public class Main2 {
    public static void main(String[] args) {    //Objects are stored in heap
        Item item = new Item("Sphere", 2000, 50);
        Item item1 = new Item("Sphere", 2000, 50);

        System.out.println(item.equals(item1)); //false - differentiates both objects even if values are same , by location
        System.out.println("Item hash : "+item.hashCode()+", Item1 hash: "+item1.hashCode());
    }   //Identity - separates one object from other objects even if their state is same
}       //i.e., value of fields are same !
