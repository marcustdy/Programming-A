import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name1Input;
        int age1Input;
        String name2Input;
        int age2Input;
        String name3Input;
        int age3Input;
        String name4Input;
        int age4Input;
        String name5Input;
        int age5Input;

        System.out.println("Student1 Name: ");
        name1Input = input.next();

        System.out.println("Student1 Age: ");
        age1Input = input.nextInt();

        System.out.println("Student2 Name: ");
        name2Input = input.next();

        System.out.println("Student2 Age: ");
        age2Input = input.nextInt();

        System.out.println("Student3 Name: ");
        name3Input = input.next();

        System.out.println("Student3 Age: ");
        age3Input = input.nextInt();

        System.out.println("Student4 Name: ");
        name4Input = input.next();

        System.out.println("Student4 Age: ");
        age4Input = input.nextInt();

        System.out.println("Student5 Name: ");
        name5Input = input.next();

        System.out.println("Student5 Age: ");
        age5Input = input.nextInt();

        System.out.println("Student1 Name: " + name1Input);
        System.out.println("Student1 Age: " + age1Input);

        System.out.println("Student2 Name: " + name2Input);
        System.out.println("Student2 Age: " + age2Input);

        System.out.println("Student3 Name: " + name3Input);
        System.out.println("Student3 Age: " + age3Input);

        System.out.println("Student4 Name: " + name4Input);
        System.out.println("Student4 Age: " + age4Input);

        System.out.println("Student5 Name: " + name5Input);
        System.out.println("Student5 Age: " + age5Input);

    }
}