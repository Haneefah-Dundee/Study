package class12;

public class E12StringDemo {
    public static void main(String[] args) {
        String sentence="yup we have another class";
        //use substring to get a part of the complete string
        System.out.println(sentence.substring(12));
        System.out.println(sentence.substring(7));
        System.out.println(sentence.substring(4));

        //if you want cut up the sentence maybe get some only from the middle
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));

        //print the last 5
        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex));

    }
}
