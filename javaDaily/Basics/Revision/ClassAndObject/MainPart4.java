import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.math.BigDecimal;

class Money {
    private int id;
    private BigDecimal amount;
    private String name;

    public void setAmount(BigDecimal amt) {
        this.amount = amt;
    }
    public void setName(String name) {
        this.name = name;
    }
    Money() {   //Default initialisation
        this.id = 1;
        this.name = "Rupee";
        this.amount = BigDecimal.valueOf(1);
    }
    Money(int i, BigDecimal amt, String name) { //To initialise multiple objects specifically very easily
        this.id = i;    //instead of manual initialisation
        this.amount = amt;
        this.name = name;
    }

    public void moneyDetails() {
        System.out.println("Bag contains : "+this.amount+" "+this.name);
    }

    public String toString() {
//        return "Id : "+this.id+", Name : "+this.name+", Amount : "+this.amount;
        return "this : "+this+", id : "+this.id+", Name : "+this.name;
    }

}

public class MainPart4 {
    public static void main(String[] args) {
        Money money = new Money(); //Initialisation of instance variables with default values

        System.out.println(money);

        money.moneyDetails();

        Money money1 = new Money(2, BigDecimal.valueOf(100), "Dollar");

        System.out.println(money1);

        money1.moneyDetails();

        money.setAmount(BigDecimal.valueOf(500));

        System.out.println(money);

        money.moneyDetails();
    }
}
