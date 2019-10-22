package lv.javaguru.lesson3.car;

//Ok
public class Car {

    //visiem objekta laukiem ir jābūt "private", tiem piekļūt var tikai izmantotjot metodes
    String color;
    String manufacturer;
    int year;

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){

        this.manufacturer = manufacturer;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
