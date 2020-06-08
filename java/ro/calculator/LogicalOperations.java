package ro.calculator;

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


}
