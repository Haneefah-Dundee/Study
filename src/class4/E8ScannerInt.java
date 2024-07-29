package class4;

import java.util.Scanner;

public class E8ScannerInt {
    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
        System.out.println("please enter your salary");
        int salary=scan.nextInt();

        if(salary>10000){
            System.out.println("You are rich");
        }
        else{
            System.out.println("Work Harder");
        }

    }
}
