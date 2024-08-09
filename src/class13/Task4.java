package class13;

public class Task4 {
    public static void main(String[] args) {
        //find out how many sentences are in this string
        String a ="Is it Saturday? Is it raining? Do we have class today? I have school?";

        String [] stArr=a.split("[?]");
        System.out.println(stArr.length);
        System.out.println("==========================");

//extract elements from a sentence as a characters in a array.
        char [] chArr=a.replace(" ","").toCharArray();
        for(char newCh:chArr){
            System.out.println(newCh);
        }

    }
}
