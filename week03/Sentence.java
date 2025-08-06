public class Sentence{

    public static void main(String[] args){

        String sentence = "I am a student of RMIT!";
        boolean check = sentence.equals(sentence);

        char index0 = sentence.charAt(0);
        String concatenation = sentence.concat("hi");


        System.out.println(index0);
        System.out.println(concatenation);
        System.out.println(check);
    }
}