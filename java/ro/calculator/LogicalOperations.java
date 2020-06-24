package ro.calculator;

import java.util.Scanner;

public class LogicalOperations{

    public static int addition(int x,int y){
      return x + y;
    }

    public static int substraction(int x,int y){
        return x -y;
    }

    public static int multiplication(int x,int y){
        return x * y;
    }

    public static int division(int x,int y){
        return x / y;
    }

    public static int modulo(int x,int y){
        return x % y;
    }

    public static void addition(double x,float y){
        System.out.println(x + y);
    }

    public static void substraction(long x,int y){
        System.out.println(x - y);
    }

    public static void multiplication(int x,double y){
        System.out.println(x * y);
    }

    public static void division(double x,long y){
        System.out.println(x / y);
    }

    public static void modulo(double x,short y){
        System.out.println(x % y);
    }

    public static void countFrom() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        try {
            System.out.println("Enter a number");
            i = input.nextInt();
        } catch (Exception e) {
            System.err.println("Enter a integer number!!!");
            countFrom();
            }
        for (int j = i; j <= 100; j++) {
                System.out.println(j + " ");
        }
    }

    public static void countDown() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        try {
            i = input.nextInt();
        } catch (Exception e) {
            System.err.println("Enter a integer number!!!");
            countDown();
        }
        for (int j = i; j >=-100; j--) {
            System.out.println(j + " ");
        }
    }

    public static void countBetween() {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            System.out.println("Enter first number");
            x = input.nextInt();
            System.out.println("Enter second number");
            y = input.nextInt();
        } catch (Exception e) {
            System.err.println("Enter a integer number!!!");
            countBetween();
        }
        if (y > x) {
            for (int j = x; j <= y; j++) {
                System.out.println(j + " ");
            }
        }else{
            for (int j = x; j >= y; j--) {
                System.out.println(j + " ");
            }
        }

    }

    public static void countFromSmallToBigger() {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            System.out.println("Enter first number");
            x = input.nextInt();
            System.out.println("Enter a number bigger than first");
            y = input.nextInt();
            if(x>y){
                System.out.println("Second number to small!!! Try again!");
                countFromSmallToBigger();
            }
        } catch (Exception e){
            System.err.println("Enter a integer number!!!");
            countFromSmallToBigger();
        }
        for (int j = x; j <= y; j++) {
            System.out.println(j + " ");
            }
    }

    public static void evenNumbers(){
        for(int i = 0; i<=100; i++){
            if(i % 2 == 0){
                System.out.println( i);
            }
        }

    }

    public static void oddNumbers(){
        for(int i = 0; i<=100; i++){
            if(i % 2 != 0){
                System.out.println( i);
            }
        }

    }

    public static void numberSum() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        try {
            System.out.println("Enter a number");
            i = input.nextInt();
        } catch (Exception e) {
            System.err.println("Enter a integer number!!!");
            countFrom();
        }
        for (int j = i; j <= 100; j++) {
            sum += j;
        }
        System.out.println("The number sum is: " + sum);
    }

    public static void averageNumbers() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        try {
            System.out.println("Enter a number");
            i = input.nextInt();
        } catch (Exception e) {
            System.err.println("Enter a integer number!!!");
            countFrom();
        }
        for (int j = i; j <= 100; j++) {
            sum += j;
        }
        double numberSum = sum / (101 - i);
        System.out.println("The avarage sum is: " + numberSum);
    }

    public static void geometricShape(){
        for (int i = 1; i <= 7; i++) {
            for (int j=1; j <=7-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }





