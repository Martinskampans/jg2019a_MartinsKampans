package lv.javaguru.lesson3.car;
//Ok
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setManufacturer("Ford");
        car1.setYear(1965);

        System.out.println("This " + car1.getColor() + " " + car1.getManufacturer() + " is produced in "
                + car1.getYear() + ".");
    }
}
