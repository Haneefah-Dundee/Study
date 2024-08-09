package class13;

public class Task2 {
    public static void main(String[] args) {
        //create a string that hold a sentence . Write a program to get a new String
        //without spaces.
        String sentence="I am here.   I know not why.  I try to be.I am";
        String newSentence=sentence.replace(" ","");

        System.out.println(newSentence);

    }
}
