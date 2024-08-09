package class13;

public class E5StringBuilder {
    public static void main(String[] args) {

        StringBuilder strB=new StringBuilder("Java");//follow norm way to create objects
        System.out.println(strB.reverse());
        System.out.println(strB.length());
        System.out.println("======================================");
//convert string to stringbuilder vice versa
        String str="Computer";
        StringBuilder str1=new StringBuilder(str);//convert str to builder by passing it through Sbuilder
        System.out.println(str1);
        System.out.println(str1.reverse());
        //revert it back to string using .toString method
        str=str1.toString();
        System.out.println(str);

    }
}
