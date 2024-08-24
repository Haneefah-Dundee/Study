package class14;

public class RandomTests {
    //write a code that will take a string input and check to see if it is a palindrome or not.

    boolean Palindrome(String word){
        boolean isPalin=false;

        String wordCheck=new StringBuilder(word).reverse().toString();
        if(wordCheck.equalsIgnoreCase(word)){
            isPalin=true;
        }
        return isPalin;

    }

    public static void main(String[] args) {
        RandomTests obj=new RandomTests();
        String word="lev e   l";
        String noSpaces=word.replace(" ","");
        boolean isItAPalinrome=obj.Palindrome(noSpaces);
        System.out.println(isItAPalinrome);
    }
}
