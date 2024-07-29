package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        // in a while loop ask the user to enter numbers and if users enter any number other than -1
        //print hello world and keep on asking for a number.

Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number");
          int num=scan.nextInt();
        while(num != -1){
            System.out.println("Please try again");
            num=scan.nextInt();
            }
        }



        }

