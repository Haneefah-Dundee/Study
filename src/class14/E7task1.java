package class14;

public class E7task1 {
    //create a method that will take 2 parameters as a number and prints which number is larger

    void printLargerNumber(int a, int b){

       // int largest =a; better to use if else condition
        if(a>b){
            System.out.println(a);

        }
        else{System.out.println(b);}

    }

    public static void main(String[] args) {
        E7task1 obj=new E7task1();
        int num=663;
        int num2=98;
        obj.printLargerNumber(num,num2);
    }
}
