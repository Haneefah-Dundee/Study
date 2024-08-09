package class13;

public class E1StringDemo {
    public static void main(String[] args) {
        //replacing
String str="Batch 16 is good";
String replaceText=str.replace("good","Terrible");
    //  str=replaceText;
        System.out.println(replaceText);
        System.out.println(str);
        // we can replace characters
        System.out.println(replaceText.replace('e','E'));


    }
}
