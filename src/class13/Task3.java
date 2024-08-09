package class13;

public class Task3 {
    public static void main(String[] args) {
        //Create a string with a comb of letters, numbers and special char. find out how many
        //Alpha num characters are in the string

        String str = "uosmcnuygJHGYTFi87630%$#&kjhofh8&%OIH";

        String alphaNum=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(alphaNum.length());

    }}