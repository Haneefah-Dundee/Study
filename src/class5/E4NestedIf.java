package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int money=000;
        String day="Sunday";

        if(money>10000){
            if(day.equals("mon")){
                System.out.println("Lets go shopping");
            }else {
                System.out.println("Wait for sunday");
            }
        }else{
            System.out.println("You are broke");
        }
    }
}
