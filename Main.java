package CoffeeBrew;

import java.util.Scanner;

public class Main {
    /**
     * This is an application to brew customized coffee
     *
     * It uses Builder Design Pattern from creational Design pattern
     *
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      Console interface
        System.out.println("Hey do you need a coffee. If yes press 'Y/y' otherwise press any key to skip");
        String needCoffee = input.nextLine();
        if(needCoffee.equals("Y") || needCoffee.equals("y")){

//          getting customers choices
            System.out.println("Would you like to add sugar. If yes press 'Y/y' otherwise press any key");
            String sugar = input.nextLine();
            System.out.println("Would you prefer milk. If yes press 'Y/y' otherwise press any key");
            String milk = input.nextLine();
            System.out.println("Would you like it to be hot or cold. If hot press 'H/h' and for cold press any key ");
            String temprature = input.nextLine();

//          initailzing the coffeebuilder
            CoffeeBuilder coffeeBuilder = new CoffeeBuilder();

//          setting customer choices
            coffeeBuilder.addSugar((sugar.equals("Y") || sugar.equals("y")));
            coffeeBuilder.addMilk((milk.equals("Y") || milk.equals("y")));
            coffeeBuilder.temprature((temprature.equals("H") || temprature.equals("h")) ? "Hot" : "Cold");

//          Displaying customer chioces
            System.out.println(coffeeBuilder.getCoffee());
        }
    }
}
