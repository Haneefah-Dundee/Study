package class4;

import java.util.Scanner;

public class E10ScannerChar {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Gender");
        char gender =scan.next().charAt(0);
        //System.out.println("You entered "+gender);
//I did this Myself. HKD
        if(gender=='F'){
            System.out.println("You are FEMALE ");
        }
        else if(gender=='M'){
            System.out.println("You are Male");
        }
        else{
            System.out.println("Incorrect entry");
        }
    }
}
