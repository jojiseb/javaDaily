package StaticEx;

public class Country {
    private String name;
    public static int countryCounter;
    protected Country(String name) {
        this.name = name;
        countryCounter++;
    }
    public static int getNumberOfCountries() {
        return countryCounter;
    }
    public static void main(String[] args) {
        Country a = new Country("USA");
        Country b = new Country("India");
        Country c = new Country("Nepal");
        System.out.println(a.countryCounter); // Not advisable to access static members using object, Use ClassName instead
        System.out.println(b.countryCounter); //
        System.out.println(c.countryCounter); // --> Accessing static variable using object to show the value is shared
        System.out.println("Total : "+Country.getNumberOfCountries());  //across all instances
    }
}
