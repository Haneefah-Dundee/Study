package class13;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Wife";
        str.toLowerCase();//original variable doesn't change unless reassigned
        System.out.println(str);//output Wife...

        System.out.println("===================================");

        StringBuilder strB=new StringBuilder("Husband");
        strB.reverse();//original variable change
        System.out.println(strB);// output dnabsuH...
    }
}
