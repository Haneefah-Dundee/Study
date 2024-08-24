package class14;

public class PalindromeOptimized {
    //write a code that will take a string input and check to see if it is a palindrome or not.
   boolean isPalindrome(String word){

       boolean isPalindromeCheck=false;
       String reversed="";

       for (int j =word.length()-1; j>=0 ; j--) {
           reversed=reversed+word.charAt(j);

//redundant reuse of replace method.
       }String noSpaces=word.replace(" ","");
       String reversedNoSpaces=reversed.replace(" ","");
       if(noSpaces.equalsIgnoreCase(reversedNoSpaces)){
           isPalindromeCheck=true;
       }
       return isPalindromeCheck;

   }

    public static void main(String[] args) {

       PalindromeOptimized obj=new PalindromeOptimized();

        String word="ca m a   c  ";
        boolean test=obj.isPalindrome(word);
        System.out.println(test);


            }

    }
