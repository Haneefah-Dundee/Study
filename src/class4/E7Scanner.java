package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scan.next();

        if(name.equals("Adam")){
            System.out.println("Mac user");
        }
        else if(name.equals("Sofia")){
            System.out.println("Rude Attitude");
        }
        else if(name.equals("John")){
            System.out.println("Hungry Boy");
        }
        else if(name.equals("Jake")){
            System.out.println("Don't call me");
        }

    }
}
