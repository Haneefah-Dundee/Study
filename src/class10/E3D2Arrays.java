package class10;

public class E3D2Arrays {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                         {20,50,65},
                         {182,54,60}};

        int[] arr1 =matrix[0];

       /* for(int ar:arr1){==========ENHANCED FOR LOOP
            System.out.print(ar+" ");
        }*/

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();
        arr1 =matrix[1];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();
        arr1 =matrix[2];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");

        }

    }
}
