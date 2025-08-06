import java.util.Scanner;

public class Egg{
  
  public static void main(String[] args){

    Scanner userInput = new Scanner(System.in);

    int eggWeight;
    String[] eggSize = new String[6];
    eggSize[0] = "too small";
    eggSize[1] = "medium";
    eggSize[2] = "large";
    eggSize[3] = "extra large";
    eggSize[4] = "jumbo";
    eggSize[5] = "king size";

    System.out.println("Enter Egg Weight: ");
    eggWeight = userInput.nextInt();

    if (eggWeight < 43){
      System.out.println("Egg Size: " + eggSize[0]);
    }

    else if (eggWeight > 43 && eggWeight < 51){
      System.out.println("Egg Size: " + eggSize[1]);
    }

    else if (eggWeight > 52 && eggWeight < 59){
      System.out.println("Egg Size: " + eggSize[2]);
    }
    
    else if (eggWeight > 60 && eggWeight < 67){
      System.out.println("Egg Size: " + eggSize[3]);
    }

    else if (eggWeight > 68 && eggWeight < 72){
      System.out.println("Egg Size: " + eggSize[4]);
    }

    else if (eggWeight > 72){
      System.out.println("Egg Size: " + eggSize[5]);
    }

    else {
      System.out.println("Unknown Error");
    }
    



  }
}
