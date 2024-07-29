package class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        /*   use one while and one for loop to
         2 4 6 8 10
         2 4 6 8 10
         2 4 6 8 10
         2 4 6 8 10
  */

        for (int i = 0; i < 4; i++) {

            int counter=2;
            while(counter<=10){
                System.out.print(counter+" ");
                counter+=2;
            }
            System.out.println();
        }



    }
}
