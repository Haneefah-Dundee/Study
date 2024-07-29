package class6;

import java.util.Scanner;
// I did this HKD
public class Task {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height=scan.nextInt();

        if(height<60){
            System.out.println("You are short");
        }
        else if(height>=60&&height<=72){
            System.out.println("You are Medium");
        }
        else if(height>72){
            System.out.println("You are tall");
        }
    }
}
