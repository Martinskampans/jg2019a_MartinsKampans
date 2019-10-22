package lv.javaguru.lesson3.circle;
//OK
public class Circle {
    //klases laukiem jābūt private
    double radius;

    //netiek izmatota, tadēļ jāzēš
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return 3.14 * radius * radius;
    }
}
