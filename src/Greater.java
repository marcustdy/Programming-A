import java.util.Scanner;

public class Greater{

    public static void main(String[] args){

        int value1, value2;

        try {
            Scanner myInput = new Scanner(System.in);

            System.out.println("Enter Value 1: ");
            value1 = myInput.nextInt();

            System.out.println("Enter Value 2: ");
            value2 = myInput.nextInt();

            if (value1 > value2){
                System.out.println("The Greater value between Value 1 and Value 2 is: "+value1+" ");
            }
            else if (value2 > value1){
                System.out.println("The Greater value between Value 1 and Value 2 is: "+value2+" ");
            }
            else if (value1 == value2){
                System.out.println("Both Values "+value1+" and "+value2+" are equal to eachother. ");
            }
        }

        catch (Exception e) {
            System.out.println("Unknown Error");
        }
    }

}