package class13;

public class E4StringDemoSplittingSentencesIntoArray {
    public static void main(String[] args) {
        String str="Today is Sunday. We have Java Class. We like Java";
        //splitting up a sentence storing it as a array
        String [] strArr=str.split("[.]");


        System.out.println(strArr.length);
        System.out.println("================================");
        System.out.println(strArr[2].trim());
        System.out.println("=============================");

        // a EFloop to access it
        for(String sen:strArr){
            System.out.println(sen.trim());
        }
        System.out.println("=============================");
        //a for loop
        for (int i = 0; i <strArr.length ; i++) {
            System.out.println(strArr[i].trim());

        }




    }
}
