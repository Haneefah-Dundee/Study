package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="    JAVA is very very easy";
        sentence=sentence.trim().toLowerCase();//method chaining
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));// Java is Case/space sensitive.
    }
}
