package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {

        String string=new String("Janel");
        //dont need to create an instance because string is popular. see below

        String string1="Anna";

        System.out.println(string1.length());

        String name ="Jus";

        if(name.length()>8){
            System.out.println("only 5 characters allowed");
        }
    }
}
