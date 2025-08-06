import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, total;

        System.out.println("Input 1st Number: ");
        num1 = input.nextInt();

        System.out.println("Input 2nd Number: ");
        num2 = input.nextInt();

        System.out.println("Input 3rd Number: ");
        num3 = input.nextInt();

        System.out.println("Input 4th Number: ");
        num4 = input.nextInt();

        total = num1 + num2 + num3 + num4;

        System.out.println(" ");
        System.out.println("The total is: " + total + "\n");

        System.out.println("The total of "+num1+","+num2+","+num3+" and "+num4+" is " + total);

    }
}