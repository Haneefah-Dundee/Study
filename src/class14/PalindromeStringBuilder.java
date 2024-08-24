package class14;

public class PalindromeStringBuilder {
    //write a code that will take a string input and check to see if it is a palindrome or not.

    public static void main(String[] args) {

   String word="lev  eL";
   String noSpaces=word.replace(" ","");
   StringBuilder build= new StringBuilder(noSpaces);
   String reversedWord=build.reverse().toString();

   boolean isPalindrome=reversedWord.equalsIgnoreCase(noSpaces);
        System.out.println(isPalindrome);
}
}
