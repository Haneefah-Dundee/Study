package class10;

public class E4D2Array {
    public static void main(String[] args) {

        int[][] matrix = {{5, 15, 20},
                          {4, 30, 8},
                          {6, 95, 4}};


        for (int m = 0; m < matrix.length; m++) {

            int []arr = matrix[m];
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");}

            System.out.println();
        }

    }
}
