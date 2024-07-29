package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //ask user input for start and end # then print  numbers
Scanner scan =new Scanner(System.in);
        System.out.println("Please print a start number");
        int start=scan.nextInt();
        System.out.println("Please enter a end number");
        int end=scan.nextInt();
        System.out.println("Please enter steps");
        int step=scan.nextInt();

        int counter=start;
        int countEnd=end;
        while(counter<=countEnd){
            System.out.print(counter+" ");
            counter+=step;
        }
    }
}
