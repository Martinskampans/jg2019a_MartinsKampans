package lv.javaguru.lesson2;

//OK
public class ArithmeticOperations {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 7;
        int sum, sub, mult, div, rem;  //typo pie "mult"

        sum = num1 + num2;
        System.out.println("num1 + num2 is: " + sum);

        sub= num1 - num2;  //lietojam kombināciju "ctrl + alt + l"
        System.out.println("num1 - num2 is: " + sub);

        mult = num1 * num2;
        System.out.println("/num1 * num2 is: " + mult);

        div = num1 / num2;
        System.out.println("num1 / num2 is: " + div);

        rem = num1 % num2;
        System.out.println("num1 % num2 is: " + rem);
    }

}
