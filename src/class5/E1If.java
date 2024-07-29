package class5;

import java.util.Scanner;

public class E1If {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are You Hungry? true or false");
        boolean isHungry=scan.nextBoolean();
        if(isHungry){
            System.out.println("Lets go eat");
        }
        else{// i added the else HKD
            System.out.println("Get Back to Break");
        }
        }

}
