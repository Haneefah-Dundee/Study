package class14;

public class E6 {

    /*
    create a method which returns true or false
    it takes an int number as parameter
    if number is even it returns true. else it returns false
    Method name :isEven
     */
    boolean isEven(int num){
        boolean isEvenCheck=false;
        if (num%2==0){
            isEvenCheck=true;
        }
        return isEvenCheck;


    }

    public static void main(String[] args) {
        int a=6;
        E6 obj =new E6();
        boolean isIt=obj.isEven(a);
        System.out.println(isIt);
    }

}
