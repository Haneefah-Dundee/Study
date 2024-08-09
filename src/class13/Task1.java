package class13;

public class Task1 {
    public static void main(String[] args) {

        // Create a string that is not empty and
        //if it has an odd number of charac and has 3/more charac, print
        //the character in the middle of the string. example hello====> l

        String str="Japva";

        if(!str.isBlank() && str.length()%2!=0 && str.length()>=3){
            int middleIndex=str.length()/2;
            char middleChar=str.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
