package CoffeeBrew;

public interface CoffeeBuilderInterface {

    void addSugar(boolean sugar);

    void addMilk(boolean milk);

    void temprature(String temprature);

    String getCoffee();
}