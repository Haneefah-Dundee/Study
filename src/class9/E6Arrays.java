package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create an aarray store 10,50,60,45,100. print elements which are present on odd indices
       */

        int []numbers={10,50,60,45,100};

        for (int i = 0; i < numbers.length ; i++) {
            if(i%2!=0){
                System.out.println(numbers[i]);
            }

        }
    }
}
