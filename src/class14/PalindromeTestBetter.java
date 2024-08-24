package class14;

public class PalindromeTestBetter {
    //write a code that will take a string input and check to see if it is a palindrome or not.

    boolean isPalindrome2(String word){
        String reversed="";
        boolean isPalind =false;

        for (int i = word.length()-1; i >=0; i--) {
            reversed=reversed+word.charAt(i);
        }
            if(word.equalsIgnoreCase(reversed)){//use ignorecase instead of .equals
                isPalind=true;

        }return isPalind;

    }

    public static void main(String[] args) {
        PalindromeTestBetter obj=new PalindromeTestBetter();
        String w="L  e   v  e l   ";
        String noSpace=w.replace(" ","");

       boolean test= obj.isPalindrome2(noSpace);
        System.out.println(test);

    }
}
