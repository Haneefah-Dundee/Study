package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        //add all #s from 1-10 and display the result 55
        int counter=1;
        int sum=0;

        while(counter<=10){
            sum+=counter;
            counter++;
        }System.out.println(sum);


    }
}
