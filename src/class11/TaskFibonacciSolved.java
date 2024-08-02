package class11;

public class TaskFibonacciSolved {
    public static void main(String[] args) {
        //write a java program that will print the first 10 #s of the fibonacci series
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        //How much #s to print
        int fibNum=10;

        // create array to store Fib #s
        int [] fibonacci=new int[fibNum];

        //initialize first two elements
        fibonacci[0]=0;
        fibonacci[1]=1;

        //calculate the rest of the series. Loop starts at 2

        for (int i = 2; i <fibNum ; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
        //print all the elements:
        for (int i = 0; i <fibNum ; i++) {
            System.out.print(fibonacci[i]+" ");

        }
            }
        }



