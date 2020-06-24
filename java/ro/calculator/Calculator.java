package ro.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("Addition result is: " + LogicalOperations.addition(x,y));

        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        System.out.println("Substraction result is: " + LogicalOperations.substraction(x,y));

        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        System.out.println("Multiplication result is: " + LogicalOperations.multiplication(x,y));

        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        System.out.println("Division result is: " + LogicalOperations.division(x,y));

        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        System.out.println("Modulo result is: " + LogicalOperations.modulo(x,y));

        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        float b = scanner.nextFloat();
        LogicalOperations.addition(a,b);

        System.out.println("Enter first number");
        long z = scanner.nextLong();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        LogicalOperations.substraction(z,y);

        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        a = scanner.nextDouble();
        LogicalOperations.multiplication(x,a);

        System.out.println("Enter first number");
        a = scanner.nextDouble();
        System.out.println("Enter second number");
        z = scanner.nextLong();
        LogicalOperations.division(a,z);

        System.out.println("Enter first number");
        a = scanner.nextDouble();
        System.out.println("Enter second number");
        short e = scanner.nextShort();
        LogicalOperations.modulo(a,e);

        System.out.println("Count from a number to 100 ");
        LogicalOperations.countFrom();

        System.out.println("Count down for a number -100");
        LogicalOperations.countDown();

        System.out.println("Count between two number ");
        LogicalOperations.countBetween();

        System.out.println("Count between a small number tu a bigger one  ");
        LogicalOperations.countFromSmallToBigger();

        LogicalOperations.evenNumbers();

        LogicalOperations.oddNumbers();

        LogicalOperations.numberSum();

        LogicalOperations.averageNumbers();

        LogicalOperations.geometricShape();

    }
}
