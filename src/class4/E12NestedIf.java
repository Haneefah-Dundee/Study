package class4;

public class E12NestedIf {
    public static void main(String[] args) {


        System.out.println("1");//print
        if(true){// main door has to be true for the code to continue
            System.out.println("2");//print
            if(false){
                System.out.println("3");//No print
            }
        }//close of main door
        System.out.println(4);//print
    }
}
