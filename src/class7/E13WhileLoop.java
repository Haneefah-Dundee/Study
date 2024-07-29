package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        //ask the user for a number and print all the numbers from 1 to that number
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        int numStart=1;

        while(numStart<=num){
            System.out.print(numStart+" ");
            numStart++;
        }
    }
}
