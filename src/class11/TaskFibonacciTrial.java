package class11;

public class TaskFibonacciTrial {
    public static void main(String[] args) {
        //write a java program that will print the first 10 #s of the fibonacci series
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34


       //1.set the # of elements in loop
        int fibNum=10;

        //2.create a loop to store the numbers
        int[ ] fibonacci=new int[fibNum];

        //3.initialize the first two #s of the loop
        fibonacci[0]=0;
        fibonacci[1]=1;

        //4.generate the other elements in the loop
        for (int i = 2; i <fibNum ; i++) {
            fibonacci[i]=fibonacci[i-1] + fibonacci[i-2];
        }

        //5.print out all the #s
        for (int i = 0; i <fibNum; i++) {
            System.out.print(fibonacci[i]+" ");

        }



    }


}