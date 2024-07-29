package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

        //System.out.println(true||true||false);
        int age=17;

        if (age<18||age>60){
            System.out.println("You will get big discount");
        }

        char gender='F';
        int aged=50;
String name="Mary";
        if(gender=='F'||aged>60 ||name!="Mary"){
            System.out.println("You will get a discount");
        }
    }
}
