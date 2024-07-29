package class9;

public class Task1 {
    public static void main(String[] args) {
        //print #s from 1 to 50 except those divisible by 3

        for (int i = 1; i <=50 ; i++) {

            if(i%3!=0){
                System.out.print(i+" ");
            }

        }
    }
}
