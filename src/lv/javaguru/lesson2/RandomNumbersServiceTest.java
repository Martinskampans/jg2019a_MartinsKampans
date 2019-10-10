package lv.javaguru.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int rundomNumber1 = randomGenerator.nextInt(100);
        int rundomNumber2 = randomGenerator.nextInt(100);
        int rundomNumber3 = randomGenerator.nextInt(100);
        int sum;

        System.out.println("First number is: " + rundomNumber1);
        System.out.println("Second number is: " + rundomNumber2);
        System.out.println("Third number is: " + rundomNumber3);

        sum = rundomNumber1 + rundomNumber2 + rundomNumber3;

        System.out.println("Sum of all numbers is: " + sum);
    }
}

