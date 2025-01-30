package CoffeeBrew;

public class CoffeeBuilder implements CoffeeBuilderInterface {
    private Coffee coffee = new Coffee();

    @Override
    public void addSugar(boolean sugar) {
        coffee.setAddSugar(sugar);
    }

    @Override
    public void addMilk(boolean milk){
        coffee.setAddMilk(milk);
    }

    @Override
    public void temprature(String temprature){
        coffee.setTemprature(temprature);
    }

    @Override
    public String getCoffee() {
        return coffee.toString();
    }

}
