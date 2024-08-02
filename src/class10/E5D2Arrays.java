package class10;

public class E5D2Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30,40,50},
                {20, 50, 65,20},
                {102,54,60},
                {20,55}
        };



        for (int m = 0; m < matrix.length; m++) {
            int []arRow=matrix[m];
            for (int i = 0; i <arRow.length; i++) {
                System.out.print(arRow[i]+" ");

            }
            System.out.println();

        }

    }
}
