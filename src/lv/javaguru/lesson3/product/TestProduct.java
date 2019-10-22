package lv.javaguru.lesson3.product;

//Ok
public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("milk");
        product1.setRegularPrice(0.8);
        product1.setDiscount(20);

        //procentiem jābūt attēlotam kā veselam skaitlim
        //šai metodei ir jābūt Product klasē
        System.out.println("Product name = " + product1.getName() + " , regular price = " + product1.getRegularPrice()
        + " EUR, discount = " + product1.getDiscount() +  "%, actual price = " + product1.calculateActualPrice() + " EUR");
    }
}
