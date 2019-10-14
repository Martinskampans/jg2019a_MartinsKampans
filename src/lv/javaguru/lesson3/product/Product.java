package lv.javaguru.lesson3.product;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getRegularPrice(){
            return regularPrice;
    }
    public void setRegularPrice(double price ){
        this.regularPrice = price;
    }

    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double calculateActualPrice(){
        return regularPrice - (regularPrice * discount/100);
    }

}
