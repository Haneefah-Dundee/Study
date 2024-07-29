package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        //100---1, even 20--100, odd 100--1

        int counter =100;
        while(counter>=1){
            System.out.print(counter+" ");
            counter--;
        }
        System.out.println();
        int num2=20;
        while(num2<=100){
            if(num2%2==0){
                System.out.print(num2+" ");
            }
            num2++;
        }
        System.out.println();
        int num=100;
        while(num>=1){
            if(num%2!=0){
            System.out.print(num+" ");
        }num--;
        }
    }
}
