package class8;

public class E14NestedLoops {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
        */

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+j+" ");

            }
            System.out.println();

        }
    }
}
