package class13;

public class E5SBuilderTrial {
    public static void main(String[] args) {

        String str="Avocado";
        StringBuilder strB=new StringBuilder(str);
        strB=strB.reverse();
        System.out.println(strB);
        System.out.println("=======================================");
        str=strB.toString();
        System.out.println(str);


    }
}
