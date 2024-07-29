package class8;

public class NefaTestNestedLoops {
    public static void main(String[] args) {

        for (int k = 0; k <6 ; k++) {
            for (int i = 0; i < 4; i++) {
                for(int j=0;j<6;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }
            System.out.println();

        }
    }
}
