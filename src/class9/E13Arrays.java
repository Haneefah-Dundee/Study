package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[3];

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=scan.nextInt();


        }
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
