package class11;

public class E1D2Array {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                      {1,2,3,4,5},
                      {5,5,5,5,5},
                      {10,8,6,4,2}};

        //print only odd number from this 2D array


        for (int m = 0; m < arr.length; m++) {
            int [] row=arr[m];
            for (int i = 0; i < row.length ; i++) {
                if(row[i]%2==1){
                    System.out.print(row[i]+" ");
                }

            }
            System.out.println();

        }

    }
}
