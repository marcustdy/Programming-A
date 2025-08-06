import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {

        String day, month;
        int date, year;

        Scanner input = new Scanner (System.in);

        System.out.println("Enter Day: ");
        day = input.next();

        System.out.println("Enter Month: ");
        month = input.next();

        System.out.println("Enter Date: ");
        date = input.nextInt();

        System.out.println("Enter Year: ");
        year = input.nextInt();

        System.out.println("American Format: "+day+" "+month+" "+date+" "+year+"  " + "\n");

        System.out.println("European Format: "+day+" "+date+" "+month+" "+year+" " + "\n");

        System.out.println("Japanese Format: "+year+" "+month+" "+date+" "+day+" " + "\n");




    }
}