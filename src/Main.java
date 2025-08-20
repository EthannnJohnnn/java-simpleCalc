import java.util.*;

public class Main {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            return Double.NaN;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my calculator!");

        System.out.print("Enter first integer: ");
        double x = sc.nextFloat();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second integer: ");
        double y = sc.nextFloat();

        double res = 0;

        switch (operator) {
            case '+':
                res = add(x, y);
                break;
            case '-':
                res = subtract(x, y);
                break;
            case '*':
                res = multiply(x, y);
                break;
            case '/':
                res = divide(x, y);
                if (Double.isNaN(res)) {
                    System.out.println("Can't divide by 0.");
                }
                break;
            default:
                System.out.println("Invalid Operator select only this options (+, -, *, /)");
        }

        System.out.println(x + " " + operator + " " + y + " = " + res);

    }
}