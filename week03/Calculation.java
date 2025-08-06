import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {

        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        num1 = input.nextDouble();

        System.out.println("Enter 2nd Number: ");
        num2 = input.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;

        System.out.println(" ");
        System.out.println("Sum of "+ num1 +" and "+ num2 +" is: " + sum);
        System.out.println(" ");
        System.out.println("Difference of "+ num1 +" and "+ num2 +" is: " + diff);
        System.out.println(" ");
        System.out.println("Product of "+ num1 +" and "+ num2 +" is: " + prod);
        System.out.println(" ");
        System.out.println("Quotient of "+ num1 +" and "+ num2 +" is: " + quot);

    }
}