package class15;

public class refresh2DArray {
    public static void main(String[] args) {

        int [][] array = {{10,20,30},
                          {1,2,3,5},
                          {14,12,24}};

        // add each row of the array and return the sum of each

        for (int m = 0; m < array.length ; m++) {

        int [] row=array[m];
        int sum=0;

        for (int i = 0; i < row.length ; i++) {

            sum=sum+row[i];

        }
        System.out.println(sum);
        }
    }
}
