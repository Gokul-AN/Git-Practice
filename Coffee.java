package CoffeeBrew;

public class Coffee{

//  data

    private String coffee = "Coffee";

    private boolean addSugar;

    private boolean addMilk;

    private String temprature;

//  setters

    public void setAddSugar(boolean addSugar){
        this.addSugar = addSugar;
    }

    public void setAddMilk(boolean addMilk){
        this.addMilk = addMilk;
    }

    public void setTemprature(String temprature){
        this.temprature = temprature;
    }

//  getter

    public String toString(){
        return "Your " + coffee + "has been successfully brewed \n Here are your choice: \n" + (addSugar ? "Sugar, ":"") + (addMilk ?"Milk, ":"") + temprature + " \n Thank you Visit Again!";
    }

}