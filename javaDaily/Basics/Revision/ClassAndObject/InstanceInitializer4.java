
abstract class AnimalTest {
    abstract void dog();
    abstract void cat();
}
public class InstanceInitializer4 {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest() {
            public int animalCount;
            public int getAnimalCount() {
                return this.animalCount;
            }

          @Override
          void dog() {
              System.out.println("Bow bow bow...");
              animalCount++;

              System.out.println("Count : "+animalCount);
          }

          @Override
            void cat() {
              System.out.println("Meow Meow meow...");
              animalCount++;

              System.out.println("Count : "+animalCount);
          }

        };

        animalTest.cat();
        animalTest.dog();

        //animalCount and getAnimalCount() won't be accessible as thy aren't
        //accessible via AnimalTest. Because They aren't defined in the base class
    }
}
