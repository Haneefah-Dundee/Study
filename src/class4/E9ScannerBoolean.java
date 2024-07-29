package class4;

import java.util.Scanner;

public class E9ScannerBoolean {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you Hungry? Enter True or False");
        boolean isHungry=scan.nextBoolean();
        if (isHungry){
            System.out.println("Lets get pizza");
        }
        else{
            System.out.println("Lets work");
        }
    }
}
