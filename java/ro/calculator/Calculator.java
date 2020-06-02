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

    }
}
