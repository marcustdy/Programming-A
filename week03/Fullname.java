import java.util.Scanner;

public class Fullname{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String firstName, lastName, fullName;

        System.out.println("Enter First Name: ");
        firstName = input.next();

        System.out.println("Enter Last Name: ");
        lastName = input.next();

        fullName = firstName + " " + lastName;

        System.out.println("Fullname: "+fullName+" ");

    }
}