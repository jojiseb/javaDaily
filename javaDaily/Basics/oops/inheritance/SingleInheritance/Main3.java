package inheritance.SingleInheritance;

import java.util.Scanner;

class HeadQuarters {
    /* private */ int numberOfEmployees;    /* private keyword usage will be error, since private access members can't be overriden */
    /* private */ String city;

    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.println("City where head quarters in located : ");
        city = sc.nextLine();
        System.out.println("Total employees in hq : ");
        numberOfEmployees = sc.nextInt();
    }

    void showDetails() {
        System.out.println("Company headquarters is at : "+city+" & total employees : "+numberOfEmployees);
    }
}

class MainBranch extends HeadQuarters {
    void getDetails() {         //Method Overriding 1
        System.out.println("City where Main Branch is located : ");
        city = sc.nextLine();
        System.out.println("Total employees in Main Branch : ");
        numberOfEmployees = sc.nextInt();
    }

    void showDetails() {    //Method Overriding 2
        System.out.println("Company Main Branch : "+city+" & total employees in Main : "+numberOfEmployees);
    }
}

public class Main3 {
    public static void main(String[] args) {
        HeadQuarters headQuarters = new HeadQuarters();

        headQuarters.getDetails();

        headQuarters.showDetails();

        MainBranch mainBranch = new MainBranch();

        mainBranch.getDetails();    //Method from super class , but with diff implementation due to overriding

        mainBranch.showDetails(); //Method from super class, but with diff implementation - showDetails of MainBranch instead of HeadQuarters
    }
}
